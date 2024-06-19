package com.sis324.citas.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sis324.citas.model.User;
import com.sis324.citas.repository.UserRepository;

@Service
public class UserService {

    @Autowired
	UserRepository userRepository;

    public ArrayList<User> getUsers(){
        return ((ArrayList<User>) userRepository.findAll());
    }

    public User save(User user){
        return (userRepository.save(user));
    }

	public boolean delete(Long id){
		try {
			userRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}