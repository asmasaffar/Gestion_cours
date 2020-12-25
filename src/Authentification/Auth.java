package Authentification;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Auth extends JFrame implements ActionListener {

	JTextField username;
	JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auth frame = new Auth();
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
	public Auth() {
		//font
				Font f = new Font("Serif",Font.BOLD, 30);
				//header
				JPanel heading;
				heading = new JPanel();
				heading.setBackground(new Color(0,0,0,80));
			
				heading.setBounds(0,0,900,100);
				JLabel name = new JLabel ("      Authentification");
				name.setForeground(Color.WHITE);
				name.setFont(f);
				heading.add(name);
				
				
				
				//Login panel
				JPanel login = new JPanel();
				login.setLayout(null);    ///////
				login.setSize(400,350);
				login.setBackground(new Color (0,0,0,60));
				login.setBounds(250,175,400,350);
				
				
				 username = new JTextField ("Entrer login");
				username.setBounds(50,50,300,50);
				//username.setOpaque(false);
				username.setForeground(Color.WHITE);
				username.setBackground(new Color(210,180,140));
				login.add(username);
			
			password = new JPasswordField ("Entrer password");
				password.setBounds(50,150,300,50);
				password.setForeground(Color.WHITE);
				//password.setOpaque(false);
				password.setBackground(new Color(210,180,140));
				login.add(password);
				
				JButton login_button = new JButton ("Connecter");
				login_button.setBounds(50,250,100,50);
				login_button.setBackground(new Color(210,180,140));
				login.add(login_button);
				// Adding the listeners to components..
				login_button.addActionListener(this);
				
				//frame
				setSize (900,600);
				setLayout(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				ImageIcon bg_image = new ImageIcon("p.jpg");
				Image img =bg_image.getImage();
				Image temp_img = img.getScaledInstance(900, 600,Image.SCALE_SMOOTH);
				bg_image = new ImageIcon(temp_img);
				JLabel bg = new JLabel ("",bg_image,JLabel.CENTER);
				bg.add(login);
				bg.add(heading);
				bg.setBounds(0,0,900,600);
				add(bg);
				setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		   String userName = username.getText();
	        String passWord =String.valueOf(password.getPassword()) ;
	       
	        String url = "jdbc:mysql://localhost:3306/cours_en_ligne?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	        String user = "root";
	        String passwd = "";
	        Dashboard menu ;
	     
	        try {
	        	
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(url, user, passwd);
	            System.out.println("Connecter");
	            Statement st = conn.createStatement();
	          String sql = "select * from  admin" ;
	          ResultSet rs = st.executeQuery(sql);
	          
	          while(rs.next())
	          if (userName.trim().equals(rs.getString(3)) && passWord.trim().equals(rs.getString(4))) {
	        	  this.dispose();
	        	  menu = new Dashboard();
	            
	          } 
	          else {
//	        	  JOptionPane.showMessageDialog(new JFrame(), message, "Eggs are not supposed to be green.",
//	        		        JOptionPane.ERROR_MESSAGE);
	        	  JOptionPane.showMessageDialog(new JFrame(), "Vérifier votre login et mot de passe",
	                      "Erreur authentification", JOptionPane.ERROR_MESSAGE);
	          }
	        } catch (Exception e1){
	            e1.printStackTrace();
	            System.out.println("Erreur");
	            System.exit(0);
	        }
	     
		
	}

}
