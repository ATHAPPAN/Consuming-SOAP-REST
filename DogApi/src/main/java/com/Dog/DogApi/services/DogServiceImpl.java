package com.Dog.DogApi.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dog.DogApi.entity.Dog;
import com.Dog.DogApi.repository.DogRepository;

@Service
public class DogServiceImpl implements DogService{

	@Autowired
	DogRepository dogRepository;

	@Override
	public List<Dog> returnDogList() {

		return (List<Dog>) dogRepository.findAll();
	}

	@Override
	public List<Dog> returnDogByBreedList(String breed) {
		System.out.println(breed);
		return (List<Dog>) dogRepository.findByBreed(breed);
	}

	@Override
	public List<Dog> returnDogByIdList(Long id) {
		//		List<Long> ids=new ArrayList<>(Arrays.asList(id));
		Optional<Dog> result=dogRepository.findById(id);
		List<Dog> output = new ArrayList<>(Arrays.asList(result.get()));
		return output;
	}

	@Override
	public List<Dog> returnDogByNameList(String name) {
		System.out.println(name);
		return (List<Dog>) dogRepository.findByName(name);
	}


}
