package com.example.function.lambda.function;

import com.example.function.lambda.model.Person;
import com.example.function.lambda.request.PersonRequest;
import com.example.function.lambda.response.PersonResponse;
import com.example.function.lambda.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component(value = "person")
@AllArgsConstructor
public class PersonFunction implements Function<PersonRequest, PersonResponse> {

    private final PersonService personService;

    @Override
    public PersonResponse apply(PersonRequest personRequest) {
        Person person = new Person(personRequest.getUsername(), personRequest.getAge());
        String messageResponse = this.personService.validatePerson(person);

        return new PersonResponse(messageResponse);
    }
}
