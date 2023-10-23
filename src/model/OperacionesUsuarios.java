package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OperacionesUsuarios {
    
    final String tabla = "usuarios";
    private Scanner scanner;
            
    public void registrar(Connection conexion, String NAME, String PASSWORD){
        MYSQLWork.getConnection();
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO "+ this.tabla +" (NAME, PASSWORD, TYPE) VALUES (?,?,?)");
            
            consulta.setString(1, NAME);
            consulta.setString(2, PASSWORD);
            consulta.setBoolean(3, true);

            consulta.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error en el registro: " + e.getMessage());
             // Mensaje de error
        } finally {
            if (scanner != null) {
                scanner.close(); // Cerrar el Scanner al finalizar
            }
        }
    }
    
    //Verifica que este en la base de datos
    public void verificar(Connection conexion){
        
        try {
            MYSQLWork.getConnection();
            PreparedStatement consulta;
            
            boolean checker= true;
            consulta = conexion.prepareStatement("SELECT * FROM " + this.tabla + " WHERE TYPE ='"+checker+"'");

            ResultSet result = consulta.executeQuery();

            while (result.next()) {

                String columnValue = result.getString("NAME");
                
                System.out.println("Productos: " + columnValue);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}

