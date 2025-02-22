import java.util.*;
public class cosc237Lab2Task1{  
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("how many elements do you want in the array?");
        
        String prompt= "Please enter an Integer ";
        int menuSelect;
        boolean allEven = false;
        int size = getint(scanner, prompt);
        int[]array= intrand(size);          
        print(array, size);
        
        do{
        menu();
        menuSelect=getint(scanner, prompt); 

        switch(menuSelect)
        {
          case 0:
           System.out.println("Testing completed.");
          break;
          
          case 1:
            isalleven(allEven, array, size);
          if (allEven) {
            System.out.println("this array is all even");
            
          }
          else{
          System.out.println("this array is not all even");
          }
          break;
          
          case 2:
           
          isunique(array, size); 
          
          if(isunique(array, size)==true)
            System.out.println("this array is unique");
          else
            System.out.println("this array is not unique");

          break;
          
          case 3:

          minGap(array, size);
          System.out.println("the min gap between 2 adjacents is "+minGap(array, size));
            
          break;
          
          case 4:
            
                print(array, size);
                System.out.printf("%n The mean for this list is: %d", getmean(array, size));
                System.out.printf(" %n The variance for this list is: %f", getVariance(array, size));
                System.out.printf(" %n The standard deviation is: %f", standDiv(array, size));
                System.out.println(" ");
            
          break;
          
          case 5:

          System.out.println("The top 20 percent of numbers is: ");
          top_20(array, size);

            
          break;
          
          default:
          System.out.println("Error!");
        }
      }while(menuSelect!=0);
    }

    public static int getint(Scanner in, String prompt) {
        System.out.println(prompt);
        while (!in.hasNextInt()) {
            System.out.println("error! not an int enter a number ");
            in.next();
        }
        return in.nextInt();
    }

    public static void print(int[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.printf("%3d ",array[i]);
        System.out.println(" ");
        

    }

    public static boolean isunique(int[] array, int size) {
      for (int i = 0; i < size; i++) {
          for (int j = i + 1; j < size; j++) {
              if (array[i] == array[j]) {
                  return false;
              }
          }
      }
      return true;
    }

    public static int[] intrand(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for(int x=0;x<size;x++){
               
            array[x] = random.nextInt(99)+ 1;
        }
        return array;
    }

    public static boolean isalleven(boolean allEven, int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            if (array[i] % 2 == 0)
              allEven = true;     
        }
          return allEven;
    }
    

    public static int getmean(int[] array, int size) {
        int mean = 0;
        for (int i = 0; i < size - 1; i++) {
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

    public static int minGap(int[] array, int size) {

    int[] low = new int[size - 1];
    int lowest = Math.abs(array[0] - array[1]);

    for (int i = 1; i < size - 1; i++) {
        low[i-1] = Math.abs(array[i] - array[i + 1]);
        if (low[i-1] < lowest) {
            lowest = low[i-1];
        }
    }
    return lowest;
    }

    public static double getVariance(int[] array, int size) {

        double variance = 0.0; 
        int mean= getmean(array, size);

      for(double temp : array){
            variance += Math.pow(temp - mean, 2) / (size);
        }
        return variance;

        
        

    }

    public static double standDiv(int[]array, int size){
    
        double variance = getVariance(array, size);
        double standDiv = Math.sqrt(variance);
        
        return standDiv;
        
        
    }
    public static void top_20(int[] array, int size){
        int[] sortedArray = bubbleSort(size, array);
        int top20Per = size/5;
        int[] topTwenty = new int[top20Per];
        int temp=size;
        int c = 0;
        for(int i = 0;i < top20Per ;i++){    
          topTwenty[c] = sortedArray[temp-1];
          c++;
          temp--;
          }
        for(int x=0;x<top20Per;x++)
          System.out.print(topTwenty[x] +" ");
        System.out.println(" ");
    } 

    

    public static void menu() {

        System.out.println("Your options are:");
        System.out.println("-----------------");
        System.out.println("1) All even values");
        System.out.println("2) All unique values");
        System.out.println("3) Print min gap between values");
        System.out.println("4) Statistics");
        System.out.println("5) Print 80% Percentile");
        System.out.println("0) Exit");
        
    }

        public static int[] bubbleSort(int size, int[]array){
      int[] sortedArray = new int[size];
      for(int j = 0; j < size;j++){
        sortedArray[j] = array[j];
      }
        int temp;
        for(int z = size; z-1 > 1; z--){
          for(int i = 0; i < size - 1; i++){
            if(sortedArray[i] > sortedArray[i+1]){
              temp = sortedArray[i];
              sortedArray[i]=sortedArray[i+1];
              sortedArray[i+1]=temp;
                }
            }
        }return sortedArray;
    }
}