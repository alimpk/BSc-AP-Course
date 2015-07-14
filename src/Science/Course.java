package Science;

import Controls.FileControl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Course {
    public   static File course = new File("data/course");

    private String courseID;
    private String courseName;
    private String courseUnit;
    private String courseType;

    public Course(String courseID,String courseName,String courseUnit,String courseType) throws IOException {

        FileWriter createCourse = new FileWriter(course, true);

        createCourse.append(courseID);
        createCourse.append(" ");
        createCourse.append(courseName);
        createCourse.append(FileControl.spacerInFile(courseName, FileControl.definer.courseName));
        createCourse.append(courseUnit);
        createCourse.append(" ");
        createCourse.append(courseType);
        createCourse.append("\n");

        createCourse.close();
    }

    public String getCourseID() {
        return this.courseID;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseType() {
        return this.courseType;
    }

    public String getCourseUnit() {
        return this.courseUnit;
    }

}
