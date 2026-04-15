import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ejemplo1_1 {
    public static void main(String[] args){
        System.out.println("Introduccion al manejo de excepciones");
        try {
            // Intento abrir el archivo test.in
            // Si no esta en la carpeta pues no funciona
            Scanner entrada = new Scanner(new File("test.in"));
            System.out.println("Archivo abierto");
            entrada.close();
        } catch (FileNotFoundException e) {
            // Este catch se ejecuta si no encuentra el archivo
            System.out.println("No se ha encontrado el archivo");
        }
    }
}