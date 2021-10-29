package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> children = new ArrayList<>();

    public boolean addStudent(String studentName){
        studentName = studentName.trim();
        if(studentName.indexOf(" ")>0){
            children.add(studentName);
            return true;
        } else {
            return false;
        }
    }

    public List<String> getChildren() {
        return children;
    }
}
