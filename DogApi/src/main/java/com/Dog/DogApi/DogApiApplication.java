package com.Dog.DogApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DogApiApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(DogApiApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
	
		
		//create and setup marshaller
		//Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	

		
		//Jaxb2Marshaller unmarshaller = new Jaxb2Marshaller();
		//provide location to the ObjectFacory
		//marshaller.setContextPath("com.dataaccess.webservicesserver");
		//unmarshaller.setContextPath("com.dataaccess.webservicesserver");
		
		//add marshaller to the client
		//numberClient.setMarshaller(marshaller);
		//numberClient.setUnmarshaller(unmarshaller);

		//numberClient.setMarshaller(marshaller);
		//retrieve the word format of the number
		//NumberToWordsResponse response = numberClient.getWord("3454");

		//print to screen
		//System.out.println("Response is: " + response.getNumberToWordsResult());
	}
 
}
