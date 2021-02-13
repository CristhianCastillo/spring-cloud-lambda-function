package com.example.function.lambda.service;

import com.example.function.lambda.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImp implements PersonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonServiceImp.class);

    @Override
    public String validatePerson(Person person) {
        LOGGER.info("Username: {}", person.getUsername());
        LOGGER.info("Age: {}", person.getAge());
        if(person.getAge() < 0)
            return "Person can not exists!";
        if(person.getAge() > 17)
            return "You are an adult";
        else
            return "You are a child";
    }
}
