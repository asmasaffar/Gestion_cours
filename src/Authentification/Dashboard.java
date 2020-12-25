package Authentification;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Gerer_Etudiant.Etudiant;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setBackground(new Color(47,79,79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 418);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(0, 0, 204, 379);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Font f = new Font("Serif",Font.BOLD, 18);
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(f);
		lblDashboard.setBounds(60, 36, 93, 14);
		panel.add(lblDashboard);
		
		JButton btnGrerEtudiant = new JButton("Gerer Etudiant");
		btnGrerEtudiant.setForeground(Color.WHITE);
		btnGrerEtudiant.setBackground(new Color(244, 164, 96));
		btnGrerEtudiant.setBounds(34, 79, 142, 29);
		panel.add(btnGrerEtudiant);
		btnGrerEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Etudiant Etudiant;
				dispose();
				try {
					Etudiant = new Etudiant();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnGrerEnseignant = new JButton("Gerer Enseignant");
		btnGrerEnseignant.setForeground(Color.WHITE);
		btnGrerEnseignant.setBackground(new Color(244, 164, 96));
		btnGrerEnseignant.setBounds(34, 113, 142, 29);
		panel.add(btnGrerEnseignant);
		
		JButton btnGererDepartement = new JButton("Gerer Departement");
		btnGererDepartement.setForeground(Color.WHITE);
		btnGererDepartement.setBackground(new Color(244, 164, 96));
		btnGererDepartement.setBounds(34, 147, 142, 29);
		panel.add(btnGererDepartement);
		
		JButton btnGererFiliere = new JButton("Gerer Filiere");
		btnGererFiliere.setForeground(Color.WHITE);
		btnGererFiliere.setBackground(new Color(244, 164, 96));
		btnGererFiliere.setBounds(34, 184, 142, 29);
		panel.add(btnGererFiliere);
		
		JButton btnGererMatiere = new JButton("Gerer Matiere");
		btnGererMatiere.setForeground(Color.WHITE);
		btnGererMatiere.setBackground(new Color(244, 164, 96));
		btnGererMatiere.setBounds(34, 218, 142, 29);
		panel.add(btnGererMatiere);
		btnGererMatiere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		JButton btnGererGroupe = new JButton("Gerer Groupe ");
		btnGererGroupe.setForeground(Color.WHITE);
		btnGererGroupe.setBackground(new Color(244, 164, 96));
		btnGererGroupe.setBounds(34, 252, 142, 29);
		btnGererGroupe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		panel.add(btnGererGroupe);
		
		JButton btnGererNiveau = new JButton("Gerer Niveau");
		btnGererNiveau.setBounds(34, 286, 140, 26);
		btnGererNiveau.setForeground(Color.WHITE);
		btnGererNiveau.setBackground(new Color(244, 164, 96));
		panel.add(btnGererNiveau);
		
		JButton btnStatistique = new JButton("Statistique");
		btnStatistique.setForeground(Color.WHITE);
		btnStatistique.setBackground(new Color(244, 164, 96));
		btnStatistique.setBounds(34, 323, 139, 29);
		btnStatistique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
		panel.add(btnStatistique);
		
		JLabel lblBienvenueVirtual = new JLabel("Bienvenue a VIRTUAL SCHOOL");
		lblBienvenueVirtual.setBounds(357, 31, 286, 39);
		lblBienvenueVirtual.setForeground(new Color(244, 164, 96));
		lblBienvenueVirtual.setFont(f);
		contentPane.add(lblBienvenueVirtual);
		
		
		ImageIcon bg_image = new ImageIcon("dashboard.jpg");
		Image img =bg_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600,Image.SCALE_SMOOTH);
		bg_image = new ImageIcon(temp_img);
		JLabel lblNewLabel = new JLabel("",bg_image,JLabel.CENTER);
		lblNewLabel.setBounds(214, 67, 577, 312);
		contentPane.add(lblNewLabel);
		setVisible(true);
	}
}
