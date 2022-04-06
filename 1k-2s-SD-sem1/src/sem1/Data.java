package sem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Data {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = 0;
        for (int i = 1; i < 51; i++) {
            randomNumber += 100;
            File myFile = new File("text" + i + ".txt");
            try {
                FileWriter writer = new FileWriter("text" + i + ".txt");
                for (int j = 1; j <= randomNumber; j++) {
                    int randomNumber2 = r.nextInt(1000);
                    writer.write(randomNumber2 + " ");
                }
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}