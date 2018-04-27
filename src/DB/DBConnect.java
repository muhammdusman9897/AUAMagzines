/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;


/**
 *
 * @author Lenovo
 */
public class DBConnect {
        Connection con;
Statement s;
ResultSet r;
int a;
public void dbconnect(){
    try{
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    
        con=DriverManager.getConnection("jdbc:ucanaccess://E:\\java\\lab11\\AUAMagzine\\Magazine.accdb");
        System.out.println("connecting");
    }
   catch(ClassNotFoundException e)
   {
   System.out.println("Jdbc connecting failed");
   
   }
    catch(SQLException a){
    System.out.println("Driver manager not working");
    
    
    
    }

}
}