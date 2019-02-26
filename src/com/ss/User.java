package com.ss;

import java.io.Serializable;

import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

public class User extends JdkSerializationRedisSerializer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;

	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
