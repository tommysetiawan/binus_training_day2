package com.blibli.training.springweb.service.impl;

import com.blibli.training.springweb.entity.User;
import com.blibli.training.springweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by tommy.setiawan on 3/9/2021.
 */
@Component
public class UserServiceImpl implements UserService {

  @Autowired
  @Qualifier("users")
  private List<User> users;

  public User getUserByFirstName(String firstName){
    for(User user:users){
      if(user.getFirstName().equals(firstName)){
        return user;
      }
    }
    return null;
  }

  public User getUserByLastName(String lastName){
    for(User user:users){
      if(user.getLastName().equals(lastName)){
        return user;
      }
    }
    return null;
  }

  public List<User> getAllUsers(){
    return users;
  }

  public User addUser(User user){
    users.add(user);
    return user;
  }
}
