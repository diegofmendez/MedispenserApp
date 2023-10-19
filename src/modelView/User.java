
package modelView;




public class User {
    int id;
    String nombres;
    String apellidos;
    String tipo;
    
    
    
    public User() {
    }

    public User(int id, String nombres, String apellidos, String tipo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo = tipo;
    }
    
    //getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }
    public String getTipo(){
        return tipo;
    }
    //setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
