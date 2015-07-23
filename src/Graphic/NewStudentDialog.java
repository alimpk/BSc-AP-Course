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



        final Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

        setVisible(true);
        getContentPane().setForeground(new Color(255, 218, 185));
        setResizable(false);
        getContentPane().setBackground(new Color(230, 230, 250));
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
        setFont(new Font("Dialog", Font.PLAIN, 20));
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setBounds(center.x - 320, center.y - 240, 360, 480);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{30, 117, 148, 24, 0};
        gridBagLayout.rowHeights = new int[]{38, 40, 5, 40, 0, 40, 0, 40, 0, 40, 0, 40, 0, 40, 0, 30, 0, 62, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        getContentPane().setLayout(gridBagLayout);

            JPanel newStuHeader = new JPanel();
            newStuHeader.setBackground(new Color(255, 228, 181));
            newStuHeader.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            GridBagConstraints con_newStuHeader = new GridBagConstraints();
            con_newStuHeader.gridwidth = 2;
            con_newStuHeader.insets = new Insets(0, 0, 5, 5);
            con_newStuHeader.fill = GridBagConstraints.BOTH;
            con_newStuHeader.gridx = 1;
            con_newStuHeader.gridy = 0;
            getContentPane().add(newStuHeader, con_newStuHeader);

                JLabel newStuPrmpt = new JLabel("اطلاعات دانشجوی جدید را وارد نمایید");
                newStuPrmpt.setBackground(new Color(230, 230, 250));
                newStuPrmpt.setForeground(new Color(0, 0, 139));
                newStuPrmpt.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                newStuPrmpt.setAlignmentX(Component.CENTER_ALIGNMENT);
                newStuPrmpt.setFont(new Font("Serif", Font.PLAIN, 18));
                newStuHeader.add(newStuPrmpt);



            JLabel lblName = new JLabel("نام");
            lblName.setForeground(new Color(0, 0, 255));
            lblName.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblName.setHorizontalAlignment(SwingConstants.RIGHT);
            lblName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblName.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblName = new GridBagConstraints();
            con_lblName.fill = GridBagConstraints.BOTH;
            con_lblName.insets = new Insets(0, 0, 5, 5);
            con_lblName.gridx = 1;
            con_lblName.gridy = 1;
            getContentPane().add(lblName, con_lblName);

            newStuName = new JTextField();
            newStuName.setName("");
            newStuName.setToolTipText("نام را  وارد نمایید");
            newStuName.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuName.setCaretColor(new Color(128, 0, 0));
            newStuName.setBackground(new Color(240, 255, 240));
            newStuName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            GridBagConstraints con_newStuName = new GridBagConstraints();
            con_newStuName.fill = GridBagConstraints.HORIZONTAL;
            con_newStuName.insets = new Insets(0, 0, 5, 5);
            con_newStuName.gridx = 2;
            con_newStuName.gridy = 1;
            getContentPane().add(newStuName, con_newStuName);
            newStuName.setColumns(10);


            JSeparator separator = new JSeparator();
            GridBagConstraints gbc_separator = new GridBagConstraints();
            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 2;
            getContentPane().add(separator, gbc_separator);

            JLabel lblLastName = new JLabel("نام خانوادگی");
            lblLastName.setForeground(new Color(0, 0, 255));
            lblLastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
            lblLastName.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblLastName.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblLastName = new GridBagConstraints();
            con_lblLastName.fill = GridBagConstraints.HORIZONTAL;
            con_lblLastName.insets = new Insets(0, 0, 5, 5);
            con_lblLastName.gridx = 1;
            con_lblLastName.gridy = 3;
            getContentPane().add(lblLastName, con_lblLastName);

            newStuLastName = new JTextField();
            newStuLastName.setToolTipText("نام خانوادگی را وارد کنید");
            newStuLastName.setBackground(new Color(240, 255, 240));
            newStuLastName.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuLastName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newStuLastName.setColumns(10);
            GridBagConstraints con_newStuLastName = new GridBagConstraints();
            con_newStuLastName.fill = GridBagConstraints.HORIZONTAL;
            con_newStuLastName.insets = new Insets(0, 0, 5, 5);
            con_newStuLastName.gridx = 2;
            con_newStuLastName.gridy = 3;
            getContentPane().add(newStuLastName, con_newStuLastName);


            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 4;
            getContentPane().add(separator, gbc_separator);

            JLabel lblFatherName = new JLabel("نام پدر");
            lblFatherName.setForeground(new Color(0, 0, 255));
            lblFatherName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblFatherName.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblFatherName.setHorizontalAlignment(SwingConstants.RIGHT);
            lblFatherName.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblFatherName = new GridBagConstraints();
            con_lblFatherName.fill = GridBagConstraints.HORIZONTAL;
            con_lblFatherName.insets = new Insets(0, 0, 5, 5);
            con_lblFatherName.gridx = 1;
            con_lblFatherName.gridy = 5;
            getContentPane().add(lblFatherName, con_lblFatherName);

            newStuFatherName = new JTextField();
            newStuFatherName.setToolTipText("نام پدر را وارد کنید");
            newStuFatherName.setBackground(new Color(240, 255, 240));
            newStuFatherName.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuFatherName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newStuFatherName.setColumns(10);
            GridBagConstraints con_newStuFatherName = new GridBagConstraints();
            con_newStuFatherName.fill = GridBagConstraints.HORIZONTAL;
            con_newStuFatherName.insets = new Insets(0, 0, 5, 5);
            con_newStuFatherName.gridx = 2;
            con_newStuFatherName.gridy = 5;
            getContentPane().add(newStuFatherName, con_newStuFatherName);


            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 6;
            getContentPane().add(separator, gbc_separator);

            JLabel lblStuNID = new JLabel("کد ملی");
            lblStuNID.setForeground(new Color(0, 0, 255));
            lblStuNID.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblStuNID.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblStuNID.setHorizontalAlignment(SwingConstants.RIGHT);
            lblStuNID.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblStuNID = new GridBagConstraints();
            con_lblStuNID.fill = GridBagConstraints.HORIZONTAL;
            con_lblStuNID.insets = new Insets(0, 0, 5, 5);
            con_lblStuNID.gridx = 1;
            con_lblStuNID.gridy = 7;
            getContentPane().add(lblStuNID, con_lblStuNID);

            newStuNID = new JTextField();
            newStuNID.setToolTipText("کد ملی 10 رقمی را وارد کنید! مثال:1234567890");
            newStuNID.setBackground(new Color(240, 255, 240));
            newStuNID.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuNID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newStuNID.setColumns(10);
            GridBagConstraints con_newStuNID = new GridBagConstraints();
            con_newStuNID.fill = GridBagConstraints.HORIZONTAL;
            con_newStuNID.insets = new Insets(0, 0, 5, 5);
            con_newStuNID.gridx = 2;
            con_newStuNID.gridy = 7;
            getContentPane().add(newStuNID, con_newStuNID);

            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 8;
            getContentPane().add(separator, gbc_separator);

            JLabel lblStuSTID = new JLabel("شماره دانشجویی");
            lblStuSTID.setForeground(new Color(0, 0, 255));
            lblStuSTID.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblStuSTID.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblStuSTID.setHorizontalAlignment(SwingConstants.RIGHT);
            lblStuSTID.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblStuSTID = new GridBagConstraints();
            con_lblStuSTID.fill = GridBagConstraints.HORIZONTAL;
            con_lblStuSTID.insets = new Insets(0, 0, 5, 5);
            con_lblStuSTID.gridx = 1;
            con_lblStuSTID.gridy = 9;
            getContentPane().add(lblStuSTID, con_lblStuSTID);

            newStuStuID = new JTextField();
            newStuStuID.setToolTipText("شماره دانش جووی 7 رقمی را وارد کنید ! مثال: 9300003");
            newStuStuID.setBackground(new Color(240, 255, 240));
            newStuStuID.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuStuID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newStuStuID.setColumns(10);
            GridBagConstraints con_newStuSTID = new GridBagConstraints();
            con_newStuSTID.fill = GridBagConstraints.HORIZONTAL;
            con_newStuSTID.insets = new Insets(0, 0, 5, 5);
            con_newStuSTID.gridx = 2;
            con_newStuSTID.gridy = 9;
            getContentPane().add(newStuStuID, con_newStuSTID);

            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 10;
            getContentPane().add(separator, gbc_separator);


            JLabel lblBirthDay = new JLabel("تاریخ تولد");
            lblBirthDay.setForeground(new Color(0, 0, 255));
            lblBirthDay.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblBirthDay.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblBirthDay.setHorizontalAlignment(SwingConstants.RIGHT);
            lblBirthDay.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblBirthDay = new GridBagConstraints();
            con_lblBirthDay.fill = GridBagConstraints.HORIZONTAL;
            con_lblBirthDay.insets = new Insets(0, 0, 5, 5);
            con_lblBirthDay.gridx = 1;
            con_lblBirthDay.gridy = 11;
            getContentPane().add(lblBirthDay, con_lblBirthDay);


            newStuBirthDay = new JTextField();
            newStuBirthDay.setToolTipText("سال/ماه/روز! مثال: 1393/12/03");
            newStuBirthDay.setBackground(new Color(240, 255, 240));
            newStuBirthDay.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuBirthDay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newStuBirthDay.setColumns(10);
            GridBagConstraints con_newStuBirthDay = new GridBagConstraints();
            con_newStuBirthDay.fill = GridBagConstraints.HORIZONTAL;
            con_newStuBirthDay.insets = new Insets(0, 0, 5, 5);
            con_newStuBirthDay.gridx = 2;
            con_newStuBirthDay.gridy = 11;
            getContentPane().add(newStuBirthDay, con_newStuBirthDay);



            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 12;
            getContentPane().add(separator, gbc_separator);


            JLabel lblBirthLocation = new JLabel("محل تولد");
            lblBirthLocation.setForeground(new Color(0, 0, 255));
            lblBirthLocation.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblBirthLocation.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblBirthLocation.setHorizontalAlignment(SwingConstants.RIGHT);
            lblBirthLocation.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblBirthLocation = new GridBagConstraints();
            con_lblBirthLocation.fill = GridBagConstraints.HORIZONTAL;
            con_lblBirthLocation.insets = new Insets(0, 0, 5, 5);
            con_lblBirthLocation.gridx = 1;
            con_lblBirthLocation.gridy = 13;
            getContentPane().add(lblBirthLocation, con_lblBirthLocation);

            newStuBirthLocation = new JTextField();
            newStuBirthLocation.setToolTipText("محل تولد را  وارد کنید");
            newStuBirthLocation.setBackground(new Color(240, 255, 240));
            newStuBirthLocation.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuBirthLocation.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newStuBirthLocation.setColumns(10);
            GridBagConstraints con_newstuBirthLocation = new GridBagConstraints();
            con_newstuBirthLocation.fill = GridBagConstraints.HORIZONTAL;
            con_newstuBirthLocation.insets = new Insets(0, 0, 5, 5);
            con_newstuBirthLocation.gridx = 2;
            con_newstuBirthLocation.gridy = 13;
            getContentPane().add(newStuBirthLocation, con_newstuBirthLocation);


            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 14;
            getContentPane().add(separator, gbc_separator);

            JLabel lblEntrance = new JLabel("ترم ورود");
            lblEntrance.setForeground(new Color(0, 0, 255));
            lblEntrance.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            lblEntrance.setHorizontalTextPosition(SwingConstants.RIGHT);
            lblEntrance.setHorizontalAlignment(SwingConstants.RIGHT);
            lblEntrance.setFont(new Font("Dialog", Font.PLAIN, 20));
            GridBagConstraints con_lblEntrance = new GridBagConstraints();
            con_lblEntrance.fill = GridBagConstraints.HORIZONTAL;
            con_lblEntrance.insets = new Insets(0, 0, 5, 5);
            con_lblEntrance.gridx = 1;
            con_lblEntrance.gridy = 15;
            getContentPane().add(lblEntrance, con_lblEntrance);

            newStuEntrance = new JTextField();
            newStuEntrance.setToolTipText("نیمسال ورود! مثال:9332 یعنی نیمسال دوم سال1393");
            newStuEntrance.setBackground(new Color(240, 255, 240));
            newStuEntrance.setFont(new Font("Dialog", Font.PLAIN, 20));
            newStuEntrance.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newStuEntrance.setColumns(10);
            GridBagConstraints con_newStuEntrance = new GridBagConstraints();
            con_newStuEntrance.fill = GridBagConstraints.HORIZONTAL;
            con_newStuEntrance.insets = new Insets(0, 0, 5, 5);
            con_newStuEntrance.gridx = 2;
            con_newStuEntrance.gridy = 15;
            getContentPane().add(newStuEntrance, con_newStuEntrance);



            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 2;
            gbc_separator.gridy = 16;
            getContentPane().add(separator, gbc_separator);


            JButton newStuHelpButton = new JButton("راهنما ؟!");
            newStuHelpButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            newStuHelpButton.setFont(new Font("B Sina", Font.PLAIN, 16));
            GridBagConstraints con_newStuHelpButton = new GridBagConstraints();
            con_newStuHelpButton.anchor = GridBagConstraints.SOUTHWEST;
            con_newStuHelpButton.insets = new Insets(0, 0, 0, 5);
            con_newStuHelpButton.gridx = 1;
            con_newStuHelpButton.gridy = 17;
            getContentPane().add(newStuHelpButton, con_newStuHelpButton);


            JPanel buttonPane = new JPanel();
            buttonPane.setBackground(new Color(255, 240, 245));
            GridBagConstraints gbc_buttonPane = new GridBagConstraints();
            gbc_buttonPane.fill = GridBagConstraints.VERTICAL;
            gbc_buttonPane.insets = new Insets(0, 0, 0, 5);
            gbc_buttonPane.gridx = 2;
            gbc_buttonPane.gridy = 17;
            getContentPane().add(buttonPane, gbc_buttonPane);
            buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));

                JButton newStuokButton = new JButton("تایید");
                newStuokButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                       if(ValidateInput.isCorrectInputOfNewStu(getNewStuName(),getNewStuLastName(),getNewStuFatherName(),getNewStuStuID(),getNewStuNID(),getNewStuBirthDay(),getNewStuBirthLocation(),getnewStuEntrance())==true) {
                           try {
                               if (FileControl.existStringInFile(Student.student, getNewStuStuID())==false) {
                                   try {
                                       new Student(getNewStuName(), getNewStuLastName(), getNewStuFatherName(), getNewStuStuID(), getNewStuNID(), getNewStuBirthDay(), getNewStuBirthLocation(), getnewStuEntrance());
                                   } catch (IOException e) {
                                       e.printStackTrace();
                                   }

                                   JOptionPane.showMessageDialog(null, "دانشجوی جدید ثبت شد.", "پیام موفقیت", JOptionPane.WARNING_MESSAGE);
                                   dispose();
                                   MainFrame.home.setVisible(true);
                               }else {

                                   ValidateInput.InputErrorDialog("دانشجوی مورد نظر از قبل ثبت شده است.\nبرای مشاهده مشخصات دانشجو از قسمت جستوجو استفاده نمایید.");

                               }
                           } catch (FileNotFoundException e) {
                               e.printStackTrace();
                           }
                       }else {
                           String error = ValidateInput.newStuInputErrorMassage(getNewStuName(), getNewStuLastName(), getNewStuFatherName(), getNewStuStuID(), getNewStuNID(), getNewStuBirthDay(), getNewStuBirthLocation(), getnewStuEntrance());
                           ValidateInput.InputErrorDialog("اطلاعات را به طور صحیح وارد نمایید"+"/n"+"error");
                       }







                    }
                });

                newStuokButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
                newStuokButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
                newStuokButton.setForeground(new Color(75, 0, 130));
                newStuokButton.setFont(new Font("B Koodak", Font.PLAIN, 30));
                newStuokButton.setAlignmentX(Component.CENTER_ALIGNMENT);
                newStuokButton.setBackground(new Color(0, 255, 0));
                newStuokButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                newStuokButton.setActionCommand("OK");
                buttonPane.add(newStuokButton);
                getRootPane().setDefaultButton(newStuokButton);


                JSeparator sep1 = new JSeparator();
                buttonPane.add(sep1);

                JSeparator sep2 = new JSeparator();
                buttonPane.add(sep2);

                JSeparator sep3 = new JSeparator();
                buttonPane.add(sep3);


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
