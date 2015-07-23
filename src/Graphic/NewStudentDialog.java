package Graphic;

import Controls.FileControl;
import Controls.ValidateInput;
import Science.Student;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;


public class NewStudentDialog extends JDialog {



    }
    public String getNewStuName(){
        return newStuName.getText();
    }
    public String getNewStuLastName(){
        return newStuLastName.getText();
    }
    public String getNewStuFatherName(){
        return newStuFatherName.getText();
    }
    public String getNewStuNID(){
        return newStuNID.getText();
    }
    public String getNewStuBirthDay(){
        return newStuBirthDay.getText();
    }
    public String getNewStuBirthLocation(){
        return newStuBirthLocation.getText();
    }
    public String getnewStuEntrance(){
        return newStuEntrance.getText();
    }
    public String getNewStuStuID(){
        return newStuStuID.getText();
    }



}
