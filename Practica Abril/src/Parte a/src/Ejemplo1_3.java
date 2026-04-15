public class Ejemplo1_3 {
    public static void main(String[] args) {
        System.out.println("Propagacion de excepciones en la pila");
        try {
            // Llamamos al primer metodo
            methodA();
        } catch (ArithmeticException e) {
            // La capturamos aqui para que no se cierre
            System.out.println("Se ha capturado una ArithmeticException: " + e.getMessage());
        }
    }
    public static void methodA() {
        // Entramos en A
        System.out.println("Enter methodA()");
        // A llama a B
        methodB();
        System.out.println("Exit methodA()");
    }
    public static void methodB() {
        // Entramos en B
        System.out.println("Enter methodB()");
        // B llama a C
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC() {
        // Entramos en C
        System.out.println("Enter methodC()");
        System.out.println(1 / 0);
        System.out.println("Exit methodC()");
    }
}