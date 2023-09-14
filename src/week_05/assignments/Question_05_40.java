package week_05.assignments;

public class Question_05_40 {
    public static void main(String[] args) {
        int headCounter = 0;
        int tailCounter = 0;
        for (int i = 1; i <= 1000000; i++) {
            int coin = (int) (Math.random() * 2);
            if (coin == 0) {
                headCounter++;
            } else {
                tailCounter++;
            }
        }
        System.out.println("Flipping a coin one million times...\n" + headCounter + "\n" + tailCounter);
    }
}
