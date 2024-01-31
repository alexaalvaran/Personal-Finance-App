/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alei
 */
public class DatabaseManager {

    //Variables
    private static final String userName = "alei";
    private static final String password = "1028";
    private static final String url = "jdbc:derby:FinanceApp_Ebd; create = true";
    private Connection conn;
    
    public DatabaseManager()
    {
        establishConnection();
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(url, userName, password);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
