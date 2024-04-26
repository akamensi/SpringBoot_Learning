package com.aka.ams.controllers;

public class Provider {
	
	private String name;
	private String adress;
	private String phone;
	
	public Provider(String name, String adress, String phone) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}
	
	

	public Provider() {
		super();
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "Provider [name=" + name + ", adress=" + adress + ", phone=" + phone + "]";
	}
	
	
	
	

}
