package com.webservicespringjpa.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webservicespringjpa.course.entities.User;
import com.webservicespringjpa.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Edson Wisses", "wisses@gmail.com", "98888888","123456");
		User u2 = new User(null, "Isabela Wisses", "belawisses@gmail.com","99887766","654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

	
}
