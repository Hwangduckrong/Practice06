package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	private int cNO;
	private int point;
	//생성자
	public Customer() {
		super();
	}
	public Customer(String name, String hp, int cNO, int point) {
		super();
		super.setName(name);
		super.setHp(hp);
		this.cNO = cNO;
		this.point = point;
	}
	//메소드
	public int getcNO() {
		return cNO;
	}
	public void setcNO(int cNO) {
		this.cNO = cNO;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void showInfo() {
		System.out.println("#이름: "+super.getName()+","+"#핸드폰: "+super.getHp()+","+"#고객번호: "+cNO+","+"#포인트점수:"+point);
	}

	
}
