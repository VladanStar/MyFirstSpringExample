package com.vladancupric;

public class Osoba {
	
	private int jmbg;
	private String ime;
	private int age;
	private Adresa adresa;
	
	public Osoba() {
		
	}
	public Osoba(String ime, int jmbg) {
		this.ime = ime;
		this.jmbg = jmbg;
		
	}
	// depedency injection
	// injekcija zavisnosti
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak() {
		System.out.println("Hello, I am "+ this.ime + " my jmbg is: " + this.jmbg);
	}
	@Override
	public String toString() {
		return "Osoba [jmbg=" + jmbg + ", ime=" + ime + ", age=" + age + ", adresa=" + adresa + "]";
	}
	public void onCreate() {
		// dodatna inicijalizacija
		System.out.println("Osoba.onCreate()" + this);
	}
	public void onDestroy() {
		// poziva se pre unistenja, gasenja konteksta
		System.out.println("Person destroy" + this);
	}

}
