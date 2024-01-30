package com.coderscampus.base;

public class SuperUser extends User {
	public SuperUser() {
		this.setWriteAccess(true);
		this.setSuperUser(true);
	}
}
