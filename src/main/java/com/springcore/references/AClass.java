package com.springcore.references;

public class AClass {
	private int x;
	private BClass ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public BClass getOb() {
		return ob;
	}
	public void setOb(BClass ob) {
		this.ob = ob;
	}
	public AClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AClass [x=" + x + ", ob=" + ob + "]";
	}
	
	
}
