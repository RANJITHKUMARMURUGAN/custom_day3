package com.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.User;

public interface UserDAO extends CrudRepository<User, Integer>{

}
