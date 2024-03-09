package com.example.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
   
   @GetMapping("/get/{id}")
   public ResponseEntity<UserDTO> getUserById(@PathVariable("id") String userId)
   {

	   UserDTO userDTO = userService.getUserById(userId);
	   
	   return new ResponseEntity<>(userDTO, HttpStatus.ACCEPTED);
	   
   }
   
   @PutMapping("/update")
   public ResponseEntity<UserDTO> updateUser(@RequestParam(value ="id" , required= true) String id, @RequestBody UserDTO userdto)
   {
	   
	   UserDTO updatedUserdto= userService.updateUser(id, userdto);
	   
	   return new ResponseEntity<>(updatedUserdto, HttpStatus.ACCEPTED);
   }
   
   @RequestMapping(value = "/delete/{id}" , method= RequestMethod.DELETE)
   public ResponseEntity<UserDTO> deleteUser(@PathVariable("id") String userId)
   {
	
	   UserDTO deletedUserDTO = userService.deleteUser(userId);
	
	   return new ResponseEntity<>(deletedUserDTO, HttpStatus.ACCEPTED);
	   
   }
   
   
   public ResponseEntity<List<UserDTO>> findAll()
   {
	   List<UserDTO> allUserDTOs = userService.findAll();
	   
	   return new ResponseEntity<>(allUserDTOs,HttpStatus.ACCEPTED);
   }
   
   
}
