package com.example.demo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.userDAO;
import com.example.demo.models.user;

@Service
public class userService {
	@Autowired
    private userDAO repos;

	public user addUser(user usr) {
		return repos.save(usr);
	}
	public void removeUser(int id )
	{
		repos.deleteById(id);
	}
	public user updateUser(user u )
	{
		return repos.save(u);
	}
	public Collection<user> getAllUser(){
		return repos.findAll();
	}
	public void deleteUser(user u) {
		repos.delete(u);
	}
	public user signin(String email,String password) {
		return repos.signin(email,password);
	}
}
