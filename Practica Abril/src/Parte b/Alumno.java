public class Alumno {

    // atributos que he elegido para representar a un alumno
    private String nombre;
    private int edad;
    private String grado;
    private int curso;
    private double notaMedia;

    // constructor vacío con datos por defecto
    // este constructor me viene bien para la operación init
    public Alumno() {
        this.nombre = "Ruben Jeronimo";
        this.edad = 18;
        this.grado = "Matematicas y Computacion";
        this.curso = 1;
        this.notaMedia = 8.0;
    }

    // constructor con parámetros por si quiero crear alumnos distintos
    public Alumno(String nombre, int edad, String grado, int curso, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    // getter del nombre
    public String getNombre() {
        return nombre;
    }

    // setter del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // getter de la edad
    public int getEdad() {
        return edad;
    }

    // setter de la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // getter del grado
    public String getGrado() {
        return grado;
    }

    // setter del grado
    public void setGrado(String grado) {
        this.grado = grado;
    }

    // getter del curso
    public int getCurso() {
        return curso;
    }

    // setter del curso
    public void setCurso(int curso) {
        this.curso = curso;
    }

    // getter de la nota media
    public double getNotaMedia() {
        return notaMedia;
    }

    // setter de la nota media
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // este método toString sirve para mostrar el objeto de forma más clara por pantalla
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", grado='" + grado + '\'' +
                ", curso=" + curso +
                ", notaMedia=" + notaMedia +
                '}';
    }
}

/*
RESPUESTA AL PUNTO 1 DEL EJERCICIO:

He programado una clase de datos llamada Alumno.
He elegido los atributos nombre, edad, grado, curso y notaMedia
porque me parecen suficientes para representar a un alumno.
*/