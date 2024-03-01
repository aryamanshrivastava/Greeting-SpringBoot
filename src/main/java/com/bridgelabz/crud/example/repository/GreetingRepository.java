package com.bridgelabz.crud.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.bridgelabz.crud.example.entity.Greeting;


public interface GreetingRepository extends CrudRepository<Greeting,Integer>{

}
 