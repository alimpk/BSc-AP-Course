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


    private JTextField newStuName;
    private JTextField newStuLastName;
    private JTextField newStuFatherName;
    private JTextField newStuNID;
    private JTextField newStuStuID;
    private JTextField newStuBirthDay;
    private JTextField newStuBirthLocation;
    private JTextField newStuEntrance;


    public NewStudentDialog() {

        setUndecorated(true);
        setAlwaysOnTop(true);
        setType(Type.UTILITY);



  

            JButton newStucancelButton = new JButton("انصراف");
            newStucancelButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
            newStucancelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            newStucancelButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
            newStucancelButton.setForeground(new Color(75, 0, 130));
            newStucancelButton.setFont(new Font("B Koodak", Font.PLAIN, 30));
            newStucancelButton.setBackground(new Color(255, 69, 0));
            newStucancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            newStucancelButton.setActionCommand("Cancel");
            buttonPane.add(newStucancelButton);
            newStucancelButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    MainFrame.home.setVisible(true);
                    dispose();

                }
            });


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
