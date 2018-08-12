package acm.objects.database.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

	@Override
	public String getErrorPath() {
		return "/error";
	}
	
    @RequestMapping(value = "/error")
    public String error() {
        return "You shouldn't be here. This is an error page :/";
    }

}
