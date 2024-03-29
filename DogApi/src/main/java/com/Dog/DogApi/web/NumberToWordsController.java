package com.Dog.DogApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Dog.DogApi.client.NumberClient;
import com.dataaccess.webservicesserver.NumberToWordsResponse;

@RestController
public class NumberToWordsController {

	
	@Autowired
  private NumberClient client ;

	@GetMapping("/N2W")
	public ResponseEntity<String>  getWords(@RequestParam("number") String number) {
		System.out.println("Soap based client called "+number);
	
		NumberToWordsResponse resp=client.getWord(number);
		String words=resp.getNumberToWordsResult();
		System.out.println("Result is "+words);
		return new ResponseEntity<String>(words,HttpStatus.OK);
	}
}
