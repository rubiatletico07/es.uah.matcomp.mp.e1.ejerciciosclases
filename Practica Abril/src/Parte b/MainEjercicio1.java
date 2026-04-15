public class MainEjercicio1 {

    public static void main(String[] args) {

        // -------------------------
        // HOJA EL1-a
        // -------------------------
        Circle circle = new Circle(2.5);
        Employee employee = new Employee(8, "Ruben", "Jeronimo", 1200);

        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\circle.json",
                circle
        );
        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\employee.json",
                employee
        );

        Circle circleLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\circle.json",
                Circle.class
        );
        Employee employeeLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\employee.json",
                Employee.class
        );

        System.out.println("EL1-a:");
        System.out.println(circleLeido);
        System.out.println(employeeLeido);

        // -------------------------
        // HOJA EL1-b
        // -------------------------
        Author author = new Author("Ruben Jeronimo", "ruben@correo.com", 'm');
        Book book = new Book("Metodologia", author, 19.95, 2);

        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\author.json",
                author
        );
        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\book.json",
                book
        );

        Author authorLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\author.json",
                Author.class
        );
        Book bookLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\book.json",
                Book.class
        );

        System.out.println("EL1-b:");
        System.out.println(authorLeido);
        System.out.println(bookLeido);

        // -------------------------
        // HOJA EL1-c
        // -------------------------
        Person person = new Person("Ruben Jeronimo", "Alcala");
        Student student = new Student("Ruben Jeronimo", "Alcala", "Matematicas y Computacion", 1, 1000);

        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\person.json",
                person
        );
        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\student.json",
                student
        );

        Person personLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\person.json",
                Person.class
        );
        Student studentLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\student.json",
                Student.class
        );

        System.out.println("EL1-c:");
        System.out.println(personLeido);
        System.out.println(studentLeido);

        // -------------------------
        // HOJA EL1-d
        // -------------------------
        MovablePoint movablePoint = new MovablePoint(2, 3, 1, 1);
        ResizableCircle resizableCircle = new ResizableCircle(10);

        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\movablePoint.json",
                movablePoint
        );
        JsonUtil.guardarObjetoEnArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\resizableCircle.json",
                resizableCircle
        );

        MovablePoint movablePointLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\movablePoint.json",
                MovablePoint.class
        );
        ResizableCircle resizableCircleLeido = JsonUtil.cargarObjetoDesdeArchivo(
                "C:\\Users\\UAH\\IdeaProjects\\Practica Abril\\resizableCircle.json",
                ResizableCircle.class
        );

        System.out.println("EL1-d:");
        System.out.println(movablePointLeido);
        System.out.println(resizableCircleLeido);
    }
}
/*
EJERCICIO 1:

En vez de usar clases inventadas como Punto y Rectangulo,
he usado 2 clases de cada una de las hojas de ejercicios que se habían trabajado antes.

De la hoja EL1-a he usado Circle y Employee.
De la hoja EL1-b he usado Author y Book.
De la hoja EL1-c he usado Person y Student.
De la hoja EL1-d he usado MovablePoint y ResizableCircle.

He guardado todos esos objetos en ficheros JSON y después los he vuelto a cargar.
Así se comprueba que Gson puede trabajar con clases simples, con composición,
con herencia y también con clases relacionadas con interfaces.
*/