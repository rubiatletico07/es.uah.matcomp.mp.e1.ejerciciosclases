public class Persona {

    // atributos de la clase, aquí guardo la información de la persona
    private String nombre;
    private int edad;
    private String estudios;

    // constructor vacío con valores por defecto
    // lo uso para crear un objeto ya relleno sin tener que pasar datos
    public Persona() {
        this.nombre = "Ruben Jeronimo";
        this.edad = 18;
        this.estudios = "Matematicas y Computacion";
    }

    // constructor con parámetros
    // este constructor sirve por si quiero crear una persona con otros datos
    public Persona(String nombre, int edad, String estudios) {
        this.nombre = nombre;
        this.edad = edad;
        this.estudios = estudios;
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

    // getter de estudios
    public String getEstudios() {
        return estudios;
    }

    // setter de estudios
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
}