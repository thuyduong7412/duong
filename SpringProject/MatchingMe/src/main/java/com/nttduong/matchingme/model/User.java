package com.nttduong.matchingme.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", catalog = "duong", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })//very imp
//@XmlRootElement(name = "user")
//@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "Id_user")
	private int idUser;
	
	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String name;

	@Column(name = "Birth_day")
	private Date birthDay;

	@Column
	private String email;

	@Column
	private String facebook;

	@Column
	private int phone;

	@Column(name = "Id_card")
	private int idCard;

	@Column
	private String gender;

	@Column(name = "Id_right")
//	@OneToOne
//	@JoinColumn(name = "right")
	private int idRight;

	@Column(name = "Id_degree")
	private int idDegree;

	@Column
	private int matp;

	@Column
	private int maqh;

	@Column
	private int xaid;

	@Column(name = "Money_amount")
	private float MoneyAccount;

	
//	private Set<UsersRoles> usersRoleses = new HashSet<UsersRoles>(0);
	
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getIdCard() {
		return idCard;
	}

	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getIdRight() {
		return idRight;
	}

	public void setIdRight(int idRight) {
		this.idRight = idRight;
	}

	public int getIdDegree() {
		return idDegree;
	}

	public void setIdDegree(int idDegree) {
		this.idDegree = idDegree;
	}

	public int getMatp() {
		return matp;
	}

	public void setMatp(int matp) {
		this.matp = matp;
	}

	public int getMaqh() {
		return maqh;
	}

	public void setMaqh(int maqh) {
		this.maqh = maqh;
	}

	public int getXaid() {
		return xaid;
	}

	public void setXaid(int xaid) {
		this.xaid = xaid;
	}

	public float getMoneyAccount() {
		return MoneyAccount;
	}

	public void setMoneyAccount(float moneyAccount) {
		MoneyAccount = moneyAccount;
	}	
	
	public User() {
		super();
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(String username, String password, String name, Date birthDay, String email, int phone, String gender,
			int idRight) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.birthDay = birthDay;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.idRight = idRight;
	}

	public User(String username, String password, int idRight) {
		this.username = username;
		this.password = password;
		this.idRight = idRight;
	}

	public User(int idUser, String username, String password, int idRight) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.idRight = idRight;
	}

	public User(String username, String password, String name, Date birthDay, String email, String facebook, int phone,
			int idCard, String gender, int idRight, int idDegree, int matp, int maqh, int xaid, float moneyAccount) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.birthDay = birthDay;
		this.email = email;
		this.facebook = facebook;
		this.phone = phone;
		this.idCard = idCard;
		this.gender = gender;
		this.idRight = idRight;
		this.idDegree = idDegree;
		this.matp = matp;
		this.maqh = maqh;
		this.xaid = xaid;
		MoneyAccount = moneyAccount;
	}

	
}
/*
 * <session-factory> <!-- Database connection settings --> <property
 * name="connection.driver_class">com.mysql.jdbc.Driver</property> <property
 * name="connection.url">jdbc:mysql://localhost:3306/funix_project</property>
 * <property name="connection.username">root</property> <property
 * name="connection.password">thuyduong056</property>
 * 
 * <!-- JDBC connection pool (use the built-in) --> <property
 * name="connection.pool_size">1</property>
 * 
 * <!-- SQL dialect --> <property
 * name="dialect">org.hibernate.dialect.MySQLDialect</property>
 * 
 * <!-- Enable Hibernate's automatic session context management --> <property
 * name="current_session_context_class">thread</property>
 * 
 * <!-- Disable the second-level cache --> <property
 * name="cache.provider_class">org.hibernate.cache.internal.NoCacheProvider</
 * property>
 * 
 * <!-- Echo all executed SQL to stdout --> <property
 * name="show_sql">true</property>
 * 
 * <mapping class="com.nttduong.matchingme.model.User" />
 * 
 * <!--<mapping class="com.nttduong.matchingme.model.Class" /> <mapping
 * class="com.nttduong.matchingme.model.Degree" /> <mapping
 * class="com.nttduong.matchingme.model.Post" /> <mapping
 * class="com.nttduong.matchingme.model.QuanHuyen" /> <mapping
 * class="com.nttduong.matchingme.model.Right" /> <mapping
 * class="com.nttduong.matchingme.model.Subject" /> <mapping
 * class="com.nttduong.matchingme.model.TinhThanhPho" /> <mapping
 * class="com.nttduong.matchingme.model.User" /> <mapping
 * class="com.nttduong.matchingme.model.XaPhuongThiTran" /> -->
 * 
 * </session-factory>
 */