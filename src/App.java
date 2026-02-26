
import java.io.IOException;
import java.util.Scanner;


 
public class App {
 
   private static Logica lg = new Logica();
   private static Usuario usuarioP = new Usuario();
 
    public static void main(String[] args) {
        
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("ingrese nombre");
            usuarioP.setNombre(sc.nextLine());
            
            System.out.println("ingrese correo por favor");
            usuarioP.setCorreo(sc.nextLine());
            lg.guardar(usuarioP);
            System.out.println(usuarioP.getMsjConfirmacion());
            lg.listarUsuarios(usuarioP);
            
            
            for (Usuario usu : usuarioP.getListaUsuarios()) {
                System.out.println(usu);
                
            }
            
            
        } catch(IOException e){
            System.out.println(e.getMessage());
            for (Throwable sup : e.getSuppressed()) {
                System.out.println(e.getMessage());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
            
        }
 
        
        
        
    }

}

 