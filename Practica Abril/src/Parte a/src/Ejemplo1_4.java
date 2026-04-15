public class Ejemplo1_4 {
    public static void main(String[] args) {
        System.out.println("Excepcion no verificada");
        try {
            // Hacemos una division entre 0 aposta
            int x = 10 / 0;
            // Esto no se llega a ejecutar
            System.out.println(x);
        } catch (ArithmeticException e) {
            // Aqui capturamos esa excepcion
            System.out.println("Se ha producido una ArithmeticException");
            // getMessage nos da el mensaje del error
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}