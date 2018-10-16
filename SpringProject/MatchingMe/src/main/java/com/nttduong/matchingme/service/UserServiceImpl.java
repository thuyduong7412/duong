package com.nttduong.matchingme.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.nttduong.matchingme.dao.UserDao;
import com.nttduong.matchingme.model.User;

@Service
//@Transactional
public class UserServiceImpl implements UserService,UserDetailsService {

	@Autowired
	private UserDao userDao;

	// setter for customerDao
	public void setUserDao(UserDao customerDao) {
		this.userDao = customerDao;
	}

	@Override
	public User findById(int id) {
		System.out.println("SERVICE_findById_NAME: " + userDao.findById(id).getName());
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findByUsername(String username) {
//		System.out.println("SERVICE_findByUsername_NAME: " + userDao.findByUsername(username).getName());
		return userDao.findByUsername(username);
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public void deleteById(int id) {
		userDao.deleteById(id);

	}

	public void deleteByUsername(String id) {
		userDao.deleteByUsername(id);		
	}
	
	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
		System.out.println("SERVICE: " + user.getName());
	}

	@Override
	public boolean isExit(User user) {
		return userDao.isExit(user);
	}

	@Override
	public void deleteAll() {
		userDao.deleteAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User u = userDao.findByUsername(username);
//		System.out.println("USER_load: " + u);
		if (u == null) {
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
//		System.out.println("USER_load_notnull: " + u.getName() +", RIGHT: "+u.getIdRight());
//		System.out.println("USER_load_password: "+u.getPassword());
		
		String role = null;
		
		switch(u.getIdRight()) {
		case 1: 
			role = "ROLE_ADMIN";
			break;
		case 2:
			role = "ROLE_TUTOR";
			break;
		case 3:
			role = "ROLE_HOST";
			break;
		default:
			break;
		}
		
		GrantedAuthority authority = new SimpleGrantedAuthority(role);
		
		boolean enabled = true;
	    boolean accountNonExpired = true;
	    boolean credentialsNonExpired = true;
	    boolean accountNonLocked = true;
		
		UserDetails userDetail = (UserDetails) new org.springframework.security.core.userdetails.User
				(u.getUsername(), u.getPassword(), enabled, accountNonExpired, credentialsNonExpired,
						accountNonLocked, Arrays.asList(authority));
		System.out.println(userDetail.getAuthorities());
		return userDetail;
	}

}
