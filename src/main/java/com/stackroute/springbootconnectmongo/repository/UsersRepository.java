package com.stackroute.springbootconnectmongo.repository;


import com.stackroute.springbootconnectmongo.config.Mongodbconfig;
import com.stackroute.springbootconnectmongo.document.users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository  extends MongoRepository<users,Integer> {
}
