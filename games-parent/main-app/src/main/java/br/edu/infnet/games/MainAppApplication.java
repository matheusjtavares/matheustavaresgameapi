package br.edu.infnet.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "br.edu.infnet.games.model.domain")
@EnableJpaRepositories(basePackages = "br.edu.infnet.games.model.repository")
@SpringBootApplication(scanBasePackages = "br.edu.infnet.games")
@EnableFeignClients(basePackages = "br.edu.infnet.games.clients")
public class MainAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainAppApplication.class, args);
	}

}
