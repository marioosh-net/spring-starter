package net.marioosh.springstarter.model.entities;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;


public class Photo extends AbstractEntity implements Serializable {

	private Long id;

	@NotEmpty
	private String name;

	public Photo() {	
	}
	
	public Photo(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
