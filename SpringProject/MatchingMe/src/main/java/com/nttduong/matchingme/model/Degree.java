package com.nttduong.matchingme.model;


public class Degree {
	
	private int IdDegree;
	private String degreeName;
	
	public int getIdDegree() {
		return IdDegree;
	}

	public void setIdDegree(int idDegree) {
		IdDegree = idDegree;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public Degree() {
		super();
	}

	public Degree(String degreeName) {
		super();
		this.degreeName = degreeName;
	}

}
