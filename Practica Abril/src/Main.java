public class Main {

    public static void main(String[] args) {

        // primero compruebo que el usuario haya escrito exactamente 2 argumentos
        // el ejercicio pide <operacion> <fichero>
        if (args.length != 2) {
            System.out.println("Uso correcto:");
            System.out.println("java -jar NombreDeTuProyecto.jar <operacion> <fichero>");
            System.out.println("Operaciones disponibles: init y show");
            return;
        }

        // guardo el primer argumento en operacion
        // aquí se espera que el usuario escriba init o show
        String operacion = args[0];

        // guardo el segundo argumento en fichero
        // aquí se espera la ruta del archivo JSON
        String fichero = args[1];

        // si la operación es init
        if (operacion.equalsIgnoreCase("init")) {

            // creo un alumno con valores por defecto
            Alumno alumno = new Alumno();

            // guardo ese alumno en el fichero indicado
            JsonUtil.guardarObjetoEnArchivo(fichero, alumno);

            // aviso por pantalla de que se ha creado bien
            System.out.println("Fichero creado correctamente en:");
            System.out.println(fichero);

        }
        // si la operación es show
        else if (operacion.equalsIgnoreCase("show")) {

            // leo el fichero y convierto el JSON en un objeto Alumno
            Alumno alumnoLeido = JsonUtil.cargarObjetoDesdeArchivo(fichero, Alumno.class);

            // compruebo que la lectura haya salido bien
            if (alumnoLeido != null) {

                // si se ha leído bien, muestro el objeto por pantalla
                System.out.println("Datos del alumno leidos desde el fichero:");
                System.out.println(alumnoLeido);

            } else {
                // si no se ha podido leer, lo aviso
                System.out.println("No se pudo leer el fichero.");
            }

        }
        // si el usuario escribe una operación que no existe
        else {
            System.out.println("Operacion no valida.");
            System.out.println("Usa 'init' o 'show'.");
        }
    }
}

/*
RESPUESTA AL PUNTO 2 DEL EJERCICIO:

He hecho un programa principal que recibe parámetros por línea de comandos.
Los parámetros son:
- <operacion>
- <fichero>

La operación puede ser:
- init -> crea un fichero con valores por defecto
- show -> lee un fichero y muestra los datos por pantalla

El fichero es la ruta donde se va a guardar o desde donde se va a leer el JSON.

RESPUESTA AL PUNTO 3 DEL EJERCICIO:

He probado el programa modificando el fichero JSON a mano.
Después, al ejecutar la operación show, se muestran los nuevos datos.
Por tanto, sí se puede comprobar que al modificar el fichero de datos
también cambia la salida del programa.
*/
