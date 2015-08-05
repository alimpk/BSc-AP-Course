package Graphic;

import Controls.FileControl;
import Controls.ValidateInput;
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
import java.util.Scanner;

/**
 * Created by Alimpk on 8/1/2015.
 */
public class SearchInput extends JDialog{
    private final JPanel contentPanel = new JPanel();
    private static JTextField SearchField;
    public SearchInput() {
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        MainFrame.home.setVisible(false);
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setAlwaysOnTop(true);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        setBounds(center.x-320, center.y-240, 320, 240);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(new Color(240, 248, 255));
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        GridBagLayout gbl_contentPanel = new GridBagLayout();
        gbl_contentPanel.columnWidths = new int[]{70, 180, 70, 0};
        gbl_contentPanel.rowHeights = new int[]{39, 17, 38, 58, 0};
        gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
        contentPanel.setLayout(gbl_contentPanel);

            JPanel Headpanel = new JPanel();
            Headpanel.setBackground(new Color(255, 228, 181));
            GridBagConstraints gbc_Headpanel = new GridBagConstraints();
            gbc_Headpanel.gridwidth = 3;
            gbc_Headpanel.insets = new Insets(0, 0, 5, 0);
            gbc_Headpanel.fill = GridBagConstraints.BOTH;
            gbc_Headpanel.gridx = 0;
            gbc_Headpanel.gridy = 0;
            contentPanel.add(Headpanel, gbc_Headpanel);

                JLabel lblHead = new JLabel("شماره دانشجویی را وارد نمایید");
                lblHead.setFont(new Font("B Mitra", Font.PLAIN, 24));
                Headpanel.add(lblHead);



            SearchField = new JTextField();
            SearchField.setFont(new Font("Dialog", Font.PLAIN, 24));
            SearchField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
            SearchField.setBackground(new Color(135, 206, 250));
            GridBagConstraints gbc_SearchField = new GridBagConstraints();
            gbc_SearchField.fill = GridBagConstraints.BOTH;
            gbc_SearchField.insets = new Insets(0, 0, 5, 5);
            gbc_SearchField.gridx = 1;
            gbc_SearchField.gridy = 2;
            contentPanel.add(SearchField, gbc_SearchField);
            SearchField.setColumns(10);


            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);

                JButton okButton = new JButton("جستوجو");
                okButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                okButton.setBackground(new Color(32, 178, 170));
                okButton.setForeground(new Color(75, 0, 130));
                okButton.setFont(new Font("B Mitra", Font.PLAIN, 24));
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);


                JButton cancelButton = new JButton("انصراف");
                cancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                cancelButton.setBackground(new Color(240, 128, 128));
                cancelButton.setForeground(new Color(75, 0, 130));
                cancelButton.setFont(new Font("B Mitra", Font.PLAIN, 24));
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                        MainFrame.home.setVisible(true);
                    }
                });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               boolean exist=false;

                boolean InputFormat=ValidateInput.isFormatOfStuID(getSID());
                try {
                    exist =FileControl.existStringInFile(Student.student,getSID());
                    }
                catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }

                if (InputFormat==false)
                    ValidateInput.InputErrorDialog("شماره دانشجویی وارد شده معتبر نیست" );
                else if (exist==false)
                    ValidateInput.InputErrorDialog( "دانشجوی مورد نظر ثبت نشده است");

                else {
                    try {
                        new SearchResult(Student.searchResult(getSID()));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    dispose();


                }


            }
        });


    }
    public static String getSID(){
        return SearchField.getText();
    }

}
