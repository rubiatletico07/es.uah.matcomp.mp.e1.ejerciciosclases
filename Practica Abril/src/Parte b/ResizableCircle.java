public class ResizableCircle extends CircleGeo implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
