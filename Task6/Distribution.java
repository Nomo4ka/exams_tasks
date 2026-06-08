import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Distribution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        
        double a = Double.parseDouble(args[2]);
        double b = Double.parseDouble(args[3]);

        String outputFileName = args[4];

        double[][] matr = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matr[i][j] = a + (b - a) * Math.random();
            }
        }

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(outputFileName))) {
            out.writeInt(n);
            out.writeInt(m);
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.writeDouble(matr[i][j]);
                }
            }
        } catch (Exception e) {
            System.err.println("Не удалось записать в файл!");
        }
    }
}
