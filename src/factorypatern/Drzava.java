package factorypatern;

import java.util.HashSet;

import facttorytim.AkreditacijaTim;

public class Drzava {
	
	AkreditacijaTim at;
	
	public Drzava(AkreditacijaTim at) {
		
		this.at=at;
	}
	
	
	public void konstruisi(int bod, HashSet<String> hash){
		System.out.println("Stigao u konstruisi "+bod);
		at.izvrsiAkreditaciju(bod, hash);
		//at.vratiAkreditaciju();
	}
}
