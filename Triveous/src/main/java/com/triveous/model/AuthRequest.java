package com.triveous.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AuthRequest {
	@NotBlank(message = "Username cannot be blank")
	private String username;

	@NotBlank(message = "Password cannot be blank")
	@Size(min = 6, message = "Password must be at least 6 characters long")
	private String password;

}
