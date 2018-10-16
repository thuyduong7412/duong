package com.nttduong.matchingme.controller;


//class Spring Security
/*
* 1.extends WebSecurityConfigurerAdapter
* 2.@EnableWebSecurity: kích hoạt việc tích hợp Spring Security với Spring MVC
* 
*/
//@Controller
public class LoginController  {

//	@RequestMapping(value = "checklogin", method = RequestMethod.POST)
//	public String login(HttpServletRequest req, HttpServletResponse res) {
//		String username = req.getParameter("txtUsername");
//		String password = req.getParameter("txtPassword");
//		System.out.println(username);
//		System.out.println(password);
//
//		int i = degree(username);
//		if (checkLogin(username, password)) {
//			HttpSession session = req.getSession();
//			session.setAttribute("username", username);
//			session.setAttribute("password", password);
//			
//			System.out.println("Correct");
//			System.out.println(i);
//
//			switch (i) {
//			case 1:
//				return "WelcomeAdmin";
//			case 2:
//				return "Welcomegs";
//			case 3:
//				return "Welcomegc";
//			default:
//				System.out.println("AHIHI-TRUE");
//				req.setAttribute("error", 0);
//				try {
//					req.getRequestDispatcher("/login.htm?error=0").forward(req, res);
//				} catch (ServletException | IOException e) {
//					System.out.println("DEFAULT"+e.getMessage());
//					e.printStackTrace();
//				}
//				return "LoginPage";
//			}
//		} else {
////			System.out.println("Not Correct");
//			try {
//				req.getRequestDispatcher("/login.htm?error=0").forward(req, res);
//			} catch (ServletException e) {
//				System.out.println(e.getMessage());
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
////			JOptionPane.showMessageDialog(null, "Thang Phong Bi KHung", "AHIHIH", JOptionPane.INFORMATION_MESSAGE);
//			return "LoginPage";
//		}
//	}
//
//	public static boolean checkLogin(String user, String pass) {
//		Connection con = ConnectMysql.getJDBCConnection();
//		String sql = "select Username from user where Username='" + user + "' and PassWord='" + pass + "'";
//		// Statement stmt = null;
//		System.out.println(sql);
//		boolean check = false;
//
//		try {
//			PreparedStatement stmt = con.prepareStatement(sql);
//			// stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			if (rs.next()) {
//				con.close();
//				check = true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return check;
//	}
//
//	public static int degree(String user) {
//		int de = 0;
//		Connection con = ConnectMysql.getJDBCConnection();
//		String sql = "select * from user where Username='" + user + "'";
//		// Statement stmt = null;
//		System.out.println(sql);
//		try {
//			PreparedStatement stmt = con.prepareStatement(sql);
//			// stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			rs.first();
//			String degree = rs.getString("Id_right");
//			switch (degree) {
//			case "1":
//				de = 1;
//				break;
//			case "2":
//				de = 2;
//				break;
//			case "3":
//				de = 3;
//				break;
//			default:
//				de = 0;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return de;
//
//	}
	
	
	//	HIBERNATE
//	static boolean checkLogin(String username, String password) {
//		SessionFactory sessionFactory;
//		sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
//				.buildSessionFactory();
//
//		Session session = sessionFactory.openSession();
//
//		Transaction tx = session.beginTransaction();
//
//		String hql = "FROM com.nttduong.matchingme.model.User U WHERE U.username = :username AND U.password = :password";
//		@SuppressWarnings("unchecked")
//		Query<User> query = session.createQuery(hql);
//		query.setParameter("username", username);
//		query.setParameter("password", password);
//		User a = query.getSingleResult();	//.uniqueResult();
//		tx.commit();
//		session.close();
//		if (a == null) {
//			return false;
//		} else {
//			return true;
//		}
//	}
	
//	static int degree(String username) {
//		SessionFactory sessionFactory;
//		sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
//				.buildSessionFactory();
//
//		Session session = sessionFactory.openSession();
//
//		Transaction tx = session.beginTransaction();
//
//		String hql = "FROM com.nttduong.matchingme.model.User U WHERE U.username = :username";
//		@SuppressWarnings("unchecked")
//		Query<User> query = session.createQuery(hql);
//		query.setParameter("username", username);
//		User a = query.getSingleResult();	//.uniqueResult();
//		tx.commit();
//		session.close();
//		if (a == null) {
//			return -1;
//		} else {
//			return a.getIdRight();
//		}
//		
//	}
	
//	 @RequestMapping(value = { "/login", "/" })
//	  public String login(@RequestParam(value = "error", required = false) final String error, final Model model) {
//	    if (error != null) {
//	      model.addAttribute("message", "Login Failed!");
//	    }
//	    return "LoginPage";
//	  }
//	  @RequestMapping("/admin")
//	  public String admin() {
//	    return "WelcomeAdmin";
//	  }
//	  @RequestMapping("/tutor")
//	  public String user() {
//	    return "Welcomegs";
//	  }
	
	  
	
	
}
