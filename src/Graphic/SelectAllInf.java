package Graphic;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;


public class SelectAllInf extends JFrame {



    /**
     * Create the frame.
     */
    public SelectAllInf() {
        MainFrame.home.setVisible(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setAlwaysOnTop(true);
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setBounds(center.x-320, center.y-240, 480, 320);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(144, 238, 144));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{422, 0};
        gbl_contentPane.rowHeights = new int[]{28, 68, 68, 21, 56, 0};
        gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JPanel headPanel = new JPanel();
        headPanel.setBackground(new Color(250, 235, 215));
        GridBagConstraints gbc_headPanel = new GridBagConstraints();
        gbc_headPanel.insets = new Insets(0, 0, 5, 0);
        gbc_headPanel.fill = GridBagConstraints.BOTH;
        gbc_headPanel.gridx = 0;
        gbc_headPanel.gridy = 0;
        contentPane.add(headPanel, gbc_headPanel);

        JLabel headLabel = new JLabel("گزینه مورد نظر را انتخاب نمایید");
        headLabel.setFont(new Font("B Zar", Font.PLAIN, 24));
        headPanel.add(headLabel);

        JButton StudentButton = new JButton("مشخصات دانشجویان");
        StudentButton.setBackground(new Color(173, 216, 230));
        StudentButton.setFont(new Font("B Compset", Font.PLAIN, 24));
        GridBagConstraints gbc_StudentButton = new GridBagConstraints();
        gbc_StudentButton.insets = new Insets(0, 0, 5, 0);
        gbc_StudentButton.fill = GridBagConstraints.BOTH;
        gbc_StudentButton.gridx = 0;
        gbc_StudentButton.gridy = 1;
        contentPane.add(StudentButton, gbc_StudentButton);

        JButton CourseButton = new JButton("مشخصات دروس");
        CourseButton.setBackground(new Color(176, 224, 230));
        CourseButton.setFont(new Font("B Compset", Font.PLAIN, 24));
        GridBagConstraints gbc_CourseButton = new GridBagConstraints();
        gbc_CourseButton.insets = new Insets(0, 0, 5, 0);
        gbc_CourseButton.fill = GridBagConstraints.BOTH;
        gbc_CourseButton.gridx = 0;
        gbc_CourseButton.gridy = 2;
        contentPane.add(CourseButton, gbc_CourseButton);

        JButton BACKButton = new JButton("بازگشت");
        BACKButton.setFont(new Font("B Compset", Font.PLAIN, 24));
        BACKButton.setBackground(new Color(244, 164, 96));
        GridBagConstraints gbc_BACKButton = new GridBagConstraints();
        gbc_BACKButton.fill = GridBagConstraints.BOTH;
        gbc_BACKButton.gridx = 0;
        gbc_BACKButton.gridy = 4;
        contentPane.add(BACKButton, gbc_BACKButton);
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.home.setVisible(true);
                dispose();
            }
        });
        StudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new AllStudentsInf();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        CourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new AllCoursesInf();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });


    }

}
