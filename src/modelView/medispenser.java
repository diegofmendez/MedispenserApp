
package modelView;

import model.MYSQLWork;
import view.Inicio;



public class medispenser {

    
    public static void main(String[] args) {
        
        Inicio inici = new Inicio();
        inici.setVisible(true);
        inici.setLocationRelativeTo(null);
    
        MYSQLWork.getConnection();
    }
}
