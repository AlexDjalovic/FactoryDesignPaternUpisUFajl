package domen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class CitanjePodatkaIzFile implements NazivFile{
	
	public static CitanjePodatkaIzFile instance=null;
	
	public ArrayList<Komisija> getAl() {
		return al;
	}

	private ArrayList<Komisija>al=new ArrayList<>();
	
	private CitanjePodatkaIzFile(){
		
		citanjePodataka();
	}

	public void citanjePodataka() {
		File f=new File(nazivFile);
		if(!f.exists()){
			
			return;
		}
		
		try {
			Scanner s=new Scanner(f);
			
			while(s.hasNextLine()){
				
				String linija=s.nextLine();
				String []niz=linija.split(";");
				Komisija k=new Komisija(niz[0], niz[1], niz[2], niz[3], niz[4],niz[5]);
				al.add(k);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static CitanjePodatkaIzFile getInstance(){
		
		if(instance==null){
			
			instance=new CitanjePodatkaIzFile();
		}
		return instance;
	}
}
