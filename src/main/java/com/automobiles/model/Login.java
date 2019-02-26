package com.automobiles.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Login {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long user_id;
	private String user_first_name;
	private String user_last_name;
	private String user_mobile;
	private String user_password;
	private int user_type;
	private String user_created;
	private String user_last_login;
	private int user_status;
	
	public Login() {}	
	
	
	public Login(Long user_id, String user_first_name, String user_last_name, String user_mobile, String user_password,
			int user_type, String user_created, String user_last_login, int user_status) {
		super();
		this.user_id = user_id;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_mobile = user_mobile;
		this.user_password = user_password;
		this.user_type = user_type;
		this.user_created = user_created;
		this.user_last_login = user_last_login;
		this.user_status = user_status;
	}




	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public String getUser_first_name() {
		return user_first_name;
	}


	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}


	public String getUser_last_name() {
		return user_last_name;
	}


	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}


	public String getUser_mobile() {
		return user_mobile;
	}


	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}


	public String getUser_password() {
		return user_password;
	}


	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	public int getUser_type() {
		return user_type;
	}


	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}


	public String getUser_created() {
		return user_created;
	}


	public void setUser_created(String user_created) {
		this.user_created = user_created;
	}


	public String getUser_last_login() {
		return user_last_login;
	}


	public void setUser_last_login(String user_last_login) {
		this.user_last_login = user_last_login;
	}


	public int getUser_status() {
		return user_status;
	}


	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}



	@Override
	public String toString() {
		return "Login [user_id=" + user_id + ", user_first_name=" + user_first_name + ", user_last_name="
				+ user_last_name + ", user_mobile=" + user_mobile + ", user_password=" + user_password + ", user_type="
				+ user_type + ", user_created=" + user_created + ", user_last_login=" + user_last_login
				+ ", user_status=" + user_status + "]";
	}


	
	
}
