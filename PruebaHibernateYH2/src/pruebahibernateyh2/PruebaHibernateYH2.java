/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebahibernateyh2;

import java.sql.*;

/**
 *
 * @author obetbeder
 */
public class PruebaHibernateYH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try{
            Class.forName("org.h2.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            

        
        }
        catch(Exception e){
        System.out.println("error "+e);
        }

        

    }
}
