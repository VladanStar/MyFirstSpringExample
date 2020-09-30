package rs.ac.singidunum.fir;

public class Osoba {
	
	private String ime;
	private int jmbg;
	
	private int uzrast;
	private Adresa adresa;
	
	public Osoba() {
		
	}
	
	public Osoba(String ime, int jmbg) {
		this.ime = ime;
		this.jmbg = jmbg;
	}

	public void setAdresa (Adresa adresa){
		this.adresa = adresa;
	}
	
	public void setUzrast(int uzrast){
		this.uzrast = uzrast;
	}

	public void pozdravi(){
		System.out.println("Zdravo, ja sam " + this.ime + " i imam " + this.uzrast + " godina");
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", jmbg=" + jmbg + ", uzrast=" + uzrast
				+ ", adresa=" + adresa + "]";
	}
	
	public void onCreate(){
		System.out.println("Kreirano je zrno: " + this);
	}
	
	public void onDestroy(){
		System.out.println("Unisteno je zrno: " + this);
	}

}
