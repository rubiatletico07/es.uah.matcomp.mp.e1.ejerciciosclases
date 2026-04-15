public class Ejemplo1_8 {
    public static void magic(int numero) throws MyMagicException {
        if (numero == 8) {
            // Lanzamos la excepcion personalizada
            throw new MyMagicException("Has encontrado el numero magico");
        }
        // Si no es 8 no pasa nada raro
        System.out.println("Numero normal: " + numero);
    }
    public static void main(String[] args) {
        // Aqui probamos la excepcion creada por nosotros
        System.out.println("Excepcion personalizada");
        try {
            // Este no falla
            magic(9);
            // Este si falla
            magic(8);
        } catch (MyMagicException e) {
            // Capturamos nuestra excepcion
            System.out.println("Se ha capturado MyMagicException");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}