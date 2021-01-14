package Statistique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import Gerer_Etudiant.Etudiant;
import Gerer_Enseignant.Enseignant;
import Parametrage.Parametrage;
import planification.Planification;
import Salle.Salle;
import Statistique.Statistique;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Statistique extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistique frame = new Statistique();
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
	public Statistique() {
		setBackground(new Color(47,79,79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(0, 0, 204, 1050);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Font f = new Font("Serif",Font.BOLD, 18);
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Serif", Font.BOLD, 27));
		lblDashboard.setBounds(29, 27, 149, 37);
		panel.add(lblDashboard);
		
		JButton btnGrerEtudiant = new JButton("G\u00E9rer Etudiant");
		btnGrerEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Etudiant Etudiant ;
				 dispose();
				 try {
					Etudiant = new Etudiant();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGrerEtudiant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnGrerEtudiant.setForeground(Color.WHITE);
		btnGrerEtudiant.setBackground(new Color(244, 164, 96));
		btnGrerEtudiant.setBounds(0, 83, 204, 40);
		panel.add(btnGrerEtudiant);
		
		
		JButton btnGrerEnseignant = new JButton("G\u00E9rer Enseignant");
		btnGrerEnseignant.setForeground(Color.WHITE);
		btnGrerEnseignant.setBackground(new Color(244, 164, 96));
		btnGrerEnseignant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnGrerEnseignant.setBounds(0, 130, 204, 40);
		panel.add(btnGrerEnseignant);
		btnGrerEnseignant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enseignant Enseignant ;
				 dispose();
				 try {
					 Enseignant = new Enseignant();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JButton btnParametrage = new JButton("Paramétrage");
		btnParametrage.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParametrage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnParametrage.setForeground(Color.WHITE);
		btnParametrage.setBackground(new Color(244, 164, 96));
		btnParametrage.setBounds(0, 177, 204, 40);
		panel.add(btnParametrage);
		
		JButton btnSalle = new JButton("G\u00E9rer Salles");
		btnSalle.setForeground(Color.WHITE);
		btnSalle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSalle.setBackground(new Color(244, 164, 96));
		btnSalle.setBounds(0, 224, 204, 40);
		panel.add(btnSalle);
		
		JButton btnPlanification = new JButton("Planification");
		btnPlanification.setForeground(Color.WHITE);
		btnPlanification.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPlanification.setBackground(new Color(244, 164, 96));
		btnPlanification.setBounds(0, 270, 204, 40);
		panel.add(btnPlanification);
		btnPlanification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnStatistique = new JButton("Statistique");
		btnStatistique.setForeground(Color.WHITE);
		btnStatistique.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnStatistique.setBackground(new Color(244, 164, 96));
		btnStatistique.setBounds(0, 316, 204, 40);
		btnStatistique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
		panel.add(btnStatistique);
		
	
	}

}
