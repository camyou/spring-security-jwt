package com.projects.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projects.model.UserDao;

@Repository
public interface UserRepository extends CrudRepository<UserDao, Integer> {

	UserDao findByUsername(String username);
}