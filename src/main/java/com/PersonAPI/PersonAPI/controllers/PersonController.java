package com.PersonAPI.PersonAPI.controllers;

import com.PersonAPI.PersonAPI.dto.response.MessageResponseDTO;
import com.PersonAPI.PersonAPI.dto.request.PersonDTO;
import com.PersonAPI.PersonAPI.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }

    @GetMapping("/list")
    public List<PersonDTO> peopleList(){
        return personService.listPeople();
    }
}
