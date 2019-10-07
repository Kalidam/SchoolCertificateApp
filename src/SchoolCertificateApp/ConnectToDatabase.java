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
    public ConnectToDatabase{
        String query;
        try {
            Class.forName("com.mysgl.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolcertificateappdatabase",
                    "root", "");
            Statement stmt = con.createStatement();
            //query = metoda zwracajaca stringa
            while (query != null) {
                ResultSet rs = stmt.executeQuery(query);
                //query = metoda zwracajaca stringa
            }
            con.close();
        }
        catch (SQLException e) {
            System.err.println("Nie znaleziono bazy danych!");
        }
        catch (ClassNotFoundException e) {
            System.err.println("Nie można połączyć z bazą danych!");;
        }
    }
}
