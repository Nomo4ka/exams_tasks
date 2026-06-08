public class Cos extends Trigonometric {
    @Override
    public double valueAt(double x) {
        return Math.cos(x) * Math.cos(x);
    }
}
