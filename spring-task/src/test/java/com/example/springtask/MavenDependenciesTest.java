package com.example.springtask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MavenDependenciesTest {

	private final ApplicationContext context;

	@Autowired
	public MavenDependenciesTest(ApplicationContext context) {
		this.context = context;
	}

	@Test
	void contextLoads() {
		assertNotNull(context.getApplicationName());
		assertNotNull(context.getBean("dispatcherServlet"));
//context.getBeansOfType("dispatcherServlet")
	}

}
