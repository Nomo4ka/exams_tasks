public class Number {
    private double value;

    private Number() {
        value = 0.0;
    }

    private static final Number instance = new Number();
    
    public static Number getInstance() {
        return instance;
    }

    public void add(double num) {
        value += num;
    }

    public void multiply(double num) {
        value *= num;
    }

    public void setValue(double num) {
        this.value = num;
    }

    public double getValue() {
        return value;
    }
}
