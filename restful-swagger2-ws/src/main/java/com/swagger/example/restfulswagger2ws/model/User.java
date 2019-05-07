package com.swagger.example.restfulswagger2ws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Component
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id()
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String occupation;
    private double salary;
}


/*
[
  {
    "id": 1,
    "firstName": "Nayan",
    "lastName": "Kumar",
    "gender": "male",
    "occupation": "employed",
    "salary": 78000
  },
  {
    "id": 2,
    "firstName": "Tatsavi",
    "lastName": "BN",
    "gender": "femal",
    "occupation": "employed",
    "salary": 178000
  },
  {
    "id": 3,
    "firstName": "Sowmya",
    "lastName": "BN",
    "gender": "female",
    "occupation": "employed",
    "salary": 128000
  }
]
 */