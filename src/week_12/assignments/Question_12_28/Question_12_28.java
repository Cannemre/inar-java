package week_12.assignments.Question_12_28;

import java.io.File;
import java.util.ArrayList;

public class Question_12_28 {
    public static void main(String[] args) {
        ArrayList<File> list = getFiles(args);
        for (int i = 0; i < list.size(); i++) {
            padFileName(list.get(i));
        }
    }
    public static void padFileName(File file) {
        StringBuilder newName = new StringBuilder(file.getName());
        newName.insert(10, '0');
        file.renameTo(new File(newName.toString()));
    }
    public static ArrayList<File> getFiles(String[] args) {
        ArrayList<File> list = new ArrayList<>();
        for (String e: args) {
            File f = new File(e);
            if (f.isFile() && f.getName().matches("Question\\d_\\d.*"))
                list.add(f);
        }
        return list;
    }
}
