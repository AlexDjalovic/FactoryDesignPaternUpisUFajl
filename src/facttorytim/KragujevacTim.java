package facttorytim;

import java.util.HashSet;

public class KragujevacTim implements AkreditacijaTim {
	private AkreditacijaUslovi au;
	@Override
	public IAkreditaciajaUslovi izvrsiAkreditaciju(int bodovi,  HashSet<String> hash) {
		
		au=new AkreditacijaUslovi();
		System.out.println("Stigao u tim kg "+bodovi);
		
		au.setBod(new KonretanBod( bodovi));
		au.setLab(new KonkretnaLaboratorija(hash));
		return au;
		
		
	}

	@Override
	public String vratiAkreditaciju() {
		// TODO Auto-generated method stub
		return au.getBod().vrati()+au.getLab().potrebanbrojLaboratorija();
		
	}

}
