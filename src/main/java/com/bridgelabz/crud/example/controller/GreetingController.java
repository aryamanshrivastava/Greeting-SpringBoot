package com.bridgelabz.crud.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.crud.example.entity.Greeting;
import com.bridgelabz.crud.example.service.IGreetingService;

@RestController
public class GreetingController {
	@Autowired
    private IGreetingService service;

    @PostMapping("/addmessage")
    public Greeting addMessage(@RequestBody Greeting greeting) {
        return service.saveMessage(greeting);
    }


    @GetMapping("/messages")
    public List<Greeting> findAllGreeting() {
        return service.getMessage();
    }

    @GetMapping("/messageById/{id}")
    public Greeting findGreetingById(@PathVariable int id) {
        return service.getMessageById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteMessage(@PathVariable int id) {
        return service.deleteMessage(id);
    }
}