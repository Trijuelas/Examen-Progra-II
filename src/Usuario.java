
import java.util.ArrayList;

//PERSONA


public class Usuario {
 
    private String nombre, correo, msjConfirmacion;
 
    private ArrayList<Usuario> listaUsuarios;
 
   public Usuario(String nombre, String correo) {
    this.nombre = nombre;
    this.correo = correo;
}
 
    public Usuario() {
        listaUsuarios = new ArrayList<>();
    }
 

    @Override
    public String toString() {
        return "nombre: " + this.nombre + " - " + " correo: " + this.correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMsjConfirmacion() {
        return msjConfirmacion;
    }

    public void setMsjConfirmacion(String msjConfirmacion) {
        this.msjConfirmacion = msjConfirmacion;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void addListaUsuarios(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

   

    
}