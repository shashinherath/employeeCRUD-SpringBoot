package com.employees.employeecrudspringboot.repository;

import com.employees.employeecrudspringboot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
