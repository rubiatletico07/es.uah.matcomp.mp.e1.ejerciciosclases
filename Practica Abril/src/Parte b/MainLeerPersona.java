import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class MainLeerPersona {

    public static void main(String[] args) {

        // vuelvo a crear gson porque lo necesito para leer el JSON
        Gson gson = new Gson();

        // esta es la misma ruta del fichero guardado antes
        String rutaArchivo = "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\persona.json";

        // este try abre el fichero para leerlo
        try (FileReader reader = new FileReader(rutaArchivo)) {

            // aquí leo el JSON y lo convierto otra vez en un objeto Persona
            Persona personaLeida = gson.fromJson(reader, Persona.class);

            // muestro por pantalla los datos cargados desde el fichero
            System.out.println("Nombre: " + personaLeida.getNombre());
            System.out.println("Edad: " + personaLeida.getEdad());
            System.out.println("Estudios: " + personaLeida.getEstudios());

        } catch (IOException e) {
            // si falla la lectura, se muestra el error
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}

/*
RESPUESTA AL EJERCICIO:
Modifica el fichero JSON del ejemplo anterior, y haz un nuevo programa main que sólo lea el fichero,
que no lo guarde: ¿Has conseguido que se modifique la salida del programa?

Sí, la salida del programa se modifica.

Esto pasa porque este programa no crea nuevos datos ni guarda nada,
solo lee lo que haya dentro del fichero JSON.

Por eso, si yo abro el fichero persona.json y cambio por ejemplo la edad o los estudios,
al ejecutar este programa aparecerán esos nuevos datos por pantalla.

Esto demuestra que la información se está cargando desde el fichero
y no desde valores escritos directamente en el código.
*/