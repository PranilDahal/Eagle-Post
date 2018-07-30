package acm.objects.database.controllers;

import org.springframework.web.bind.annotation.RestController;

import acm.objects.database.SetupDatabaseBean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiscControllers<SetupTestObject> {
	
	@Autowired
	SetupDatabaseBean setupTestBean;
	
	@RequestMapping("/SetupTest")
    public List<acm.objects.SetupTestObject> testSetup() {
		return setupTestBean.getTestValues() ;
    }
	
}
