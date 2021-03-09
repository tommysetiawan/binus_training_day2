package com.blibli.training.springweb.service;

import com.blibli.training.springweb.entity.User;

import java.util.List;

/**
 * Created by tommy.setiawan on 3/9/2021.
 */
public interface UserService {
  User getUserByFirstName(String firstName);
  User getUserByLastName(String lastName);
  List<User> getAllUsers();
  User addUser(User user);
}
