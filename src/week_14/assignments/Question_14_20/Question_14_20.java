package week_14.assignments.Question_14_20;


public class Question_14_20 {
    public static void main(String[] args) {
        Post post1 = new Post("000001");
        Post post2 = new Post("000002");
        post1.addTag("Java");
        post1.addTag("Coding");
        post1.addTag("Programming");
        post2.addTag("Java");
        post2.addTag("Technology");
        post2.addTag("Coding");
        System.out.println("Tags for Post 1: " + post1.toString());
        System.out.println("Tags for Post 2: " + post2.toString());
        System.out.println("Does post1 have the tag 'Java'? " + post1.isContain("Java"));
        System.out.println("Does post2 have the tag 'Technology'? " + post2.isContain("Technology"));
        post1.removeTag("Programming");
        System.out.println("Tags for Post 1: " + post1.toString());
    }
}
