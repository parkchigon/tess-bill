package com.vup.tess;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class TessDemo01ApplicationTests {

	@Autowired
	Environment environment;
	
	@Test
	
	void contextLoads() {
		System.out.println("3333333333333333333");
		System.out.println("테스트 server.port:" + environment.getProperty("server.port"));
	}

}
