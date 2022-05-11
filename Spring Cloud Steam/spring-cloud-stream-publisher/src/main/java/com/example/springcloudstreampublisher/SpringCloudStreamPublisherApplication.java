package com.example.springcloudstreampublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
public class SpringCloudStreamPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamPublisherApplication.class, args);
	}

}
