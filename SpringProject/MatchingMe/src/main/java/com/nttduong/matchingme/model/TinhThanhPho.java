package com.nttduong.matchingme.model;

public class TinhThanhPho {
	private int matp;
	private String name;
	private String type;

	public int getMatp() {
		return matp;
	}

	public void setMatp(int matp) {
		this.matp = matp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TinhThanhPho() {
		super();
	}

	public TinhThanhPho(int matp, String name, String type) {
		super();
		this.matp = matp;
		this.name = name;
		this.type = type;
	}
}
