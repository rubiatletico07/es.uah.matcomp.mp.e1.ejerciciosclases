public class Clase {

    // nombre de la clase
    private String nombreClase;

    // aquí guardo un array de alumnos
    private String[] alumnos;

    // constructor vacío
    public Clase() {
        this.nombreClase = "MP";
        this.alumnos = new String[]{"Ruben", "Ana", "Luis"};
    }

    // constructor con parámetros
    public Clase(String nombreClase, String[] alumnos) {
        this.nombreClase = nombreClase;
        this.alumnos = alumnos;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
