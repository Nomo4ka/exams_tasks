public class Main{
    public static void main(String[] args) {
        double minValue = min(args);
        double maxValue = max(args);
        double averageValue = avg(args);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Average value: " + averageValue);
    }
    
    static double min(String[] args) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            double num = Double.parseDouble(args[i]);
            if (Double.compare(num, min) < 0) {
                min = num;
            }
        }
        return min;
    }

    static double max(String[] args) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < args.length; i++) {
            double num = Double.parseDouble(args[i]);
            if (Double.compare(num, max) > 0) {
                max = num;
            }
        }
        return max;
    }

    static double avg(String[] args) {
        double sum = 0.0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        return sum / args.length;
    }
}