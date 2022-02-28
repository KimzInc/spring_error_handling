package com.kimz.validate.user;

import com.kimz.validate.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUserById(long id) {

		return userRepository.findById(id).orElseThrow(() -> new NotFoundException("User does not exits"));
	}

    public User save(User user) {
		return this.userRepository.save(user);
    }
}
