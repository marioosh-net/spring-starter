package net.marioosh.springstarter.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User extends AbstractEntity implements Serializable {

	@Id
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
