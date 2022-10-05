package com.yamani.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yamani.model.DAOUser;


@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
}