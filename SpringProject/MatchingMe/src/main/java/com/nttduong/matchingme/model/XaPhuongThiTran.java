package com.nttduong.matchingme.model;

public class XaPhuongThiTran {
	private int xaid;
	private String name;
	private String type;
	private String maqh;

	public int getXaid() {
		return xaid;
	}

	public void setXaid(int xaid) {
		this.xaid = xaid;
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

	public String getMaqh() {
		return maqh;
	}

	public void setMaqh(String maqh) {
		this.maqh = maqh;
	}

	public XaPhuongThiTran() {
		super();
	}

	public XaPhuongThiTran(int xaid, String name, String type, String maqh) {
		super();
		this.xaid = xaid;
		this.name = name;
		this.type = type;
		this.maqh = maqh;
	}

}
