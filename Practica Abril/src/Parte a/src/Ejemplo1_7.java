public class Ejemplo1_7 {
    public static void main(String[] args) {
        System.out.println("Excepciones comunes");
        try {
            // Creamos un array de tamaño 3
            int[] array = new int[3];
            // Las posiciones validas son 0, 1 y 2
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturamos el error del array
            System.out.println("ArrayIndexOutOfBoundsException capturada");
        }
        try {
            // Creamos un array de String pero vacio de contenido
            String[] textos = new String[3];
            //texto[0] no vale nada
            System.out.println(textos[0].length());
        } catch (NullPointerException e) {
            // Capturamos null pointer
            System.out.println("NullPointerException capturada");
        }
        try {
            // Intentamos pasar letras a numeros
            int numero = Integer.parseInt("abc");
            // No llega aqui
            System.out.println(numero);
        } catch (NumberFormatException e) {
            // Capturamos el error de formato
            System.out.println("NumberFormatException capturada");
        }
        try {
            // Llamamos a un metodo con un numero negativo
            comprobarNumero(-5);
        } catch (IllegalArgumentException e) {
            // Capturamos el error de argumento ilegal
            System.out.println("IllegalArgumentException capturada");
        }
    }
    public static void comprobarNumero(int n) {
        // Si el numero es negativo lanzamos la excepcion
        if (n < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        // Si no fuera negativo podria seguir
        System.out.println("Numero correcto");
    }
}