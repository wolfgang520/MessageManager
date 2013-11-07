/**
 * 
 */
package com.wolfgang.domain;

import java.util.Set;

/**
 * @author Administrator
 *
 */
public class Group {
	private int id;
	private String name;
	private Set<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
