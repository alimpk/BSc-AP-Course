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



    public Added(String studentID,String courseID ,String Term,String courseGrade) throws IOException {
        FileWriter creator = new FileWriter(added,true);
        creator.append(studentID);
        creator.append(" ");
        creator.append(courseID);
        creator.append(" ");
        creator.append(Term);
        creator.append(" ");
        if (courseGrade.equalsIgnoreCase(""))
            creator.append("-");
        else
            creator.append(courseGrade);

        creator.append("\n");

        creator.close();

    }
    public static double AllGradesAverage(String studentID,String CurrentTerm) throws FileNotFoundException {
    double average=0;
        int term = Integer.parseInt(CurrentTerm);
        int entrance = Integer.parseInt(FileControl.getStudentEntrance(Student.student, studentID));
        int units=0;

        for (int termCoun = entrance; termCoun <= term; termCoun++) {
            average +=( TermGradesAverage(studentID, String.valueOf(termCoun)) * TermUnits(studentID, String.valueOf(termCoun)));
            units += TermUnits(studentID, String.valueOf(termCoun));
        }
        average/=units;
        average*=1000;
        average=(int)average/1000;

        return average;
    }
    public static int TermUnits(String studentID,String Term) throws FileNotFoundException {
        int units=0;
        String stID;
        String term;
        String Grade;
        String courseN;

        Scanner scan=new Scanner(Added.added);
        while (scan.hasNext()){
            stID=scan.next();
            if (stID.equalsIgnoreCase(studentID)){

                courseN=scan.next();
                term=scan.next();
                if (term.equalsIgnoreCase(Term)){

                    Grade=scan.next();
                    if (Grade.equalsIgnoreCase("-")){

                        units+=0;

                    }else {

                        units += Integer.parseInt(FileControl.getCourseUnit(Course.course, courseN));
                    }
                }
            }

        }
        scan.close();


        return units;
    }
  public static double TermGradesAverage(String studentID,String Term) throws FileNotFoundException {
      double average;
      double SUM=0;
      int unitCounter=0;
      String stID;
      String Grade;
      String courseN;
      String term;
      Scanner scan=new Scanner(Added.added);
      while (scan.hasNext()){
          stID=scan.next();
          if (stID.equalsIgnoreCase(studentID)){

              courseN=scan.next();
              term=scan.next();
              if (term.equalsIgnoreCase(Term)){

                  Grade=scan.next();
                  if (Grade.equalsIgnoreCase("-")){
                      SUM+=0;
                      unitCounter+=0;

                  }else {

                      SUM += Double.parseDouble(Grade) * Integer.parseInt(FileControl.getCourseUnit(Course.course, courseN));
                      unitCounter += Integer.parseInt(FileControl.getCourseUnit(Course.course, courseN));
                  }
              }
          }

      }
      scan.close();
      if (unitCounter==0)
      return unitCounter;
      average=SUM/unitCounter;
      average*=1000;

      average=(int)average/1000;
      return average;
  }
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
