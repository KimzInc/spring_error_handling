package com.kimz.validate.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable long id) {

		return this.userService.getUserById(id);

	}

	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user){
	return this.userService.save(user);
	}

	// @GetMapping("/users/{id}")
	// public ResponseEntity<?> getUser(@PathVariable long id) {
	// try {
	// return ResponseEntity.ok(userService.getUserById(id));
	// }
	// catch (Exception exception) {
	// ApiError error = new ApiError(404, "User not found", "/users/"+id);
	// return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	// }
	// }


}
