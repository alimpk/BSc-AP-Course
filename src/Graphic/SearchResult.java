package Graphic;

import Controls.FileControl;
import Science.Added;
import Science.Student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/**
 * Created by Alimpk on 8/2/2015.
 */
public class SearchResult extends JFrame {
    private JPanel contentPane;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField fatherName;
    private JTextField birthLoc;
    private JTextField entrance;
    private JTextField birthday;
    private JTextField nID;
    private JTextField stuID;
    private JTextField term;
    private static JTextField currentTerm;
    private JTextField AllPointAverage;
    private static JTextField TermPointAverage;

    public SearchResult(final Student search) throws FileNotFoundException {
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        MainFrame.home.setVisible(false);
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(center.x-320, center.y-240, 800,600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 240, 245));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{9, 100, 150, 17, 100, 150, 0};
        gbl_contentPane.rowHeights = new int[]{38, 40, 40, 40, 40, 40, 40, 0, 40, 7, 30, 30, 40, 40,40,40};
        gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JPanel headPanel = new JPanel();
        headPanel.setBackground(new Color(143, 188, 143));
        GridBagConstraints gbc_headPanel = new GridBagConstraints();
        gbc_headPanel.gridwidth = 8;
        gbc_headPanel.insets = new Insets(0, 0, 5, 0);
        gbc_headPanel.fill = GridBagConstraints.BOTH;
        gbc_headPanel.gridx = 0;
        gbc_headPanel.gridy = 0;
        contentPane.add(headPanel, gbc_headPanel);

        JLabel lblHead = new JLabel("مشخصات فردی");
        lblHead.setFont(new Font("B Homa", Font.PLAIN, 20));
        headPanel.add(lblHead);

        JLabel nameLbl = new JLabel(" نام");
        nameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        nameLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        nameLbl.setBackground(new Color(250, 235, 215));
        nameLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        GridBagConstraints gbc_nameLbl = new GridBagConstraints();
        gbc_nameLbl.fill = GridBagConstraints.BOTH;
        gbc_nameLbl.insets = new Insets(0, 0, 5, 5);
        gbc_nameLbl.gridx = 1;
        gbc_nameLbl.gridy = 1;
        contentPane.add(nameLbl, gbc_nameLbl);

        firstName = new JTextField();
        firstName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        firstName.setBackground(new Color(230, 230, 250));
        firstName.setDisabledTextColor(new Color(224, 255, 255));
        firstName.setEditable(false);
        firstName.setFont(new Font("Dialog", Font.PLAIN, 20));
        GridBagConstraints gbc_firstName = new GridBagConstraints();
        gbc_firstName.insets = new Insets(0, 0, 5, 5);
        gbc_firstName.fill = GridBagConstraints.HORIZONTAL;
        gbc_firstName.gridx = 2;
        gbc_firstName.gridy = 1;
        contentPane.add(firstName, gbc_firstName);
        firstName.setColumns(10);

        JLabel stuIDLbl = new JLabel(" شماره دانشجویی");
        stuIDLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        stuIDLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        stuIDLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        stuIDLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_stuIDLbl = new GridBagConstraints();
        gbc_stuIDLbl.fill = GridBagConstraints.BOTH;
        gbc_stuIDLbl.insets = new Insets(0, 0, 5, 5);
        gbc_stuIDLbl.gridx = 4;
        gbc_stuIDLbl.gridy = 1;
        contentPane.add(stuIDLbl, gbc_stuIDLbl);

        stuID = new JTextField();
        stuID.setFont(new Font("Dialog", Font.PLAIN, 20));
        stuID.setEditable(false);
        stuID.setDisabledTextColor(new Color(224, 255, 255));
        stuID.setColumns(10);
        stuID.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        stuID.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_stuID = new GridBagConstraints();
        gbc_stuID.insets = new Insets(0, 0, 5, 5);
        gbc_stuID.fill = GridBagConstraints.HORIZONTAL;
        gbc_stuID.gridx = 5;
        gbc_stuID.gridy = 1;
        contentPane.add(stuID, gbc_stuID);

        JLabel familyLbl = new JLabel(" نام خانوادگی");
        familyLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        familyLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        familyLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        familyLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_familyLbl = new GridBagConstraints();
        gbc_familyLbl.fill = GridBagConstraints.BOTH;
        gbc_familyLbl.insets = new Insets(0, 0, 5, 5);
        gbc_familyLbl.gridx = 1;
        gbc_familyLbl.gridy = 2;
        contentPane.add(familyLbl, gbc_familyLbl);

        lastName = new JTextField();
        lastName.setFont(new Font("Dialog", Font.PLAIN, 20));
        lastName.setEditable(false);
        lastName.setDisabledTextColor(new Color(224, 255, 255));
        lastName.setColumns(10);
        lastName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        lastName.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_lastName = new GridBagConstraints();
        gbc_lastName.insets = new Insets(0, 0, 5, 5);
        gbc_lastName.fill = GridBagConstraints.HORIZONTAL;
        gbc_lastName.gridx = 2;
        gbc_lastName.gridy = 2;
        contentPane.add(lastName, gbc_lastName);

        JLabel nIDLbl = new JLabel(" کد ملی");
        nIDLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        nIDLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        nIDLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        nIDLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_nIDLbl = new GridBagConstraints();
        gbc_nIDLbl.fill = GridBagConstraints.BOTH;
        gbc_nIDLbl.insets = new Insets(0, 0, 5, 5);
        gbc_nIDLbl.gridx = 4;
        gbc_nIDLbl.gridy = 2;
        contentPane.add(nIDLbl, gbc_nIDLbl);

        nID = new JTextField();
        nID.setFont(new Font("Dialog", Font.PLAIN, 20));
        nID.setEditable(false);
        nID.setDisabledTextColor(new Color(224, 255, 255));
        nID.setColumns(10);
        nID.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        nID.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_nID = new GridBagConstraints();
        gbc_nID.insets = new Insets(0, 0, 5, 5);
        gbc_nID.fill = GridBagConstraints.HORIZONTAL;
        gbc_nID.gridx = 5;
        gbc_nID.gridy = 2;
        contentPane.add(nID, gbc_nID);

        JLabel fatherLbl = new JLabel(" نام پدر");
        fatherLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        fatherLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        fatherLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        fatherLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_fatherLbl = new GridBagConstraints();
        gbc_fatherLbl.fill = GridBagConstraints.BOTH;
        gbc_fatherLbl.insets = new Insets(0, 0, 5, 5);
        gbc_fatherLbl.gridx = 1;
        gbc_fatherLbl.gridy = 3;
        contentPane.add(fatherLbl, gbc_fatherLbl);

        fatherName = new JTextField();
        fatherName.setFont(new Font("Dialog", Font.PLAIN, 20));
        fatherName.setEditable(false);
        fatherName.setDisabledTextColor(new Color(224, 255, 255));
        fatherName.setColumns(10);
        fatherName.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        fatherName.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_fatherName = new GridBagConstraints();
        gbc_fatherName.insets = new Insets(0, 0, 5, 5);
        gbc_fatherName.fill = GridBagConstraints.HORIZONTAL;
        gbc_fatherName.gridx = 2;
        gbc_fatherName.gridy = 3;
        contentPane.add(fatherName, gbc_fatherName);

        JLabel birthdayLbl = new JLabel(" تاریخ تولد");
        birthdayLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        birthdayLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        birthdayLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        birthdayLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_birthdayLbl = new GridBagConstraints();
        gbc_birthdayLbl.fill = GridBagConstraints.BOTH;
        gbc_birthdayLbl.insets = new Insets(0, 0, 5, 5);
        gbc_birthdayLbl.gridx = 4;
        gbc_birthdayLbl.gridy = 3;
        contentPane.add(birthdayLbl, gbc_birthdayLbl);

        birthday = new JTextField();
        birthday.setFont(new Font("Dialog", Font.PLAIN, 20));
        birthday.setEditable(false);
        birthday.setDisabledTextColor(new Color(224, 255, 255));
        birthday.setColumns(10);
        birthday.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        birthday.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_birthday = new GridBagConstraints();
        gbc_birthday.insets = new Insets(0, 0, 5, 5);
        gbc_birthday.fill = GridBagConstraints.HORIZONTAL;
        gbc_birthday.gridx = 5;
        gbc_birthday.gridy = 3;
        contentPane.add(birthday, gbc_birthday);

        JLabel birthLocLbl = new JLabel(" محل تولد");
        birthLocLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        birthLocLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        birthLocLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(168, 168, 216)));
        birthLocLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_birthLocLbl = new GridBagConstraints();
        gbc_birthLocLbl.fill = GridBagConstraints.BOTH;
        gbc_birthLocLbl.insets = new Insets(0, 0, 5, 5);
        gbc_birthLocLbl.gridx = 1;
        gbc_birthLocLbl.gridy = 4;
        contentPane.add(birthLocLbl, gbc_birthLocLbl);

        birthLoc = new JTextField();
        birthLoc.setFont(new Font("Dialog", Font.PLAIN, 20));
        birthLoc.setEditable(false);
        birthLoc.setDisabledTextColor(new Color(224, 255, 255));
        birthLoc.setColumns(10);
        birthLoc.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        birthLoc.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_birthLoc = new GridBagConstraints();
        gbc_birthLoc.insets = new Insets(0, 0, 5, 5);
        gbc_birthLoc.fill = GridBagConstraints.HORIZONTAL;
        gbc_birthLoc.gridx = 2;
        gbc_birthLoc.gridy = 4;
        contentPane.add(birthLoc, gbc_birthLoc);

        JLabel entranceLbl = new JLabel(" نیمسال ورود");
        entranceLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        entranceLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        entranceLbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(168, 168, 216)));
        entranceLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_entranceLbl = new GridBagConstraints();
        gbc_entranceLbl.fill = GridBagConstraints.BOTH;
        gbc_entranceLbl.insets = new Insets(0, 0, 5, 5);
        gbc_entranceLbl.gridx = 4;
        gbc_entranceLbl.gridy = 4;
        contentPane.add(entranceLbl, gbc_entranceLbl);

        entrance = new JTextField();
        entrance.setFont(new Font("Dialog", Font.PLAIN, 20));
        entrance.setEditable(false);
        entrance.setDisabledTextColor(new Color(224, 255, 255));
        entrance.setColumns(10);
        entrance.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        entrance.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_entrance = new GridBagConstraints();
        gbc_entrance.insets = new Insets(0, 0, 5, 5);
        gbc_entrance.fill = GridBagConstraints.HORIZONTAL;
        gbc_entrance.gridx = 5;
        gbc_entrance.gridy = 4;
        contentPane.add(entrance, gbc_entrance);

        JPanel midPanel = new JPanel();
        midPanel.setBackground(new Color(143, 188, 143));
        GridBagConstraints gbc_midPanel = new GridBagConstraints();
        gbc_midPanel.anchor = GridBagConstraints.SOUTH;
        gbc_midPanel.gridwidth = 8;
        gbc_midPanel.insets = new Insets(0, 0, 5, 0);
        gbc_midPanel.fill = GridBagConstraints.HORIZONTAL;
        gbc_midPanel.gridx = 0;
        gbc_midPanel.gridy = 5;
        contentPane.add(midPanel, gbc_midPanel);

        JLabel lblMed = new JLabel("مشخصات تحصیلی");
        lblMed.setFont(new Font("B Homa", Font.PLAIN, 20));
        midPanel.add(lblMed);

        currentTerm = new JTextField();
        currentTerm.setFont(new Font("Dialog", Font.PLAIN, 20));
        currentTerm.setDisabledTextColor(new Color(224, 255, 255));
        currentTerm.setColumns(10);
        currentTerm.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        currentTerm.setBackground(new Color(240, 230, 140));
        GridBagConstraints gbc_currentTerm = new GridBagConstraints();
        gbc_currentTerm.insets = new Insets(0, 0, 5, 5);
        gbc_currentTerm.fill = GridBagConstraints.HORIZONTAL;
        gbc_currentTerm.gridx = 1;
        gbc_currentTerm.gridy = 6;
        contentPane.add(currentTerm, gbc_currentTerm);

        JLabel currentTermLbl = new JLabel(" نیمسال جاری را وارد نمایید");
        currentTermLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        currentTermLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        currentTermLbl.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        currentTermLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_currentTermLbl = new GridBagConstraints();
        gbc_currentTermLbl.fill = GridBagConstraints.BOTH;
        gbc_currentTermLbl.insets = new Insets(0, 0, 5, 5);
        gbc_currentTermLbl.gridx = 2;
        gbc_currentTermLbl.gridy = 6;
        contentPane.add(currentTermLbl, gbc_currentTermLbl);

        term = new JTextField();
        term.setFont(new Font("Dialog", Font.PLAIN, 20));
        term.setDisabledTextColor(new Color(224, 255, 255));
        term.setColumns(10);
        term.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        term.setBackground(new Color(240, 230, 140));
        GridBagConstraints gbc_term = new GridBagConstraints();
        gbc_term.insets = new Insets(0, 0, 5, 5);
        gbc_term.fill = GridBagConstraints.HORIZONTAL;
        gbc_term.gridx = 4;
        gbc_term.gridy = 6;
        contentPane.add(term, gbc_term);

        JLabel singleTermLbl = new JLabel(" نیمسال مورد نظر را وارد نمایید");
        singleTermLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        singleTermLbl.setFont(new Font("B Mitra", Font.PLAIN, 20));
        singleTermLbl.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        singleTermLbl.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_singleTermLbl = new GridBagConstraints();
        gbc_singleTermLbl.fill = GridBagConstraints.BOTH;
        gbc_singleTermLbl.insets = new Insets(0, 0, 5, 5);
        gbc_singleTermLbl.gridx = 5;
        gbc_singleTermLbl.gridy = 6;
        contentPane.add(singleTermLbl, gbc_singleTermLbl);

        JButton AllTermShowB = new JButton("نمایش");
        AllTermShowB.setFont(new Font("B Traffic", Font.PLAIN, 24));
        AllTermShowB.setBackground(new Color(135, 206, 235));
        GridBagConstraints gbc_AllTermShowB = new GridBagConstraints();
        gbc_AllTermShowB.fill = GridBagConstraints.BOTH;
        gbc_AllTermShowB.gridwidth = 2;
        gbc_AllTermShowB.insets = new Insets(0, 0, 5, 5);
        gbc_AllTermShowB.gridx = 1;
        gbc_AllTermShowB.gridy = 7;
        contentPane.add(AllTermShowB, gbc_AllTermShowB);

        JButton termShowB = new JButton("نمایش");
        termShowB.setFont(new Font("B Traffic", Font.PLAIN, 24));
        termShowB.setBackground(new Color(135, 206, 235));
        GridBagConstraints gbc_termShowB = new GridBagConstraints();
        gbc_termShowB.gridwidth = 2;
        gbc_termShowB.fill = GridBagConstraints.BOTH;
        gbc_termShowB.insets = new Insets(0, 0, 5, 5);
        gbc_termShowB.gridx = 4;
        gbc_termShowB.gridy = 7;
        contentPane.add(termShowB, gbc_termShowB);

        JLabel AllPointAveLbl = new JLabel("  معدل کل");
        AllPointAveLbl.setForeground(new Color(72, 61, 139));
        AllPointAveLbl.setBackground(new Color(255, 0, 0));
        AllPointAveLbl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        AllPointAveLbl.setFont(new Font("B Mitra", Font.PLAIN, 24));
        AllPointAveLbl.setHorizontalTextPosition(SwingConstants.RIGHT);
        AllPointAveLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints gbc_AllPointAveLbl = new GridBagConstraints();
        gbc_AllPointAveLbl.fill = GridBagConstraints.BOTH;
        gbc_AllPointAveLbl.insets = new Insets(0, 0, 5, 5);
        gbc_AllPointAveLbl.gridx = 1;
        gbc_AllPointAveLbl.gridy = 8;
        contentPane.add(AllPointAveLbl, gbc_AllPointAveLbl);

        AllPointAverage = new JTextField();
        AllPointAverage.setFont(new Font("Dialog", Font.PLAIN, 20));
        AllPointAverage.setEditable(false);
        AllPointAverage.setDisabledTextColor(new Color(224, 255, 255));
        AllPointAverage.setColumns(10);
        AllPointAverage.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        AllPointAverage.setBackground(new Color(216, 191, 216));
        GridBagConstraints gbc_AllPointAverage = new GridBagConstraints();
        gbc_AllPointAverage.insets = new Insets(0, 0, 5, 5);
        gbc_AllPointAverage.fill = GridBagConstraints.BOTH;
        gbc_AllPointAverage.gridx = 2;
        gbc_AllPointAverage.gridy = 8;
        contentPane.add(AllPointAverage, gbc_AllPointAverage);

        JLabel TermPointAveLbl = new JLabel("  معدل ترم");
        TermPointAveLbl.setHorizontalTextPosition(SwingConstants.RIGHT);
        TermPointAveLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        TermPointAveLbl.setForeground(new Color(72, 61, 139));
        TermPointAveLbl.setFont(new Font("B Mitra", Font.PLAIN, 24));
        TermPointAveLbl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        TermPointAveLbl.setBackground(Color.RED);
        GridBagConstraints gbc_TermPointAveLbl = new GridBagConstraints();
        gbc_TermPointAveLbl.fill = GridBagConstraints.BOTH;
        gbc_TermPointAveLbl.insets = new Insets(0, 0, 5, 5);
        gbc_TermPointAveLbl.gridx = 4;
        gbc_TermPointAveLbl.gridy = 8;
        contentPane.add(TermPointAveLbl, gbc_TermPointAveLbl);

        TermPointAverage = new JTextField();
        TermPointAverage.setFont(new Font("Dialog", Font.PLAIN, 20));
        TermPointAverage.setEditable(false);
        TermPointAverage.setDisabledTextColor(new Color(224, 255, 255));
        TermPointAverage.setColumns(10);
        TermPointAverage.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        TermPointAverage.setBackground(new Color(216, 191, 216));
        GridBagConstraints gbc_TermPointAverage = new GridBagConstraints();
        gbc_TermPointAverage.insets = new Insets(0, 0, 5, 5);
        gbc_TermPointAverage.fill = GridBagConstraints.HORIZONTAL;
        gbc_TermPointAverage.gridx = 5;
        gbc_TermPointAverage.gridy = 8;
        contentPane.add(TermPointAverage, gbc_TermPointAverage);

        JSeparator separator = new JSeparator();
        GridBagConstraints gbc_separator = new GridBagConstraints();
        gbc_separator.gridwidth = 8;
        gbc_separator.insets = new Insets(0, 0, 5, 0);
        gbc_separator.gridx = 0;
        gbc_separator.gridy = 9;
        contentPane.add(separator, gbc_separator);

        JLabel guidance1Lbl = new JLabel("  برای نمایش معدل کل ترم جاری را وارد کرده و نمایش را انتخاب کنید");
        guidance1Lbl.setFont(new Font("B Mitra", Font.BOLD, 16));
        guidance1Lbl.setHorizontalTextPosition(SwingConstants.RIGHT);
        guidance1Lbl.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints gbc_guidance1Lbl = new GridBagConstraints();
        gbc_guidance1Lbl.fill = GridBagConstraints.HORIZONTAL;
        gbc_guidance1Lbl.gridwidth = 8;
        gbc_guidance1Lbl.insets = new Insets(0, 0, 5, 0);
        gbc_guidance1Lbl.gridx = 0;
        gbc_guidance1Lbl.gridy = 10;
        contentPane.add(guidance1Lbl, gbc_guidance1Lbl);

        JLabel Guidance2Lbl = new JLabel("  برای نمایش معدل ترمی ،نیمسال مورد نظر ان را وارد کرده ونمایش را انتخاب کنید ");
        Guidance2Lbl.setFont(new Font("B Mitra", Font.BOLD, 16));
        Guidance2Lbl.setHorizontalAlignment(SwingConstants.RIGHT);
        Guidance2Lbl.setHorizontalTextPosition(SwingConstants.RIGHT);
        GridBagConstraints gbc_Guidance2Lbl = new GridBagConstraints();
        gbc_Guidance2Lbl.fill = GridBagConstraints.HORIZONTAL;
        gbc_Guidance2Lbl.gridwidth = 8;
        gbc_Guidance2Lbl.insets = new Insets(0, 0, 5, 0);
        gbc_Guidance2Lbl.gridx = 0;
        gbc_Guidance2Lbl.gridy = 11;
        contentPane.add(Guidance2Lbl, gbc_Guidance2Lbl);

        JPanel medPanel = new JPanel();
        medPanel.setBackground(new Color(143, 188, 143));
        GridBagConstraints gbc_medPanel = new GridBagConstraints();
        gbc_medPanel.gridwidth = 8;
        gbc_medPanel.insets = new Insets(0, 0, 5, 0);
        gbc_medPanel.fill = GridBagConstraints.BOTH;
        gbc_medPanel.gridx = 0;
        gbc_medPanel.gridy = 12;
        contentPane.add(medPanel, gbc_medPanel);
        JLabel lblMed2 = new JLabel("مشخصات دروس");
        lblMed2.setFont(new Font("B Homa", Font.PLAIN, 20));
        medPanel.add(lblMed2);
        JButton termCourseShowB = new JButton("نمایش دروس اخذ شده");
        termCourseShowB.setFont(new Font("B Traffic", Font.PLAIN, 24));
        termCourseShowB.setBackground(new Color(135, 206, 235));
        GridBagConstraints gbc_termCourseShowB = new GridBagConstraints();
        gbc_termCourseShowB.gridwidth = 8;
        gbc_termCourseShowB.fill = GridBagConstraints.BOTH;
        gbc_termCourseShowB.insets = new Insets(0, 0, 5, 5);
        gbc_termCourseShowB.gridx = 0;
        gbc_termCourseShowB.gridy = 13;
        contentPane.add(termCourseShowB, gbc_termCourseShowB);

        JButton backButton = new JButton("بازگشت به منوی اصلی");
        backButton.setBackground(new Color(100, 149, 237));
        GridBagConstraints gbc_backButton = new GridBagConstraints();
        gbc_backButton.fill = GridBagConstraints.BOTH;
        gbc_backButton.gridwidth = 8;
        gbc_backButton.gridx = 0;
        gbc_backButton.gridy = 15;
        contentPane.add(backButton, gbc_backButton);
        backButton.setFont(new Font("B Zar", Font.PLAIN, 24));
        backButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));

        termShowB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double singleAve=0;
                try {
                    singleAve= Added.TermGradesAverage(search.getStudentID(),term.getText());
                } catch (FileNotFoundException e1) {

                }
                TermPointAverage.setText(String.valueOf(singleAve));

            }
        });
        AllTermShowB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              double singleAve=0;
            try {
                singleAve= Added.AllGradesAverage(search.getStudentID(),currentTerm.getText());
            } catch (FileNotFoundException e1) {

            }
            AllPointAverage.setText(String.valueOf(singleAve));

        }
        });
        //------------------------------------

       loadInformation(search.getFirstName(), search.getLastName(), search.getFatherName(), search.getStudentID(), search.getNationalID(), search.getBirthDay(), search.getBirthLocation());
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.home.setVisible(true);
                dispose();

            }
        });
        termCourseShowB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new StudentAdded(search.getStudentID());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public void loadInformation(String fName ,String lName,String faName,String ID,String NID,String bDate,String bLoc) throws FileNotFoundException {
        this.firstName.setText(fName);
        this.lastName.setText(lName);
        this.fatherName.setText(faName);
        this.birthday.setText(bDate);
        this.birthLoc.setText(bLoc);
        this.stuID.setText(ID);
        this.nID.setText(NID);
        this.entrance.setText(FileControl.getStudentEntrance(Student.student,ID));
    }


}
