package Authentification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
	public Connection connexion_BD() throws SQLException {
	  String url = "jdbc:mysql://localhost:3306/cours_en_ligne";
      String user = "root";
      String passwd = "";
      Connection connection = null ;
      try {
      Class.forName("com.mysql.jdbc.Driver");
      DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
      connection = (Connection) DriverManager.getConnection(url, user, passwd);

      }
      catch(ClassNotFoundException ex){ 
 	     ex.printStackTrace();
 	 }
	return connection;
      }

}
