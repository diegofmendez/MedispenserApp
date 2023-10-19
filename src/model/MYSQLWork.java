
package model;


import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLWork {
    private static java.sql.Connection con;
    public static String driver  = "com.mysql.jdbc.Driver";
    public static String user = "root";
    public static String pass = "";
    public static String url = "jdbc:mysql://localhost:3306/medispenser";

    public static java.sql.Connection getConnection() {
        con = null;
        try {
            con =  DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Conexión no exitosa");
        }
        return con;
        
    }
    
}