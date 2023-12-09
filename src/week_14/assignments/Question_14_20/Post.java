package week_14.assignments.Question_14_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Post {
    private Set<String> tags;
    private String postID;

    public Post() {
        tags = new HashSet<>();
        postID = null;
    }

    public Post(String postID) {
        tags = new HashSet<>();
        this.postID = postID;
    }
    public void addTag(String tagName) {
        tags.add(tagName);
    }
    public void removeTag(String tagName) {
        tags.remove(tagName);
    }
    public boolean isContain(String tagName) {
       return tags.contains(tagName);
    }
    @Override
    public String toString() {
        return tags.toString();
    }
}
