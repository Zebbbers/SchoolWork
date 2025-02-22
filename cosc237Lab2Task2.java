import java.util.*;
import java.io.*;
public class cosc237Lab2Task2{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int menuSelect;
    System.out.println("Enter the file name you want to read from:");
    boolean fileopened = true;
    boolean allEven = false;
    String fileName = scanner.next();

    int size = 15; // the instructions were confusing, this is our "constant" we used for max size
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

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      fileopened = false;
    }
    print(array, size);

    do {
      menuSelect = menu();

      switch (menuSelect) {
        case 0:
          System.out.println("Testing completed.");
          break;

        case 1:
          isalleven(array, size);
          if (allEven) {
            System.out.println("this array is all even");

          } else {
            System.out.println("this array is not all even");
          }
          break;

        case 2:

          isunique(array, size);

          if (isunique(array, size) == true)
            System.out.println("this array is unique");
          else
            System.out.println("this array is not unique");

          break;

        case 3:

          minGap(array, size);
          System.out.println("the min gap between 2 adjacents is " + minGap(array, size));

          break;

        case 4:

          print(array, size);
          System.out.printf("%n The mean for this list is: %d", getmean(array, size));
          System.out.printf(" %n The variance for this list is: %f", getVariance(array, size));
          System.out.printf(" %n The standard deviation is: %f", standDiv(array, size));
          System.out.println(" ");

          break;

        case 5:

          top_20(size, array);

          break;

        default:
          System.out.println("Error!");
      }
    } while (menuSelect != 0);
  }

  public static void print(int[] array, int size) {
    for (int i = 0; i < size; i++) {
      System.out.printf("%3d ", array[i]);
    }

  }

  public static boolean isunique(int[] array, int size) {
    for (int j = 0; j < size - 1; j++) {
      for (int i = 1; i < size - 1; i++) {
        if (array[i] == array[j])
          return false;

      }

    }
    return true;

  }

  public static boolean isalleven(int[] array, int size) {
    for (int i = 0; i < size - 1; i++) {
      if (array[i] % 2 != 0)
        return false;
    }
    return true;
  }

  public static int getmean(int[] array, int size) {
    int mean = 0;
    for (int i = 0; i < size; i++) {
      mean += array[i];
    }
    return mean / (size);

  }

  public static int[] copy(int[] array, int size) {
    int[] copy = new int[size];
    for (int i = 0; i < size - 1; i++) {
      copy[i] = array[i];
    }
    return copy;
  }

  public static double getVariance(int[] array, int size) {

    double variance = 0.0;
    int mean = getmean(array, size);

    for (double temp : array) {
      variance += Math.pow(temp - mean, 2) / (size);

    }

    return variance;

  }

  public static int minGap(int[] array, int size) {

    int[] low = new int[size - 1];
    int lowest = Math.abs(array[0] - array[1]);

    for (int i = 1; i < size - 1; i++) {
      low[i - 1] = Math.abs(array[i] - array[i + 1]);
      if (low[i - 1] < lowest) {
        lowest = low[i - 1];
      }
    }
    return lowest;
  }

  public static double standDiv(int[] array, int size) {

    double variance = getVariance(array, size);
    double standDiv = Math.sqrt(variance);

    return standDiv;

  }

  public static void top_20(int size, int[] array) {

    int[] sortedArray = bubbleSort(array, size);
    int top20Per = size / 5;
    int[] topTwenty = new int[top20Per];
    int temp = size;
    int c = 0;
    for (int i = 0; i < top20Per; i++) {
      topTwenty[c] = sortedArray[temp - 1];
      c++;
      temp--;
    }
    for (int x = 0; x < top20Per; x++)
      System.out.print(topTwenty[x] + " ");
    System.out.println(" ");

  }

  public static int menu() {
    int menuSelect;
    Scanner input = new Scanner(System.in);
    do {
      System.out.println("Your options are:");
      System.out.println("-----------------");
      System.out.println("1) All even values");
      System.out.println("2) All unique values");
      System.out.println("3) Print min gap between values");
      System.out.println("4) Statistics");
      System.out.println("5) Print 80% Percentile");
      System.out.println("0) Exit");
      System.out.printf("Please enter your options ");
      menuSelect = getint(input);
      System.out.println();
    } while (menuSelect < 0 || menuSelect > 5);
    return menuSelect;
  }

  public static int[] bubbleSort(int[] array, int size) {
    int[] sortedArray = new int[size];
    for (int j = 0; j < size; j++) {
      sortedArray[j] = array[j];
    }
    int temp;
    for (int z = size; z - 1 > 1; z--) {
      for (int i = 0; i < size - 1; i++) {
        if (sortedArray[i] > sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
        }
      }
    }
    return sortedArray;
  }

  public static int getint(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.println("error! not an int enter a number ");
      scanner.next();
    }
    return scanner.nextInt();
  }
}