package week_07.live_class;

import java.util.Arrays;

public class evenOddEx {
    public static void main(String[] args) {
        int[] testArrayOne = {1, 0, 1, 0, 0, 1, 1}; //[0, 0, 0, 1, 1, 1, 1]
        int[] testArrayTwo = {3, 3, 2}; // [2, 3, 3]
        int[] testArrayThree = {2, 2, 2}; // [2, 2, 2]
        int[] testArrayFour = {1}; // 	[1]
        int[] testArrayFive = {1, 2}; // [2, 1]
        System.out.println(Arrays.toString(evenOdd(testArrayOne)));
        System.out.println(Arrays.toString(evenOdd(testArrayTwo)));
        System.out.println(Arrays.toString(evenOdd(testArrayThree)));
        System.out.println(Arrays.toString(evenOdd(testArrayFour)));
        System.out.println(Arrays.toString(evenOdd(testArrayFive)));
    }

    public static int[] evenOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] % 2 == 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
