package com.nttduong.matchingme.testhibernate;

public abstract class Animal {
	private String species;
	int a;
	
	public abstract void Sound();

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}
