package com.PersonsAPI.PersonsAPI.service;

import com.PersonsAPI.PersonsAPI.dto.MessageResponseDTO;
import com.PersonsAPI.PersonsAPI.models.PersonModel;
import com.PersonsAPI.PersonsAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    private PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository=personRepository;
    }

    public MessageResponseDTO createPerson(PersonModel person){
        PersonModel savedPerson= personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID:" + savedPerson.getId())
                .build();
    }
}
