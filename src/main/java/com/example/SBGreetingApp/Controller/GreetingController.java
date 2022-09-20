package com.example.SBGreetingApp.Controller;

import com.example.SBGreetingApp.Model.GreetingUser;
import com.example.SBGreetingApp.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    /*
    //UC1

    @RestController
    public class GreetingApp {
        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @GetMapping("/greeting")
        public GreetingUser greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
            return new GreetingUser(counter.incrementAndGet(), String.format(template, name));
        }
    }
}


    //UC2

    @GetMapping("/message")
    public String get() {
        return "Hello world";
    }
}



    //UC3
    @GetMapping(value = {"/get", "/get/{firstName}", "/get/{firstName}/{lastName}"})
    public String Name(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        return greetingService.name(firstName, lastName);
    }
}


    //UC4

    @PostMapping("/save")
    public GreetingUser add(@RequestBody GreetingUser user) {
        return greetingService.save(user);
    }
}



    //UC5

    @GetMapping("/get/{id}")
    public Optional<GreetingUser> getById(@PathVariable int id) {
        Optional<GreetingUser> result = greetingService.getById(id);
        return result;
    }

}

     */


    //UC6

    @GetMapping("/list")
    public List<GreetingUser> list() {
        List<GreetingUser> result = greetingService.listAll();
        return result;
    }

}

/*
        //UC7
    @PutMapping("/edit")
    public GreetingUser edit(@RequestBody GreetingUser greetingUser){
        return greetingService.update(greetingUser);
    }

    //UC8

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable long id){
        String result = greetingService.deleteById(id);
        return result;

    }
}

*/

