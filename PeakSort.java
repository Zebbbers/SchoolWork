import java.util.Arrays;

public class PeakSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 3, 5, 1, 2, 7, 6};
        peakSort(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void peakSort(int[] arr, int k) {
        if (k < 2) {
            throw new IllegalArgumentException("k must be at least 2");
        }
        int n = arr.length;
        int numChunks = (n + k - 1) / k;
        for (int i = 0; i < numChunks; i++) {
            int left = i * k;
            int right = Math.min(left + k - 1, n - 1);
            Arrays.sort(arr, left, right + 1);
        }
        while (k < n) {
            for (int i = 0; i < n; i += k * 2) {
                int left = i;
                int middle = Math.min(i + k - 1, n - 1);
                int right = Math.min(i + k * 2 - 1, n - 1);
                int[] temp = new int[right - left + 1];
                int index = 0;
                int p = middle; // find peak
                for (int j = middle + 1; j <= right; j++) {
                    if (arr[j] > arr[p]) {
                        p = j;
                    }
                }
                temp[index++] = arr[p];
                int q = middle - 1; // find valley
                for (int j = middle - 1; j >= left; j--) {
                    if (arr[j] < arr[q]) {
                        q = j;
                    }
                }
                temp[index++] = arr[q];
                for (int j = left; j <= right; j++) {
                    if (j == p || j == q) {
                        continue;
                    }
                    temp[index++] = arr[j];
                }
                System.arraycopy(temp, 0, arr, left, index);
            }
            k *= 2;
        }
    }
}

