package week_07.assignments;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100000) + 1);
        }
        int key = (int) ((Math.random() * 100000) + 1);
        long startTime = System.currentTimeMillis();
        int keyLinearIndex = linearSearch(array, key);
        long endTime = System.currentTimeMillis();
        sort(array);
        long startTime2 = System.currentTimeMillis();
        int keyBinaryIndex = binarySearch(array, key);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Execution time of invoking the linearSearch in milliseconds: " + (endTime - startTime));
        System.out.println("Execution time of invoking the binarySearch in milliseconds: " + (endTime2 - startTime2));
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int high = array.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -(low + 1);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
