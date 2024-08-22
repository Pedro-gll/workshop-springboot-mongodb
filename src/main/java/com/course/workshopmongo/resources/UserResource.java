package com.course.workshopmongo.resources;

import com.course.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //@RequestMapping(method = RequestMethod.GET) Essas duas formas funcionam.
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "maria", "maria@gmail.com");
        User alex = new User("2", "alex", "alex@gmail.com");
        List<User> list = new ArrayList<User>();
        list.addAll(Arrays.asList(maria,alex));
        return ResponseEntity.ok().body(list);
    }
}
