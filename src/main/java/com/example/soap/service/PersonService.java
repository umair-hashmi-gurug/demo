package com.example.soap.service;
import com.example.soap.model.Person;
import org.springframework.stereotype.Service;
@Service
public class PersonService {

    public void setName(){
        Person person = new Person();
        person.setName("name");
    }

    public String getName(){
        Person person = new Person();
        return person.getName();
    }
}
