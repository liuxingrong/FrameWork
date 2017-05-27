package com.team.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService{

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		if(username.equals("admin")){
			authorities.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
			authorities.add(new GrantedAuthorityImpl("ROLE_USER"));
		}
		User user = new User(username, "admin123", authorities);
		return user;
	}

}
