package com.nttduong.matchingme.dao;

import java.util.List;

import com.nttduong.matchingme.model.User;

public interface UserDao {
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




//private static Map<String, User> userMap = new HashMap<String, User>();
//
//static { 
//	initUser();		
//};
//
//private static void initUser() {
//	User u1 = new User("aaa", "password", 2);
//	User u2 = new User("bbb", "password", 2);
//	User u3 = new User("ccc","pass",3);
//	userMap.put(u1.getUsername() ,u1 );
//	userMap.put(u1.getUsername(), u2);
//	userMap.put(u3.getUsername(), u3);
//}
//
//public static User getUser(String empNo) {
//	return userMap.get(empNo);
//}
//
//public static User addUser(User emp) {
//	userMap.put(emp.getUsername(), emp);
//	return emp;
//}
//
//public static User updateUser(User emp) {
//	userMap.put(emp.getUsername(), emp);
//	return emp;
//}
//
//public static void deleteUser(String empNo) {
//	userMap.remove(empNo);
//}
//
//public static List<User> getAllUsers() {
//	Collection<User> c = userMap.values();
//	List<User> list = new ArrayList<User>();
//	list.addAll(c);
//	return list;
//}

