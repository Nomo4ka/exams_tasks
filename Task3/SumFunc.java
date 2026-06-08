public class SumFunc implements functions {
    private functions f1;
    private functions f2;

    public SumFunc(functions f1, functions f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public double getleft() {
        return Math.max(f1.getleft(), f2.getleft());
    }

    @Override
    public double getright() {
        return Math.min(f1.getright(), f2.getright());
    }

    @Override
    public double valueAt(double x) {
        return f1.valueAt(x) + f2.valueAt(x);
    }

}
