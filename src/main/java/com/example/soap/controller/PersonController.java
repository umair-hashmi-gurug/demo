package com.example.soap.controller;

import com.example.soap.model.Person;
import com.example.soap.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonController {
    private static final String NAMESPACE = "http://schemas.yourorganization.org/namespace";
    @Autowired
    private PersonService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "Person")
    @ResponsePayload
    public Person getPerson(@RequestPayload Person request) {

        service.setName();
        Person response = new Person();
        response.setName("John Doe");
        return response;
    }
}
