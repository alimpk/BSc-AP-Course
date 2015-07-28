package Graphic;

import Controls.ValidateInput;
import Science.Added;
import Science.Course;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Alimpk on 8/4/2015.
 */
public class StudentAdded extends JFrame{
    String StudentID;
    private JPanel contentPane;
    private String headers[];
    private JTable table;
    StudentAdded(String StudentID) throws FileNotFoundException {
        setUndecorated(true);

        setAlwaysOnTop(true);
        setType(Window.Type.UTILITY);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setBounds(center.x-320, center.y-240, 800, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 248, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{17, 0, 0, 0, 0, 0, 0, 0, -124, 77, 26, 0, 0};
        gbl_contentPane.rowHeights = new int[]{40, 0, 40, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 222, 173));
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.gridwidth = 12;
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 0;
        contentPane.add(panel, gbc_panel);

        JLabel lblNewLabel = new JLabel("اطلاعات جامع دانشجویان");
        lblNewLabel.setFont(new Font("B Homa", Font.PLAIN, 24));
        panel.add(lblNewLabel);

        table = new JTable();
        table.setEnabled(false);
        table.setRowHeight(24);
        table.setForeground(new Color(72, 61, 139));
        table.setFont(new Font("Dialog", Font.PLAIN, 16));
        table.setBackground(new Color(255, 240, 245));
        GridBagConstraints gbc_table = new GridBagConstraints();
        gbc_table.gridwidth = 7;
        gbc_table.insets = new Insets(0, 0, 0, 5);
        gbc_table.fill = GridBagConstraints.BOTH;
        gbc_table.gridx = 3;
        gbc_table.gridy = 5;
        contentPane.add(table, gbc_table);


        JScrollPane scrollBar = new JScrollPane(table);
        scrollBar.setPreferredSize(new Dimension(480, 400));
        scrollBar.setBackground(new Color(255, 245, 238));
        scrollBar.setForeground(new Color(0, 0, 255));
        scrollBar.setFont(new Font("Dialog", Font.PLAIN, 12));
        GridBagConstraints gbc_scrollBar = new GridBagConstraints();
        gbc_scrollBar.weightx = 100.0;
        gbc_scrollBar.gridwidth = 10;
        gbc_scrollBar.fill = GridBagConstraints.BOTH;
        gbc_scrollBar.insets = new Insets(0, 0, 5, 5);
        gbc_scrollBar.gridx = 1;
        gbc_scrollBar.gridy = 1;
        contentPane.add(scrollBar, gbc_scrollBar);


        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        headers = new String[] { "ردیف", "   کد درس", "ترم اخذ","نمره"
        };


        table.setModel(dtm);

        JButton BACK = new JButton("بازگشت");
        BACK.setBackground(new Color(173, 216, 230));
        BACK.setForeground(new Color(34, 139, 34));
        BACK.setFont(new Font("B Homa", Font.PLAIN, 24));
        BACK.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        GridBagConstraints gbc_BACK = new GridBagConstraints();
        gbc_BACK.fill = GridBagConstraints.BOTH;
        gbc_BACK.gridwidth = 12;
        gbc_BACK.insets = new Insets(0, 0, 0, 5);
        gbc_BACK.gridx = 0;
        gbc_BACK.gridy = 2;
        contentPane.add(BACK, gbc_BACK);


        dtm.setColumnIdentifiers(headers);
        Scanner read = new Scanner(Added.added);
        String cid;

        String sID;
        String Term;
        String grade;

        int counter = 1;

        while (read.hasNext()){
            sID=read.next();
            if (sID.equalsIgnoreCase(StudentID)) {

                cid = read.next();
                Term = read.next();
                grade = read.next();


                dtm.addRow(new Object[]{counter++, cid,  Term, grade});

            }
        }


        BACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
