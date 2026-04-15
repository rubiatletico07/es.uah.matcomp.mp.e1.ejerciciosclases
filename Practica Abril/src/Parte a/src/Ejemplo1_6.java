import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ejemplo1_6 {
    public static void main(String[] args) {
        System.out.println("Uso de try catch finally");
        try {
            // Intentamos abrir el archivo
            System.out.println("Intentando abrir el archivo");
            Scanner entrada = new Scanner(new File("test.in"));
            // Si llega aqui es que ha ido bien
            System.out.println("Archivo encontrado");
            // Cerramos el scanner
            entrada.close();
        } catch (FileNotFoundException e) {
            // Si no existe el archivo entra aqui
            System.out.println("No se ha encontrado el archivo");
        } finally {
            // Esto se ejecuta siempre
            System.out.println("El bloque finally se ejecuta siempre");
        }
        // El programa sigue despues
        System.out.println("El programa sigue despues del try-catch-finally");
    }
}