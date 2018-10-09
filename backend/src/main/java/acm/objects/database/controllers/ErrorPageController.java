package acm.objects.database.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorPageController implements ErrorController{

	@RequestMapping("/error")
	@ResponseBody
	public String handleError(HttpServletRequest request) {
		
		// TODO Issue #6 - Make this error page more responsive based on what type of error it is.
		// Look at https://www.logicbig.com/tutorials/spring-framework/spring-boot/implementing-error-controller.html for example
		// Test it out on your browser anby making bad API calls to trigger those specific errors.
		
		return String.format("<html><body><h2>Error Page</h2><body></html>");
		
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
