package net.marioosh.springstarter.model.impl;

import net.marioosh.springstarter.model.dao.PhotoDAO;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("photoDAO")
public class PhotoDAOImpl extends HibernateDaoSupport implements PhotoDAO {

	private Logger log = Logger.getLogger(getClass());
	
	@Autowired
	public void init(SessionFactory factory) {
	    setSessionFactory(factory);
	}
	
	
}
