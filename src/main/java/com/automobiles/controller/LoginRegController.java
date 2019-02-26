package com.automobiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.customexceptions.LoginRegException;
import com.automobiles.model.Login;
import com.automobiles.service.LoginRegService;

@CrossOrigin("*")
@RestController
public class LoginRegController {

	@Autowired
	LoginRegService loginRegService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public @ResponseBody Login userRegisteration(@RequestBody Login login) throws LoginRegException {

		  if(login != null) {
			//  loginRegService.chkAlreadyExists(login.getUser_mobile());
			  return loginRegService.saveUserRegistrationData(login);
			
		  }else {
			  throw new LoginRegException("Please fill data properly");
		  }
		 	
	}
	
	
	
	@RequestMapping(value="/allUser",method=RequestMethod.GET)
	public List<Login> getAllUserData(){
		return loginRegService.getAllUser();
	}
	
	
	
	
}
