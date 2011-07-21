package net.marioosh.springstarter.model.impl;

import java.util.ArrayList;
import java.util.Collection;

import net.marioosh.springstarter.model.dao.UserDAO;
import net.marioosh.springstarter.model.entities.User;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO, UserDetailsService {

	private Logger log = Logger.getLogger(getClass());

	@Autowired
	public void init(SessionFactory factory) {
	    setSessionFactory(factory);
	}

	@Override
	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException, DataAccessException {
		
		// do testow
		User userEntity = new User();
		userEntity.setLogin("a");
		userEntity.setPassword("098f6bcd4621d373cade4e832627b4f6");	// haslo = test
		
		/*
		User userEntity = null;
		String sql = "select * from tuser where login = ?";
		try {
			userEntity = (User)jdbcTemplate.queryForObject(sql, new Object[] { login }, new BeanPropertyRowMapper<User>());
		} catch (org.springframework.dao.EmptyResultDataAccessException e) {
			throw new UsernameNotFoundException("Login not found");
		}
		*/
		
		String username = userEntity.getLogin();
		String password = userEntity.getPassword();
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new GrantedAuthorityImpl("ROLE_USER"));

		org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		return user;

	}

}
