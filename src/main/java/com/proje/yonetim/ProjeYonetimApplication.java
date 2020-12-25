package com.proje.yonetim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class ProjeYonetimApplication {   // Uygulamayı çalıştıran sınıf

	public static void main(String[] args) {
		SpringApplication.run(ProjeYonetimApplication.class, args);
	}

}
