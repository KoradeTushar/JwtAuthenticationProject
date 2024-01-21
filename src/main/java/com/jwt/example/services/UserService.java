package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Tushar Korade","temp@yopmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Atharv Korade","temp1@yopmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Yatiraj Korade","temp2@yopmail.com"));
    }

    public List<User> getUsers(){
        System.out.println("getUsers Called");
        return this.store;
    }

}
