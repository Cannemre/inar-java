package week_12.assignments.Question_12_10;

public class Question_12_10 {
    public static void main(String[] args) throws OutOfMemoryError {
        int length = 1239000000;
        try {
            byte[] array = new byte[length];
        }
        catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }
    }
}
