public class Sin extends Trigonometric {
    @Override
    public double valueAt(double x) {
        return Math.sin(x) * Math.sin(x);
    }
}
