package forme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domen.Komisija;
import domen.UpisPodatakaUFile;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UpisPodataka extends JFrame {//forma3

	private JPanel contentPane;
	private JTextField tfUniverzitet;
	private JTextField tfProfesor;
	private JTextField tflaboratorija;
	private JTextField tfNaucni;
	private ArrayList<Komisija>al=new ArrayList<>();
	private JTextField tfFakultet;
	private JTextField tfBod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpisPodataka frame = new UpisPodataka();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpisPodataka() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(43, 11, 338, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unos univerziteta :");
		lblNewLabel.setBounds(22, 14, 103, 14);
		panel.add(lblNewLabel);
		
		JLabel lblUnosProfesora = new JLabel("Unos profesora :");
		lblUnosProfesora.setBounds(22, 75, 103, 14);
		panel.add(lblUnosProfesora);
		
		JLabel lblUnosLaboratorijew = new JLabel("Unos laboratorije :");
		lblUnosLaboratorijew.setBounds(22, 112, 103, 14);
		panel.add(lblUnosLaboratorijew);
		
		JLabel lblNaucniRad = new JLabel("Naucni rad :");
		lblNaucniRad.setBounds(22, 142, 89, 14);
		panel.add(lblNaucniRad);
		
		tfUniverzitet = new JTextField();
		tfUniverzitet.setBounds(132, 11, 134, 20);
		panel.add(tfUniverzitet);
		tfUniverzitet.setColumns(10);
		
		tfProfesor = new JTextField();
		tfProfesor.setColumns(10);
		tfProfesor.setBounds(132, 72, 134, 20);
		panel.add(tfProfesor);
		
		tflaboratorija = new JTextField();
		tflaboratorija.setColumns(10);
		tflaboratorija.setBounds(132, 109, 134, 20);
		panel.add(tflaboratorija);
		
		tfNaucni = new JTextField();
		tfNaucni.setColumns(10);
		tfNaucni.setBounds(132, 139, 134, 20);
		panel.add(tfNaucni);
		
		JButton btnUpis = new JButton("Upisi");
		btnUpis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String uni=tfUniverzitet.getText();
				String prf=tfProfesor.getText();
				String lab=tflaboratorija.getText();
				String naucni=tfNaucni.getText();
				String fak=tfFakultet.getText();
				String bod=tfBod.getText();
			
				Komisija k=new Komisija(uni, prf, lab, naucni, fak, bod);
				
				//al.add(k);
				
				
				brisiPodatke();
				UpisPodatakaUFile upf=new UpisPodatakaUFile(k);
				
				upf.upisiPodatkeUFile();
						
			}

			private void brisiPodatke() {
			
				tflaboratorija.setText("");
				tfNaucni.setText("");
				tfProfesor.setText("");
				tfUniverzitet.setText("");
				tfBod.setText("");
				tfFakultet.setText("");
				
			}
		});
		btnUpis.setBounds(132, 205, 134, 23);
		panel.add(btnUpis);
		
		JLabel lblNewLabel_1 = new JLabel("Fakultet");
		lblNewLabel_1.setBounds(22, 39, 46, 14);
		panel.add(lblNewLabel_1);
		
		tfFakultet = new JTextField();
		tfFakultet.setColumns(10);
		tfFakultet.setBounds(132, 41, 134, 20);
		panel.add(tfFakultet);
		
		JLabel lblNewLabel_2 = new JLabel("Vrednost bodova rada");
		lblNewLabel_2.setBounds(22, 179, 114, 14);
		panel.add(lblNewLabel_2);
		
		tfBod = new JTextField();
		tfBod.setBounds(132, 174, 134, 20);
		panel.add(tfBod);
		tfBod.setColumns(10);
	}

}
