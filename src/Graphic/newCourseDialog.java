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

  

}
