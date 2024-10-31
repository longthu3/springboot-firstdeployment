package org.example.demodeployazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDeployAzureApplication {

	@GetMapping
	public String getDeployMessage() {
		return "Deployed to Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoDeployAzureApplication.class, args);
	}

}
