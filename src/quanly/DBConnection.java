/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DBConnection {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        String url = "net.sourceforge.jtds.jdbc.Driver";
            Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://PKTUONG:1433/Users;instance=SQLEXPRESS;user=sa;password=11111";
            Connection con = DriverManager.getConnection(dbUrl);
        return con;
    }
}
