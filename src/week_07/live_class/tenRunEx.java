package week_07.live_class;

import java.util.Arrays;

public class tenRunEx {
    public static void main(String[] args) {
        int[] testArrayOne = {2, 10, 3, 4, 20, 5}; //[2, 10, 10, 10, 20, 20]
        int[] testArrayTwo = {10, 1, 20, 2}; // [10, 10, 20, 20]
        int[] testArrayThree = {10, 1, 9, 20}; // [10, 10, 10, 20]
        System.out.println(Arrays.toString(tenRun(testArrayOne)));
        System.out.println(Arrays.toString(tenRun(testArrayTwo)));
        System.out.println(Arrays.toString(tenRun(testArrayThree)));
    }

    public static int[] tenRun(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 10 == 0) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[j] % 10 != 0) {
                        list[j] = list[i];
                    } else {
                        break;
                    }
                }
            }
        }
        return list;
    }
}
