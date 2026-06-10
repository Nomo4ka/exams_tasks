public class MonteCarloThread extends Thread {
    private int pointsCount;
    private double result;
    
    MonteCarloThread(int pointsCount) {
        this.pointsCount = pointsCount;
    }

    public double getResult(){
        return result;
    }

    @Override 
    public void run() {
        for (int i = 0; i < pointsCount; i++) {
            if(isInterrupted()) return;
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                result++;
            }
        }   

    }
}
