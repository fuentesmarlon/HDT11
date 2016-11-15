
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Joice Miranda
Marlon Fuentes
Jose Antonio Ramirez
Proposito: Programa que realiza los caluclos para las matrices de adyacencia del grafo.
*/
public class Calculos {
    public void leerArchivo(){
        // Se crea una matriz de adyacencia 
       String[][] adyancencia = new String [15][15];
       String csvFile = "C:\\"; //cambiar esto con la location del archivo datos.csv
        BufferedReader br = null;
        String line ="";
        
        int n = 0;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use punto coma as separator
                String[] peso = line.split(";");
                
                adyancencia[0][n]=peso[1];
                adyancencia[1][n]=peso[2];
                adyancencia[2][n]=peso[3];
                adyancencia[3][n]=peso[4];
                adyancencia[4][n]=peso[5];
                adyancencia[5][n]=peso[6];
                adyancencia[6][n]=peso[7];
                adyancencia[7][n]=peso[8];
                adyancencia[8][n]=peso[9];
                adyancencia[9][n]=peso[10];
                adyancencia[10][n]=peso[11];
                adyancencia[11][n]=peso[12];
                adyancencia[12][n]=peso[13];
                adyancencia[13][n]=peso[14];
                
                n++;
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
