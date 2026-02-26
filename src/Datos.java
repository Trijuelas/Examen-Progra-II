
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



 
public class Datos {
 
    private String archivo;

    private String registro;

    private ArrayList<String> listaRegistro;
    
     public Datos (String archivo){
     this.archivo = archivo;
    listaRegistro = new ArrayList<>();
 }
    
    
    
 
    public String guardarReg() throws IOException {
 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo, true))) {
 
           bw.append(registro);
           bw.newLine();
 
        }

        return "se agrego su usuario muy bien";

    }

    public void listarReg() throws IOException{

        try(BufferedReader br  = new BufferedReader(new FileReader(this.archivo))){

            while((this.registro = br.readLine()) != null){

               this.listaRegistro.add(registro);
            }

        }

    }
 

 
 public Datos(){
     
 }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public ArrayList<String> getListaRegistro() {
        return listaRegistro;
    }

    public void setListaRegistro(String registro) {
        this.listaRegistro = listaRegistro;
    }
 
 
    
 
    


}

 