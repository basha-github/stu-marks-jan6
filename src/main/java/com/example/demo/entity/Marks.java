package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marks {
	
	@Id
	private int roolNo;
	private String name;
	private String course;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	private int sub6;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getSub4() {
		return sub4;
	}
	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}
	public int getSub5() {
		return sub5;
	}
	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}
	public int getSub6() {
		return sub6;
	}
	public void setSub6(int sub6) {
		this.sub6 = sub6;
	}
	@Override
	public String toString() {
		return "Marks [roolNo=" + roolNo + ", name=" + name + ", course=" + course + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + ", sub4=" + sub4 + ", sub5=" + sub5 + ", sub6=" + sub6 + "]";
	}
	
	
	

}
