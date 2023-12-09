package week_13.assignments.Question_13_08;

public class Question_13_08 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        System.out.println("Pushing the number 4, 5, and 6 to 1st stack...");
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        System.out.println("Cloning 1st stack...");
        Stack stack2 = stack1.clone();
        System.out.println("Popping object from 1st stack...");
        stack1.pop();
        System.out.printf("1st Stack: %s\n2nd Stack: %s\n", stack1, stack2);
        System.out.println("Is the 1st stack equal to the 2nd stack? --> " + stack1.isEqual(stack2));
    }
}
