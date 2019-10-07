/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolCertificateApp;

import java.sql.*;

/**
 *
 * @author Dell
 */
public class ConnectToDatabase {
    private Connection con;

    public ConnectToDatabase {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolcertificateappdatabase",
                    "root", "");
            Class.forName("com.mysgl.jdbc.Driver");
            Statement stmt = con.createStatement();
        }

        catch (SQLException e) {
            System.err.println("Nie znaleziono bazy danych!");
        }
        catch (ClassNotFoundException e) {
            System.err.println("Nie można połączyć z bazą danych!");;
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void cloceConnection() {
        con.close();
    }

}
