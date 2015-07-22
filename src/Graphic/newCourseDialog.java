package Graphic;



import Controls.FileControl;
import Controls.ValidateInput;
import Science.Course;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;


public class newCourseDialog extends JDialog{
    Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

    JPanel contentPanel = new JPanel();
     JTextField newCourseName;
    private JTextField newCourseID;
    private String CourseTYPE;
    private String CourseUNIT;
    private FileControl.CourseType courseType;
    private FileControl.CourseUnit courseUnit;


    public newCourseDialog() {

        setUndecorated(true);

        setVisible(true);
        setAlwaysOnTop(true);

        setResizable(false);


        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setBounds(center.x - 320, center.y - 240, 360, 480);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        contentPanel.setForeground(new Color(0, 128, 128));
        contentPanel.setBackground(new Color(230, 230, 250));
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        GridBagLayout gbl_contentPanel = new GridBagLayout();
        gbl_contentPanel.columnWidths = new int[]{30, 118, 153, 30};
        gbl_contentPanel.rowHeights = new int[]{48, 0, 0, 0, 6, 0, 0, 0, 0, 10, 31, 0, 0, 0, 0, 0, 0};
        gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0};
        gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};

        contentPanel.setLayout(gbl_contentPanel);

            JPanel panel = new JPanel();
            panel.setBackground(new Color(255, 228, 196));
            GridBagConstraints gbc_panel = new GridBagConstraints();
            gbc_panel.gridwidth = 4;
            gbc_panel.insets = new Insets(0, 0, 5, 0);
            gbc_panel.fill = GridBagConstraints.BOTH;
            gbc_panel.gridx = 0;
            gbc_panel.gridy = 0;
            contentPanel.add(panel, gbc_panel);

                JLabel label = new JLabel("ایجاد درس جدید");
                label.setForeground(new Color(0, 0, 139));
                label.setFont(new Font("B Zar", Font.PLAIN, 24));
                panel.add(label);



            JLabel lblNewCourseName = new JLabel("نام درس");
            lblNewCourseName.setHorizontalTextPosition(SwingConstants.CENTER);
            lblNewCourseName.setHorizontalAlignment(SwingConstants.RIGHT);
            lblNewCourseName.setForeground(Color.BLUE);
            lblNewCourseName.setFont(new Font("Dialog", Font.PLAIN, 20));
            lblNewCourseName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            GridBagConstraints gbc_lblNewCourceName = new GridBagConstraints();
            gbc_lblNewCourceName.fill = GridBagConstraints.BOTH;
            gbc_lblNewCourceName.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewCourceName.gridx = 1;
            gbc_lblNewCourceName.gridy = 1;
            contentPanel.add(lblNewCourseName, gbc_lblNewCourceName);


            newCourseName = new JTextField();
            newCourseName.setToolTipText("نام را به انگلیسی وارد نمایید");
            newCourseName.setName("");
            newCourseName.setFont(new Font("Dialog", Font.PLAIN, 20));
            newCourseName.setColumns(10);
            newCourseName.setCaretColor(new Color(128, 0, 0));
            newCourseName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newCourseName.setBackground(new Color(240, 255, 240));
            GridBagConstraints gbc_NewCourseName = new GridBagConstraints();
            gbc_NewCourseName.insets = new Insets(0, 0, 5, 5);
            gbc_NewCourseName.fill = GridBagConstraints.HORIZONTAL;
            gbc_NewCourseName.gridx = 2;
            gbc_NewCourseName.gridy = 1;
            contentPanel.add(newCourseName, gbc_NewCourseName);

        {
            JLabel lblNewCourseID = new JLabel("کد درس");
            lblNewCourseID.setHorizontalTextPosition(SwingConstants.CENTER);
            lblNewCourseID.setHorizontalAlignment(SwingConstants.RIGHT);
            lblNewCourseID.setForeground(Color.BLUE);
            lblNewCourseID.setFont(new Font("Dialog", Font.PLAIN, 20));
            lblNewCourseID.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            GridBagConstraints gbc_lblNewCourseID = new GridBagConstraints();
            gbc_lblNewCourseID.fill = GridBagConstraints.HORIZONTAL;
            gbc_lblNewCourseID.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewCourseID.gridx = 1;
            gbc_lblNewCourseID.gridy = 2;
            contentPanel.add(lblNewCourseID, gbc_lblNewCourseID);
        }
        {
            newCourseID = new JTextField();
            newCourseID.setToolTipText("نام را به انگلیسی وارد نمایید");
            newCourseID.setName("");
            newCourseID.setFont(new Font("Dialog", Font.PLAIN, 20));
            newCourseID.setColumns(10);
            newCourseID.setCaretColor(new Color(128, 0, 0));
            newCourseID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
            newCourseID.setBackground(new Color(240, 255, 240));
            GridBagConstraints gbc_NewCourseID = new GridBagConstraints();
            gbc_NewCourseID.insets = new Insets(0, 0, 5, 5);
            gbc_NewCourseID.fill = GridBagConstraints.HORIZONTAL;
            gbc_NewCourseID.gridx = 2;
            gbc_NewCourseID.gridy = 2;
            contentPanel.add(newCourseID, gbc_NewCourseID);
        }
        {
            JSeparator separator = new JSeparator();
            GridBagConstraints gbc_separator = new GridBagConstraints();
            gbc_separator.gridwidth = 2;
            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 1;
            gbc_separator.gridy = 3;
            contentPanel.add(separator, gbc_separator);
        }
        {
            JSeparator separator = new JSeparator();
            GridBagConstraints gbc_separator = new GridBagConstraints();
            gbc_separator.gridwidth = 2;
            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridx = 1;
            gbc_separator.gridy = 4;
            contentPanel.add(separator, gbc_separator);
        }
        {
            JLabel lblNewCourseType = new JLabel("نوع درس");
            lblNewCourseType.setHorizontalTextPosition(SwingConstants.CENTER);
            lblNewCourseType.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewCourseType.setForeground(Color.BLUE);
            lblNewCourseType.setFont(new Font("Dialog", Font.PLAIN, 20));
            lblNewCourseType.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            GridBagConstraints gbc_lblNewCourseType = new GridBagConstraints();
            gbc_lblNewCourseType.gridwidth = 2;
            gbc_lblNewCourseType.fill = GridBagConstraints.HORIZONTAL;
            gbc_lblNewCourseType.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewCourseType.gridx = 1;
            gbc_lblNewCourseType.gridy = 5;
            contentPanel.add(lblNewCourseType, gbc_lblNewCourseType);
        }


        JRadioButton newCourseTypeProfessional = new JRadioButton("تخصصی");
        newCourseTypeProfessional.setBackground(new Color(255, 228, 225));
        newCourseTypeProfessional.setForeground(new Color(0, 128, 128));
        newCourseTypeProfessional.setIconTextGap(2);
        newCourseTypeProfessional.setHorizontalTextPosition(SwingConstants.LEFT);
        newCourseTypeProfessional.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseTypeProfessional.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseTypeProfessional.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GridBagConstraints gbc_newCourseTypeProfessional = new GridBagConstraints();
        gbc_newCourseTypeProfessional.fill = GridBagConstraints.BOTH;
        gbc_newCourseTypeProfessional.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseTypeProfessional.gridx = 1;
        gbc_newCourseTypeProfessional.gridy = 6;
        contentPanel.add(newCourseTypeProfessional, gbc_newCourseTypeProfessional);


        JRadioButton newCourseTypePublic = new JRadioButton("عمومی");
        newCourseTypePublic.setSelected(true);
        newCourseTypePublic.setBackground(new Color(255, 228, 225));
        newCourseTypePublic.setForeground(new Color(0, 128, 128));
        newCourseTypePublic.setIconTextGap(2);
        newCourseTypePublic.setHorizontalTextPosition(SwingConstants.LEFT);
        newCourseTypePublic.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseTypePublic.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseTypePublic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GridBagConstraints gbc_newCourseTypePublic = new GridBagConstraints();
        gbc_newCourseTypePublic.fill = GridBagConstraints.BOTH;
        gbc_newCourseTypePublic.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseTypePublic.gridx = 2;
        gbc_newCourseTypePublic.gridy = 6;
        contentPanel.add(newCourseTypePublic, gbc_newCourseTypePublic);


        JSeparator separator = new JSeparator();
        GridBagConstraints gbc_separator = new GridBagConstraints();
        gbc_separator.gridheight = 4;
        gbc_separator.insets = new Insets(0, 0, 5, 5);
        gbc_separator.gridx = 1;
        gbc_separator.gridy = 5;
        contentPanel.add(separator, gbc_separator);


        JSeparator separator2 = new JSeparator();
        GridBagConstraints gbc_separator2 = new GridBagConstraints();
        gbc_separator.gridheight = 4;
        gbc_separator.insets = new Insets(0, 0, 5, 5);
        gbc_separator.gridx = 1;
        gbc_separator.gridy = 5;
        contentPanel.add(separator2, gbc_separator2);


        JRadioButton newCourseTypeOptional = new JRadioButton("اختیاری");
        newCourseTypeOptional.setBackground(new Color(255, 228, 225));
        newCourseTypeOptional.setForeground(new Color(0, 128, 128));
        newCourseTypeOptional.setIconTextGap(2);
        newCourseTypeOptional.setHorizontalTextPosition(SwingConstants.LEFT);
        newCourseTypeOptional.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseTypeOptional.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseTypeOptional.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GridBagConstraints gbc_newCourseTypeOptional = new GridBagConstraints();
        gbc_newCourseTypeOptional.fill = GridBagConstraints.BOTH;
        gbc_newCourseTypeOptional.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseTypeOptional.gridx = 1;
        gbc_newCourseTypeOptional.gridy = 7;
        contentPanel.add(newCourseTypeOptional, gbc_newCourseTypeOptional);


        JRadioButton newCourseTypePrimary = new JRadioButton("پایه");
        newCourseTypePrimary.setBackground(new Color(255, 228, 225));
        newCourseTypePrimary.setForeground(new Color(0, 128, 128));
        newCourseTypePrimary.setIconTextGap(2);
        newCourseTypePrimary.setHorizontalTextPosition(SwingConstants.LEFT);
        newCourseTypePrimary.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseTypePrimary.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseTypePrimary.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GridBagConstraints gbc_newCourseTypePrimary = new GridBagConstraints();
        gbc_newCourseTypePrimary.fill = GridBagConstraints.BOTH;
        gbc_newCourseTypePrimary.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseTypePrimary.gridx = 2;
        gbc_newCourseTypePrimary.gridy = 7;
        contentPanel.add(newCourseTypePrimary, gbc_newCourseTypePrimary);


        JRadioButton newCourseTypeReparative = new JRadioButton("جبرانی");
        newCourseTypeReparative.setBackground(new Color(255, 228, 225));
        newCourseTypeReparative.setForeground(new Color(0, 128, 128));
        newCourseTypeReparative.setIconTextGap(2);
        newCourseTypeReparative.setHorizontalTextPosition(SwingConstants.LEFT);
        newCourseTypeReparative.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseTypeReparative.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseTypeReparative.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GridBagConstraints gbc_newCourseTypeReparative = new GridBagConstraints();
        gbc_newCourseTypeReparative.fill = GridBagConstraints.BOTH;
        gbc_newCourseTypeReparative.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseTypeReparative.gridx = 1;
        gbc_newCourseTypeReparative.gridy = 8;
        contentPanel.add(newCourseTypeReparative, gbc_newCourseTypeReparative);


        JRadioButton newCourseBasic = new JRadioButton("اصلی");
        newCourseBasic.setBackground(new Color(255, 228, 225));
        newCourseBasic.setForeground(new Color(0, 128, 128));
        newCourseBasic.setIconTextGap(2);
        newCourseBasic.setHorizontalTextPosition(SwingConstants.LEFT);
        newCourseBasic.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseBasic.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseBasic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GridBagConstraints gbc_newCourseBasic = new GridBagConstraints();
        gbc_newCourseBasic.fill = GridBagConstraints.BOTH;
        gbc_newCourseBasic.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseBasic.gridx = 2;
        gbc_newCourseBasic.gridy = 8;
        contentPanel.add(newCourseBasic, gbc_newCourseBasic);


        JSeparator separator3 = new JSeparator();
        GridBagConstraints gbc_separator3 = new GridBagConstraints();
        gbc_separator.gridwidth = 2;
        gbc_separator.insets = new Insets(0, 0, 5, 5);
        gbc_separator.gridx = 2;
        gbc_separator.gridy = 9;
        contentPanel.add(separator3, gbc_separator3);
        //******
        final ButtonGroup newCourseType=new ButtonGroup();
        newCourseType.add(newCourseTypePublic);
        newCourseType.add(newCourseTypePrimary);
        newCourseType.add(newCourseBasic);
        newCourseType.add(newCourseTypeProfessional);
        newCourseType.add(newCourseTypeOptional);
        newCourseType.add(newCourseTypeReparative);
        //*****************************
        newCourseBasic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseType= FileControl.CourseType.BASIC;
            }
        });
        newCourseTypePublic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseType= FileControl.CourseType.PUBIC;
            }
        });
        newCourseTypePrimary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseType= FileControl.CourseType.PRIMARY;
            }
        });
        newCourseTypeProfessional.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseType= FileControl.CourseType.PROFESSIONAL;
            }
        });
        newCourseTypeOptional.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseType= FileControl.CourseType.OPTIONAL;
            }
        });
        newCourseTypeReparative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseType= FileControl.CourseType.REPARATIVE;

            }
        });
        //***************************************
        {
            JLabel lblNewCourseUnit = new JLabel("تعداد واحد درس جدید");
            lblNewCourseUnit.setHorizontalTextPosition(SwingConstants.CENTER);
            lblNewCourseUnit.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewCourseUnit.setForeground(Color.BLUE);
            lblNewCourseUnit.setFont(new Font("Dialog", Font.PLAIN, 20));
            lblNewCourseUnit.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            GridBagConstraints gbc_lblNewCourseUnit = new GridBagConstraints();
            gbc_lblNewCourseUnit.fill = GridBagConstraints.BOTH;
            gbc_lblNewCourseUnit.gridwidth = 2;
            gbc_lblNewCourseUnit.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewCourseUnit.gridx = 1;
            gbc_lblNewCourseUnit.gridy = 10;
            contentPanel.add(lblNewCourseUnit, gbc_lblNewCourseUnit);
        }

        JRadioButton newCourseUnit2 = new JRadioButton("دو");
        newCourseUnit2.setBackground(new Color(255, 228, 225));
        newCourseUnit2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newCourseUnit2.setForeground(new Color(0, 128, 128));
        newCourseUnit2.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseUnit2.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseUnit2.setHorizontalTextPosition(SwingConstants.LEFT);
        GridBagConstraints gbc_newCourseUnit2 = new GridBagConstraints();
        gbc_newCourseUnit2.fill = GridBagConstraints.BOTH;
        gbc_newCourseUnit2.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseUnit2.gridx = 1;
        gbc_newCourseUnit2.gridy = 11;
        contentPanel.add(newCourseUnit2, gbc_newCourseUnit2);


        JRadioButton newCourseUnit1 = new JRadioButton("یک");
        newCourseUnit1.setBackground(new Color(255, 228, 225));
        newCourseUnit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newCourseUnit1.setForeground(new Color(0, 128, 128));
        newCourseUnit1.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseUnit1.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseUnit1.setHorizontalTextPosition(SwingConstants.LEFT);
        GridBagConstraints gbc_newCourseUnit1 = new GridBagConstraints();
        gbc_newCourseUnit1.fill = GridBagConstraints.BOTH;
        gbc_newCourseUnit1.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseUnit1.gridx = 2;
        gbc_newCourseUnit1.gridy = 11;
        contentPanel.add(newCourseUnit1, gbc_newCourseUnit1);


        JRadioButton newCourseUnit4 = new JRadioButton("چهار");
        newCourseUnit4.setBackground(new Color(255, 228, 225));
        newCourseUnit4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newCourseUnit4.setForeground(new Color(0, 128, 128));
        newCourseUnit4.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseUnit4.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseUnit4.setHorizontalTextPosition(SwingConstants.LEFT);
        GridBagConstraints gbc_newCourseUnit4 = new GridBagConstraints();
        gbc_newCourseUnit4.fill = GridBagConstraints.BOTH;
        gbc_newCourseUnit4.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseUnit4.gridx = 1;
        gbc_newCourseUnit4.gridy = 12;
        contentPanel.add(newCourseUnit4, gbc_newCourseUnit4);


        JRadioButton newCourseUnit3 = new JRadioButton("سه");
        newCourseUnit3.setSelected(true);
        newCourseUnit3.setBackground(new Color(255, 228, 225));
        newCourseUnit3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newCourseUnit3.setForeground(new Color(0, 128, 128));
        newCourseUnit3.setFont(new Font("B Mitra", Font.BOLD, 16));
        newCourseUnit3.setHorizontalAlignment(SwingConstants.RIGHT);
        newCourseUnit3.setHorizontalTextPosition(SwingConstants.LEFT);
        GridBagConstraints gbc_newCourseUnit3 = new GridBagConstraints();
        gbc_newCourseUnit3.fill = GridBagConstraints.BOTH;
        gbc_newCourseUnit3.insets = new Insets(0, 0, 5, 5);
        gbc_newCourseUnit3.gridx = 2;
        gbc_newCourseUnit3.gridy = 12;
        contentPanel.add(newCourseUnit3, gbc_newCourseUnit3);


        //********************************************
        ButtonGroup newCourseUnit=new ButtonGroup();
        newCourseUnit.add(newCourseUnit1);
        newCourseUnit.add(newCourseUnit2);
        newCourseUnit.add(newCourseUnit3);
        newCourseUnit.add(newCourseUnit4);
        //********************
        newCourseUnit1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                courseUnit= FileControl.CourseUnit.ONE;

            }
        });
        newCourseUnit2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                courseUnit= FileControl.CourseUnit.TWO;

            }
        });
        newCourseUnit3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseUnit= FileControl.CourseUnit.THREE;

            }
        });
        newCourseUnit4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseUnit= FileControl.CourseUnit.FOUR;

            }
        });
        //*******************************************



      

}
