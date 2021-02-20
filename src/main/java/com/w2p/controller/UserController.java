package com.w2p.controller;

import com.w2p.model.entity.User;
import com.w2p.services.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private JwtUserDetailsService jwtUserDetailsService;

	@GetMapping({ "/getUserByUsername/{username}" })
	public User getUserByUsername(@PathVariable("username") String username) {

		return jwtUserDetailsService.getUserByUsername(username);
}


}
