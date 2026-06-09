public class Main {
    public static void main(String[] args) {
        int pointsCount = Integer.parseInt(args[0]);
        int threadsCount = Integer.parseInt(args[1]);

        MonteCarloThread[] threads = new MonteCarloThread[threadsCount];
        for (int i = 0; i < threadsCount; i++) {
            threads[i] = new MonteCarloThread(pointsCount);
            threads[i].start();
        }

        int inside = 0;
        for (int i = 0; i < threadsCount; i++) {
            try {
                threads[i].join();
                inside += threads[i].result;
            } catch (InterruptedException e) {
                System.err.println("возникла ошибка!");
            }
        }
        System.out.println(4.0 * inside / pointsCount);
        //если взять 100000 точек и 4 потока, то результат будет 12.55552 , охуенная апроксимация 
    }
}