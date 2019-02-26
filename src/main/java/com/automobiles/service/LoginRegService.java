package com.automobiles.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.automobiles.model.Login;
import com.automobiles.repository.LoginRegRepository;



@Service
@Transactional
public class LoginRegService {

	@Autowired
	LoginRegRepository loginRegRepository;
	
	public LoginRegService(LoginRegRepository loginRegRepository) {
		this.loginRegRepository = loginRegRepository;
	}

	public Login saveUserRegistrationData(@RequestBody Login login) {
		return loginRegRepository.save(login);
	}
	
	/*
	 * public Login chkAlreadyExists(String user_mobile) { return
	 * loginRegRepository.chkAlreadyExists(user_mobile); }
	 */

	public List<Login> getAllUser() {
		return loginRegRepository.findAll();
	}


}