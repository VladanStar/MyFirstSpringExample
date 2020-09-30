package rs.ac.singidunum.fir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		/*
		Osoba osoba = new Osoba("Pera Peric", 2352325);
		osoba.pozdravi();
		Adresa adresa  = new Adresa("Danijelova 32", "11000");
		osoba.setUzrast(35);
		osoba.setAdresa(adresa);
		
		*
		*/
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Osoba osoba = (Osoba) context.getBean("osoba");
		osoba.pozdravi();
		System.out.println(osoba);
		
		Adresa adresa = (Adresa) context.getBean("adresa");
		
		System.out.println(adresa);
		((FileSystemXmlApplicationContext)context).close();

	}

}
