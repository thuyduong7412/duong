package com.nttduong.matchingme.model;

public class Subject {
	
	private int IdSubject;
	private String SubjectName;

	
	public int getIdSubject() {
		return IdSubject;
	}

	public void setIdSubject(int idSubject) {
		IdSubject = idSubject;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public Subject() {
		super();
	}

	public Subject(String subject_name) {
		super();
		SubjectName = subject_name;
	}

}
