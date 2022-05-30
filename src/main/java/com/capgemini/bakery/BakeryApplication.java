package com.capgemini.bakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BakeryApplication {

	public static void main(String[] args) {

		SpringApplication.run(BakeryApplication.class, args);
	}

	@GetMapping(value = "/bakery", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<ResponseHello> message(){
		return new ResponseEntity<>(new ResponseHello("Hello world from our bakery. You want a painica prajita?"), HttpStatus.OK);
	}

}
