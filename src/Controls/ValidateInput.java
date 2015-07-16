package Controls;

import Graphic.MainFrame;
import Graphic.NewStudentDialog;

import javax.swing.*;
import java.awt.*;

public class ValidateInput {


    public static boolean isFormatOfName(String string){
        boolean len=false;
        if(string.length()>0 &&string.length()<=10)
            len=true;
        boolean FAFormat= string.matches("[ا-ی]*");
        boolean ENFormat = string.matches("[a-zA-Z]*");
        return (len && (FAFormat || ENFormat));
    }
    public static boolean isFormatOfCourseName(String string){
        boolean len=false;
        if(string.length()>0 &&string.length()<=16)
            len=true;
        boolean FAFormat= string.matches("[ا-ی]*");
        boolean ENFormat = string.matches("[a-zA-Z]*");
        return (len && ( FAFormat || ENFormat ));
    }
    public static boolean isFormatOfNID(String string){

        return  string.matches("[0-9]{10}");
    }
    public static boolean isFormatOfStuID(String string){

        return  string.matches("[0-9]{7}");
    }
    public static boolean isFormatOfEntrance(String string) {
        return string.matches("[3]+[8-9]+[0-9]+[1-2]");
    }
    public static boolean isFormatOfCourseID(String string){
        return string.matches("[0-9]{3}");
    }
    public static boolean isCourseCorrectInput(String courseName,String courseID) {
        return (isFormatOfCourseName(courseName) && isFormatOfCourseID(courseID));
    }

    public static boolean isFormatOfBirthDate(String string){
        boolean isCorrect=false;


            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[0][1-6]+[/]+[0]+[1-9]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[0][1-6]+[/]+[1-2]+[0-9]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[0][1-6]+[/]+[3]+[0-1]"))
                isCorrect=true;

            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[0][7-9]+[/]+[0]+[1-9]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[0][7-9]+[/]+[1-2]+[0-9]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[0][7-9]+[/]+[30]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[1][0-1]+[/]+[0]+[1-9]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[1][0-1]+[/]+[1-2]+[0-9]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[12]+[/]+[0]+[1-9]"))
                isCorrect=true;
            if (string.matches("[1]+[3]+[6-8]+[0-9]+[/]+[12]+[/]+[1-2]+[0-9]"))
                isCorrect=true;

            return isCorrect;
        }

    public static boolean isCorrectInputOfNewStu(
            String name,String lastName,String fatherName,
            String studentID,String nationalID,String birthDay,
            String birthLocation,String  entrance){
        boolean isCorrectInput;
        isCorrectInput =(
                isFormatOfName(name)&&isFormatOfName(lastName)&&
                isFormatOfName(fatherName)&&isFormatOfBirthDate(birthDay)&&
                isFormatOfName(birthLocation)&&isFormatOfEntrance(entrance)&&
                isFormatOfNID(nationalID)&&isFormatOfStuID(studentID));
        return isCorrectInput;
    }
    public static boolean isFormatOfPoint(String string){
       boolean isCorrect=false;
        if (string.matches("[0-1]+[0-9]+[.]+[0-9][0-9]"))
            isCorrect = true;
        if (string.matches("[2]+[0]+[.]+[0]+[0]"))
            isCorrect=true;
        if (string.equalsIgnoreCase(""))
            isCorrect=true;

        return isCorrect;
    }
    public static String newStuInputErrorMassage(
            String name,String lastName,String fatherName,
            String studentID,String nationalID,String birthDay,
            String birthLocation,String  entrance) {

        String errorString="اطلاعات را به درستی وارد نمایید:\n";

                if(isFormatOfName(name)==false)
                    errorString+="نام\n";
                if (isFormatOfName(lastName)==false)
                    errorString+="نام خانوادگی\n";
                if (isFormatOfName(fatherName)==false)
                    errorString += "نام پدر\n";
                if (isFormatOfNID(nationalID)==false)
                    errorString +="کد ملی\n";
                if (isFormatOfStuID(studentID)==false)
                errorString += "شماره دانشجویی\n";
                if (isFormatOfBirthDate(birthDay)==false)
                    errorString += "تاریخ تولد\n";
                if(isFormatOfName(birthLocation)==false)
                    errorString += "محل تولد\n";
                if (isFormatOfEntrance(entrance)==false)
                    errorString = "نیمسال ورود به دانشگاه";


                    return errorString;
            }
    public static void InputErrorDialog(String errorMassage) {
        final Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        JOptionPane errorPane = new JOptionPane();
        JFrame frame = new JFrame();
        frame.pack();
        frame.setAlwaysOnTop(true);
        frame.setLocation(center.x-240,center.y+160);

        frame.setVisible(true);
        errorPane.showMessageDialog(frame, errorMassage);
        frame.dispose();
    }
    }

