import java.io.BufferedReader;
import java.io.FileReader;

public class CharCounts {
    public static void main(String[] args) {
        String filename = args[1];
        char target = args[0].charAt(0);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int count = 0;
            int ch;
            while ((ch = br.read()) != -1) {
                if (ch == target) {
                    count++;
                }
            }
            System.out.println("Количество символов: '" + target + "': " + count);
            
        } catch (Exception e) {
            System.err.println("Не удалось прочитать файл!");
        }
    }
}