package planification;

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
import javax.swing.JComboBox;

public class Planification extends JFrame {
	private JTable tablepla;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planification frame = new Planification();
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
	public Planification() {
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
		//////////
		JLabel lblBienvenueVirtual = new JLabel("Planification");
		lblBienvenueVirtual.setBackground(new Color(255, 140, 0));
		lblBienvenueVirtual.setBounds(707, 13, 258, 43);
		lblBienvenueVirtual.setForeground(new Color(244, 164, 96));
		lblBienvenueVirtual.setFont(new Font("Times New Roman", Font.BOLD, 27));
		contentPane.add(lblBienvenueVirtual);
		/////
	
		
		JComboBox comboBoxmatieres = new JComboBox();
		comboBoxmatieres.setBounds(549, 103, 31, 22);
		contentPane.add(comboBoxmatieres);
		
		JComboBox comboBoxGroupes = new JComboBox();
		comboBoxGroupes.setBounds(1111, 103, 31, 22);
		contentPane.add(comboBoxGroupes);
		
		JComboBox comboBox_2enseignant = new JComboBox();
		comboBox_2enseignant.setBounds(549, 152, 31, 22);
		contentPane.add(comboBox_2enseignant);
		
		JComboBox comboBoxSalle = new JComboBox();
		comboBoxSalle.setBounds(1111, 153, 31, 22);
		contentPane.add(comboBoxSalle);
		
		JComboBox comboBox_4seance = new JComboBox();
		comboBox_4seance.setBounds(549, 205, 31, 22);
		contentPane.add(comboBox_4seance);
		
		JComboBox comboBoxJour = new JComboBox();
		comboBoxJour.setBounds(1111, 205, 31, 22);
		contentPane.add(comboBoxJour);
		
		JLabel lblmatiere = new JLabel("Mati\u00E9res");
		lblmatiere.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		lblmatiere.setBounds(239, 106, 111, 19);
		contentPane.add(lblmatiere);
		
		JLabel lblGroupes = new JLabel("Groupes");
		lblGroupes.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		lblGroupes.setBounds(852, 103, 113, 22);
		contentPane.add(lblGroupes);
		
		JLabel lblseance = new JLabel("S\u00E9ance");
		lblseance.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		lblseance.setBounds(239, 205, 56, 19);
		contentPane.add(lblseance);
		
		JLabel enseignant = new JLabel("Enseignant");
		enseignant.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		enseignant.setBounds(239, 151, 101, 22);
		contentPane.add(enseignant);
		
		JLabel lblSalle = new JLabel("Salle");
		lblSalle.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		lblSalle.setBounds(852, 153, 78, 19);
		contentPane.add(lblSalle);
		
		JLabel lblJour = new JLabel("Jour de la s\u00E9ance");
		lblJour.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
		lblJour.setBounds(852, 206, 176, 19);
		contentPane.add(lblJour);
		/////
		 

    
        
    ///ButtonDepartement
        JButton btnAjouterdep = new JButton("Ajouter");
        btnAjouterdep.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnAjouterdep.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      
        	

        btnAjouterdep.setForeground(Color.WHITE);
        btnAjouterdep.setBackground(new Color(60, 179, 113));
        btnAjouterdep.setBounds(303, 257, 155, 30);
        contentPane.add(btnAjouterdep);
        		                  		            
         JButton btnModifier = new JButton("Modifier ");
         btnModifier.setFont(new Font("Times New Roman", Font.PLAIN, 16));
         btnModifier.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent arg0) {
        		                  		            	}
        	});
         btnModifier.setForeground(Color.WHITE);
         btnModifier.setBackground(new Color(0, 0, 139));
         btnModifier.setBounds(824, 257, 142, 30);
         contentPane.add(btnModifier);
        		                  		            
         JButton btnSupprimer = new JButton("Supprimer ");
         btnSupprimer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        btnSupprimer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        }
        });
        btnSupprimer.setForeground(Color.WHITE);
        btnSupprimer.setBackground(new Color(220, 20, 60));
        btnSupprimer.setBounds(1069, 257, 149, 30);
        contentPane.add(btnSupprimer);
        
        JButton reinitialise_1 = new JButton("Reinitialiser");
        reinitialise_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        reinitialise_1.setBounds(558, 257, 142, 30);
        contentPane.add(reinitialise_1);
        reinitialise_1.setBackground(new Color(255, 165, 0));
        reinitialise_1.setForeground(Color.WHITE);
        reinitialise_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
       
        tablepla = new JTable();
        tablepla.setBounds(266, 369, 1015, 542);
        contentPane.add(tablepla);
        
        JLabel lblNewLabel_6 = new JLabel("Nouvelle Planification");
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblNewLabel_6.setBounds(216, 60, 224, 33);
        lblNewLabel_6.setForeground(Color.GRAY);
        lblNewLabel_6.setBackground(new Color(255, 140, 0));
        contentPane.add(lblNewLabel_6);
        
        JLabel lblListesDesPlanifications = new JLabel("Listes des Planifications");
        lblListesDesPlanifications.setForeground(Color.GRAY);
        lblListesDesPlanifications.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblListesDesPlanifications.setBackground(new Color(255, 140, 0));
        lblListesDesPlanifications.setBounds(216, 311, 265, 30);
        contentPane.add(lblListesDesPlanifications);
        DefaultTableModel model = new DefaultTableModel();
        
	    
	  
	}
}
