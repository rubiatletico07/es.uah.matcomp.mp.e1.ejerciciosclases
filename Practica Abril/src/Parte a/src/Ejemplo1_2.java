public class Ejemplo1_2 {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA() {
        // Entramos en methodA
        System.out.println("Enter methodA()");
        // Desde aqui llamamos al siguiente metodo
        methodB();
        // Esto se ejecuta al volver de methodB
        System.out.println("Exit methodA()");
    }
    public static void methodB() {
        // Entramos en methodB
        System.out.println("Enter methodB()");
        // Llamamos al siguiente metodo
        methodC();
        // Cuando termina methodC vuelve aqui
        System.out.println("Exit methodB()");
    }
    public static void methodC() {
        // Este es el ultimo metodo
        System.out.println("Enter methodC()");
        // Ya no llama a nadie mas
        System.out.println("Exit methodC()");
    }
}