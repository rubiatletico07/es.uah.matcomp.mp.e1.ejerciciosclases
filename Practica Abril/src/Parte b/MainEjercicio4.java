public class MainEjercicio4 {

    public static void main(String[] args) {

        // creo varios estudiantes
        Estudiante e1 = new Estudiante("Ruben Jeronimo", 18, 8.8);
        Estudiante e2 = new Estudiante("Marta", 19, 7.9);
        Estudiante e3 = new Estudiante("Pablo", 20, 6.5);

        // los meto dentro de un array
        Estudiante[] lista = {e1, e2, e3};

        // creo una asignatura que contiene ese array de estudiantes
        Asignatura asignatura = new Asignatura("Metodologia de la Programacion", lista);

        // ruta donde guardaré la asignatura
        String rutaAsignatura = "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\asignatura.json";

        // guardo la asignatura en JSON
        JsonUtil.guardarObjetoEnArchivo(rutaAsignatura, asignatura);

        // la vuelvo a leer
        Asignatura asignaturaLeida = JsonUtil.cargarObjetoDesdeArchivo(rutaAsignatura, Asignatura.class);

        // muestro lo leído
        System.out.println(asignaturaLeida);
    }
}

/*
RESPUESTA DEL EJERCICIO 4:

La estructura del fichero resultante es un objeto JSON que contiene
el nombre de la asignatura y dentro una lista de estudiantes.

Tendría una forma parecida a esta:

{
  "nombre": "Metodologia de la Programacion",
  "estudiantes": [
    {
      "nombre": "Ruben Jeronimo",
      "edad": 18,
      "nota": 8.8
    },
    {
      "nombre": "Marta",
      "edad": 19,
      "nota": 7.9
    },
    {
      "nombre": "Pablo",
      "edad": 20,
      "nota": 6.5
    }
  ]
}

Sí, puedo modificar los alumnos en el fichero resultante.
Por ejemplo, puedo cambiar nombres, edades o notas.

Después, al volver a cargar el fichero, Gson construirá nuevos objetos
con los datos modificados.

Por tanto, sí se pueden obtener nuevos objetos cargando el fichero de vuelta
después de editarlo manualmente.
*/
