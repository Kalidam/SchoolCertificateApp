/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolCertificateApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class SQLTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("org.apache.derby.jdbc.ClientDriver");
String myDb = "jdbc:derby://localhost:1527/grades";
Connection DBconn = DriverManager.getConnection(myDb, "teacher","password");
    }
    
}
