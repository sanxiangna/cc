package com.cc.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.filter.FormContentFilter;

@Import({FormContentFilter.class})
@SpringBootApplication
public class CcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcApplication.class, args);
	}

}
