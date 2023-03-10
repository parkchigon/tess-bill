package com.vup.tess;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;


@SpringBootTest(properties = {"server.port=8081",
		"logging.level,root=TRACE"
})
public class PropertiesTest {

	@Autowired
	Environment environment;

	@Test
	public void testMethod() {
		System.out.println("3333333333333333333");
		System.out.print("테스트 server.port:" + environment.getProperty("server.port"));
		System.out.print("테스트 logging.level,root:" + environment.getProperty("logging.level,root"));

	}
}
