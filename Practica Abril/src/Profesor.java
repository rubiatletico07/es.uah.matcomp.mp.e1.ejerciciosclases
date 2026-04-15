public class Profesor {

    // atributos del profesor
    private String nombre;
    private String departamento;

    // aquí hay un objeto dentro de otro objeto
    private Direccion direccion;

    // constructor vacío
    public Profesor() {
        this.nombre = "Ana Lopez";
        this.departamento = "Programacion";
        this.direccion = new Direccion("Avenida de la Universidad", 15, "Alcala de Henares");
    }

    // constructor con parámetros
    public Profesor(String nombre, String departamento, Direccion direccion) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}

/*
EJERCICIO 2:

Aquí he hecho que Profesor tenga una Direccion.
Eso significa que hay un objeto dentro de otro objeto.
*/