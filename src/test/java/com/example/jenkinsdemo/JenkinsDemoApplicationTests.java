package com.example.jenkinsdemo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsDemoApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void contextLoads() {
		Assertions.assertThat(true).isTrue();
	}

	@Test
	public void shouldApplicationContextExists() {
		Assertions.assertThat(applicationContext).isNotNull();
	}

}
