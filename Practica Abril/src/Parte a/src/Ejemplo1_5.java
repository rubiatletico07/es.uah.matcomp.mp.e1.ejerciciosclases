public class Ejemplo1_5 {
    public static void main(String[] args) {
        System.out.println("Uso de throw y throws");
        try {
            // Llamamos al metodo con una edad mala aposta
            comprobarEdad(-2);
        } catch (IllegalArgumentException e) {
            // Capturamos la excepcion aqui
            System.out.println("Excepcion capturada: " + e.getMessage());
        }
    }
    public static void comprobarEdad(int edad) throws IllegalArgumentException {
        // Si la edad es menor que 0 no tiene sentido
        if (edad < 0) {
            // Lanzamos nosotros la excepcion
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        // Si esta bien se dice
        System.out.println("Edad valida: " + edad);
    }
}