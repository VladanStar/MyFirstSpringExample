package rs.ac.singidunum.fir;

public class Adresa {
	
	private String ulica; //Danijelova 32
	private String postanskiBroj; //11000
	
	public Adresa (){
		
	}

	public Adresa(String ulica, String postanskiBroj) {
		this.ulica = ulica;
		this.postanskiBroj = postanskiBroj;
	}

	@Override
	public String toString() {
		return "Adresa [ulica=" + ulica + ", postanskiBroj=" + postanskiBroj
				+ "]";
	}
	
	public void onCreate(){
		System.out.println("Kreirano je zrno " + this);
	}
	
	public void onDestroy(){
		System.out.println("Unisteno je zrno " + this);
	}
			

}
