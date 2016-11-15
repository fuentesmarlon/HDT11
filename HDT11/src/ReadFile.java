
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Joice Miranda
Marlon Fuentes
Jose Antonio Ramirez
Proposito: Lector y Editor de texto
*/
/**
 *
 * @author JoiceAndrea
 */
public class ReadFile { 
    File arc;
    FileReader filer;
    BufferedReader buferr;
    FileWriter fw;
    PrintWriter pw;
    GrafoInterfaz graf = new Grafo();

    
   // Pide como parametro la direccion donde se encuentre el archivo
    
    public void LeerArchivo(String direccion) throws FileNotFoundException, IOException{
        arc=new File(direccion);
        filer = new FileReader (arc);
        buferr = new BufferedReader(filer);
        String linea;
        try {
            while((linea=buferr.readLine())!=null){
            String[] word;
            word=linea.split(" ");
            graf.agregar(word[0]);
            graf.agregar(word[1]);
            } 
        } catch (IOException e) {
                System.out.println("No se ha encontrado el archivo");
        }         
    } 
    
    // Devuelve Arcos
    public GrafoInterfaz Arcos() throws IOException{
        filer = new FileReader (arc);
        buferr = new BufferedReader(filer);
        String linea;
        while((linea=buferr.readLine())!=null){
            String[] temp;
            temp=linea.split(" ");
            graf.agregarGrafo(temp[0], temp[1], temp[2]);
        }
        return graf;
    }
    //Escribe archivo de texto
    public void Escribir(String cadena) throws IOException{
        fw = new FileWriter(arc);
        pw = new PrintWriter(fw);
        pw.println(cadena);
    }  
    
}
