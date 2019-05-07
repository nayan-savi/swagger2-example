package com.swagger.example.restfulswagger2ws.resources;

import com.swagger.example.restfulswagger2ws.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserResource extends JpaRepository<User, Long> {
    List<User> getUsersByLastName(String lastName);
}
