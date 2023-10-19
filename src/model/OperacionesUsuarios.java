package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OperacionesUsuarios {
    
    final String tabla = "usuarios";
    private Scanner scanner;
            
    public void registro(Connection conexion){
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO "+ this.tabla +" (NAME, PASSWORD, TYPE, TELEFONO) VALUES (?,?,?,?)");
            
            scanner = new Scanner(System.in);

            for (int i = 0; i < 4; i++) {
                switch(i) {
                    case 0:
                        System.out.println("Ingresar tipo de usuario");
                        break;
                    case 1:
                        System.out.println("Ingresar nombre completo");
                        break;
                    case 2:
                        System.out.println("Ingresar contraseña");
                        break;
                    case 3:
                        System.out.println("Ingresar número de telefono");
                        break;
                }
                String texto = scanner.nextLine();
                consulta.setString((i+1), texto);
            }

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
}

