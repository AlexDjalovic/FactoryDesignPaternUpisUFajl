package forme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpisIspis extends JFrame {//forma2

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpisIspis frame = new UpisIspis();
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
	public UpisIspis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(73, 45, 274, 166);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnUpis = new JButton("Upis");
		btnUpis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			UpisPodataka up=new UpisPodataka();
			up.setVisible(true);
				
			}
		});
		btnUpis.setBounds(89, 34, 89, 23);
		panel.add(btnUpis);
		
		JLabel label = new JLabel("New label");
		label.setBounds(128, 38, 46, 14);
		panel.add(label);
		
		JButton btnCitanje = new JButton("Citanje");
		btnCitanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CitanjePodataka cp=new CitanjePodataka();
				cp.setVisible(true);
			
			}
		});
		btnCitanje.setBounds(89, 81, 89, 23);
		panel.add(btnCitanje);
	}
}
