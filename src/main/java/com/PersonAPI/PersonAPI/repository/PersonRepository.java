package com.PersonAPI.PersonAPI.repository;

import com.PersonAPI.PersonAPI.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel,Long> {
}
