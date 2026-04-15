public class Circle {

    // atributo del círculo
    private double radius;

    // constructor por defecto
    public Circle() {
        this.radius = 1.0;
    }

    // constructor con parámetro
    public Circle(double radius) {
        this.radius = radius;
    }

    // getter del radio
    public double getRadius() {
        return radius;
    }

    // setter del radio
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // área del círculo
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // perímetro o longitud de la circunferencia
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}