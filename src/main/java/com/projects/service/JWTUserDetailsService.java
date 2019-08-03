package com.projects.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JWTUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (username.equals("admin")) {
			return new User(username, "$2a$10$ZSJxhHcA8VOToBODUYktFu1XMZHD0kVoYtN85ckmoXFFK61D04TTi",
					new ArrayList<>());
		}
		throw new UsernameNotFoundException("User with " + username + " is not found");
	}

}
