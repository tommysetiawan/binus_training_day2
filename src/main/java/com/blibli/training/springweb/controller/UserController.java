package com.blibli.training.springweb.controller;

import com.blibli.training.springweb.entity.User;
import com.blibli.training.springweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tommy.setiawan on 3/9/2021.
 */
@RestController
@RequestMapping(path = "/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

  @GetMapping(path = "/{firstName}",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
  public User getUserByFirstName(@PathVariable(value = "firstName") String firstName){
    return userService.getUserByFirstName(firstName);
  }

  @GetMapping(path = "/byLastName")
  public  User getUserByLastName(@RequestParam(value = "name") String lastName){
    return userService.getUserByLastName(lastName);
  }

  @PostMapping
  public  User addUser(@RequestBody User user){
    return userService.addUser(user);
  }
}
