package com.bridgelabz.crud.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.crud.example.entity.Greeting;
import com.bridgelabz.crud.example.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {
	@Autowired
	private GreetingRepository repository;
	
	@Override
	public Greeting saveMessage(Greeting greeting) {
		return repository.save(greeting);
	}
	@Override
	public Greeting getMessageById(int id){
		return repository.findById(id).orElse(null);
	}
	@Override
	public List<Greeting> getMessage(){
		return (List<Greeting>) repository.findAll();
	}
	@Override
	public String deleteMessage(int id) {
		repository.deleteById(id);
		return "Message removed !!" +id;
	}
}