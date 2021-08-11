package com.PersonsAPI.PersonsAPI.controllers;

import com.PersonsAPI.PersonsAPI.dto.MessageResponseDTO;
import com.PersonsAPI.PersonsAPI.models.PersonModel;
import com.PersonsAPI.PersonsAPI.repository.PersonRepository;
import com.PersonsAPI.PersonsAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody PersonModel person){
        return personService.createPerson(person);
    }
}
