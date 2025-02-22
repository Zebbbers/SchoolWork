import java.util.*;
import java.io.*;

public class Lab2test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name you want to read from:");
        boolean fileopened = true;
        String fileName = input.next();

        int size = 15;
        int[] array = new int[size];
        try {
            File file = new File(fileName);

            Scanner read = new Scanner(file);
            int i = 0;
            while (i < size && read.hasNext()) {
                if (read.hasNextInt()) {
                    array[i] = read.nextInt();
                    i++;
                } else {
                    read.next();
                }
            }

            for (int k = 0; k < i; k++) {
                System.out.print(array[k] + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            fileopened = false;
        }

    }
}