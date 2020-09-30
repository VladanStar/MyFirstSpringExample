package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// standardna Java
		/*	Osoba osoba = new Osoba();
		osoba.speak();
*/
		// Spring way
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Osoba osoba = (Osoba)context.getBean("osoba");
		osoba.speak();
		Adresa adresa =(Adresa)context.getBean("adresa");
		//adresa.toString();
		System.out.println(osoba);
		
		((FileSystemXmlApplicationContext)context).close();
	}

}
