package com.Dog.DogApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.Dog.DogApi.entity.Dog;



public interface DogRepository extends CrudRepository<Dog, Long>{
	
	@Query(value="Select D.ID,D.BREED,D.NAME,D.ORIGIN from  Dog D where D.NAME=(:name)",nativeQuery = true)
	List<Dog> findByName(@Param("name") String name);


	
	@Query(value="Select D.ID,D.BREED,D.NAME,D.ORIGIN from  Dog D where D.BREED=(:breed)",nativeQuery = true)
	List<Dog> findByBreed(@Param("breed") String breed);
}
 