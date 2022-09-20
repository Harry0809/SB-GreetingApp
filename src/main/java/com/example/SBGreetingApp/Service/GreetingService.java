package com.example.SBGreetingApp.Service;


import com.example.SBGreetingApp.Model.GreetingUser;
import com.example.SBGreetingApp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    GreetingRepo greetingRepo;


    public GreetingUser save(GreetingUser user) {
        return greetingRepo.save(user);
    }

    public List<GreetingUser> display() {
        return greetingRepo.findAll();

    }



    public Optional<GreetingUser> getById(long id) {
        return greetingRepo.findById((long) id);
    }

    public List<GreetingUser> listAll() {
        return greetingRepo.findAll();
    }

    public String deleteById(Long id) {
         greetingRepo.deleteById(id);
        return "record deleted";
    }

    public String name(String firstName, String lastName) {
        if(firstName != null && lastName != null){
            return "Hello " + firstName + " " + lastName;
        } else if(firstName != null || lastName != null) {
            String name = firstName != null ? firstName : lastName;
            return  "Hello " +name;
        }
        return "Hello World";
    }

    public GreetingUser update(GreetingUser greetingUser) {
        return greetingRepo.save(greetingUser);
    }
}

