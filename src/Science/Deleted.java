package Science;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Deleted {
public static File deleted = new File("data/deleted");

    private String studentID;
    private String courseID;
    private String Term;

    public Deleted(String studentID,String courseID,String Term) throws IOException {
       FileWriter delete = new FileWriter(deleted);
        delete.append(studentID);
        delete.append(" ");
        delete.append(courseID);
        delete.append(" ");
        delete.append(Term);
        delete.append("\n");
        delete.close();
    }
    public String getCourseId() {
        return this.courseID;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getTerm() {
        return this.Term;
    }

}
