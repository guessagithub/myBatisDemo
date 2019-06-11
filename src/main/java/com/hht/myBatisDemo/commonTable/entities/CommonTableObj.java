package com.hht.myBatisDemo.commonTable.entities;

public class CommonTableObj {
	
	private String id;
	private String name;
	private int age;
	private String address;
	private String fcu;
	private String fcd;
	private String lcu;
	private String lcd;
	
	public CommonTableObj() {};
	
	public CommonTableObj(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public CommonTableObj(String name, int age, String address, String fcu, String fcd, String lcu, String lcd) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.fcu = fcu;
		this.fcd = fcd;
		this.lcu = lcu;
		this.lcd = lcd;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFcu() {
		return fcu;
	}
	public void setFcu(String fcu) {
		this.fcu = fcu;
	}
	public String getFcd() {
		return fcd;
	}
	public void setFcd(String fcd) {
		this.fcd = fcd;
	}
	public String getLcu() {
		return lcu;
	}
	public void setLcu(String lcu) {
		this.lcu = lcu;
	}
	public String getLcd() {
		return lcd;
	}
	public void setLcd(String lcd) {
		this.lcd = lcd;
	}
	
	

}
