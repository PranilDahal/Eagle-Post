package acm.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import acm.objects.HumanUser;
import acm.objects.database.HumanUserFactory;

@Service
public class UserInfoService implements UserDetailsService{

	@Autowired
	HumanUserFactory userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		HumanUser user = userRepository.getByUsername(username);
		return user;
	}

	// This method is used by JWTAuthenticationFilter
	@Transactional
	public UserDetails loadUserById(Long id) {
		HumanUser user = userRepository.getById(Long.toString(id));
		return user;
	}

}
