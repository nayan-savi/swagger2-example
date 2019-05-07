package com.swagger.example.restfulswagger2ws.service;

import com.swagger.example.restfulswagger2ws.model.User;
import com.swagger.example.restfulswagger2ws.resources.UserResource;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserService {
    @Autowired
    private UserResource userResource;


    @ApiOperation(value = "Get user by lastname", response = User.class, tags = "getUserByLastName")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!")})
    @GetMapping("/user")
    public List<User> getUserByLastName(String lastName) {
        return userResource.getUsersByLastName(lastName);
    }

    @ApiOperation(value = "save user", response = User.class, tags = "saveUser")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!")})
    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userResource.save(user);
    }

    @ApiOperation(value = "get users", response = List.class, tags = "getUsers")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!")})
    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userResource.findAll();
    }
}
