package com.example.repo;

import javax.servlet.http.HttpSession;

import org.springframework.data.repository.CrudRepository;

import com.example.model.User;

public interface Urepository extends CrudRepository<User, String> {

}
