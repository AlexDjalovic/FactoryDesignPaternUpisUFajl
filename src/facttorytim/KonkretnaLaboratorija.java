package facttorytim;

import java.util.HashSet;

public class KonkretnaLaboratorija implements Laboratorija {

	private HashSet<String>hash;
	private String vrednost;
	public KonkretnaLaboratorija(HashSet<String>hash) {
		// TODO Auto-generated constructor stub
		this.hash=hash;
	
		
	}
	@Override
	public String potrebanbrojLaboratorija() {
		// TODO Auto-generated method stub
		if(hash.size()>2){
			vrednost="Ulov ispunjen za lab";
			return vrednost;
		}else{
			vrednost="Uslov nije ispunjen za lab";
			return vrednost;
			
		}
		
	}

}
