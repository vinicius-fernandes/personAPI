package com.PersonAPI.PersonAPI.mapper;

import com.PersonAPI.PersonAPI.dto.request.PersonDTO;
import com.PersonAPI.PersonAPI.models.PersonModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    PersonModel toModel(PersonDTO personDTO);

    PersonDTO toDTO(PersonModel person);
}
