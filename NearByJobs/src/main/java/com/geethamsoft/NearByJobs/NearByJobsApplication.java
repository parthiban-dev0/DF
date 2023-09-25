package com.geethamsoft.NearByJobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NearByJobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NearByJobsApplication.class, args);
	}

}
