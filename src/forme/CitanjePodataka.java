package forme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import domen.CitanjePodatkaIzFile;
import domen.Komisija;
import factorypatern.Drzava;
import facttorytim.AkreditacijaTim;
import facttorytim.BeogradTim;
import facttorytim.KragujevacTim;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CitanjePodataka extends JFrame {//forma4

	private JPanel contentPane;
	private ArrayList<Komisija>al=CitanjePodatkaIzFile.getInstance().getAl();
	private ArrayList<Komisija>al1=new ArrayList<>();
	private JComboBox cbUniverz,cbFakultet,cbProf,cblab, cbNaucni, cbBodova;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	HashSet<String> hash=new HashSet<>();
	private String nazivFakulteta;
	
	private int ukupniBodovi;
	String univer, prof, naucn, labo,bodovi, fakul;
	DefaultTableModel dfm=new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CitanjePodataka frame = new CitanjePodataka();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	//KONSTRUKTOR/////////
	public CitanjePodataka() {
		
		Collections.sort(al,Komisija.poredjenjeFakulteta);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(69, 59, 331, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		cbUniverz = new JComboBox();
		cbUniverz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				dodajFakultet();
				univer=(String) cbUniverz.getSelectedItem();
			
			
			
			}
		});
		cbUniverz.setBounds(95, 23, 102, 20);
		panel.add(cbUniverz);
		
		cbFakultet = new JComboBox();
		cbFakultet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dodajProf();
				fakul=(String) cbFakultet.getSelectedItem();
				
			}
		});
		cbFakultet.setBounds(95, 65, 102, 20);
		panel.add(cbFakultet);
		
		 cbProf = new JComboBox();
		cbProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dodajLab();
				
				prof=(String) cbProf.getSelectedItem();
			}
		});
		cbProf.setBounds(95, 96, 102, 20);
		panel.add(cbProf);
		
		 cblab = new JComboBox();
		cblab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dodajNaucni();
				labo=(String) cblab.getSelectedItem();
			}
		});
		cblab.setBounds(95, 139, 102, 20);
		panel.add(cblab);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
				Komisija k=new Komisija(univer, prof, labo, naucn, fakul, bodovi);

					ukupniBodovi+=Integer.valueOf(bodovi);
					al1.add(k);
					System.out.println(ukupniBodovi);
					hash.add(labo);
					System.out.println(hash.size());
					JOptionPane.showMessageDialog(null, "Dodata vrednost");	
				}catch (Exception ex) {
					// TODO: handle exception
					
					System.out.println(ex.getMessage());
					
				}
				
				
			}
		});
		btnDodaj.setBounds(95, 235, 102, 23);
		panel.add(btnDodaj);
		
		lblNewLabel = new JLabel("Univerzitet");
		lblNewLabel.setBounds(10, 26, 60, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fakultet");
		lblNewLabel_1.setBounds(10, 68, 46, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Prof");
		lblNewLabel_2.setBounds(10, 99, 46, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Lab");
		lblNewLabel_3.setBounds(10, 142, 46, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Naucni");
		lblNewLabel_4.setBounds(10, 173, 46, 14);
		panel.add(lblNewLabel_4);
		
		 cbNaucni = new JComboBox();
		cbNaucni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dodajBod();
				naucn=(String) cbNaucni.getSelectedItem();
			}
		});
		cbNaucni.setBounds(95, 170, 102, 20);
		panel.add(cbNaucni);
		
		JLabel lblNewLabel_5 = new JLabel("Br bodova");
		lblNewLabel_5.setBounds(10, 208, 60, 14);
		panel.add(lblNewLabel_5);
		
		 cbBodova = new JComboBox();
		cbBodova.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bodovi=(String) cbBodova.getSelectedItem();
			}
		});
		cbBodova.setBounds(95, 204, 102, 20);
		panel.add(cbBodova);
		
		JButton btnAkredituj = new JButton("Akredituj");
		btnAkredituj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*for(Komisija k:al1){
					System.out.println("Prof "+k.getProfesor() +k.getBod());
				}*/
				dfm.setRowCount(0);
				if(univer.equalsIgnoreCase("Kragujevac")){
					
					AkreditacijaTim at=new KragujevacTim();
					Drzava d=new Drzava(at);
					d.konstruisi(Integer.valueOf(ukupniBodovi),hash);
					System.out.println("Vrednost u citanje podataka "+at.vratiAkreditaciju());
					Object[]o=new Object[2];
					o[0]=fakul;
					o[1]=at.vratiAkreditaciju();
					dfm.addRow(o);
					
					
				}else{
					
					//AkreditacijaTim kt=new BeogradTim();
					
				}
			}
		});
		btnAkredituj.setBounds(209, 235, 89, 23);
		panel.add(btnAkredituj);
		table = new JTable(dfm);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(69, 330, 331, 77);
		contentPane.add(scrollPane);
		
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
            int red=table.getSelectedRow();//selektovani red u tabeli
				
		     nazivFakulteta=(table.getModel().getValueAt(red, 0).toString());
			 
		
					
					
					
				
			
				
			}});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(69, 418, 331, 39);
		contentPane.add(panel_1);
		
		JButton btnPrikaziDetalje = new JButton("Prikazi Detalje");
		btnPrikaziDetalje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DetaljiAkreditacije dt=new DetaljiAkreditacije(al1,nazivFakulteta);
				dt.setVisible(true);
			}
			
			
		});
		btnPrikaziDetalje.setBackground(Color.RED);
		panel_1.add(btnPrikaziDetalje);
		
		Object[]o=new Object[2];
		dfm.addColumn("Naziv Fkulteta");
		dfm.addColumn("Status akreditacije");
	
		dodaj();
		
	}

	

	public void dodaj(){
		//al.sort(k);
		
		 cbUniverz.removeAllItems();
		 //Collections.sort(al,Komisija.poredjenjeUniverziviteta);
		 String prehodna="";
		 for(Komisija k: al){
			 
			if(prehodna.equals(k.getUniverzitet())){//ako u arrayListi tj.u file postoji duplikat  univerziteta
				//nista ne radi
			}else{
				
			cbUniverz.addItem(k.getUniverzitet());
			//ali ako se prvi put javi stavi ga u combo
			
			}
			
			 prehodna=k.getUniverzitet();   
		}
	}
	private void dodajFakultet() {
			
		cbFakultet.removeAllItems();
		//
		 String prehodna="";
		 for(Komisija k: al){
			if(k.getUniverzitet().equals(cbUniverz.getSelectedItem())){
			if(!prehodna.equals(k.getFak())){
				cbFakultet.addItem(k.getFak());
			//}else{
			//cbFakultet.addItem(k.getFak());
			}
			
			 prehodna=k.getFak();   
			 
			 }
		}
	}
	
	private void dodajProf() {
		
		cbProf.removeAllItems();
		//
		 String prehodna="";
		 for(Komisija k: al){
			if(k.getFak().equals(cbFakultet.getSelectedItem())){
			if(!prehodna.equals(k.getProfesor())){
				cbProf.addItem(k.getProfesor());
			//}else{
			//cbFakultet.addItem(k.getFak());
			}
			
			 prehodna=k.getProfesor();   
			 
			 }
		}
	}
	
	private void dodajLab() {
		
		cblab.removeAllItems();
		//
		 String prehodna="";
		 for(Komisija k: al){
			if(k.getProfesor().equals(cbProf.getSelectedItem())){
			if(!prehodna.equals(k.getLaboratorija())){
				cblab.addItem(k.getLaboratorija());
			//}else{
			//cbFakultet.addItem(k.getFak());
			}
			
			 prehodna=k.getLaboratorija();   
			 
			 }
		}
	}
	
	private void dodajNaucni() {
		
		cbNaucni.removeAllItems();
		//
		 String prehodna="";
		 for(Komisija k: al){
			if(k.getLaboratorija().equals(cblab.getSelectedItem()) && k.getProfesor().equals(cbProf.getSelectedItem())&& k.getFak().equals(cbFakultet.getSelectedItem())){
			//posto je za naucni rad bitno da ima uniqe laboratoriju,profu i fakultet
				if(!prehodna.equals(k.getNaucniRad())){
				cbNaucni.addItem(k.getNaucniRad());
			//}else{
			//cbFakultet.addItem(k.getFak());
			}
			
			 prehodna=k.getNaucniRad();   
			 
			 }
		}
	}
	
private void dodajBod() {
		
		cbBodova.removeAllItems();
		//
		 String prehodna="";
		 for(Komisija k: al){
			if(k.getLaboratorija().equals(cblab.getSelectedItem()) && k.getNaucniRad().equals(cbNaucni.getSelectedItem())&& k.getProfesor().equals(cbProf.getSelectedItem())){
			if(!prehodna.equals(k.getNaucniRad())){
				cbBodova.addItem(k.getBod());
			//}else{
			//cbFakultet.addItem(k.getFak());
			}
			
			 prehodna=k.getBod();   
			 
			 }
		}
	}
}
