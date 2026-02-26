
import java.io.IOException;

public class Logica {

    private Datos datos = null;

    public void guardar(Usuario usuario) throws IOException {

        datos = new Datos("datos.txt");

        datos.setRegistro(usuario.getNombre() + "," + usuario.getCorreo());
    

        usuario.setMsjConfirmacion(datos.guardarReg());

    }

    public void listarUsuarios(Usuario usuario) throws IOException {
        datos = new Datos("datos.txt");
        datos.listarReg();
        for (String registro : datos.getListaRegistro()) {
            String[] datos = registro.split(",");
            Usuario us = new Usuario(datos[0], datos[1]);
            usuario.addListaUsuarios(us);
        }

    }
}
