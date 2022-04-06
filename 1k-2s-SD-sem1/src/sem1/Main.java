package sem1;

import java.io.File;
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

//            fileWriter.write(arr.length + " elements \n");
//            fileWriter.write(ob.iteration + " iterations \n");
//            fileWriter.write("Elapsed time in nanoseconds: " + elapsed + "\n\n");
        }
        fileWriter.close();

        //Drive code//

        //System.out.println("Given Array");
        //printArray(arr);
        //MergeSort ob = new MergeSort();
        //ob.sort(arr, 0, arr.length - 1);
        //System.out.println("\nSorted array");
        //printArray(arr);






//        Scanner scanner = new Scanner(Paths.get("path to file"));
//        List<Integer> list = new ArrayList<>();
//        while (scanner.hasNextInt()) {
//            list.add(scanner.nextInt());
//        }
//
//        int arr[] = new int [list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }


        /*public static int[] intoArray(String path) throws FileNotFoundException {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int n = scanner.nextInt();
            String line = scanner.next();
            String[] numbersString = line.split(" ");
            int [] numbers = new int[n];
            int counter = 0;
            for (String number : numbersString) {
                numbers [counter++] = Integer.parseInt(number);
            }
            scanner.close();
            return numbers;
        }*/


        // Driver code
        /*int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr); */
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

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
