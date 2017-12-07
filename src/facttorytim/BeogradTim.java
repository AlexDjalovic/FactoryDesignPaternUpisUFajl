package facttorytim;

import java.util.HashSet;

public class BeogradTim implements AkreditacijaTim{
	private AkreditacijaUslovi au;
	@Override
	public IAkreditaciajaUslovi izvrsiAkreditaciju(int bodovi,  HashSet<String> hash) {
		
		au=new AkreditacijaUslovi();
		System.out.println("Stigao u tim bg "+bodovi);
		
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
