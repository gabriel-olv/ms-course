package br.dev.gabrieldeoliveira.hreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HreurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HreurekaserverApplication.class, args);
	}

}
