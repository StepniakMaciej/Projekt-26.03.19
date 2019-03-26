import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Projekt3 {
    public void text() {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();
        System.out.println(text);


        Path path = Paths.get("home", "Idea Projects", "Projekt 26.03.19");
        try {
            List o = Files.readAllLines(path);
            System.out.println(o);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
