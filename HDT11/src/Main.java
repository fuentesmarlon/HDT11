/*Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Joice Miranda
Marlon Fuentes
Jose Antonio Ramirez
Proposito: Programa principal, pide datos.
*/
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Floyd caminos = new Floyd();
        caminos.Corto(); 
        int choose=1;
        int opcion; 
        Scanner scan = new Scanner(System.in);
       
        while(choose!=4){
            System.out.println("1. Encontrar la ruta mas corta entre ciudades");
            System.out.println("2. Ciudad en el centro del grafo");
            System.out.println("3. Modificaciones a las rutas");
            System.out.println("4. Fin");
            System.out.print("Ingrese la opcion: ");
            choose = scan.nextInt();      
           
            if(choose==1){
                caminos.Corto();
                System.out.print("Ciudad de Inicio: ");
                String ciudad1 = scan.next(); 
                System.out.print("Ciudad de Destino: ");
                String ciudad2 = scan.next();
                if(caminos.nodo.contenido(ciudad1)&&caminos.nodo.contenido(ciudad2)){
                    System.out.println("\nLa distancia minima es: "+caminos.nodo.getD(ciudad1, ciudad2)+".");
                    if(caminos.nodo.getD(ciudad1, ciudad2)!=9999){
                        System.out.print("La ruta es: "+ciudad1);
                        try {
                        caminos.Intermedias(caminos.nodo.getIndice(ciudad1), caminos.nodo.getIndice(ciudad2));
                        } catch (Exception e) {
                           System.out.println("");
                        }
                        
                        System.out.println(", "+ciudad2);
                    }
                }
            }
            
            
            if(choose==2){
                System.out.print("El centro del grafo es: ");
                caminos.Grafo();
            }
            
            
            if(choose==3){
                System.out.println("1. Establecer trafico entre ciudades");
                System.out.println("2. Establecer nueva conexion");
                System.out.print("Ingrese la opcion: ");
                opcion = scan.nextInt(); 
                if(opcion==1){
                    System.out.print("Ciudad de Inicio: ");
                    String ciudad1 = scan.next();
                    System.out.print("Ciudad de destino: ");
                    String ciudad2 = scan.next();
                    if(caminos.nodo.contenido(ciudad1)&&caminos.nodo.contenido(ciudad2)){
                        caminos.nodo.agregarGrafo(ciudad1, ciudad2, 9999);
                        try {
                            caminos.archivo.Escribir(ciudad1+" "+ciudad2+" 9999");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                if(opcion==2){
                    System.out.print("    Ciudad de salida: ");
                    String ciudad1 = scan.next();
                    System.out.print("    Ciudad de destino: ");
                    String ciudad2 = scan.next();
                    System.out.print("    Distancia entre las ciudades: ");
                    int d = scan.nextInt();
                    if(caminos.nodo.contenido(ciudad1)&&caminos.nodo.contenido(ciudad2)){
                        caminos.nodo.agregarGrafo(ciudad1, ciudad2, d);
                    }
                    else{
                        caminos.nodo.agregar(ciudad1);
                        caminos.nodo.agregar(ciudad2);
                        caminos.nodo.agregarGrafo(ciudad1, ciudad2, d);
                    }
                    try {
                        caminos.archivo.Escribir(ciudad1+" "+ciudad2+" "+d);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                caminos.Corto();
            }
        }
         System.out.println("FIN");
    }
    
}
