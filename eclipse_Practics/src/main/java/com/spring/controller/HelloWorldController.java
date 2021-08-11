package com.spring.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(value= {"","/","home"})
	public String sayHello() {
		return "Hello from bridgelabz";
	}
	
	@RequestMapping(value = {"/query"}, method= RequestMethod.GET)
	public String getMeassage(@RequestParam(value ="firstname")String fname, @RequestParam(value="lastname")String lname) {
		return "hello"+ fname + " " + lname;
	}
	@GetMapping("get/{name}")
	public String getPrint(@PathVariable String name) {
		return "hello"+" "+name;
	}
	@PostMapping("post")
	public String printPost(@RequestBody User user) {
		return "Hello"+" "+user.getFirstname()+" "+user.getLastname();
	}
	
	public String printPut(@PathVariable String firstname,@RequestParam(value="lastname")String lastname) {
		return "Hello" +" "+firstname+" "+lastname;
	}
}
