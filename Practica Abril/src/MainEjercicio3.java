import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class MainEjercicio3 {

    public static void main(String[] args) {

        Gson gson = new Gson();

        // -------------------------------
        // PARTE 1: guardar un array suelto
        // -------------------------------
        int[] numeros = {1, 2, 3, 4, 5};
        String rutaArray = "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\arrayNumeros.json";

        try (FileWriter writer = new FileWriter(rutaArray)) {
            gson.toJson(numeros, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar array: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(rutaArray)) {
            int[] numerosLeidos = gson.fromJson(reader, int[].class);

            System.out.println("Array leido:");
            for (int n : numerosLeidos) {
                System.out.print(n + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error al leer array: " + e.getMessage());
        }

        // ----------------------------------------
        // PARTE 2: guardar un array dentro de objeto
        // ----------------------------------------
        String[] alumnos = {"Ruben", "Lucia", "Pedro"};
        Clase clase = new Clase("MatComp", alumnos);

        String rutaClase = "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\clase.json";
        JsonUtil.guardarObjetoEnArchivo(rutaClase, clase);

        Clase claseLeida = JsonUtil.cargarObjetoDesdeArchivo(rutaClase, Clase.class);

        System.out.println("Clase leida: " + claseLeida.getNombreClase());
        System.out.println("Alumnos de la clase:");

        for (String alumno : claseLeida.getAlumnos()) {
            System.out.println(alumno);
        }
    }
}

/*
RESPUESTA DEL EJERCICIO 3:

Si guardo un array suelto, Gson lo transforma en una lista JSON.
Por ejemplo, un array de enteros queda así:
[1,2,3,4,5]

Si el array está dentro de un objeto, entonces aparece como un atributo más del objeto.
Por ejemplo:
{
  "nombreClase": "MatComp",
  "alumnos": ["Ruben", "Lucia", "Pedro"]
}

Por tanto, Gson también puede trabajar con arrays, tanto solos como dentro de objetos.
*/
