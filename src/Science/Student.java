package Science;
import Controls.FileControl;
import java.io.*;
import java.util.Scanner;


public class Student {

   public static File student = new File("data/Student");
    private String studentID;
    private String nationalID;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String birthDay;
    private String birthLocation;
    private String  entrance;
    public Student(String firstName,String lastName,
                   String fatherName,String studentID,
                   String nationalID,String birthDay,
                   String birthLocation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.fatherName=fatherName;
        this.studentID=studentID;
        this.nationalID=nationalID;
        this.birthDay=birthDay;
        this.birthLocation=birthLocation;
    }
    public Student(String firstName,String lastName,
                   String fatherName,String studentID,
                   String nationalID,String birthDay,
                   String birthLocation,String entrance) throws IOException {
            FileWriter create=new FileWriter(student,true);

            create.append(studentID);
            create.append(" ");
            create.append(nationalID);
            create.append(" ");
            create.append(firstName);
            create.append(FileControl.spacerInFile(firstName, FileControl.definer.firstName));
            create.append(lastName);
            create.append(FileControl.spacerInFile(lastName, FileControl.definer.lastName));
            create.append(fatherName);
            create.append(FileControl.spacerInFile(fatherName, FileControl.definer.fatherName));
            create.append(birthDay);
            create.append(" ");
            create.append(birthLocation);
            create.append(FileControl.spacerInFile(birthLocation, FileControl.definer.birthLocation));
            create.append(entrance);
            create.append("\n");

            create.close();
    }
    public String getStudentID(){
        return this.studentID;
    }
    public String getNationalID(){
        return this.nationalID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFatherName() {
        return this.fatherName;
    }
    public String getBirthDay() {
        return this.birthDay;
    }
    public String getBirthLocation(){
        return this.birthLocation;
    }
    public String getEntrance(){
        return this.entrance;
    }
    public static Student searchResult(String SID) throws IOException {

        if (FileControl.existStringInFile(Student.student, SID) == false)
            return null;
        else {

            String studentID = null;
            String nationalID = null;
            String firstName = null;
            String lastName = null;
            String fatherName = null;
            String birthDay = null;
            String birthLocation = null;
            String entrance = null;
            Scanner loader = new Scanner(Student.student);
            while (loader.hasNext()){
                studentID=loader.next();
                if (studentID.equalsIgnoreCase(SID)) {
                    nationalID = loader.next();
                    firstName = loader.next();
                    lastName = loader.next();
                    fatherName = loader.next();
                    birthDay = loader.next();
                    birthLocation = loader.next();

                    break;
                }
            }
            loader.close();



            return new Student(firstName, lastName, fatherName, studentID, nationalID, birthDay, birthLocation);
        }

    }



}

