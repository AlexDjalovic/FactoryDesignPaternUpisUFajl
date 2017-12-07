package facttorytim;

import java.util.HashSet;

public interface AkreditacijaTim {
	
	public abstract IAkreditaciajaUslovi izvrsiAkreditaciju(int bodovi, HashSet<String> hash);
	
	public abstract String vratiAkreditaciju();

}
