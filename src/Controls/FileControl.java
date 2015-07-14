package Controls;

import Science.*;
import java.io.*;
import java.util.Scanner;

public class FileControl {

    public   enum definer{
        firstName,lastName,fatherName,nationalID,StudentID,birthDate,birthLocation,entrance
      ,courseName,courseID,courseUnit,courseType,WRITE,TEMPLATE
    }

    public enum CourseUnit{
        ONE,TWO,THREE,FOUR
    }

    public enum CourseType{
        PUBIC,BASIC,PRIMARY,PROFESSIONAL,OPTIONAL,REPARATIVE
    }

    public static String spacerInFile(String string,definer outputType) {
        String space= "";
       // int len = string.length();
        if(outputType==definer.firstName||outputType==definer.lastName||
                outputType==definer.fatherName||outputType==definer.birthLocation)
            for (int counter = -1; counter< 10-string.length(); counter++) {
                space += " ";
            }
        if (outputType==definer.courseName)
            for (int counter = -1; counter <16-string.length() ; counter++) {
                space += " ";
            }

        return space;
    }

    public static boolean existStringInFile(File file,String string) throws FileNotFoundException {
        boolean exist = false;

        String fileString;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            fileString= scanner.next();
            if(fileString.equalsIgnoreCase(string)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public static String getStudentEntrance(File file,String StudentID) throws FileNotFoundException {
        String studentEntrance=null;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){

            if (scanner.next().equalsIgnoreCase(StudentID)) {
                for (int i = 0; i < 7; i++) {

                    studentEntrance=scanner.next();
                }
                break;
            }
        }
        scanner.close();
        return studentEntrance;
    }

    public static String getCourseUnit(File file,String CourseID) throws FileNotFoundException {
        String CourseUnit = null;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            if (scanner.next().equalsIgnoreCase(CourseID)) {
                for (int i = 0; i < 2; i++) {

                    CourseUnit=scanner.next();
                }
                break;
            }
        }
        scanner.close();
        return CourseUnit;

    }

    public static int getStudentCourseUnits(String studentID,String Term) throws FileNotFoundException {
        int units=0;
        String StuID;
        String CID;
        String courseTerm;
        Scanner scanner = new Scanner(Course.course);
        while (scanner.hasNext()) {
            StuID = scanner.next();
            if (StuID.equalsIgnoreCase(studentID)) {
                CID = scanner.next();
                courseTerm = scanner.next();
                if (courseTerm.equalsIgnoreCase(Term)) {
                    units += Integer.parseInt(getCourseUnit(Course.course, CID));
                }
            }
        }
            scanner.close();
            Scanner scan =new Scanner(Deleted.deleted);
            while (scan.hasNext()) {
                StuID = scan.next();
                if (StuID.equalsIgnoreCase(studentID)) {
                    CID = scan.next();
                    courseTerm = scanner.next();
                    if (courseTerm.equalsIgnoreCase(Term)) {
                        units -= Integer.parseInt(getCourseUnit(Course.course, CID));
                    }
                }
            }
        scan.close();
        return units;
    }

}

