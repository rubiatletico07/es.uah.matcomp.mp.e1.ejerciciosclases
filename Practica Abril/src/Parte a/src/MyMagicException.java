public class MyMagicException extends Exception {
    // Esta es la excepcion que creamos nosotros
    public MyMagicException(String mensaje) {
        // Llamamos al constructor de Exception
        super(mensaje);
    }
}