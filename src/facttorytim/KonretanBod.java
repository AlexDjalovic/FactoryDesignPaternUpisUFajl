package facttorytim;

import java.util.HashSet;

public class KonretanBod implements Bodovi{
	private int bod;
	private String vrednost;
	
	public KonretanBod(int bod) {
	// TODO Auto-generated constructor stub
		this.bod=bod;
		
		potrebniBodovi();
}
	
	@Override
	public String potrebniBodovi() {
		// TODO Auto-generated method stub
		
		if(bod>42 ){
			vrednost="Uslovi ispunjeni za bod";
			System.out.println("Stigao u konkretan bod "+vrednost);
			return vrednost ;
		}else{
			vrednost="Nema dovoljan broj bodova!";
			return vrednost;
			
		}
		
	}

	@Override
	public String vrati() {
		// TODO Auto-generated method stub
		return vrednost;
	}

}
