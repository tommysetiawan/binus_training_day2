package com.blibli.training.springweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by tommy.setiawan on 3/9/2021.
 */
@Data
@AllArgsConstructor
public class User {
  private String firstName;
  private String lastName;
  private int age;
  private String address;
}
