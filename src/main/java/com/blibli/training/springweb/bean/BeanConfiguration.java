package com.blibli.training.springweb.bean;

import com.blibli.training.springweb.entity.Cart;
import com.blibli.training.springweb.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tommy.setiawan on 3/9/2021.
 */
@Configuration
public class BeanConfiguration {

  @Bean(name = "users")
  public List<User> getUsers(){
    List<User> users = new ArrayList<>();
    User user = new User("tommy","setiawan", 20, "Jakarta");
    users.add(user);
    return users;
  }

  @Bean(name = "carts")
  public List<Cart> carts(){
    return new ArrayList<>();
  }
}
