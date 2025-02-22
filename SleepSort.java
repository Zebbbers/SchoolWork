import java.util.*;

public class SleepSort {
    public static void main(String[] args) {
        int[] nums = {200, 20, 5, 2, 7, 1, 9, 3, 6, 8, 4};
        sleepSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sleepSort(int[] nums) {
        List<Thread> threads = new ArrayList<>();
        for (int num : nums) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(num * 1L); // sleep for num seconds
                    System.out.print(num + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads.add(thread);
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




