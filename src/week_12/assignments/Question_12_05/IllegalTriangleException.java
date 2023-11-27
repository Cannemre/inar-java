package week_12.assignments.Question_12_05;

public class IllegalTriangleException extends Exception{
    private Triangle triangle;
    public IllegalTriangleException() {
        super("The sum of any two sides must be greater than the remaining side");
    }


}
