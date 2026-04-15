import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtil {

    // este método sirve para guardar cualquier objeto en un archivo JSON
    // uso <T> porque así el método vale para distintos tipos de objetos
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {

        // creo gson para hacer la conversión a JSON
        Gson gson = new Gson();

        // abro el archivo para escribir
        try (FileWriter writer = new FileWriter(rutaArchivo)) {

            // convierto el objeto a JSON y lo escribo en el fichero
            gson.toJson(objeto, writer);

        } catch (IOException e) {
            // si falla, lo indico por pantalla
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }

    // este método sirve para leer un archivo JSON y convertirlo en un objeto Java
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {

        // vuelvo a crear gson para poder leer el JSON
        Gson gson = new Gson();

        // abro el archivo para leer
        try (FileReader reader = new FileReader(rutaArchivo)) {

            // aquí convierto el contenido del JSON en un objeto de la clase indicada
            return gson.fromJson(reader, clase);

        } catch (IOException e) {
            // si falla la lectura, muestro el error y devuelvo null
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return null;
        }
    }
}

/*
COMENTARIO EXPLICATIVO:

He hecho esta clase aparte porque así no repito el mismo código en el main.
Además, al ser métodos static, puedo llamarlos directamente sin crear un objeto JsonUtil.
Por ejemplo:
JsonUtil.guardarObjetoEnArchivo(...)
JsonUtil.cargarObjetoDesdeArchivo(...)
*/