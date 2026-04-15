import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class MainGuardarPersona {

    public static void main(String[] args) {

        // creo el objeto gson, que es la librería que transforma objetos Java en JSON
        Gson gson = new Gson();

        // creo una persona con mis datos
        Persona p = new Persona("Ruben Jeronimo", 18, "Matematicas y Computacion");

        // aquí pongo la ruta exacta donde quiero guardar el fichero
        // en Java hay que poner \\ porque la barra \ sola da problemas en los String
        String rutaArchivo = "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\persona.json";

        // este try abre el fichero para escribir en él
        // si el fichero no existe, lo crea
        try (FileWriter writer = new FileWriter(rutaArchivo)) {

            // aquí convierto el objeto persona a JSON y lo guardo en el fichero
            gson.toJson(p, writer);

            // mensaje para comprobar que se ha guardado bien
            System.out.println("Fichero guardado en: " + rutaArchivo);

        } catch (IOException e) {
            // si hay un error al guardar, se muestra por pantalla
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}

/*
RESPUESTA A LA PREGUNTA: ¿Dónde se guarda el fichero de datos?

El fichero de datos se guarda en la ruta que se le indica al programa.
En este caso se guarda en:
C:\Users\UAH\IdeaProjects\Practica Abril\persona.json

Si no se pone una ruta completa y solo se pone un nombre como persona.json,
entonces el fichero se guarda en el directorio de trabajo actual del programa.
*/