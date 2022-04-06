package sem1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        FileWriter fileWriter = new FileWriter("test_time.txt");
        for (int n = 1; n <= 50; n += 1) {
            int[] arr = intoArray("text" + n + ".txt");

            MergeSort ob = new MergeSort();
            long start = System.nanoTime();
            ob.sort(arr, 0, arr.length - 1);
            long end = System.nanoTime();
            long elapsed = end - start;

            fileWriter.write(arr.length + " ");
            fileWriter.write(ob.iteration + " ");
            fileWriter.write(elapsed + "\n");
        }
        fileWriter.close();

    static int[] intoArray(String path) throws IOException {
        Scanner scanner = new Scanner(Paths.get(path));
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        int arr[] = new int [list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
