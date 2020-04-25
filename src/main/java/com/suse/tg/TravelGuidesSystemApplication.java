package com.suse.tg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suse.tg.background.dao")
public class TravelGuidesSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelGuidesSystemApplication.class, args);
	}

}
