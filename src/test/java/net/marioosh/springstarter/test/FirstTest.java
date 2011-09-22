package net.marioosh.springstarter.test;

import net.marioosh.springstarter.MainController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class FirstTest {

	@Autowired
	private MainController mainController;
	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void test() throws Exception {
		System.out.println("C:"+mainController);
	}
}
