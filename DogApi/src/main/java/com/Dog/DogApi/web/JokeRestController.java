package com.Dog.DogApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dog.DogApi.config.SpringSecurityConfig;
import com.Dog.DogApi.entity.Joke;

@RestController
public class JokeRestController {

	@Autowired
	private SpringSecurityConfig config;
	
	private RestTemplateBuilder builder;
	
	@GetMapping("/Joke")
	public ResponseEntity<Joke> getRandomJoke(){
		Joke joke=new Joke();
		joke=config.getRestTemp(builder).getForObject("https://official-joke-api.appspot.com/random_joke", Joke.class);
		return new ResponseEntity<Joke>(joke,HttpStatus.OK);
	}
}
