package net.hari.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.hari.spring.model.User;
import net.hari.spring.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
