package net.marioosh.springstarter.test;

import net.marioosh.springstarter.MainController;
import net.marioosh.springstarter.model.dao.UserDAO;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class FirstTest {

	private final Logger log = Logger.getLogger(getClass());
	
	@Autowired
	private UserDAO userDAO;
	
	@Before
	public void setup() {
	}
	
	@Test
	public void test() throws Exception {
		log.info(userDAO);
	}
}
