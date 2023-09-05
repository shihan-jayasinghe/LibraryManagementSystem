/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHIHAN
 */
public class DatabaseConnection
{
  public static Connection connection()
    {   Connection con=null;
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanager","root","root");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
  /*
  public static Connection mySQLconnection(String... url) throws SQLException
  {   
      Connection con=null;
      String driverType=url[0];
      String uurl=url[1];
      String 
      switch(url[0])
      {
          case "4":
               con=DriverManager.getConnection("","","");
      }        //System.out.println("\"jdbc:mysql://localhost:"+url[1]+"/"+url[2]+"\","+"\""+url[3]+"\","+"\""+url[4]+"\"");
      return con;
  }
  
  
  public static void main(String[] args)
  {
      try {
          Connection abc=mySQLconnection("4","3306","librarymanager","root","root");
          if(abc!=null)
          {
            System.out.println("yess");
          }
      } catch (SQLException ex) {
          Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
  }*/
}
