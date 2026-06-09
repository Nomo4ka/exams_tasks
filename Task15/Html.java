import java.nio.file.Files;
import java.nio.file.Paths;


public class Html {
    public static void main(String[] args) throws Exception {
        String html = new String(Files.readAllBytes(Paths.get(args[0])));
        System.out.println(html);       
    }
}