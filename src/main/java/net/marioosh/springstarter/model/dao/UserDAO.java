package net.marioosh.springstarter.model.dao;

import java.util.List;
import net.marioosh.springstarter.model.entities.User;

public interface UserDAO extends GenericDAO<User> {

	public User getByLogin(String login);
	public List<User> findAll();
}
