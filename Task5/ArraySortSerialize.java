import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArraySortSerialize {
    public static void main(String[] args) {
        String inputFileName = args[0];
        String outputFileName = args[1];
        double[] array;
        
        try {
            FileInputStream fis = new FileInputStream(inputFileName);
            FileOutputStream fos = new FileOutputStream(outputFileName);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ObjectInputStream ois = new ObjectInputStream(fis);

            //я сам хз зачем тут try-catch, но джава на чё-то ругаетя,поэтому пусть будет
            try {
                array = (double[]) ois.readObject();
            }catch(ClassNotFoundException e) {
                System.err.println(e.getMessage());
                ois.close();
                oos.close();
                return;
            }
            Arrays.sort(array);

            oos.writeObject(array);
            ois.close();
            oos.close();
        }
        catch(IOException e) {
            System.err.println("Не удалось открыть файл для чтения или записи!");
        }
    }
}