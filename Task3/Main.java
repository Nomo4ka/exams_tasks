
public class Main {
    public static void main(String[] args) {
        functions function = new SumFunc(new Sin(), new Cos());
        for (double x = 0; x <= 2 * Math.PI; x += 0.1) {
            System.out.println("x = " + x + ", f(x) = " + function.valueAt(x));
        }
    }
}
