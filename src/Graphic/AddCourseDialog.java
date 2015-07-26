package Graphic;

import Controls.FileControl;
import Controls.ValidateInput;
import Science.Added;
import Science.Course;
import Science.Student;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddCourseDialog extends JDialog {

    JPanel mainPanel = new JPanel();
    private static JTextField SetStudentID;
    private static JTextField setCourseID;
    private static JTextField setPoint;
    private static JTextField setEntrance;

    public AddCourseDialog(){
        setAlwaysOnTop(true);
        setUndecorated(true);
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        MainFrame.home.setVisible(false);
        setVisible(true);
        setAlwaysOnTop(true);
        setBounds(center.x - 320, center.y - 240, 360, 480);
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(230, 230, 250));
        mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        GridBagLayout gbl_mainPanel = new GridBagLayout();
        gbl_mainPanel.columnWidths = new int[]{30, 118, 153, 30, 0};
        gbl_mainPanel.rowHeights = new int[]{42, 40, 40, 48, 0, 0, 38, 40, 40, 40, 0, 0};
        gbl_mainPanel.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_mainPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        mainPanel.setLayout(gbl_mainPanel);

        JPanel headPanel = new JPanel();
        headPanel.setBackground(new Color(255, 228, 196));
        GridBagConstraints gbc_headPanel = new GridBagConstraints();
        gbc_headPanel.gridwidth = 4;
        gbc_headPanel.insets = new Insets(0, 0, 5, 0);
        gbc_headPanel.fill = GridBagConstraints.BOTH;
        gbc_headPanel.gridx = 0;
        gbc_headPanel.gridy = 0;
        mainPanel.add(headPanel, gbc_headPanel);

        JLabel lblHead = new JLabel("ثبت درس اخذ شده");
        lblHead.setForeground(new Color(0, 0, 139));
        lblHead.setFont(new Font("B Zar", Font.PLAIN, 24));
        headPanel.add(lblHead);



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


        SetStudentID = new JTextField();
        SetStudentID.setToolTipText("شماره دانشجویی را وارد نمایید");
        SetStudentID.setName("");
        SetStudentID.setFont(new Font("Dialog", Font.PLAIN, 20));
        SetStudentID.setColumns(10);
        SetStudentID.setCaretColor(new Color(128, 0, 0));
        SetStudentID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        SetStudentID.setBackground(new Color(240, 255, 240));
        GridBagConstraints gbc_SetStudentID = new GridBagConstraints();
        gbc_SetStudentID.insets = new Insets(0, 0, 5, 5);
        gbc_SetStudentID.fill = GridBagConstraints.HORIZONTAL;
        gbc_SetStudentID.gridx = 2;
        gbc_SetStudentID.gridy = 1;
        mainPanel.add(SetStudentID, gbc_SetStudentID);


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


        setCourseID = new JTextField();
        setCourseID.setToolTipText("کد درس را وارد نمایید");
        setCourseID.setName("");
        setCourseID.setFont(new Font("Dialog", Font.PLAIN, 20));
        setCourseID.setColumns(10);
        setCourseID.setCaretColor(new Color(128, 0, 0));
        setCourseID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        setCourseID.setBackground(new Color(240, 255, 240));
        GridBagConstraints gbc_setCourseID = new GridBagConstraints();
        gbc_setCourseID.insets = new Insets(0, 0, 5, 5);
        gbc_setCourseID.fill = GridBagConstraints.HORIZONTAL;
        gbc_setCourseID.gridx = 2;
        gbc_setCourseID.gridy = 2;
        mainPanel.add(setCourseID, gbc_setCourseID);


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


        final JPanel panelPlan2 = new JPanel();
        panelPlan2.setVisible(false);
        panelPlan2.setBackground(new Color(255, 192, 203));
        GridBagConstraints gbc_panelPlan2 = new GridBagConstraints();
        gbc_panelPlan2.gridwidth = 2;
        gbc_panelPlan2.insets = new Insets(0, 0, 5, 5);
        gbc_panelPlan2.fill = GridBagConstraints.BOTH;
        gbc_panelPlan2.gridx = 1;
        gbc_panelPlan2.gridy = 6;
        mainPanel.add(panelPlan2, gbc_panelPlan2);

        final JLabel lblPrompt = new JLabel("اطلاعات را تکمیل نمایید");
        lblPrompt.setVisible(false);
        lblPrompt.setForeground(new Color(128, 0, 128));
        lblPrompt.setFont(new Font("B Zar", Font.PLAIN, 24));
        panelPlan2.add(lblPrompt);



        final JLabel lblPoint = new JLabel("نمره");
        lblPoint.setVisible(false);
        lblPoint.setHorizontalTextPosition(SwingConstants.RIGHT);
        lblPoint.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPoint.setForeground(Color.BLUE);
        lblPoint.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblPoint.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GridBagConstraints gbc_lblPoint = new GridBagConstraints();
        gbc_lblPoint.fill = GridBagConstraints.BOTH;
        gbc_lblPoint.insets = new Insets(0, 0, 5, 5);
        gbc_lblPoint.gridx = 1;
        gbc_lblPoint.gridy = 7;
        mainPanel.add(lblPoint, gbc_lblPoint);


        setPoint = new JTextField();
        setPoint.setVisible(false);
        setPoint.setToolTipText("نمره ی درس را وارد نمایید"+"\n"+"میتوانید خالی بگذارید");

        setPoint.setFont(new Font("Dialog", Font.PLAIN, 20));
        setPoint.setColumns(10);
        setPoint.setCaretColor(new Color(128, 0, 0));
        setPoint.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        setPoint.setBackground(new Color(240, 255, 240));

        GridBagConstraints gbc_setPoint = new GridBagConstraints();
        gbc_setPoint.insets = new Insets(0, 0, 5, 5);
        gbc_setPoint.fill = GridBagConstraints.HORIZONTAL;
        gbc_setPoint.gridx = 2;
        gbc_setPoint.gridy = 7;
        mainPanel.add(setPoint, gbc_setPoint);


        final JLabel lblEntrance = new JLabel("نیمسال تحصیلی");
        lblEntrance.setVisible(false);
        lblEntrance.setHorizontalTextPosition(SwingConstants.RIGHT);
        lblEntrance.setHorizontalAlignment(SwingConstants.RIGHT);
        lblEntrance.setForeground(Color.BLUE);
        lblEntrance.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblEntrance.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        GridBagConstraints gbc_lblEntrance = new GridBagConstraints();
        gbc_lblEntrance.fill = GridBagConstraints.BOTH;
        gbc_lblEntrance.insets = new Insets(0, 0, 5, 5);
        gbc_lblEntrance.gridx = 1;
        gbc_lblEntrance.gridy = 8;
        mainPanel.add(lblEntrance, gbc_lblEntrance);


        setEntrance = new JTextField();
        setEntrance.setVisible(false);
        setEntrance.setToolTipText("ترم جاری را وارد نمایید");


        setEntrance.setFont(new Font("Dialog", Font.PLAIN, 20));
        setEntrance.setColumns(10);

        setEntrance.setCaretColor(new Color(128, 0, 0));
        setEntrance.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        setEntrance.setBackground(new Color(240, 255, 240));
        GridBagConstraints gbc_setEntrance = new GridBagConstraints();
        gbc_setEntrance.insets = new Insets(0, 0, 5, 5);
        gbc_setEntrance.fill = GridBagConstraints.HORIZONTAL;
        gbc_setEntrance.gridx = 2;
        gbc_setEntrance.gridy = 8;
        mainPanel.add(setEntrance, gbc_setEntrance);

        final JButton checkButtonFinal = new JButton("بررسی اطلاعات");
        checkButtonFinal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        checkButtonFinal.setBackground(new Color(32, 178, 170));
        checkButtonFinal.setFont(new Font("B Koodak", Font.PLAIN, 30));
        GridBagConstraints gbc_checkButtonFinal = new GridBagConstraints();
        gbc_checkButtonFinal.fill = GridBagConstraints.VERTICAL;
        gbc_checkButtonFinal.gridwidth = 3;
        gbc_checkButtonFinal.insets = new Insets(0, 0, 5, 5);
        gbc_checkButtonFinal.gridx = 0;
        gbc_checkButtonFinal.gridy = 9;
        checkButtonFinal.setVisible(false);
        mainPanel.add(checkButtonFinal, gbc_checkButtonFinal);
        JPanel buttonPane = new JPanel();
        buttonPane.setBackground(new Color(123, 167, 232));
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

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


        final JButton okButton = new JButton("ثبت");
        okButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        okButton.setVisible(false);
        okButton.setBackground(new Color(154, 205, 50));
        okButton.setForeground(new Color(72, 61, 139));
        okButton.setFont(new Font("B Koodak", Font.PLAIN, 30));

        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);





        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                boolean existStuID = false;
                boolean existCourseID = false;
                try {
                    if (FileControl.existStringInFile(Student.student, getCourseAddStudentID())) {
                        existStuID=true;
                        if (FileControl.existStringInFile(Course.course, getCourseAddCourseID())){
                            existCourseID=true;

                            {
                                panelPlan2.setVisible(true);
                                lblPoint.setVisible(true);
                                lblPrompt.setVisible(true);
                                lblEntrance.setVisible(true);
                                setPoint.setVisible(true);
                                setEntrance.setVisible(true);

                                checkButtonFinal.setVisible(true);
                                checkButton.setVisible(false);


                            }
                        }

                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    existCourseID=FileControl.existStringInFile(Course.course, getCourseAddCourseID());

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                if (existCourseID==false || existStuID==false ) {
                    String existenceError = "";
                    if (existCourseID==false)
                        existenceError+="درس مورد نظر شده ثبت نشده است."+"\n";
                    if (existStuID==false)
                        existenceError+="دانشجوی مورد نظر شده ثبت نشده است.";
                    ValidateInput.InputErrorDialog(existenceError);
                }

            }
        });


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Added(getCourseAddStudentID(),getCourseAddCourseID(),getCourseAddTerm(),getCourseAddPoint());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                MainFrame.home.setVisible(true);
                dispose();
            }
        });
        checkButtonFinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ValidPoint = ValidateInput.isFormatOfPoint(getCourseAddPoint());
                boolean ValidTermFormat = ValidateInput.isFormatOfEntrance(getCourseAddTerm());


                boolean inValidTerm=false;
                String errorMassage = "";
                if (ValidPoint == false)
                    errorMassage += "نمره ی وارد شده معتبر نیست" + "\n";
                if (ValidTermFormat==false)
                        errorMassage += "نیمسال تحصیلی را درست وارد نمایید" ;
                else
                    {
                        try {

                            if (Integer.parseInt(getCourseAddTerm()) < Integer.parseInt(FileControl.getStudentEntrance(Student.student, getCourseAddStudentID()))) {
                                errorMassage += "ترم وارد شده معتبر نیست";
                                inValidTerm=true;
                            }
                        }catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        }


                    }

                if ((ValidPoint&&ValidTermFormat&&(inValidTerm==false))) {
                    okButton.setVisible(true);
                }
                else {

                    ValidateInput.InputErrorDialog(errorMassage);
                }
            }
        });

    }
    public static String getCourseAddStudentID(){
        return SetStudentID.getText();
    }
    public static String getCourseAddCourseID(){
        return setCourseID.getText();
    }
    public static String getCourseAddPoint(){
        return setPoint.getText();
    }
    public static String getCourseAddTerm() {
        return setEntrance.getText();
    }

}
