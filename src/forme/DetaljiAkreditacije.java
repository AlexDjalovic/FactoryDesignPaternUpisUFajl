package forme;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import domen.Komisija;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DetaljiAkreditacije extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel dfm=new DefaultTableModel();
	private JTable table;
	private ArrayList<Komisija>al1;
	private String nazivFakulteta;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param al1 
	 * @param nazivFakulteta 
	 */
	public DetaljiAkreditacije(ArrayList<Komisija> al1, String nazivFakulteta) {
		this.al1=al1;
		this.nazivFakulteta=nazivFakulteta;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable(dfm);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(49, 59, 329, 136);
		contentPane.add(scrollPane);
		
		
		scrollPane.setRowHeaderView(table);
		scrollPane.setViewportView(table);
		Object o[]=new Object[4];
		o[0]="Fakultet";
		o[1]="Profesor";
		o[2]="Bod";
		o[3]="Laboratorija";
		dfm.addColumn(o[0]);
		dfm.addColumn(o[1]);
		dfm.addColumn(o[2]);
		dfm.addColumn(o[3]);
		prikaziPodatke();
	}
	private void prikaziPodatke() {
		dfm.setRowCount(0);
		Object []o=new Object[4];
		for(Komisija k:al1){
			if(nazivFakulteta.equals(k.getFak())){
			o[0]=k.getFak();
			o[1]=k.getProfesor();
			o[2]=k.getBod();
			o[3]=k.getLaboratorija();
			dfm.addRow(o);
			}
		}
		
	}
}
