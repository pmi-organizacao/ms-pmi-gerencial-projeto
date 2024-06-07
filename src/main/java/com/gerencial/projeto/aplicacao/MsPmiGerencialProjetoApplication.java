package com.gerencial.projeto.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsPmiGerencialProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPmiGerencialProjetoApplication.class, args);
	}

}
