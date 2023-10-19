/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

import javax.swing.JFrame;
import view.InicioSesion;
import view.RegistroPaciente;
import view.RegistroParaQuien;
import view.RegistroTipoPaciente;
import view.RegistroYo;

public class Redirect {
    
    public static void redireccion(int idvista){
        switch (idvista) {
            //Vista Inicio
            case 1:
                        InicioSesion isesi = new InicioSesion();
                        isesi.setVisible(true);
                        isesi.setLocationRelativeTo(null);
                break;
            //Vista Inicio Sesión
            case 2:
                        RegistroParaQuien para = new RegistroParaQuien();
                        para.setVisible(true);
                        para.setLocationRelativeTo(null);
                        //cambiar despues
                        para.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                break;
            //Vista relacion con paciente(sin usar por ahora)
            case 3:
                        RegistroTipoPaciente quien = new RegistroTipoPaciente();
                        quien.setVisible(true);
                        quien.setLocationRelativeTo(null);     
                break;
            //Vista 
            case 4:
                        RegistroYo parami = new RegistroYo();
                        parami.setVisible(true);
                        parami.setLocationRelativeTo(null);
            case 5:
                        RegistroPaciente paciente = new RegistroPaciente();
                        paciente.setVisible(true);
                        paciente.setLocationRelativeTo(null);
                
                break;
            default:
                throw new AssertionError();
        }
        
        

    
    }
}
