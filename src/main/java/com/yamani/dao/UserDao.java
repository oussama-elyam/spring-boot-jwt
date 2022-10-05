package com.yamani.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yamani.model.User;


@Repository
public interface UserDao extends CrudRepository<User, Integer> {
}