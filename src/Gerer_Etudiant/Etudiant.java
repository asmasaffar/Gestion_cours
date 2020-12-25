package Gerer_Etudiant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Authentification.Connexion;
import Gerer_Enseignant.Enseignant;

import javax.swing.JEditorPane;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class Etudiant  extends JFrame  implements ActionListener {

	private JPanel contentPane;
	 private Container c; 
	    private JLabel titre; 
	    private JLabel cin; 
	    private JTextField tcin; 
	    private JLabel nom; 
	    private JTextField tnom; 	    
	    private JLabel prenom; 
	    private JTextField tprenom; 
	    private JLabel email; 
	    private JTextField temail;  
	    private JLabel telephone; 
	    private JTextField ttelephone; 
	    private JLabel dnaissance; 
	    private JLabel lblAnne ;
	    private  JLabel lblFacult;
	    private JTextField tfaculte;
	    private  JLabel lblDiplome;
		private JTextField tdiplome;
	    private JLabel sexe; 
	    private JRadioButton homme; 
	    private JRadioButton femme; 
	    private ButtonGroup ghommefemme; 
	    private JLabel Annee_Entre;
	     //Calendrier
		JDateChooser dateNaissance;
		JDateChooser AnneDentre ;
		JDateChooser dateObtentionDiplome;
		// variable pour récupere le sexe choisi
		String gender;
		// les boutons
		private JButton ajout;
		private JButton reinitialise;
		private JButton Supprimer;
		private JButton modifier;
		private JButton ValiderLaModification;
		//Tableau JTabe
		private JTable jTable1;
		private DefaultTableModel model;
	
	  
	   
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Etudiant  frame = new Etudiant ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Etudiant () throws SQLException {
	
		// DOnnée connexion
				Connection connection = null;
				Connexion co = new Connexion();
				connection = co.connexion_BD();
			
			setBackground(new Color(47,79,79));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1350, 600);
			contentPane = new JPanel();
			contentPane.setBackground(Color.WHITE);

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(105, 105, 105));
			panel.setBounds(0, 0, 204, 553);
			contentPane.add(panel);
			panel.setLayout(null);
			//Dashboard
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
					Etudiant  Etudiant ;
					 dispose();
					 try {
						Etudiant = new Etudiant ();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			JButton btnGrerEnseignant = new JButton("Gerer Enseignant");
			btnGrerEnseignant.setForeground(Color.WHITE);
			btnGrerEnseignant.setBackground(new Color(244, 164, 96));
			btnGrerEnseignant.setBounds(34, 125, 142, 29);
			panel.add(btnGrerEnseignant);
			btnGrerEnseignant.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Enseignant listeEnseignant ;
					 dispose();
					 try {
						listeEnseignant = new Enseignant();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			JButton btnGererDepartement = new JButton("Gerer Departement");
			btnGererDepartement.setForeground(Color.WHITE);
			btnGererDepartement.setBackground(new Color(244, 164, 96));
			btnGererDepartement.setBounds(34, 167, 142, 29);
			panel.add(btnGererDepartement);
			
			JButton btnGererFiliere = new JButton("Gerer Filiere");
			btnGererFiliere.setForeground(Color.WHITE);
			btnGererFiliere.setBackground(new Color(244, 164, 96));
			btnGererFiliere.setBounds(34, 209, 142, 29);
			panel.add(btnGererFiliere);
			
			JButton btnGererMatiere = new JButton("Gerer Matiere");
			btnGererMatiere.setForeground(Color.WHITE);
			btnGererMatiere.setBackground(new Color(244, 164, 96));
			btnGererMatiere.setBounds(34, 251, 142, 29);
			panel.add(btnGererMatiere);
			btnGererMatiere.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			
			
			JButton btnGererGroupe = new JButton("Gerer Groupe ");
			btnGererGroupe.setForeground(Color.WHITE);
			btnGererGroupe.setBackground(new Color(244, 164, 96));
			btnGererGroupe.setBounds(34, 293, 142, 29);
			btnGererGroupe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			panel.add(btnGererGroupe);
			
			JButton btnGererNiveau = new JButton("Gerer Niveau");
			btnGererNiveau.setBounds(34, 335, 140, 26);
			btnGererNiveau.setForeground(Color.WHITE);
			btnGererNiveau.setBackground(new Color(244, 164, 96));
			panel.add(btnGererNiveau);
			
			JButton btnStatistique = new JButton("Statistique");
			btnStatistique.setForeground(Color.WHITE);
			btnStatistique.setBackground(new Color(244, 164, 96));
			btnStatistique.setBounds(34, 374, 139, 29);
			btnStatistique.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		
			panel.add(btnStatistique);
			
			JLabel lblBienvenueVirtual = new JLabel("Gestion des etudiants");
			lblBienvenueVirtual.setBackground(new Color(255, 140, 0));
			lblBienvenueVirtual.setBounds(568, 0, 258, 43);
			lblBienvenueVirtual.setForeground(new Color(244, 164, 96));
			lblBienvenueVirtual.setFont(new Font("Times New Roman", Font.BOLD, 27));
			contentPane.add(lblBienvenueVirtual);
			//fin dashboard
			
			//Les boutons de manipulation
			ajout = new JButton("Ajouter");
			ajout.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			ajout.setForeground(Color.WHITE);
			ajout.setBackground(new Color(60, 179, 113));
			ajout.setBounds(1060, 71, 129, 35);
			ajout.addActionListener(this);
			contentPane.add(ajout);

			modifier = new JButton("Modifier");
			modifier.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			modifier.setForeground(Color.WHITE);
			modifier.setBackground(new Color(0, 0, 139));
			modifier.setBounds(1060, 165, 129, 35);
			modifier.addActionListener(this);
			contentPane.add(modifier);

			Supprimer = new JButton("Supprimer");
			Supprimer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			Supprimer.setForeground(Color.WHITE);
			Supprimer.setBackground(new Color(220, 20, 60));
			Supprimer.setBounds(1060, 211, 129, 35);
			Supprimer.addActionListener(this);
			contentPane.add(Supprimer);

			reinitialise = new JButton("Reinitialiser");

			reinitialise.setBounds(1060, 119, 129, 35);
			contentPane.add(reinitialise);
			reinitialise.setBackground(new Color(255, 165, 0));
			reinitialise.setForeground(Color.WHITE);
			reinitialise.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			reinitialise.addActionListener(this);

			ValiderLaModification = new JButton("Valider ");
			ValiderLaModification.setBounds(1195, 165, 107, 35);
			ValiderLaModification.setForeground(Color.WHITE);
			ValiderLaModification.setBackground(new Color(0, 0, 139));
			ValiderLaModification.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			ValiderLaModification.addActionListener(this);
			contentPane.add(ValiderLaModification);

		
	       
	            //Cin Etudiant
	            JLabel cin = new JLabel("Cin");
	            cin.setBounds(255, 111, 56, 16);
	            cin.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(cin);
	             
	           
	            tcin = new JTextField();
	            tcin.setBounds(323, 109, 116, 22);
	            tcin.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(tcin);
	            tcin.setColumns(10);
	             
	           
	            tcin.addKeyListener(new KeyAdapter() {
	               public void keyPressed(KeyEvent ke) {
	               	char c=ke.getKeyChar();
	             
	                  if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' )|| (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)) {
	               	   if (tcin.getText().length() >= 9 ) {
	               		   if ( (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)) {// limit textfield to 9 characters
	                		   tcin.setEditable(true);}
	                		   else {
	                			   tcin.setEditable(false);
	                		   }
	                			   }
	                	   else  {
	                		   tcin.setEditable(true);                       
	                	   }
	                   } 
	                   else {
	                      tcin.setEditable(false);
	                   
	                   }
	                }
	             });
	         
	            
	            //Nom Etudiant
	            tnom = new JTextField();
	            tnom.setBounds(583, 109, 116, 22);
	            tnom.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(tnom);
	            tnom.setColumns(10);
	            
	           
	            JLabel nom = new JLabel("Nom");
	            nom.setBounds(479, 110, 56, 16);
	            nom.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(nom);
	           
	            
	             //Prenom Etudiant
	            tprenom = new JTextField();
	            tprenom.setBounds(846, 109, 116, 22);
	            tprenom.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            contentPane.add(tprenom);
	            
	            tprenom.setColumns(10);
	            
	            JLabel prenom = new JLabel("Prenom");
	            prenom.setBounds(748, 110, 102, 16);
	            prenom.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            contentPane.add(prenom);
	            
	            //Email   
	            JLabel email = new JLabel("Email");
	            email.setBounds(255, 165, 56, 16);
	            email.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            contentPane.add(email);
	        
	            temail = new JTextField();
	            temail.setBounds(305, 162, 165, 22);
	            temail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            contentPane.add(temail);
	            
	            //Telephone
	            JLabel telephone = new JLabel("Telephone");
	            telephone.setBounds(480, 165, 91, 16);
	            telephone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            contentPane.add(telephone);
	            
	            ttelephone = new JTextField();
	            ttelephone.setBounds(583, 164, 116, 22);
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
	            ///sexe 
	            JLabel sexe = new JLabel("Sexe");
	            sexe.setBounds(748, 167, 56, 16);
	            sexe.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(sexe);
	            
	             homme = new JRadioButton("Homme");
	            homme.setBounds(807, 163, 87, 25);
	            homme.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(homme);
	             femme = new JRadioButton("Femme");
	            femme.setBounds(898, 163, 87, 25);
	            femme.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            contentPane.add(femme);
	   
	            ghommefemme = new ButtonGroup(); 
	            ghommefemme.add(homme); 
	            ghommefemme.add(femme); 
	            
	           
	      //DateNaissance
	            JLabel dnaissance = new JLabel("Date de naissance");
	            dnaissance.setBounds(255, 220, 180, 16);
	            dnaissance.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(dnaissance);
	            
         
	           
	            //Année d'entrée  
	            Annee_Entre = new JLabel("Annee d'entree");
	            Annee_Entre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            Annee_Entre.setBounds(709, 211, 117, 16);
	            contentPane.add(Annee_Entre);
	           
	        	dateNaissance = new JDateChooser();
	    		dateNaissance.setBounds(407, 211, 197, 22);
	    		contentPane.add(dateNaissance);

	    		AnneDentre = new JDateChooser();
	    		AnneDentre.setBounds(826, 211, 159, 23);
	    		contentPane.add(AnneDentre);

	    	     
	             lblDiplome = new JLabel("Diplome");
	            lblDiplome.setBounds(255, 278, 66, 23);
	            lblDiplome.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	            contentPane.add(lblDiplome);
	            
	            tdiplome = new JTextField();
	            tdiplome.setBounds(344, 278, 159, 25);
	            tdiplome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	            contentPane.add(tdiplome);
	            
	             lblFacult = new JLabel("Faculte");
	               lblFacult.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	               lblFacult.setBounds(513, 280, 71, 19);
	               contentPane.add(lblFacult);
	               
	     
	               JSeparator separator_1 = new JSeparator();
	               separator_1.setBounds(255, 265, 730, 2);
	               contentPane.add(separator_1);
	               
	               tfaculte = new JTextField();
	               tfaculte.setBounds(583, 280, 165, 23);
	               contentPane.add(tfaculte);
	               
	                lblAnne = new JLabel("Annee");
	               lblAnne.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
	               lblAnne.setBounds(758, 284, 46, 14);
	               contentPane.add(lblAnne);
	               
	                dateObtentionDiplome = new JDateChooser();
	               dateObtentionDiplome.setBounds(826, 281, 159, 20);
	               contentPane.add(dateObtentionDiplome);
	            

	            
	            JLabel lblInformations = new JLabel("Informations Etudiant ");
	            lblInformations.setFont(new Font("Times New Roman", Font.BOLD, 20));
	            lblInformations.setForeground(new Color(105, 105, 105));
	            lblInformations.setBackground(new Color(105, 105, 105));
	            lblInformations.setBounds(235, 58, 313, 23);
	            contentPane.add(lblInformations);
	            
	            JLabel lblListeDestudiant = new JLabel("liste des etudiant ");
	            lblListeDestudiant.setForeground(SystemColor.controlDkShadow);
	            lblListeDestudiant.setFont(new Font("Times New Roman", Font.BOLD, 20));
	            lblListeDestudiant.setBackground(SystemColor.controlDkShadow);
	            lblListeDestudiant.setBounds(249, 344, 159, 23);
	            contentPane.add(lblListeDestudiant);
	            
	            
	        	//Affichage de la liste	        

		        model = new DefaultTableModel();
		       model.addColumn("Num");
		       model.addColumn("Cin");
		       model.addColumn("Nom");
		       model.addColumn("Prenom");
		       model.addColumn("Email");
		       model.addColumn("Telephone");
		       model.addColumn("Date naissance");
		       model.addColumn("Annee_entree");
		       model.addColumn("Diplome");
			 try{
					Statement st = connection.createStatement();
		          String sql =" select e.Num, p.Cin , p.Nom , p.Prenom , p.Email , p.Telephone , p.Date_naissance , e.Annee_entree , d.diplome from  personne p   JOIN etudiant e on  p.Cin = e.Cin JOIN diplome d on  d.Cin = e.Cin order by e.Num asc" ;
		          ResultSet rs = st.executeQuery(sql);
	   
		         
	            // met le resultat de la requete dans un tableau
		          while (rs.next()) {
		        	  model.addRow(new Object[] { 
		        			  rs.getString("Num"),
		        		      rs.getString("Cin"),
			                  rs.getString("Nom"),
			                  rs.getString("Prenom"),
			                  rs.getString("Email"),
			                  rs.getString("Telephone"),
			                  rs.getString("Date_naissance"),
			                  rs.getString("Annee_entree"),
			                  rs.getString("Diplome")
		        	  });
		          }
		         
		          
		          rs.close();
					st.close();
					connection.close();

					jTable1 = new JTable();
					jTable1.setModel(model);
					jTable1.setPreferredScrollableViewportSize(new Dimension(450, 63));
					jTable1.setFillsViewportHeight(true);

					JScrollPane jps = new JScrollPane(jTable1);
					jps.setBounds(235, 378, 1057, 175);
					getContentPane().add(jps);              
	         	       
		        }
			 
			    catch(Exception ex){ 
			     ex.printStackTrace();
			 }              
		            setVisible(true);
		
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// les dates
				
		
//Ajouter enseignant
		if (e.getSource() == ajout) {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			String date_naissance = f.format(dateNaissance.getDate());
			System.out.println("date" + date_naissance) ;
			String date_dentree = f.format(AnneDentre.getDate());
			String date_obtention_diplome = f.format(dateObtentionDiplome.getDate());
			String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
			Pattern pat = Pattern.compile(ePattern);
			Matcher match = pat.matcher(temail.getText());
			if (!match.matches()) {
				JOptionPane.showMessageDialog(temail, "Format email incorrect");
				temail.setText("");
			} else if ((tcin.getText().isEmpty()) || (tnom.getText().isEmpty()) || (tprenom.getText().isEmpty()) || (temail.getText().isEmpty()) || (ttelephone.getText().isEmpty()) || (date_naissance.isEmpty()) || (date_dentree.isEmpty()) ) {
				JOptionPane.showMessageDialog(new JFrame(), "Il faut remplir tous les champs !", "Erreur champs",JOptionPane.ERROR_MESSAGE);
			} else {
				if (homme.isSelected())
					gender = "Homme";
				else {
					gender = "Femme";
				}			

//récuperation de la valeur de NUM dans la table Personne
				int numero = 0;
				try {
					
					Connection connection = null;
					Connexion co = new Connexion();
					connection = co.connexion_BD();
					ResultSet rsListe = null ;
					Statement st = connection.createStatement();
					String num = "select max(Num) from personne ";
					ResultSet rs = st.executeQuery(num);
					while (rs.next()) {
						numero = rs.getInt(1);
						String requeteTablePersonne = "INSERT INTO personne (Num, Cin, Nom, Prenom, Email , Telephone , Date_naissance , Sexe  ) VALUES (? , ? , ? , ? , ? , ? , ? , ?   )";
						PreparedStatement pdtTablePersonne = connection.prepareStatement(requeteTablePersonne);
						pdtTablePersonne.setInt(1, numero + 1);
						pdtTablePersonne.setString(2, tcin.getText());
						pdtTablePersonne.setString(3, tnom.getText());
						pdtTablePersonne.setString(4, tprenom.getText());
						pdtTablePersonne.setString(5, temail.getText());
						pdtTablePersonne.setString(6, ttelephone.getText());
						pdtTablePersonne.setString(7, date_naissance);
						pdtTablePersonne.setString(8, gender);

						int n1 = pdtTablePersonne.executeUpdate();
						if (n1 > 0) {
							String requeteTableEtudiant = "INSERT INTO etudiant ( Annee_entree  , Cin ) VALUES (? , ?  )";
							PreparedStatement pdtTableEtudiant= connection.prepareStatement(requeteTableEtudiant);
							pdtTableEtudiant.setString(1, date_dentree);
							pdtTableEtudiant.setString(2, tcin.getText());
							int n2 = pdtTableEtudiant.executeUpdate();
							if (n2 > 0) {
								String requeteTableDiplome = "INSERT INTO diplome ( Fac , Diplome, An  , Cin ) VALUES (? , ? , ? , ?  )";
								PreparedStatement pdtTableDiplome= connection.prepareStatement(requeteTableDiplome);
								pdtTableDiplome.setString(1, tfaculte.getText());
								pdtTableDiplome.setString(2, tdiplome.getText());
								pdtTableDiplome.setString(3, date_obtention_diplome);
								pdtTableDiplome.setString(4, tcin.getText());
								int n3 = pdtTableDiplome.executeUpdate();
								
								if (n3 > 0) {																								
								JOptionPane.showMessageDialog(null, "Inserted Successfully!");
							Statement stListe = connection.createStatement();
							String sql = " select p.Num, p.Cin , p.Nom , p.Prenom , p.Email , p.Telephone , p.Date_naissance , e.Annee_entree , d.diplome from  personne p   JOIN etudiant e on  p.Cin = e.Cin JOIN diplome d on  d.Cin = e.Cin order by p.Num asc" ;			
							rsListe = stListe.executeQuery(sql);
							model.getDataVector().removeAllElements();
							// met le resultat de la requete dans un tableau
							while (rsListe.next()) {
								
								model.addRow(new Object[] { 
										rsListe.getString("Num"),
										rsListe.getString("Cin"),
										rsListe.getString("Nom"),
										rsListe.getString("Prenom"),
										rsListe.getString("Email"),
										rsListe.getString("Telephone"),
										rsListe.getString("Date_naissance"),
										rsListe.getString("Annee_entree"),
										rsListe.getString("Diplome")
								});
							}
								}}
						}
					}
					rsListe.close();
					rs.close();
					st.close();
					connection.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		//fin traitement ajout enseignant
				//Traitement reinitialisation
				else if (e.getSource() == reinitialise) {
					String def = "";
					tcin.setText(def);
					tnom.setText(def);
					tprenom.setText(def);
					temail.setText(def);
					ttelephone.setText(def);
					tdiplome.setText(def);
					tfaculte.setText(def);
					homme.setSelected(false);
					femme.setSelected(false);
					dateNaissance.setCalendar(null);
					AnneDentre.setCalendar(null);
					dateObtentionDiplome.setCalendar(null);
				}
				//fin Traitement reinitialisation
		
		//Traitement suppression
				else if (e.getSource() == Supprimer) {
					int ligneSelectionne = jTable1.getSelectedRow();
					// on récupére la valeur de CIN de la ligne sélectionné
					Object cellule = jTable1.getValueAt(ligneSelectionne, 1);
					//une seule ligne séléctionnée
					if (jTable1.getSelectedRowCount() == 1) {
						int result = JOptionPane.showConfirmDialog(this, "Vous etes sur ?", "Suppression d'un enseignant",	JOptionPane.OK_CANCEL_OPTION);
						if (result == JOptionPane.OK_OPTION) {
							try {
								Connection connection = null;
								Connexion co = new Connexion();
								connection = co.connexion_BD();

								String sqlDeleteDiplome = "DELETE FROM diplome WHERE Cin = ?";
								PreparedStatement pddeleteteDiplome = connection.prepareStatement(sqlDeleteDiplome);
								pddeleteteDiplome.setInt(1, Integer.parseInt(cellule.toString()));
								String sqlDeleteEtudiant = "DELETE FROM etudiant WHERE Cin = ?";
								PreparedStatement pddeleteteEtudiant = connection.prepareStatement(sqlDeleteEtudiant);
								pddeleteteEtudiant.setInt(1, Integer.parseInt(cellule.toString()));
		                        String sqlDeletePersonne = "DELETE FROM personne WHERE Cin = ?";
								PreparedStatement pdDeletePersonne = connection.prepareStatement(sqlDeletePersonne);
								pdDeletePersonne.setInt(1, Integer.parseInt(cellule.toString()));
								// execute the delete statement
								pddeleteteDiplome.executeUpdate();
								pddeleteteEtudiant.executeUpdate();
								pdDeletePersonne.executeUpdate();
								//fermer la connexion
								pddeleteteEtudiant.close();
								pdDeletePersonne.close();
								connection.close();
							} catch (Exception ex) {
								ex.printStackTrace();
							}
							model.removeRow(jTable1.getSelectedRow());
						}

					} else {
						//pas de ligne séléctionnée
						if (jTable1.getSelectedRowCount() == 0) {
							JOptionPane.showMessageDialog(this, "La liste est vide");
						} else {
							//plusieurs ligne séléctionnée
							JOptionPane.showMessageDialog(this, "Merci de seléctionner une seule ligne !");
						}
					}
				}
		//fin suppression
		
		//traitement validation modification 
				else if (e.getSource() == ValiderLaModification) {
					// les dates
					SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
					String date_naissance = f.format(dateNaissance.getDate());
					System.out.println("date" + date_naissance) ;
					String date_dentree = f.format(AnneDentre.getDate());
					String date_obtention_diplome = f.format(dateObtentionDiplome.getDate());
					
					String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
					Pattern pat = Pattern.compile(ePattern);
					Matcher match = pat.matcher(temail.getText());
					if (!match.matches()) {
						JOptionPane.showMessageDialog(temail, "Format email incorrect");
						temail.setText("");
					} else if ((tcin.getText().isEmpty()) || (tnom.getText().isEmpty()) || (tprenom.getText().isEmpty())|| (temail.getText().isEmpty()) || (ttelephone.getText().isEmpty())  || (date_naissance.isEmpty()) || (date_dentree.isEmpty())) {
						System.out.println("erreur");
						JOptionPane.showMessageDialog(new JFrame(), "Il faut remplir tous les champs !", "Erreur champs",	JOptionPane.ERROR_MESSAGE);
					} else {
						if (homme.isSelected())
							gender = "Homme";
						else {
							gender = "Femme";
						}
					}
				

					
					try {
						int ligneSelectionne = jTable1.getSelectedRow();

						// on récupére la valeur de la première colonne de la ligne sélectionné
						Object cellule = jTable1.getValueAt(ligneSelectionne, 1);
						Connection connection = null;
						Connexion co = new Connexion();
						connection = co.connexion_BD();
						Statement st1 = null;
						PreparedStatement pdt1 = null;
						PreparedStatement pdtDiplome = null;
						ResultSet rs1 = null;
						// récuperation de la valeur de NUM dans la table Personne
						int numero = 0;
						Statement st = connection.createStatement();
						String num = "select Num from personne WHERE cin = " + Integer.parseInt(cellule.toString());
						ResultSet rs = st.executeQuery(num);

						while (rs.next()) {
							numero = rs.getInt(1);
							String nom = tnom.getText().toString();
							String prenom = tprenom.getText().toString();
							String email = temail.getText().toString();
							String requete = " UPDATE personne SET Num = " + numero + " , cin = '" + tcin.getText()+ "' , Nom = '" + nom + "', Prenom = '" + prenom + "', Email = '" + email
									+ "', Telephone = " + ttelephone.getText() + ", Date_naissance ='" + date_naissance
									+ "' , Sexe = '" + gender + "'" + " WHERE cin = " + Integer.parseInt(cellule.toString());
							PreparedStatement pdt = connection.prepareStatement(requete);
							int n1 = pdt.executeUpdate();

							if (n1 > 0) {
								String requete1 = " UPDATE etudiant SET  Annee_entree ='" + date_dentree + "' "
										+ " WHERE cin = " + Integer.parseInt(cellule.toString());
								pdt1 = connection.prepareStatement(requete1);
								int n = pdt1.executeUpdate();
								if (n > 0) {
									String facult = tfaculte.getText().toString();
									String diplome = tdiplome.getText().toString();
									String requeteDiplome = " UPDATE diplome SET  Fac ='" + facult +"' , Diplome = '" + diplome  + "' , An = '" + date_obtention_diplome +"' "+ " WHERE cin = " + Integer.parseInt(cellule.toString());
									pdtDiplome = connection.prepareStatement(requeteDiplome);
									int nDiplome = pdtDiplome.executeUpdate(); 
									if (nDiplome > 0) {
									model.removeRow(jTable1.getSelectedRow());
									JOptionPane.showMessageDialog(null, "Inserted Successfully!");
									String def = "";
									tcin.setText(def);
									tnom.setText(def);
									tprenom.setText(def);
									temail.setText(def);
									ttelephone.setText(def);
									tdiplome.setText(def);
									tfaculte.setText(def);
									homme.setSelected(false);
									femme.setSelected(false);
									dateNaissance.setCalendar(null);
									AnneDentre.setCalendar(null);
									dateObtentionDiplome.setCalendar(null);
									st1 = connection.createStatement();
									String sql = " select e.Num, p.Cin , p.Nom , p.Prenom , p.Email , p.Telephone , p.Date_naissance , e.Annee_entree , d.diplome from  personne p   JOIN etudiant e on  p.Cin = e.Cin JOIN diplome d on  d.Cin = e.Cin order by e.Num asc" ;
									rs1 = st1.executeQuery(sql);
									model.getDataVector().removeAllElements();
									// met le resultat de la requete dans un tableau
									while (rs1.next()) {
										
										model.addRow(new Object[] {										
												rs1.getString("Num"),
												rs1.getString("Cin"),
												rs1.getString("Nom"),
												rs1.getString("Prenom"),
												rs1.getString("Email"),
												rs1.getString("Telephone"),
												rs1.getString("Date_naissance"),
												rs1.getString("Annee_entree"),
												rs1.getString("Diplome")
										});
									}

								}
							}
							}

						}
						rs.close();
						pdt1.close();
						rs1.close();
						st1.close();
						st.close();
						connection.close();
					} catch (Exception ex) {
						ex.printStackTrace();
					}

				}
		
		if (e.getSource() == modifier) {
			
			int ligneSelectionne = jTable1.getSelectedRow();
			// on récupére la valeur de la première colonne de la ligne sélectionné
			Object cellule = jTable1.getValueAt(ligneSelectionne, 1);
			if (jTable1.getSelectedRowCount() == 1) {
				int result = JOptionPane.showConfirmDialog(this, "Vous etes sur de modifier cette enseignant ??","modifier un enseignant", JOptionPane.OK_CANCEL_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					try {
						Connection connection = null;
						Connexion co = new Connexion();
						connection = co.connexion_BD();

						String sql = "select Num, Cin, Nom, Prenom, Email , Telephone , Date_naissance , Sexe from personne where Cin = "+ Integer.parseInt(cellule.toString());
						Statement st = connection.createStatement();
						ResultSet rs = st.executeQuery(sql);
						ResultSet rs1 = null;
						// execute the delete statement
						while (rs.next()) {
							tcin.setText(rs.getString("Cin"));
							tnom.setText(rs.getString("Nom"));
							tprenom.setText(rs.getString("Prenom"));
							temail.setText(rs.getString("Email"));
							ttelephone.setText(rs.getString("Telephone"));
							dateNaissance.setDate(rs.getDate("Date_naissance"));
							String sex = rs.getString("Sexe");
							if (sex.equals("Homme")) {
								homme.setSelected(true);
							} else {
								femme.setSelected(true);
							}

						}
						rs.close();

						String sql1 = "select Annee_entree from etudiant where cin = "+ Integer.parseInt(cellule.toString());
						Statement st1 = connection.createStatement();
						rs1 = st1.executeQuery(sql1);
						while (rs1.next()) {
							AnneDentre.setDate(rs1.getDate("Annee_entree"));
											
						}
						// execute the delete statement
						rs1.close();
						String sql2 = "select Fac , Diplome , An from diplome where cin = "+ Integer.parseInt(cellule.toString());
						Statement st2 = connection.createStatement();
						ResultSet	rs2 = st2.executeQuery(sql2);
						while (rs2.next()) {
							dateObtentionDiplome.setDate(rs2.getDate("An"));
							tfaculte.setText(rs2.getString("Fac"));
							tdiplome.setText(rs2.getString("Diplome"));		
						}
						rs2.close();
						connection.close();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				}

			}
		}
	}
