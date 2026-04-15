public class Asignatura {

    // nombre de la asignatura
    private String nombre;

    // aquí la asignatura tiene varios estudiantes
    private Estudiante[] estudiantes;

    // constructor vacío
    public Asignatura() {
        this.nombre = "Metodologia de la Programacion";
        this.estudiantes = new Estudiante[]{
                new Estudiante("Ruben Jeronimo", 18, 8.5),
                new Estudiante("Lucia", 19, 7.2)
        };
    }

    // constructor con parámetros
    public Asignatura(String nombre, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        String texto = "Asignatura: " + nombre + "\n";
        texto += "Estudiantes:\n";

        for (Estudiante e : estudiantes) {
            texto += e + "\n";
        }

        return texto;
    }
}