package Science;

import Controls.FileControl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Added {

   public static File added = new File("data/added");
    private String studentID;
    private String courseID;
    private String Term;
    private String courseGrade;




    public String getStudentID(){
        return this.studentID;
    }
    public String getCourseID(){
        return this.courseID;
    }
    public String getTerm(){
        return this.Term;
    }
    public String getCourseGrade(){
        return this.courseGrade;
    }
}
