public class Main {
    public static void main(String[] args) {
        int pointsCount = Integer.parseInt(args[0]);
        int threadsCount = Integer.parseInt(args[1]);

        int points = pointsCount / threadsCount;
        int remainder = pointsCount % threadsCount;

        MonteCarloThread[] threads = new MonteCarloThread[threadsCount];
        for (int i = 0; i < threadsCount; i++) {
            if (remainder != 0){
                ++points;
                --remainder;
            }
            threads[i] = new MonteCarloThread(points);
            threads[i].start();
        }

        int inside = 0;
        for (int i = 0; i < threadsCount; i++) {
            try {
                threads[i].join();
                inside += threads[i].getResult();
            } catch (InterruptedException e) {
                System.err.println("возникла ошибка!");
            }
        }
        System.out.println(4.0 * inside / pointsCount);
    }
}
