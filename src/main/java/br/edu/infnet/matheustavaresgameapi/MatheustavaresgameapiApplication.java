package br.edu.infnet.matheustavaresgameapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.edu.infnet.matheustavaresgameapi.model.clients")
public class MatheustavaresgameapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatheustavaresgameapiApplication.class, args);
	}

}
