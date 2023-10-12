package week_07.assignments;

public class Question_07_22 {
    public static void main(String[] args) {
        String[] row1 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        String[] row2 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        String[] row3 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        String[] row4 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        String[] row5 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        String[] row6 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        String[] row7 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        String[] row8 = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};

        int queen1 = (int) (Math.random() * 8);
        if (queen1 == 7) {
            row1[queen1] = "|Q|";
        } else {
            row1[queen1] = "|Q";
        }

        int queen2 = 10;
        boolean result = true;
        while (result) {
            queen2 = (int) (Math.random() * 8);
            if (!(queen2 == queen1 || queen2 == queen1 + 1 || queen2 == queen1 - 1)) {
                result = false;
            }
        }
        if (queen2 == 7) {
            row2[queen2] = "|Q|";
        } else {
            row2[queen2] = "|Q";
        }

        int queen3 = 10;
        result = true;
        while (result) {
            queen3 = (int) (Math.random() * 8);
            if (!(queen3 == queen1 || queen3 == queen1 + 2 || queen3 == queen1 - 2 || queen3 == queen2 || queen3 == queen2 + 1 || queen3 == queen2 - 1)) {
                result = false;
            }
        }
        if (queen3 == 7) {
            row3[queen3] = "|Q|";
        } else {
            row3[queen3] = "|Q";
        }

        int queen4 = 10;
        result = true;
        while (result) {
            queen4 = (int) (Math.random() * 8);
            if (!(queen4 == queen1 || queen4 == queen1 + 3 || queen4 == queen1 - 3 || queen4 == queen2 || queen4 == queen2 + 2 || queen4 == queen2 - 2 || queen4 == queen3 || queen4 == queen3 + 1 || queen4 == queen3 - 1)) {
                result = false;
            }
        }
        if (queen4 == 7) {
            row4[queen4] = "|Q|";
        } else {
            row4[queen4] = "|Q";
        }

        int queen5 = 10;
        result = true;
        while (result) {
            queen5 = (int) (Math.random() * 8);
            if (!(queen5 == queen1 || queen5 == queen1 + 4 || queen5 == queen1 - 4 || queen5 == queen2 || queen5 == queen2 + 3 || queen5 == queen2 - 3 || queen5 == queen3 || queen5 == queen3 + 2 || queen5 == queen3 - 2)) {
                result = false;
            }
        }
        if (queen5 == 7) {
            row5[queen5] = "|Q|";
        } else {
            row5[queen5] = "|Q";
        }
    }
}
