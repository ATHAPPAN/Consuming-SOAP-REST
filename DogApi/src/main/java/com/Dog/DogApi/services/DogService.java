package com.Dog.DogApi.services;

import java.util.List;

import com.Dog.DogApi.entity.Dog;

public interface DogService {

	List<Dog> returnDogList();
	List<Dog> returnDogByBreedList(String breed);
	List<Dog> returnDogByIdList(Long Id);
	List<Dog> returnDogByNameList(String name);
}
