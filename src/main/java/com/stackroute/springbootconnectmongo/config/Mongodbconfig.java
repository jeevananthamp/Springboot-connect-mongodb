package com.stackroute.springbootconnectmongo.config;

import com.stackroute.springbootconnectmongo.document.users;
import com.stackroute.springbootconnectmongo.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class Mongodbconfig {

    @Bean
    CommandLineRunner cmdrunner (UsersRepository usersRepository)
    {
        return strings ->{

                 usersRepository.save(new users(1,"jeevanantham",21,"stackroute"));
                 usersRepository.save(new users(2,"jaswanth",21,"stackroute"));


        };
    }
}
