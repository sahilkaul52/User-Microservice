package com.example.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.payload.UserDTO;
import com.example.user.service.services.UserService;

@Component
@RestController
@RequestMapping("/user")
public class UserController 
{

   @Autowired
   UserService userService;	
	
   @PostMapping("/create")
   public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userdto)
   {
	   
	   UserDTO userDTO2 = userService.createUser(userdto);   
	   return new ResponseEntity<>(userDTO2, HttpStatus.CREATED);
	   
   }
   
   
	
   
	
	
}
