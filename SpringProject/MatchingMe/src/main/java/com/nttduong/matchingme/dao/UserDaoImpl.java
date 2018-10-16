package com.nttduong.matchingme.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.nttduong.matchingme.model.User;

//@Repository(value = "userDAO")
//@Transactional(rollbackFor = Exception.class)
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	// setter for sessionFactory
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User u = new User();
		try {
//			u = (User) session.get(User.class, id);
			u = (User) session.createQuery("From com.nttduong.matchingme.model.User U WHERE U.idUser = " + id)
					.getSingleResult();
			System.out.println(u.getUsername());
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		session.close();

		return u;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<User> list = new ArrayList<User>();
		try {
//			System.out.println("AAAA");
			list = session.createQuery("From com.nttduong.matchingme.model.User").getResultList();
//			System.out.println("2222");
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		session.close();
		return list;
	}

	@Override
	public void saveUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		session.close();
	}

	@Override
	public void deleteById(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User u = new User();
		try {
			u = (User) session.createQuery("From com.nttduong.matchingme.model.User U WHERE U.idUser = " + id)
					.getSingleResult();
			System.out.println(id + "_");
//			int result = session.createQuery("DELETE com.nttduong.matchingme.model.User U WHERE U.idUser = "+ id) 
//					.executeUpdate(); // => also correct 
//			System.out.println(result);
			
			session.delete(u);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		session.close();
	}

	public void deleteByUsername(String username) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		User u = new User();
		try {
//			u = (User) session.createQuery("From com.nttduong.matchingme.model.User U WHERE U.username = "+ id).getSingleResult();
			int result = session.createQuery("DELETE com.nttduong.matchingme.model.User U WHERE U.username = "+ username).executeUpdate();
			System.out.println(result);
//			session.delete(u);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		session.close();
	}
	

	@Override
	public User findByUsername(String username) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User u = new User();
		try {
			u = (User) session.createQuery("From com.nttduong.matchingme.model.User U WHERE U.username=?").setParameter(0, username)
					.getSingleResult();
//			Query q = session.createQuery("From com.nttduong.matchingme.model.User U WHERE U.username=?" );
//			q.setParameter(0, username);
//			u = (User) q.getSingleResult();
			if(u.getUsername() == null) {
				return null;
			}
			
			System.out.println("DAO: " + u.getName());
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		session.close();

		return u;
	}

	@Override
	public boolean isExit(User user) { 
		System.out.println("AHIHI: " + findByUsername(user.getUsername()).toString());
		System.out.println("AHhaha: " + findByUsername(user.getUsername()).getEmail());
		
		if((findById(user.getIdUser()).getName() != null) || (findByUsername(user.getUsername()).getName() != null)) {
			return true;
		}
		return false;
//		return findByUsername(user.getUsername()) != null ; //always false => SAI
	}
	
	@Override
	public void updateUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if (user != null) {
			try {
				System.out.println("DAO: " + user.getName());
				
				//c1
				session.update(user);
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
			}
		}
		session.close();
	}

	@Override
	public void deleteAll() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.createQuery("delete from com.nttduong.matchingme.model.User").executeUpdate();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		}
		session.close();
	}
}

//c2
//@SuppressWarnings("rawtypes")
//Query query = session.createQuery("update user set Money_amount=?, Birth_day=?, email=?, facebook=?, "
//		+ "gender=?, Id_card=?, Id_degree=?, Id_right=?, Id_user=?, maqh=?, matp=?, name=?, password=?,"
//		+ " phone=?, xaid=? where username="+ user.getIdUser());
//
//query.setParameter(0, user.getMoneyAccount());
//query.setParameter(1, user.getBirthDay());
//query.setParameter(2, user.getEmail());
//query.setParameter(3, user.getFacebook());
//query.setParameter(4, user.getGender());
//query.setParameter(5, user.getIdCard());
//query.setParameter(6, user.getIdDegree());
//query.setParameter(7, user.getIdRight());
//query.setParameter(8, user.getIdUser());
//query.setParameter(9, user.getMaqh());
//query.setParameter(10, user.getMatp());
//query.setParameter(11, user.getName());
//query.setParameter(12, user.getPassword());
//query.setParameter(13, user.getPhone());
//query.setParameter(14, user.getXaid());
//
//int result = query.executeUpdate();

//c3
//int result = session.createQuery("update user set Money_amount= " + user.getMoneyAccount() 
//	+ ", Birth_day = "+ user.getBirthDay() 
//	+ ", email = " + user.getEmail() 
//	+ ", facebook = " +user.getFacebook()
//	+ ", gender = " +user.getGender()
//	+ ", Id_card = " +user.getIdCard()
//	+ ", Id_degree = " +user.getIdDegree()
//	+ ", Id_right = " + user.getIdRight()
//	+ ", Id_user = " + user.getIdUser()
//	+ ", maqh = " + user.getMaqh()
//	+ ", matp = " + user.getMatp()
//	+ ", name = " + user.getName()
//	+ ", password = " +user.getPassword()
//	+ ", phone = " + user.getPhone()
//	+ ", xaid = " + user.getXaid()
//	+ " where username = "+ user.getUsername()).executeUpdate();
//
//System.out.println(result);

