package com.automobiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.automobiles.model.Login;

public interface LoginRegRepository extends JpaRepository<Login, Long> {
	
	//public Login chkAlreadyExists(String user_mobile);

}
