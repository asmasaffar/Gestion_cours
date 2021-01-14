package Salle;

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
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class Salle extends JFrame {

	private JPanel contentPane;
	private JTextField tlibelle;
	private JTextField ttype;
	private JTextField tcapasite;
	  private JTable tablesalle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salle frame = new Salle();
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
	public Salle() {
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
		/////

		JLabel lblBienvenueVirtual = new JLabel("Gestion des Salles");
		lblBienvenueVirtual.setBackground(new Color(255, 140, 0));
		lblBienvenueVirtual.setBounds(636, 0, 258, 43);
		lblBienvenueVirtual.setForeground(new Color(244, 164, 96));
		lblBienvenueVirtual.setFont(new Font("Times New Roman", Font.BOLD, 27));
		contentPane.add(lblBienvenueVirtual);
		
		JLabel lblNewsalle = new JLabel("Nouvelle Salle");
		lblNewsalle.setBackground(new Color(255, 140, 0));
		lblNewsalle.setBounds(237, 56, 321, 43);
		lblNewsalle.setForeground(Color.GRAY);
		
		tlibelle = new JTextField();
		tlibelle.setBounds(343, 111, 226, 30);
		contentPane.add(tlibelle);
		tlibelle.setColumns(10);
		
		ttype = new JTextField();
		ttype.setBounds(343, 162, 226, 30);
		contentPane.add(ttype);
		ttype.setColumns(10);
		
		tcapasite = new JTextField();
		tcapasite.setBounds(343, 212, 226, 30);
		contentPane.add(tcapasite);
		tcapasite.setColumns(10);
		
		
		
		lblNewsalle.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblNewsalle);
		
		JLabel libelle = new JLabel("Libelle");
		libelle.setBounds(247, 116, 56, 18);
		libelle.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		contentPane.add(libelle);
		
		JLabel lbltype = new JLabel("Type");
		lbltype.setBounds(247, 165, 56, 22);
		lbltype.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		contentPane.add(lbltype);
		
		JLabel lblNewLabel_3 = new JLabel("Capacit\u00E9");
		lblNewLabel_3.setBounds(247, 209, 81, 34);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		contentPane.add(lblNewLabel_3);
		
	
		////
		 JButton btnAjouterdep = new JButton("Ajouter");
	        btnAjouterdep.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        	}
	        });
	        btnAjouterdep.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	      
	        	

	        btnAjouterdep.setForeground(Color.WHITE);
	        btnAjouterdep.setBackground(new Color(60, 179, 113));
	        btnAjouterdep.setBounds(714, 157, 180, 30);
	        contentPane.add(btnAjouterdep);
	        		                  		            
	         JButton btnModifier = new JButton("Modifier ");
	         btnModifier.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	         btnModifier.addActionListener(new ActionListener() {
	              public void actionPerformed(ActionEvent arg0) {
	        		                  		            	}
	        	});
	         btnModifier.setForeground(Color.WHITE);
	         btnModifier.setBackground(new Color(0, 0, 139));
	         btnModifier.setBounds(1056, 161, 189, 30);
	         contentPane.add(btnModifier);
	        		                  		            
	         JButton btnSupprimer = new JButton("Supprimer ");
	         btnSupprimer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        btnSupprimer.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        }
	        });
	        btnSupprimer.setForeground(Color.WHITE);
	        btnSupprimer.setBackground(new Color(220, 20, 60));
	        btnSupprimer.setBounds(1056, 211, 189, 30);
	        contentPane.add(btnSupprimer);
	        
	        JButton reinitialise_1 = new JButton("Reinitialiser");
	        reinitialise_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        reinitialise_1.setBounds(1056, 118, 189, 30);
	        contentPane.add(reinitialise_1);
	        reinitialise_1.setBackground(new Color(255, 165, 0));
	        reinitialise_1.setForeground(Color.WHITE);
	        reinitialise_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	       
	    ////listes salles
	    	JLabel lblListeDesSalles = new JLabel("Liste des Salles");
			lblListeDesSalles.setForeground(Color.GRAY);
			lblListeDesSalles.setFont(new Font("Times New Roman", Font.BOLD, 22));
			lblListeDesSalles.setBackground(new Color(255, 140, 0));
			lblListeDesSalles.setBounds(237, 293, 321, 43);
			contentPane.add(lblListeDesSalles);
			
	        tablesalle = new JTable();
	        tablesalle.setBounds(237, 349, 1057, 564);
	        contentPane.add(tablesalle);
	        DefaultTableModel model = new DefaultTableModel();
	
	}
}
