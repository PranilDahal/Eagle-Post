package acm.objects.database.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import acm.objects.database.HumanUserDatabaseBean;
import acm.objects.datahandlers.ApiResponseData;
import acm.objects.datahandlers.HumanUserPostData;
import acm.objects.datahandlers.JwtAuthenticationResponse;
import acm.objects.datahandlers.LoginRequestData;
import acm.objects.datahandlers.SignUpRequestData;
import acm.security.TokenProvider;

@RestController
@RequestMapping("/who")
public class AuthenticationControllers {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	HumanUserDatabaseBean userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	TokenProvider tokenProvider;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequestData loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						loginRequest.getUsernameOrEmail(),
						loginRequest.getPassword()
						)
				);

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = tokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequestData signUpRequestData) {
		if(userRepository.existsByUsername(signUpRequestData.getUserName())) {
			return new ResponseEntity(new ApiResponseData(false, "Username is already taken!"),
					HttpStatus.BAD_REQUEST);
		}

		if(userRepository.existsByEmail(signUpRequestData.getEmailAddress())) {
			return new ResponseEntity(new ApiResponseData(false, "Email Address already in use!"),
					HttpStatus.BAD_REQUEST);
		}

		// Create a post data object
		SignUpRequestData obj = signUpRequestData;
		HumanUserPostData user = new HumanUserPostData(
				obj.getFirstName(), obj.getLastName(), obj.getUserName(), obj.getPassword(), obj.getCIN(),
				obj.getPhoneNumber(), obj.getEmailAddress(), obj.getBirthDay(), obj.getSecretCode());

		user.setPassword(passwordEncoder.encode(user.getPassword()));

		String newId = userRepository.insertToDatabase(user);

		//TODO MAKE THE USER CONTROLLERS
		URI location = ServletUriComponentsBuilder
				.fromCurrentContextPath().path("/users/{username}")
				.buildAndExpand(userRepository.getById(newId).getUserName()).toUri();

		return ResponseEntity.created(location).body(new ApiResponseData(true, "User registered successfully"));
	}

}
