package com.projects.model;

import lombok.Data;

@Data
public class User {

	private String status;

	private User(String status) {
		this.status = status;
	}

	public static User of(String status) {
		return new User(status);
	}
}
