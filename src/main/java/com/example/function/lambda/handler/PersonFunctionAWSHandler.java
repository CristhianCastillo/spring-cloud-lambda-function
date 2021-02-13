package com.example.function.lambda.handler;

import com.example.function.lambda.request.PersonRequest;
import com.example.function.lambda.response.PersonResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class PersonFunctionAWSHandler extends SpringBootRequestHandler<PersonRequest, PersonResponse> {
}
