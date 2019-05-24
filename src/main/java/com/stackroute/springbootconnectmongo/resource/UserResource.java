package com.stackroute.springbootconnectmongo.resource;

import com.stackroute.springbootconnectmongo.document.users;
import com.stackroute.springbootconnectmongo.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")

public class UserResource {

private UsersRepository usersRepository;

    public UserResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")


    public List<users> getall()
    {
     return usersRepository.findAll();
    }
}
