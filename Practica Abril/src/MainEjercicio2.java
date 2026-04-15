public class MainEjercicio2 {

    public static void main(String[] args) {

        // ruta del fichero
        String rutaProfesor = "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\profesor.json";

        // creo un profesor con una dirección dentro
        Direccion direccion = new Direccion("Calle Libreros", 25, "Alcala de Henares");
        Profesor profesor = new Profesor("Carlos Perez", "Metodologia", direccion);

        // guardo el profesor
        JsonUtil.guardarObjetoEnArchivo(rutaProfesor, profesor);

        // lo vuelvo a leer
        Profesor profesorLeido = JsonUtil.cargarObjetoDesdeArchivo(rutaProfesor, Profesor.class);

        // lo muestro por pantalla
        System.out.println("Profesor leido: " + profesorLeido);
    }
}

/*
RESPUESTA DEL EJERCICIO 2:

Lo que ocurre es que Gson también guarda el objeto interno.
Es decir, no solo guarda los datos del profesor, sino también los datos de la dirección.

El JSON resultante tiene una estructura anidada, con un bloque dentro de otro.

Por ejemplo, aparecerá algo parecido a:
{
  "nombre": "...",
  "departamento": "...",
  "direccion": {
      "calle": "...",
      "numero": ...,
      "ciudad": "..."
  }
}

Por tanto, sí se pueden transformar a JSON objetos que contengan otros objetos.
*/
