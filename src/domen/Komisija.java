package domen;

import java.util.Comparator;

public class Komisija {
	
	private String univerzitet, profesor, laboratorija, naucniRad, fak, bod;

	public Komisija(String univerzitet, String profesor, String laboratorija, String naucniRad, String fak, String bod) {
		super();
		this.univerzitet = univerzitet;
		this.profesor = profesor;
		this.laboratorija = laboratorija;
		this.naucniRad = naucniRad;
		this.fak=fak;
		this.bod=bod;
	}

	public String getFak() {
		return fak;
	}

	public void setFak(String fak) {
		this.fak = fak;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public String getUniverzitet() {
		return univerzitet;
	}

	public void setUniverzitet(String univerzitet) {
		this.univerzitet = univerzitet;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getLaboratorija() {
		return laboratorija;
	}

	public void setLaboratorija(String laboratorija) {
		this.laboratorija = laboratorija;
	}

	public String getNaucniRad() {
		return naucniRad;
	}

	public void setNaucniRad(String naucniRad) {
		this.naucniRad = naucniRad;
	}

	@Override
	public String toString() {
		return "Komisija [univerzitet=" + univerzitet + ", profesor=" + profesor + ", laboratorija=" + laboratorija
				+ ", naucniRad=" + naucniRad + "]";
	}

	
   
	 public static Comparator<Komisija> poredjenjeFakulteta = new Comparator<Komisija>() {

			@Override
			public int compare(Komisija o1, Komisija o2) {
				// TODO Auto-generated method stub
				   String uni = o1.getFak().toUpperCase();
				   String uni1 = o2.getFak().toUpperCase();
				   return uni.compareTo(uni1);
			}};
			 
			 public static Comparator<Komisija> poredjenjeProf = new Comparator<Komisija>() {

					@Override
					public int compare(Komisija o1, Komisija o2) {
						// TODO Auto-generated method stub
						   String uni = o1.getProfesor().toUpperCase();
						   String uni1 = o2.getProfesor().toUpperCase();
						   return uni.compareTo(uni1);
					}};

					 public static Comparator<Komisija> poredjenjeNaucni = new Comparator<Komisija>() {

							@Override
							public int compare(Komisija o1, Komisija o2) {
								// TODO Auto-generated method stub
								   String uni = o1.getNaucniRad().toUpperCase();
								   String uni1 = o2.getNaucniRad().toUpperCase();
								   return uni.compareTo(uni1);
							}};

}
