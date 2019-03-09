package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import srini.students.GetStudentDetailsResponse;

@SpringBootApplication
public class SoaptaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaptaskApplication.class, args);
		  Client client = new Client();
	      Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	      marshaller.setContextPath("srini.students");
	      client.setMarshaller(marshaller);
	      client.setUnmarshaller(marshaller);
	      GetStudentDetailsResponse response = client.getCountryDetails(1);

	      System.out.println("id : " + response.getStudentDetails().getId());
	      System.out.println("name : " + response.getStudentDetails().getName());
	      System.out.println("passport : " + response.getStudentDetails().getPassportNumber());
	     
	   }
	}


