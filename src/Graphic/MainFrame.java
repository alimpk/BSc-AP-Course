package Graphic;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class MainFrame extends JFrame {

    public static JPanel home;


    public MainFrame() {
        setUndecorated(true);
        //************************
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setResizable(false);
        setType(Type.UTILITY);
        setBounds(center.x-320, center.y-240, 800, 600);
        setTitle("سامانه مدیریت اطلاعات دانشجویان");
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setRootPaneCheckingEnabled(false);

        setLocale(new Locale("fa", "IR"));

        setName("Student");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //**********************************

        JMenuBar menuBar = new JMenuBar();
        menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        menuBar.setBackground(new Color(211, 211, 211));
        setJMenuBar(menuBar);

        JMenu mnFile = new JMenu("File");
        mnFile.setBorder(UIManager.getBorder("MenuBar.border"));
        mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnFile.setAlignmentX(2.0f);
        menuBar.add(mnFile);

        JMenuItem mntmRe = new JMenuItem("Restart");
        mnFile.add(mntmRe);
        mntmRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MainFrame.home.setVisible(false);
                for (int i = 0; i < 300003333333333L; i++) {
                    MainFrame.home.setVisible(true);
                }

            }
        });

        JSeparator separator_1 = new JSeparator();
        mnFile.add(separator_1);

        JMenuItem mnItmExit = new JMenuItem("Exit");
        mnFile.add(mnItmExit);

        JMenu mnEdit = new JMenu("Edit");
        mnEdit.setBorder(UIManager.getBorder("MenuBar.border"));
        mnEdit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnEdit.setAlignmentX(2.0f);
        menuBar.add(mnEdit);

        JMenuItem mntmUndo = new JMenuItem("Cut");
        mnEdit.add(mntmUndo);

        JMenuItem mntmNewMenuItem = new JMenuItem("Copy");
        mnEdit.add(mntmNewMenuItem);

        JMenuItem mntmPaste = new JMenuItem("Paste");
        mnEdit.add(mntmPaste);

        JSeparator separator = new JSeparator();
        mnEdit.add(separator);

        JMenuItem mntmDelete = new JMenuItem("Delete");
        mnEdit.add(mntmDelete);

        JMenu mnNewMenu = new JMenu("Help");
        mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnNewMenu.setBorder(UIManager.getBorder("MenuBar.border"));
        menuBar.add(mnNewMenu);

        JMenuItem mntmHelp = new JMenuItem("Help");
        mnNewMenu.add(mntmHelp);
       /* mntmHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

        JSeparator separator_2 = new JSeparator();
        mnNewMenu.add(separator_2);

        JMenuItem mntmAbout = new JMenuItem("About  SIMS");
        mnNewMenu.add(mntmAbout);
        mntmAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new About();
            }
        });
        //*****************************************************
        home = new JPanel();
        home.setAlignmentY(0.0f);
        home.setAlignmentX(0.0f);
        home.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        home.setFont(new Font("SimHei", Font.BOLD, 13));


        home.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        home.setBackground(new Color(255, 235, 205));
        setContentPane(home);
        //***************************
        GridBagLayout gbl_home = new GridBagLayout();
        gbl_home.columnWidths = new int[]{0, 0, 0, 0, 124, 124, 102, 88};
        gbl_home.rowHeights = new int[] {23, 76, 50, 50, 50, 50, 50, 50, 50, 58, 40, 0};
        gbl_home.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0};
        gbl_home.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        home.setLayout(gbl_home);

        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.gridwidth = 8;
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 0;
        home.add(panel, gbc_panel);

        JPanel headPanel = new JPanel();
        headPanel.setBorder(UIManager.getBorder("InternalFrame.border"));
        headPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        headPanel.setBackground(new Color(230, 230, 250));
        GridBagConstraints Frame_headPanel = new GridBagConstraints();
        Frame_headPanel.gridwidth = 8;
        Frame_headPanel.fill = GridBagConstraints.BOTH;
        Frame_headPanel.insets = new Insets(0, 0, 5, 0);
        Frame_headPanel.gridx = 0;
        Frame_headPanel.gridy = 1;
        home.add(headPanel, Frame_headPanel);
        headPanel.setLayout(new BoxLayout(headPanel, BoxLayout.X_AXIS));

        JLabel label = new JLabel();
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setBackground(new Color(255, 0, 0));
        label.setIcon(new ImageIcon("logo/Rm00D.jpg"));
        headPanel.add(label);

        JLabel label_1 = new JLabel("");
        headPanel.add(label_1);

        JButton newStudentB = new JButton("دانشجوی جدید");

        newStudentB.setToolTipText("ایجاد دانشجوی جدید");
        newStudentB.setBackground(new Color(176, 224, 230));
        newStudentB.setFont(new Font("B Homa", newStudentB.getFont().getStyle() | Font.BOLD, newStudentB.getFont().getSize() + 6));
        newStudentB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newStudentB.setBorder(UIManager.getBorder("Button.border"));
        GridBagConstraints newStudentButton = new GridBagConstraints();
        newStudentButton.fill = GridBagConstraints.BOTH;
        newStudentButton.insets = new Insets(0, 0, 5, 0);
        newStudentButton.gridx = 7;
        newStudentButton.gridy = 2;
        home.add(newStudentB, newStudentButton);

        JButton newCourceB = new JButton("درس جدید");
        newCourceB.setToolTipText("ایجاد درس جدید");
        newCourceB.setBackground(new Color(176, 224, 230));
        newCourceB.setFont(new Font("B Homa", newCourceB.getFont().getStyle() | Font.BOLD, newCourceB.getFont().getSize() + 6));
        newCourceB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newCourceB.setBorder(UIManager.getBorder("Button.border"));
        GridBagConstraints newCourceButton = new GridBagConstraints();
        newCourceButton.fill = GridBagConstraints.BOTH;
        newCourceButton.insets = new Insets(0, 0, 5, 0);
        newCourceButton.gridx = 7;
        newCourceButton.gridy = 3;
        home.add(newCourceB, newCourceButton);

        JButton searchB = new JButton("جستجو");
        searchB.setVerifyInputWhenFocusTarget(false);
        searchB.setToolTipText("جهت دیدن اطلاعات دانشجوی مورد نظر کلیک کنید\r\n");
        searchB.setBackground(new Color(176, 224, 230));
        searchB.setFont(new Font("B Homa", searchB.getFont().getStyle(), searchB.getFont().getSize() + 6));
        searchB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchB.setBorder(UIManager.getBorder("Button.border"));
        GridBagConstraints searchButton = new GridBagConstraints();
        searchButton.fill = GridBagConstraints.BOTH;
        searchButton.insets = new Insets(0, 0, 5, 0);
        searchButton.gridx = 7;
        searchButton.gridy = 4;
        home.add(searchB, searchButton);

        JButton courseAddB = new JButton("اخذ درس");
        courseAddB.setToolTipText("اخذ درس جدید");
        courseAddB.setFont(new Font("B Homa", courseAddB.getFont().getStyle(), courseAddB.getFont().getSize() + 6));
        courseAddB.setBackground(new Color(176, 224, 230));
        courseAddB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        courseAddB.setBorder(UIManager.getBorder("Button.border"));
        GridBagConstraints courseAddButton = new GridBagConstraints();
        courseAddButton.fill = GridBagConstraints.BOTH;
        courseAddButton.insets = new Insets(0, 0, 5, 0);
        courseAddButton.gridx = 7;
        courseAddButton.gridy = 5;
        home.add(courseAddB, courseAddButton);


        JButton courseDelB = new JButton("حذف درس");
        courseDelB.setToolTipText("حذف درس انتخاب شده");
        courseDelB.setFont(new Font("B Homa", courseDelB.getFont().getStyle(), courseDelB.getFont().getSize() + 6));
        courseDelB.setBackground(new Color(176, 224, 230));
        courseDelB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        courseDelB.setBorder(UIManager.getBorder("Button.border"));
        GridBagConstraints courseDelButton = new GridBagConstraints();
        courseDelButton.fill = GridBagConstraints.BOTH;
        courseDelButton.insets = new Insets(0, 0, 5, 0);
        courseDelButton.gridx = 7;
        courseDelButton.gridy = 6;
        home.add(courseDelB, courseDelButton);

        JButton allInformationB = new JButton("اطلاعات جامع دانشجویان");
        allInformationB.setToolTipText("اطلاعات کلیه دانشجویان");
        allInformationB.setFont(new Font("B Homa", allInformationB.getFont().getStyle(), allInformationB.getFont().getSize() + 4));
        allInformationB.setBackground(new Color(176, 224, 230));
        allInformationB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        allInformationB.setBorder(UIManager.getBorder("Button.border"));
        GridBagConstraints allInformationButton = new GridBagConstraints();
        allInformationButton.fill = GridBagConstraints.BOTH;
        allInformationButton.insets = new Insets(0, 0, 5, 0);
        allInformationButton.gridx = 7;
        allInformationButton.gridy = 7;
        home.add(allInformationB, allInformationButton);

        JButton aboutMeB = new JButton("درباره ما");
        aboutMeB.setToolTipText("درباره ما ");
        aboutMeB.setBackground(new Color(255, 140, 0));
        aboutMeB.setFont(new Font("B Homa", aboutMeB.getFont().getStyle(), aboutMeB.getFont().getSize() + 6));
        aboutMeB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutMeB.setBorder(UIManager.getBorder("Button.border"));
        GridBagConstraints aboutMeButton = new GridBagConstraints();
        aboutMeButton.fill = GridBagConstraints.BOTH;
        aboutMeButton.insets = new Insets(0, 0, 5, 0);
        aboutMeButton.gridx = 7;
        aboutMeButton.gridy = 8;
        home.add(aboutMeB, aboutMeButton);

        JButton ExitButton = new JButton("خروج");
        ExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
            }
        });
        ExitButton.setFont(new Font("B Homa", Font.PLAIN, 32));
        ExitButton.setToolTipText("خروج ");
        ExitButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        ExitButton.setBackground(new Color(165, 42, 42));
        GridBagConstraints ExitBtn = new GridBagConstraints();
        ExitBtn.anchor = GridBagConstraints.SOUTH;
        ExitBtn.fill = GridBagConstraints.HORIZONTAL;
        ExitBtn.insets = new Insets(0, 0, 5, 0);
        ExitBtn.gridx = 7;
        ExitBtn.gridy = 9;
        home.add(ExitButton, ExitBtn);

        JPanel footPanel = new JPanel();
        footPanel.setBackground(new Color(154, 205, 50));
        footPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        GridBagConstraints frame_footPanel = new GridBagConstraints();
        frame_footPanel.gridwidth = 8;
        frame_footPanel.fill = GridBagConstraints.BOTH;
        frame_footPanel.gridx = 0;
        frame_footPanel.gridy = 10;
        home.add(footPanel, frame_footPanel);

        JLabel lblSims = new JLabel("SIMS © 2015 Rm00D All rights reserved.");
        footPanel.add(lblSims);
        newStudentB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NewStudentDialog();
                home.setVisible(false);


            }
        });
        newCourceB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new newCourseDialog();
                home.setVisible(false);
            }
        });
        allInformationB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SelectAllInf();
            }
        });
        aboutMeB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new About();
            }
        });


        courseAddB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCourseDialog();
            }
        });
        courseDelB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DelCourseDialog();
            }
        });
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        mnItmExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        searchB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchInput();
            }
        });




    }



}
