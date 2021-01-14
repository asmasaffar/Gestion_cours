package Parametrage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import Gerer_Etudiant.Etudiant;
import Gerer_Enseignant.Enseignant;
import Parametrage.Parametrage;
import planification.Planification;
import Salle.Salle;
import Statistique.Statistique;
//import Gerer_Etudiant.Etudiant;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.Box;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JComboBox;
import java.awt.SystemColor;

public class Parametrage extends JFrame {

	private JPanel contentPane;
	  private JLabel telephone; 
	  private JTextField ttelephone; 
	  private JLabel nom; 
	 
	    private JTextField tnom; 	   
	    
	    private JLabel bureau; 
	    private JTextField tbureau; 
	    private JTable tabledep;
	    private JTextField tlibellefiliere;
	    private JLabel labellibellefiliere;
	    private JTable tablefiliere;
	    private JTextField tniveau;
	    private JTextField tgroupe;
	    private JTextField tMatiére;
	    private JTable tableNiveaux;
	    private JTable tableGroupe;
	    private JTable tableMatiéres;
	    private JTextField tnbtd;
	    private JTextField tnbtp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parametrage frame = new Parametrage();
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
	public Parametrage() {
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
		
	
		

//// Departement
		
		JLabel lblBienvenueVirtual = new JLabel("Gestion des departements");
		lblBienvenueVirtual.setBackground(new Color(255, 140, 0));
		lblBienvenueVirtual.setBounds(216, 0, 321, 43);
		lblBienvenueVirtual.setForeground(Color.GRAY);
		lblBienvenueVirtual.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(lblBienvenueVirtual);
		
		 //Nom Departement
        tnom = new JTextField();
        tnom.setBounds(305, 56, 181, 20);
        tnom.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
        contentPane.add(tnom);
        tnom.setColumns(10);
        
       
        JLabel nom = new JLabel("libell\u00E9");
        nom.setBounds(216, 60, 57, 16);
        nom.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
        contentPane.add(nom);
       
        
         //Bureau
        tbureau = new JTextField();
        tbureau.setBounds(305, 89, 181, 20);
        tbureau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        contentPane.add(tbureau);
        
        tbureau.setColumns(10);
        
        JLabel bureau = new JLabel("Bureau");
        bureau.setBounds(216, 91, 102, 16);
        bureau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        contentPane.add(bureau);
        
		
		 //Telephone
        JLabel telephone = new JLabel("T\u00E9l\u00E9phone");
        telephone.setBounds(216, 122, 91, 16);
        telephone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        contentPane.add(telephone);
        
        ttelephone = new JTextField();
        ttelephone.setBounds(305, 122, 181, 20);
        ttelephone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        contentPane.add(ttelephone);
        ttelephone.setColumns(10);
        ttelephone.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
            	char c=ke.getKeyChar();
         
               if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' )|| (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)) {
            	   ttelephone.setEditable(true);
               } 
               else {
            	   ttelephone.setEditable(false);
               
               }
            }
         });
        
        
        
     ////tabledep

        tabledep = new JTable();
        tabledep.setBounds(672, 45, 574, 140);
        contentPane.add(tabledep);
        DefaultTableModel model = new DefaultTableModel();
        
    ///ButtonDepartement
        JButton btnAjouterdep = new JButton("Ajouter");
        btnAjouterdep.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnAjouterdep.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      
        	

        btnAjouterdep.setForeground(Color.WHITE);
        btnAjouterdep.setBackground(new Color(60, 179, 113));
        btnAjouterdep.setBounds(356, 155, 130, 30);
        contentPane.add(btnAjouterdep);
        		                  		            
         JButton btnModifier = new JButton("Modifier ");
         btnModifier.setFont(new Font("Times New Roman", Font.PLAIN, 16));
         btnModifier.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent arg0) {
        		                  		            	}
        	});
         btnModifier.setForeground(Color.WHITE);
         btnModifier.setBackground(new Color(0, 0, 139));
         btnModifier.setBounds(530, 83, 130, 30);
         contentPane.add(btnModifier);
        		                  		            
         JButton btnSupprimer = new JButton("Supprimer ");
         btnSupprimer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        btnSupprimer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        }
        });
        btnSupprimer.setForeground(Color.WHITE);
        btnSupprimer.setBackground(new Color(220, 20, 60));
        btnSupprimer.setBounds(530, 115, 130, 30);
        contentPane.add(btnSupprimer);
        
        JButton reinitialise_1 = new JButton("Reinitialiser");
        reinitialise_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        reinitialise_1.setBounds(530, 51, 130, 30);
        contentPane.add(reinitialise_1);
        reinitialise_1.setBackground(new Color(255, 165, 0));
        reinitialise_1.setForeground(Color.WHITE);
        reinitialise_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
       
	  
	    
	  
     /// Filiere
	       //libellé filiére 
	     
	        
	        JLabel label = new JLabel("Gestion des Filiéres");
	        label.setForeground(Color.GRAY);
	        label.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        label.setBackground(new Color(255, 140, 0));
	        label.setBounds(216, 198, 321, 43);
	        contentPane.add(label);
	        JLabel label_1;
	        labellibellefiliere = new JLabel("libell\u00E9");
	        labellibellefiliere.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        labellibellefiliere.setBounds(216, 254, 57, 16);
	        contentPane.add(labellibellefiliere);
	        
	        tlibellefiliere = new JTextField();
	        tlibellefiliere.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        tlibellefiliere.setColumns(10);
	        tlibellefiliere.setBounds(305, 254, 181, 20);
	        contentPane.add(tlibellefiliere);
	 
	   //tablefiliere     
	        tablefiliere = new JTable();
	        tablefiliere.setBounds(672, 231, 574, 114);
	        contentPane.add(tablefiliere);
	
	 //ButtonFiliéres       
	        JButton reinitialiserFiliere = new JButton("Reinitialiser");
	        reinitialiserFiliere.setForeground(Color.WHITE);
	        reinitialiserFiliere.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	        reinitialiserFiliere.setBackground(new Color(255, 165, 0));
	        reinitialiserFiliere.setBounds(530, 236, 130, 30);
	        contentPane.add(reinitialiserFiliere);
	        
	        JButton modifierFiliere = new JButton("Modifier ");
	        modifierFiliere.setForeground(Color.WHITE);
	        modifierFiliere.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        modifierFiliere.setBackground(new Color(0, 0, 139));
	        modifierFiliere.setBounds(530, 268, 130, 30);
	        contentPane.add(modifierFiliere);
	        
	        JButton suppFiliere = new JButton("Supprimer ");
	        suppFiliere.setForeground(Color.WHITE);
	        suppFiliere.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        suppFiliere.setBackground(new Color(220, 20, 60));
	        suppFiliere.setBounds(530, 300, 130, 30);
	        contentPane.add(suppFiliere);
	        
	        JButton ajouterFiliere = new JButton("Ajouter");
	        ajouterFiliere.setForeground(Color.WHITE);
	        ajouterFiliere.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        ajouterFiliere.setBackground(new Color(60, 179, 113));
	        ajouterFiliere.setBounds(356, 300, 130, 30);
	        contentPane.add(ajouterFiliere);
	        
	        
	        
	 //Niveaux        
	        JLabel lblGestionDesNiveaux = new JLabel("Gestion des Niveaux");
	        lblGestionDesNiveaux.setForeground(Color.GRAY);
	        lblGestionDesNiveaux.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblGestionDesNiveaux.setBackground(new Color(255, 140, 0));
	        lblGestionDesNiveaux.setBounds(216, 353, 321, 43);
	        contentPane.add(lblGestionDesNiveaux);
	        
	        JLabel labelNiveau = new JLabel("libell\u00E9");
	        labelNiveau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        labelNiveau.setBounds(216, 411, 57, 16);
	        contentPane.add(labelNiveau);
	        
	        tniveau = new JTextField();
	        tniveau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        tniveau.setColumns(10);
	        tniveau.setBounds(305, 409, 181, 20);
	        contentPane.add(tniveau);
	        
	        
    ///tableNiveaux
	        tableNiveaux = new JTable();
	        tableNiveaux.setBounds(672, 388, 574, 96);
	        contentPane.add(tableNiveaux);
    ///ButtonNiveaux
	        JButton reinitialiserNiveau = new JButton("Reinitialiser");
	        reinitialiserNiveau.setForeground(Color.WHITE);
	        reinitialiserNiveau.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	        reinitialiserNiveau.setBackground(new Color(255, 165, 0));
	        reinitialiserNiveau.setBounds(530, 388, 130, 30);
	        contentPane.add(reinitialiserNiveau);
	        
	        JButton ModifierNiveaux = new JButton("Modifier ");
	        ModifierNiveaux.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        	}
	        });
	        ModifierNiveaux.setForeground(Color.WHITE);
	        ModifierNiveaux.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        ModifierNiveaux.setBackground(new Color(0, 0, 139));
	        ModifierNiveaux.setBounds(530, 420, 130, 30);
	        contentPane.add(ModifierNiveaux);
	        
	        JButton suppNiveau = new JButton("Supprimer ");
	        suppNiveau.setForeground(Color.WHITE);
	        suppNiveau.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        suppNiveau.setBackground(new Color(220, 20, 60));
	        suppNiveau.setBounds(530, 452, 130, 30);
	        contentPane.add(suppNiveau);
	        
	        JButton ajouterNiveau = new JButton("Ajouter");
	        ajouterNiveau.setForeground(Color.WHITE);
	        ajouterNiveau.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        ajouterNiveau.setBackground(new Color(60, 179, 113));
	        ajouterNiveau.setBounds(356, 456, 130, 30);
	        contentPane.add(ajouterNiveau);    
	  
	        
	   ///Groupes
	        JLabel lblGestionDesGroupes = new JLabel("Gestion des Groupes");
	        lblGestionDesGroupes.setForeground(Color.GRAY);
	        lblGestionDesGroupes.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblGestionDesGroupes.setBackground(new Color(255, 140, 0));
	        lblGestionDesGroupes.setBounds(216, 503, 321, 43);
	        contentPane.add(lblGestionDesGroupes);
	        
	        JLabel lblGroupe = new JLabel("Groupe");
	        lblGroupe.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblGroupe.setBounds(216, 625, 57, 16);
	        contentPane.add(lblGroupe);
	        
	        tgroupe = new JTextField();
	        tgroupe.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        tgroupe.setColumns(10);
	        tgroupe.setBounds(305, 623, 181, 20);
	        contentPane.add(tgroupe);
	        
	        JLabel lblNiveaux = new JLabel("Niveaux");
	        lblNiveaux.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblNiveaux.setBounds(216, 590, 75, 16);
	        contentPane.add(lblNiveaux);
	        
	        JLabel lblDpartement = new JLabel("D\u00E9partement ");
	        lblDpartement.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblDpartement.setBounds(216, 555, 102, 16);
	        contentPane.add(lblDpartement);
	        
	        JComboBox Cdepartement = new JComboBox();
	        Cdepartement.setBounds(351, 553, 135, 22);
	        contentPane.add(Cdepartement);
	        
	        JComboBox Cniveaux = new JComboBox();
	        Cniveaux.setBounds(351, 588, 135, 22);
	        contentPane.add(Cniveaux);
	 //tableGroupe
	        tableGroupe = new JTable();
	        tableGroupe.setBounds(672, 548, 574, 129);
	        contentPane.add(tableGroupe);
	 //Button Groupe
	       
	        JButton ReinitialiserGroupe = new JButton("Reinitialiser");
	        ReinitialiserGroupe.setForeground(Color.WHITE);
	        ReinitialiserGroupe.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	        ReinitialiserGroupe.setBackground(new Color(255, 165, 0));
	        ReinitialiserGroupe.setBounds(530, 548, 130, 30);
	        contentPane.add(ReinitialiserGroupe);
	        
	        JButton modifierGroupes = new JButton("Modifier ");
	        modifierGroupes.setForeground(Color.WHITE);
	        modifierGroupes.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        modifierGroupes.setBackground(new Color(0, 0, 139));
	        modifierGroupes.setBounds(530, 580, 130, 30);
	        contentPane.add(modifierGroupes);
	        
	        JButton SuppGroupe = new JButton("Supprimer ");
	        SuppGroupe.setForeground(Color.WHITE);
	        SuppGroupe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        SuppGroupe.setBackground(new Color(220, 20, 60));
	        SuppGroupe.setBounds(530, 612, 130, 30);
	        contentPane.add(SuppGroupe);
	        
	        JButton ajouterGroupe = new JButton("Ajouter");
	        ajouterGroupe.setForeground(Color.WHITE);
	        ajouterGroupe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        ajouterGroupe.setBackground(new Color(60, 179, 113));
	        ajouterGroupe.setBounds(356, 656, 130, 30);
	        contentPane.add(ajouterGroupe);
	        
	  ///Matiéres
	        
	        JLabel lblGestionDesMatires = new JLabel("Gestion des Mati\u00E9res");
	        lblGestionDesMatires.setForeground(Color.GRAY);
	        lblGestionDesMatires.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblGestionDesMatires.setBackground(new Color(255, 140, 0));
	        lblGestionDesMatires.setBounds(216, 694, 321, 43);
	        contentPane.add(lblGestionDesMatires);
	        
	        JLabel labeldepartementMatieres = new JLabel("D\u00E9partement ");
	        labeldepartementMatieres.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        labeldepartementMatieres.setBounds(216, 750, 102, 16);
	        contentPane.add(labeldepartementMatieres);
	        
	        JComboBox comboBox = new JComboBox();
	        comboBox.setBounds(351, 750, 135, 22);
	        contentPane.add(comboBox);
	        
	        JLabel lblMatire = new JLabel("Mati\u00E9re");
	        lblMatire.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblMatire.setBounds(216, 788, 57, 16);
	        contentPane.add(lblMatire);
	        
	        tMatiére = new JTextField();
	        tMatiére.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        tMatiére.setColumns(10);
	        tMatiére.setBounds(305, 786, 181, 20);
	        contentPane.add(tMatiére);
	        
	        JLabel lblNoumbreDeTp = new JLabel("Nombre TD");
	        lblNoumbreDeTp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblNoumbreDeTp.setBounds(216, 821, 102, 16);
	        contentPane.add(lblNoumbreDeTp);
	        
	        tnbtd = new JTextField();
	        tnbtd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        tnbtd.setColumns(10);
	        tnbtd.setBounds(315, 819, 171, 20);
	        contentPane.add(tnbtd);
	        
	        
	        JLabel lblNombreTp = new JLabel("Nombre TP");
	        lblNombreTp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        lblNombreTp.setBounds(216, 855, 102, 16);
	        contentPane.add(lblNombreTp);
	        
	        tnbtp = new JTextField();
	        tnbtp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	        tnbtp.setColumns(10);
	        tnbtp.setBounds(315, 852, 171, 20);
	        contentPane.add(tnbtp);
//table Matiéres
	        
	        tableMatiéres = new JTable();
	        tableMatiéres.setBounds(672, 747, 574, 168);
	        contentPane.add(tableMatiéres);
	        
	// Button Matiéres
	        JButton ReinitialiserMatiere = new JButton("Reinitialiser");
	        ReinitialiserMatiere.setForeground(Color.WHITE);
	        ReinitialiserMatiere.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	        ReinitialiserMatiere.setBackground(new Color(255, 165, 0));
	        ReinitialiserMatiere.setBounds(530, 749, 130, 30);
	        contentPane.add(ReinitialiserMatiere);
	        
	        JButton modifierMatiere = new JButton("Modifier ");
	        modifierMatiere.setForeground(Color.WHITE);
	        modifierMatiere.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        modifierMatiere.setBackground(new Color(0, 0, 139));
	        modifierMatiere.setBounds(530, 781, 130, 30);
	        contentPane.add(modifierMatiere);
	        
	        JButton suppmatiére = new JButton("Supprimer ");
	        suppmatiére.setForeground(Color.WHITE);
	        suppmatiére.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        suppmatiére.setBackground(new Color(220, 20, 60));
	        suppmatiére.setBounds(530, 813, 130, 30);
	        contentPane.add(suppmatiére);
	        
	        JButton ajouterMatiere = new JButton("Ajouter");
	        ajouterMatiere.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        ajouterMatiere.setForeground(Color.WHITE);
	        ajouterMatiere.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        ajouterMatiere.setBackground(new Color(60, 179, 113));
	        ajouterMatiere.setBounds(356, 885, 130, 30);
	        contentPane.add(ajouterMatiere);

        
	}
}
