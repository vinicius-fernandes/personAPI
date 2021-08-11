package com.PersonsAPI.PersonsAPI.repository;

import com.PersonsAPI.PersonsAPI.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel,Long> {
}
