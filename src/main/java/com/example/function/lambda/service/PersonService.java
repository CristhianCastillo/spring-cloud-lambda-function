package com.example.function.lambda.service;

import com.example.function.lambda.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    String validatePerson(Person person);
}
