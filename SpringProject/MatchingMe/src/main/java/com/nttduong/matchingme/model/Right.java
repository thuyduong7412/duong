package com.nttduong.matchingme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "right", catalog = "duong")
public class Right implements java.io.Serializable {

	/**
	 * ID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
//	@OneToMany(mappedBy="right")
	@Column(name = "Id_right")
	private int IdRight;

	@Column(name = "Right_name")
	private String rightName;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "right")
//	private Set<UsersRoles> usersRoleses = new HashSet<UsersRoles>(0);
	
	public int getIdRight() {
		return IdRight;
	}

	public void setIdRight(int idRight) {
		IdRight = idRight;
	}

	public String getRightName() {
		return rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}
	
//	public Set<UsersRoles> getUsersRoleses() {
//		return usersRoleses;
//	}
//
//	public void setUsersRoleses(Set<UsersRoles> usersRoleses) {
//		this.usersRoleses = usersRoleses;
//	}

}
