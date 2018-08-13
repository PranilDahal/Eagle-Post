package acm.objects.database.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import acm.objects.SimpleStatusUpdate;
import acm.objects.database.SsuDatabaseBean;

@RestController
public class SsuControllers {

	@Autowired
	SsuDatabaseBean SsuDatabaseBean;

	@RequestMapping("/SSU")
	public List<SimpleStatusUpdate> testSetup() {
		return SsuDatabaseBean.getAllSSUs() ;
	}
}
