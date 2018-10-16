package com.nttduong.matchingme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class Class {
	
	@Id
    @Column(name = "Id_class")
	private int IdClass;
	 @Column(name = "Class_name")
	private String className;
	
   
	public int getId_class() {
		return IdClass;
	}

	public void setIdClass(int idClass) {
		IdClass = idClass;
	}


	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Class() {
		super();
	}

	public Class(String className) {
		super();
		this.className = className;
	}

}

