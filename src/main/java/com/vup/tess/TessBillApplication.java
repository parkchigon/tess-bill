package com.vup.tess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TessBillApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TessBillApplication.class, args);
	}

}

