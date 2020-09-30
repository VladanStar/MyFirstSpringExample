package com.vladancupric;

public class Adresa {
	private String street;
	private String postCode;
	
	public Adresa() {
		
	}
	public Adresa(String street, String postCode) {
		this.street = street;
		this.postCode = postCode;	
	}
	@Override
	public String toString() {
		return "Adresa [street=" + street + ", postCode=" + postCode + "]";
	}
	

}
