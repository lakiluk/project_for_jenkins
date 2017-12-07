package com.example.jenkinsdemo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsDemoApplicationTests {

	@Test
	public void contextLoads() {
		Assertions.assertThat(true).isFalse();
	}

}
