/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/**
 *
 * @author SanOVG
 */
public class Users {
	@Expose
	ArrayList<User> users = new ArrayList<>();

	public ArrayList<User> getEmployees() {
		return users;
	}

	public void addEmployee(User user) {
		this.users.add(user);
	}
}
