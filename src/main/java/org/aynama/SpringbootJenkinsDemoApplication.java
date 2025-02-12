package org.aynama;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsDemoApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		System.out.println("@ main method...");
		SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
          System.out.println("@ Command Line runner...!");
	}
}
