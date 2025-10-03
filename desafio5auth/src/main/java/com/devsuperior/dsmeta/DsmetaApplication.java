package com.devsuperior.dsmeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DsmetaApplication implements CommandLineRunner {
	
	@Autowired
	private PasswordEncoder passwordEnconder;

	public static void main(String[] args) {
		SpringApplication.run(DsmetaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODE = " + passwordEnconder.encode("123456"));
		
		boolean result = passwordEnconder.matches("123456", "$2a$10$czLaAFuRv37kRyK/gxIAx.yuR2/I.u7RE5NTSPm.fd64AgM0vqNm.");
		
		System.out.println("RESULTADO = " + result );
	}
}
