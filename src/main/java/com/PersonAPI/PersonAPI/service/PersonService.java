package com.PersonAPI.PersonAPI.service;

import com.PersonAPI.PersonAPI.dto.request.PersonDTO;
import com.PersonAPI.PersonAPI.dto.response.MessageResponseDTO;
import com.PersonAPI.PersonAPI.mapper.PersonMapper;
import com.PersonAPI.PersonAPI.models.PersonModel;
import com.PersonAPI.PersonAPI.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        PersonModel personToSave = personMapper.toModel(personDTO);
        PersonModel savedPerson= personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID:" + savedPerson.getId())
                .build();
    }
    @GetMapping("/list")
    public List<PersonDTO> listPeople(){
        List<PersonModel> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO).collect(Collectors.toList());
    }
}
