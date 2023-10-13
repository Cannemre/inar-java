package week_07.assignments;

public class Question_07_22 {
    public static void main(String[] args) {
        String[] row1 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        String[] row2 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        String[] row3 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        String[] row4 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        String[] row5 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        String[] row6 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        String[] row7 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        String[] row8 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| "};
        boolean result = false;
        while (!result) {
            int queen1 = (int) (Math.random() * 8);
            row1[queen1] = "|Q";
            int queen2 = 8;
            for (int i = 0; i < 100; i++) {
                queen2 = (int) (Math.random() * 8);
                if (queen2 != queen1 && queen2 != queen1 + 1 && queen2 != queen1 - 1) {
                    row2[queen2] = "|Q";
                    break;
                }
            }
            if (row2[queen2].equals("| ")) {
                row1[queen1] = "| ";
                continue;
            }
            int queen3 = 8;
            for (int i = 0; i < 100; i++) {
                queen3 = (int) (Math.random() * 8);
                if (queen3 != queen2 && queen3 != queen2 + 1 && queen3 != queen2 - 1 && queen3 != queen1 && queen3 != queen1 + 2 && queen3 != queen1 - 2) {
                    row3[queen3] = "|Q";
                    break;
                }
            }
            if (row3[queen3].equals("| ")) {
                row1[queen1] = "| ";
                row2[queen2] = "| ";
                continue;
            }
            int queen4 = 8;
            for (int i = 0; i < 100; i++) {
                queen4 = (int) (Math.random() * 8);
                if (queen4 != queen3 && queen4 != queen3 + 1 && queen4 != queen3 - 1 && queen4 != queen2 && queen4 != queen2 + 2 && queen4 != queen2 - 2 && queen4 != queen1 && queen4 != queen1 + 3 && queen4 != queen1 - 3) {
                    row4[queen4] = "|Q";
                    break;
                }
            }
            if (row4[queen4].equals("| ")) {
                row1[queen1] = "| ";
                row2[queen2] = "| ";
                row3[queen3] = "| ";
                continue;
            }
            int queen5 = 8;
            for (int i = 0; i < 100; i++) {
                queen5 = (int) (Math.random() * 8);
                if (queen5 != queen4 && queen5 != queen4 + 1 && queen5 != queen4 - 1 && queen5 != queen3 && queen5 != queen3 + 2 && queen5 != queen3 - 2 && queen5 != queen2 && queen5 != queen2 + 3 && queen5 != queen2 - 3 && queen5 != queen1 && queen5 != queen1 + 4 && queen5 != queen1 - 4) {
                    row5[queen5] = "|Q";
                    break;
                }
            }
            if (row5[queen5].equals("| ")) {
                row1[queen1] = "| ";
                row2[queen2] = "| ";
                row3[queen3] = "| ";
                row4[queen4] = "| ";
                continue;
            }
            int queen6 = 8;
            for (int i = 0; i < 100; i++) {
                queen6 = (int) (Math.random() * 8);
                if (queen6 != queen5 && queen6 != queen5 + 1 && queen6 != queen5 - 1 && queen6 != queen4 && queen6 != queen4 + 2 && queen6 != queen4 - 2 && queen6 != queen3 && queen6 != queen3 + 3 && queen6 != queen3 - 3 && queen6 != queen2 && queen6 != queen2 + 4 && queen6 != queen2 - 4 && queen6 != queen1 && queen6 != queen1 + 5 && queen6 != queen1 - 5) {
                    row6[queen6] = "|Q";
                    break;
                }
            }
            if (row6[queen6].equals("| ")) {
                row1[queen1] = "| ";
                row2[queen2] = "| ";
                row3[queen3] = "| ";
                row4[queen4] = "| ";
                row5[queen5] = "| ";
                continue;
            }
            int queen7 = 8;
            for (int i = 0; i < 100; i++) {
                queen7 = (int) (Math.random() * 8);
                if (queen7 != queen6 && queen7 != queen6 + 1 && queen7 != queen6 - 1 && queen7 != queen5 && queen7 != queen5 + 2 && queen7 != queen5 - 2 && queen7 != queen4 && queen7 != queen4 + 3 && queen7 != queen4 - 3 && queen7 != queen3 && queen7 != queen3 + 4 && queen7 != queen3 - 4 && queen7 != queen2 && queen7 != queen2 + 5 && queen7 != queen2 - 5 && queen7 != queen1 && queen7 != queen1 + 6 && queen7 != queen1 - 6) {
                    row7[queen7] = "|Q";
                    break;
                }
            }
            if (row7[queen7].equals("| ")) {
                row1[queen1] = "| ";
                row2[queen2] = "| ";
                row3[queen3] = "| ";
                row4[queen4] = "| ";
                row5[queen5] = "| ";
                row6[queen6] = "| ";
                continue;
            }
            int queen8 = 8;
            for (int i = 0; i < 100; i++) {
                queen8 = (int) (Math.random() * 8);
                if (queen8 != queen7 && queen8 != queen7 + 1 && queen8 != queen7 - 1 && queen8 != queen6 && queen8 != queen6 + 2 && queen8 != queen6 - 2 && queen8 != queen5 && queen8 != queen5 + 3 && queen8 != queen5 - 3 && queen8 != queen4 && queen8 != queen4 + 4 && queen8 != queen4 - 4 && queen8 != queen3 && queen8 != queen3 + 5 && queen8 != queen3 - 5 && queen8 != queen2 && queen8 != queen2 + 6 && queen8 != queen2 - 6 && queen8 != queen1 && queen8 != queen1 + 7 && queen8 != queen1 - 7) {
                    row8[queen8] = "|Q";
                    break;
                }
            }
            if (!row8[queen8].equals("| ")) {
                result = true;
            } else {
                row1[queen1] = "| ";
                row2[queen2] = "| ";
                row3[queen3] = "| ";
                row4[queen4] = "| ";
                row5[queen5] = "| ";
                row6[queen6] = "| ";
                row7[queen7] = "| ";
            }
        }
        for (String s : row1) {
            System.out.print(s);
        }
        System.out.print("|");
        System.out.println();
        for (String s : row2) {
            System.out.print(s);
        }
        System.out.print("|");
        System.out.println();
        for (String s : row3) {
            System.out.print(s);
        }
        System.out.print("|");
        System.out.println();
        for (String s : row4) {
            System.out.print(s);
        }
        System.out.print("|");
        System.out.println();
        for (String s : row5) {
            System.out.print(s);
        }
        System.out.print("|");
        System.out.println();
        for (String s : row6) {
            System.out.print(s);
        }
        System.out.print("|");
        System.out.println();
        for (String s : row7) {
            System.out.print(s);
        }
        System.out.print("|");
        System.out.println();
        for (String s : row8) {
            System.out.print(s);
        }
        System.out.print("|");
    }
}
