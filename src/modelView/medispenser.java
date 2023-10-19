
package modelView;

import model.OperacionesUsuarios;
import view.Inicio;



public class medispenser {
    
    private static java.sql.Connection con;
    
    public static void main(String[] args) {
        
        Inicio inici = new Inicio();
        inici.setVisible(true);
        inici.setLocationRelativeTo(null);
        

        OperacionesUsuarios opu = new OperacionesUsuarios();
        opu.registro(con);
    }
}
