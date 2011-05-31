package net.marioosh.gallery.model.entities;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;


public class User extends AbstractEntity implements Serializable {

	private Long id;

	@NotEmpty
	private String login;
	
	private String password;

	public User() {	
	}
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
