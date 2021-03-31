package com.backlabs.projects.shoppingstore.core.modules.user.repository;

import com.backlabs.projects.shoppingstore.core.modules.user.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends MongoRepository<User, Serializable> {
//    public User findByEmail(String email);
}
