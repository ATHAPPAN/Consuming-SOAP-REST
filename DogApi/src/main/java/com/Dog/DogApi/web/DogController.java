package com.Dog.DogApi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Dog.DogApi.entity.Dog;
import com.Dog.DogApi.services.DogService;

@RestController
public class DogController {

	@Autowired
	private DogService dogService;
	


	@GetMapping("/Dog")
	public ResponseEntity<List<Dog>> getDogList(){
		List<Dog> dogData= dogService.returnDogList();
		return new ResponseEntity<List<Dog>>(dogData,HttpStatus.OK);
	}
	
	@GetMapping("/DogById")
	public ResponseEntity<List<Dog>> getDogById(@RequestParam("id") Long id){
		List<Dog> dogData= dogService.returnDogByIdList(id);
		return new ResponseEntity<List<Dog>>(dogData,HttpStatus.OK);
	}
	@GetMapping("/DogByName")
	public ResponseEntity<List<Dog>> getDogByNmae(@RequestParam("name") String name){
		List<Dog> dogData= dogService.returnDogByNameList(name);
		return new ResponseEntity<List<Dog>>(dogData,HttpStatus.OK);
	}
	
	@GetMapping("/DogByBreed")
	public ResponseEntity<List<Dog>> getDogByBreed(@RequestParam("breed") String breed){
		List<Dog> dogData= dogService.returnDogByBreedList(breed);
		return new ResponseEntity<List<Dog>>(dogData,HttpStatus.OK);
	}
	
}
