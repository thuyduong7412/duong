package com.nttduong.matchingme.service;

import java.util.List;

import com.nttduong.matchingme.model.User;

public interface UserService {

	public User findById(int id);

	public User findByUsername(String username);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteById(int id);
	
	public void deleteByUsername(String username);
	
	public void deleteAll();
	
	public List<User> findAll();
	
	public boolean isExit(User user);


}
//@Path("/user")
//public class UserService {
//
//	@GET
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public List<User> getUsers_JSON() {
//		List<User> listOfCountries = UserDAO.getAllUsers();
//		return listOfCountries;
//	}
//	
//	@GET
//	@Path("/{username}")
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public User getEmployee(@PathParam("username") String username) {
//		return UserDAO.getUser(username);
//	}
//	
//	@POST
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public User addUser(User user) {
//		return UserDAO.addUser(user);
//	}
//	
//	@PUT
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public User updateUser(User user) {
//		return UserDAO.updateUser(user);
//	}
//
//	@DELETE
//	@Path("/{username}")
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public void deleteUser(@PathParam("username") String username) {
//		UserDAO.deleteUser(username);
//	}
//	
	