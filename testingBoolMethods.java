import java.util.*;
public class testingBoolMethods{ 
  public static void main(String[] args){
    int size = 5 ;
    int[] array = {5,6,5,3};
    isunique(array, size);
  } 
  
  public static boolean isunique(int[] array, int size) {
        for (int j = 0; j < size - 1; j++) {
            for (int i = 1; i < size - 1; i++) {
                if (array[i] == a[j])
                    return false;

            }

        }
        return true;

    }
  }