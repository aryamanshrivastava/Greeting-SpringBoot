package com.bridgelabz.crud.example.service;

import java.util.List;

import com.bridgelabz.crud.example.entity.Greeting;

public interface IGreetingService {

	Greeting saveMessage(Greeting greeting);

	Greeting getMessageById(int id);

	List<Greeting> getMessage();

	String deleteMessage(int id);

}