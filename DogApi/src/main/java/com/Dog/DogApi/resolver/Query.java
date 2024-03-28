package com.Dog.DogApi.resolver;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.Dog.DogApi.Exception.DogNotFoundException;
import com.Dog.DogApi.entity.Dog;
import com.Dog.DogApi.repository.DogRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class Query implements GraphQLQueryResolver  {

	 private DogRepository dogRepository;

	    public Query(DogRepository dogRepository) {
	        this.dogRepository = dogRepository;
	    }

	    public Iterable<Dog> findAllDogs() {
	        return dogRepository.findAll();
	    }

	    public Dog findDogById(Long id) {
	        Optional<Dog> optionalDog = dogRepository.findById(id);
	        if (optionalDog.isPresent()) {
	            return optionalDog.get();
	        } else {
	            throw new DogNotFoundException("Dog Not Found", id);
	        }
	    }
}
