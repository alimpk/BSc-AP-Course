package Graphic;

import Controls.*;
import Science.*;

import java.awt.*;
import javax.swing.*;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class DelCourseDialog extends JDialog {

    private final JPanel mainPanel = new JPanel();
    private static JTextField delStudentID;
    private static JTextField delCourseID;
    private static JTextField delTerm;

    public DelCourseDialog() {
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setUndecorated(true);
        setResizable(false);
        setVisible(true);
        setAlwaysOnTop(true);
        setBounds(center.x - 320, center.y - 240, 360, 480);
        MainFrame.home.setVisible(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(230, 230, 250));
        mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        GridBagLayout gbl_mainPanel = new GridBagLayout();
        gbl_mainPanel.columnWidths = new int[]{30, 118, 153, 30, 0};
        gbl_mainPanel.rowHeights = new int[]{40, 40, 40, 48, 0, 0, 38, 40, 40, 40, 0, 0};
        gbl_mainPanel.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_mainPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        mainPanel.setLayout(gbl_mainPanel);

        JPanel headpanel = new JPanel();
        headpanel.setBackground(new Color(255, 228, 196));
        GridBagConstraints gbc_headpanel = new GridBagConstraints();
        gbc_headpanel.gridwidth = 4;
        gbc_headpanel.insets = new Insets(0, 0, 5, 0);
        gbc_headpanel.fill = GridBagConstraints.BOTH;
        gbc_headpanel.gridx = 0;
        gbc_headpanel.gridy = 0;
        mainPanel.add(headpanel, gbc_headpanel);

        JLabel lblHead = new JLabel("حذف درس");
        lblHead.setForeground(new Color(0, 0, 139));
        lblHead.setFont(new Font("B Zar", Font.PLAIN, 24));
        headpanel.add(lblHead);



        JLabel lblStudentID = new JLabel("شماره دانشجویی");
        lblStudentID.setHorizontalTextPosition(SwingConstants.RIGHT);
        lblStudentID.setHorizontalAlignment(SwingConstants.RIGHT);
        lblStudentID.setForeground(Color.BLUE);
        lblStudentID.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblStudentID.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GridBagConstraints gbc_lblStudentID = new GridBagConstraints();
        gbc_lblStudentID.fill = GridBagConstraints.BOTH;
        gbc_lblStudentID.insets = new Insets(0, 0, 5, 5);
        gbc_lblStudentID.gridx = 1;
        gbc_lblStudentID.gridy = 1;
        mainPanel.add(lblStudentID, gbc_lblStudentID);


        delStudentID = new JTextField();
        delStudentID.setToolTipText("نام را به انگلیسی وارد نمایید");
        delStudentID.setName("");
        delStudentID.setFont(new Font("Dialog", Font.PLAIN, 20));
        delStudentID.setColumns(10);
        delStudentID.setCaretColor(new Color(128, 0, 0));
        delStudentID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        delStudentID.setBackground(new Color(240, 255, 240));
        GridBagConstraints gbc_delStudentID = new GridBagConstraints();
        gbc_delStudentID.insets = new Insets(0, 0, 5, 5);
        gbc_delStudentID.fill = GridBagConstraints.HORIZONTAL;
        gbc_delStudentID.gridx = 2;
        gbc_delStudentID.gridy = 1;
        mainPanel.add(delStudentID, gbc_delStudentID);


        JLabel lblCourseID = new JLabel("کد درس");
        lblCourseID.setHorizontalTextPosition(SwingConstants.RIGHT);
        lblCourseID.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCourseID.setForeground(Color.BLUE);
        lblCourseID.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblCourseID.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GridBagConstraints gbc_lblCourseID = new GridBagConstraints();
        gbc_lblCourseID.fill = GridBagConstraints.BOTH;
        gbc_lblCourseID.insets = new Insets(0, 0, 5, 5);
        gbc_lblCourseID.gridx = 1;
        gbc_lblCourseID.gridy = 2;
        mainPanel.add(lblCourseID, gbc_lblCourseID);


        delCourseID = new JTextField();
        delCourseID.setToolTipText("نام را به انگلیسی وارد نمایید");
        delCourseID.setName("");
        delCourseID.setFont(new Font("Dialog", Font.PLAIN, 20));
        delCourseID.setColumns(10);
        delCourseID.setCaretColor(new Color(128, 0, 0));
        delCourseID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        delCourseID.setBackground(new Color(240, 255, 240));
        GridBagConstraints gbc_delCourseID = new GridBagConstraints();
        gbc_delCourseID.insets = new Insets(0, 0, 5, 5);
        gbc_delCourseID.fill = GridBagConstraints.HORIZONTAL;
        gbc_delCourseID.gridx = 2;
        gbc_delCourseID.gridy = 2;
        mainPanel.add(delCourseID, gbc_delCourseID);


        final JButton checkButton = new JButton("بررسی اطلاعات");
        checkButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        checkButton.setBackground(new Color(32, 178, 170));
        checkButton.setFont(new Font("B Koodak", Font.PLAIN, 30));
        GridBagConstraints gbc_checkButton = new GridBagConstraints();
        gbc_checkButton.fill = GridBagConstraints.VERTICAL;
        gbc_checkButton.gridwidth = 3;
        gbc_checkButton.insets = new Insets(0, 0, 5, 5);
        gbc_checkButton.gridx = 0;
        gbc_checkButton.gridy = 3;
        mainPanel.add(checkButton, gbc_checkButton);


        final JLabel lblTerm = new JLabel("نیمسال تحصیلی");
        lblTerm.setVisible(false);
        lblTerm.setHorizontalTextPosition(SwingConstants.RIGHT);
        lblTerm.setHorizontalAlignment(SwingConstants.RIGHT);
        lblTerm.setForeground(Color.BLUE);
        lblTerm.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblTerm.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GridBagConstraints gbc_lblTerm = new GridBagConstraints();
        gbc_lblTerm.fill = GridBagConstraints.BOTH;
        gbc_lblTerm.insets = new Insets(0, 0, 5, 5);
        gbc_lblTerm.gridx = 1;
        gbc_lblTerm.gridy = 8;
        mainPanel.add(lblTerm, gbc_lblTerm);


        delTerm = new JTextField();
        delTerm.setVisible(false);
        delTerm.setToolTipText("نام را به انگلیسی وارد نمایید");
        delTerm.setName("");
        delTerm.setFont(new Font("Dialog", Font.PLAIN, 20));
        delTerm.setColumns(10);
        delTerm.setCaretColor(new Color(128, 0, 0));
        delTerm.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        delTerm.setBackground(new Color(240, 255, 240));
        GridBagConstraints gbc_delTerm = new GridBagConstraints();
        gbc_delTerm.insets = new Insets(0, 0, 5, 5);
        gbc_delTerm.fill = GridBagConstraints.HORIZONTAL;
        gbc_delTerm.gridx = 2;
        gbc_delTerm.gridy = 8;
        mainPanel.add(delTerm, gbc_delTerm);


        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

        final JButton okButton = new JButton("حذف");
        okButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        okButton.setVisible(false);
        okButton.setBackground(new Color(154, 205, 50));
        okButton.setForeground(new Color(72, 61, 139));
        okButton.setFont(new Font("B Koodak", Font.PLAIN, 30));
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
              boolean termFormat=  ValidateInput.isFormatOfEntrance(getDelCourseTerm());
                if (termFormat) {
                    try {
                        Scanner scanner = new Scanner(Added.added);
                        String STID;
                        String CID;
                        String CTERM=null;
                        while (scanner.hasNext()){
                            STID=scanner.next();
                            if (STID.equalsIgnoreCase(getDelCourseStudentID())){
                                CID=scanner.next();
                                if (CID.equalsIgnoreCase(getDelCourseID())){
                                    CTERM=scanner.next();
                                }
                            }

                        }
                        if (CTERM.equalsIgnoreCase(getDelCourseTerm())==false)
                            ValidateInput.InputErrorDialog("درس مورد نظر در نیمسال وارد شده برداشته نشده است");
                            else {
                            new Deleted(getDelCourseStudentID(), getDelCourseID(), getDelCourseTerm());
                            dispose();
                            MainFrame.home.setVisible(true);
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {


                    ValidateInput.InputErrorDialog("نیمسال وارد شده معتبر نیست");
                }


            }
        });
        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);


        JButton cancelButton = new JButton("انصراف");
        cancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
                MainFrame.home.setVisible(true);
            }
        });
        cancelButton.setBackground(new Color(233, 150, 122));
        cancelButton.setForeground(new Color(72, 61, 139));
        cancelButton.setFont(new Font("B Koodak", Font.PLAIN, 30));
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                boolean existStuID = false;
                boolean existCourseID = false;
                try {

                    if (FileControl.existStringInFile(Student.student, getDelCourseStudentID()))
                        existStuID=true;
                    if (FileControl.existStringInFile(Course.course, getDelCourseID()))
                        existCourseID=true;

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                String errorMassage=null;
                if (existCourseID==false)
                    errorMassage = "درس مورد نظر ثبت نشده است";
                if (existStuID==false)
                    errorMassage += "\n" + "دانشجوی مورد نظر ثبت نشده است";
                if (existCourseID==false||existStuID==false)
                    ValidateInput.InputErrorDialog(errorMassage);
                else{
                    lblTerm.setVisible(true);
                    delTerm.setVisible(true);
                    okButton.setVisible(true);
                    checkButton.setVisible(false);
                }
            }
        });


    }

    public static String getDelCourseStudentID(){
        return delStudentID.getText();
    }
    public static String getDelCourseID(){
        return delCourseID.getText();
    }
    public static String getDelCourseTerm(){
        return delTerm.getText();
    }




}
