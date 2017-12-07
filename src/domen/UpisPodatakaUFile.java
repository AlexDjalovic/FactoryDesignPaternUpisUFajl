package domen;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//import com.sun.org.apache.bcel.internal.classfile.Field;

public class UpisPodatakaUFile implements NazivFile{
	private Komisija al;
	private PrintWriter pw;
	public UpisPodatakaUFile(Komisija k) {
		
		this.al=k;
	}
	
	public void upisiPodatkeUFile(){
		System.out.println("Usao u file");
		File f=new File(nazivFile);
		
		if(!f.exists()){
			System.out.println("Usao u ne postoji");
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			try {
				pw=new PrintWriter(new FileWriter(f,true));
				pw.println(al.getUniverzitet()+";"+ al.getProfesor()+";"+al.getLaboratorija()+";"+al.getNaucniRad()+";"+al.getFak()+";"+al.getBod());
				//System.out.println(pw.);
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
