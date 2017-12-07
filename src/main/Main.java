package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import forme.UpisIspis;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {//forma1 i main

	private JFrame frame;
	private JTextField tfUser;
	private JTextField tfPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		panel.setBounds(133, 60, 261, 151);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User :");
		lblNewLabel.setBounds(22, 43, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPass = new JLabel("Pass :");
		lblPass.setBounds(22, 84, 46, 14);
		panel.add(lblPass);
		
		tfUser = new JTextField();
		tfUser.setBounds(66, 40, 110, 20);
		panel.add(tfUser);
		tfUser.setColumns(10);
		
		tfPass = new JTextField();
		tfPass.setBounds(66, 81, 110, 20);
		panel.add(tfPass);
		tfPass.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String ime=tfUser.getText();
				String pass=tfPass.getText();
				if(ime.equalsIgnoreCase("dejan")&&pass.equalsIgnoreCase("dejan")){
					
					UpisIspis ui=new UpisIspis();
					ui.setVisible(true);
					
				}else{
					
					JOptionPane.showMessageDialog(null, "Pogresna sifra ili user");
				}
			}
		});
		btnLogin.setBounds(66, 117, 110, 23);
		panel.add(btnLogin);
	}
}
