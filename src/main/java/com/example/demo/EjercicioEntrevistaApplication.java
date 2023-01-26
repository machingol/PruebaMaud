package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.repository.PricesRepository;





@EnableAutoConfiguration
@SpringBootApplication

@Controller
public class EjercicioEntrevistaApplication {
	


	@ResponseBody
	public static void main(String[] args) {

		SpringApplication.run(EjercicioEntrevistaApplication.class, args);
		
	}

}
