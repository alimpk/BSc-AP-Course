package Graphic;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame {
    private JPanel contentPane;
    About(){
        Point center=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setUndecorated(true);
        MainFrame.home.setVisible(false);
        setType(Type.UTILITY);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(center.x-320, center.y-240, 800, 480);
        contentPane = new JPanel();
        contentPane.setForeground(new Color(25, 25, 112));
        contentPane.setBackground(new Color(240, 248, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[] {30, 30, 75, 30};
        gbl_contentPane.rowHeights = new int[] {40, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
        contentPane.setLayout(gbl_contentPane);

        JPanel headPanel = new JPanel();
        headPanel.setBackground(new Color(255, 222, 173));
        GridBagConstraints gbc_headPanel = new GridBagConstraints();
        gbc_headPanel.gridwidth = 4;
        gbc_headPanel.insets = new Insets(0, 0, 5, 0);
        gbc_headPanel.fill = GridBagConstraints.BOTH;
        gbc_headPanel.gridx = 0;
        gbc_headPanel.gridy = 0;
        contentPane.add(headPanel, gbc_headPanel);

        JLabel lblNewLabel = new JLabel("درباره ما");
        lblNewLabel.setFont(new Font("B Homa", Font.PLAIN, 24));
        headPanel.add(lblNewLabel);



        JLabel lbl1 = new JLabel("Students Informations Management System");
        lbl1.setForeground(new Color(255, 0, 0));
        lbl1.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl1.setHorizontalAlignment(SwingConstants.LEFT);
        lbl1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl1 = new GridBagConstraints();
        gbc_lbl1.fill = GridBagConstraints.HORIZONTAL;
        gbc_lbl1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl1.gridx = 1;
        gbc_lbl1.gridy = 1;
        contentPane.add(lbl1, gbc_lbl1);

        JLabel lbl10 = new JLabel("سامانه مدیریت امور دانشجویی");
        lbl10.setForeground(new Color(25, 25, 112));
        lbl10.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl10.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbl10.setFont(new Font("B Mitra", Font.PLAIN, 20));
        GridBagConstraints gbc_lbl10 = new GridBagConstraints();
        gbc_lbl10.fill = GridBagConstraints.HORIZONTAL;
        gbc_lbl10.insets = new Insets(0, 0, 5, 5);
        gbc_lbl10.gridx = 2;
        gbc_lbl10.gridy = 1;
        contentPane.add(lbl10, gbc_lbl10);

        JLabel lbl2 = new JLabel("Powered By JavaSE");
        lbl2.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl2.setHorizontalAlignment(SwingConstants.LEFT);
        lbl2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl2 = new GridBagConstraints();
        gbc_lbl2.fill = GridBagConstraints.BOTH;
        gbc_lbl2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl2.gridx = 1;
        gbc_lbl2.gridy = 2;
        contentPane.add(lbl2, gbc_lbl2);

        JLabel lbl11 = new JLabel("پروژه پایان ترم جاوا");
        lbl11.setForeground(new Color(25, 25, 112));
        lbl11.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbl11.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl11.setFont(new Font("B Mitra", Font.PLAIN, 20));
        GridBagConstraints gbc_lbl11 = new GridBagConstraints();
        gbc_lbl11.fill = GridBagConstraints.HORIZONTAL;
        gbc_lbl11.insets = new Insets(0, 0, 5, 5);
        gbc_lbl11.gridx = 2;
        gbc_lbl11.gridy = 2;
        contentPane.add(lbl11, gbc_lbl11);

        JLabel lbl3 = new JLabel("opensourse program (GPL & LGPL)");
        lbl3.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl3.setHorizontalAlignment(SwingConstants.LEFT);
        lbl3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl3 = new GridBagConstraints();
        gbc_lbl3.fill = GridBagConstraints.BOTH;
        gbc_lbl3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl3.gridx = 1;
        gbc_lbl3.gridy = 3;
        contentPane.add(lbl3, gbc_lbl3);

        JLabel lbl12 = new JLabel("دانشگاه صنعتی همدان");
        lbl12.setForeground(new Color(25, 25, 112));
        lbl12.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbl12.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl12.setFont(new Font("B Mitra", Font.PLAIN, 20));
        GridBagConstraints gbc_lbl12 = new GridBagConstraints();
        gbc_lbl12.fill = GridBagConstraints.HORIZONTAL;
        gbc_lbl12.insets = new Insets(0, 0, 5, 5);
        gbc_lbl12.gridx = 2;
        gbc_lbl12.gridy = 3;
        contentPane.add(lbl12, gbc_lbl12);

        JLabel lbl4 = new JLabel("develped By Rm00D");
        lbl4.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl4.setHorizontalAlignment(SwingConstants.LEFT);
        lbl4.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl4 = new GridBagConstraints();
        gbc_lbl4.fill = GridBagConstraints.BOTH;
        gbc_lbl4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl4.gridx = 1;
        gbc_lbl4.gridy = 4;
        contentPane.add(lbl4, gbc_lbl4);

        JLabel lbl5 = new JLabel("created By JSF Tools\r\n");
        lbl5.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl5.setHorizontalAlignment(SwingConstants.LEFT);
        lbl5.setForeground(new Color(0, 0, 0));
        lbl5.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl5 = new GridBagConstraints();
        gbc_lbl5.fill = GridBagConstraints.BOTH;
        gbc_lbl5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl5.gridx = 1;
        gbc_lbl5.gridy = 5;
        contentPane.add(lbl5, gbc_lbl5);

        JLabel logo2 = new JLabel("");
        logo2.setBackground(new Color(224, 255, 255));
        logo2.setIcon(new ImageIcon("logo/CIT00.jpg"));
        GridBagConstraints gbc_logo2 = new GridBagConstraints();
        gbc_logo2.fill = GridBagConstraints.VERTICAL;
        gbc_logo2.gridheight = 3;
        gbc_logo2.insets = new Insets(0, 0, 5, 5);
        gbc_logo2.gridx = 2;
        gbc_logo2.gridy = 7;
        contentPane.add(logo2, gbc_logo2);

        JLabel lbl6 = new JLabel("Design:Ali Mohammadpour ( Rm00D@Alimpk )");
        lbl6.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl6.setHorizontalAlignment(SwingConstants.LEFT);
        lbl6.setForeground(new Color(34, 139, 34));
        lbl6.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl6 = new GridBagConstraints();
        gbc_lbl6.fill = GridBagConstraints.BOTH;
        gbc_lbl6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl6.gridx = 1;
        gbc_lbl6.gridy = 7;
        contentPane.add(lbl6, gbc_lbl6);

        JLabel lbl7 = new JLabel("Mail : Alimpk@outlook.com");
        lbl7.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl7.setHorizontalAlignment(SwingConstants.LEFT);
        lbl7.setForeground(new Color(34, 139, 34));
        lbl7.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl7 = new GridBagConstraints();
        gbc_lbl7.fill = GridBagConstraints.BOTH;
        gbc_lbl7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl7.gridx = 1;
        gbc_lbl7.gridy = 8;
        contentPane.add(lbl7, gbc_lbl7);

        JLabel ligo3 = new JLabel("");
        ligo3.setBackground(new Color(224, 255, 255));
        ligo3.setIcon(new ImageIcon("logo/Rm00D.jpg"));
        GridBagConstraints gbc_ligo3 = new GridBagConstraints();
        gbc_ligo3.gridheight = 3;
        gbc_ligo3.insets = new Insets(0, 0, 5, 5);
        gbc_ligo3.gridx = 2;
        gbc_ligo3.gridy = 10;
        contentPane.add(ligo3, gbc_ligo3);

        JLabel lbl8 = new JLabel("for get program sourse code send mail to me");
        lbl8.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl8.setHorizontalAlignment(SwingConstants.LEFT);
        lbl8.setForeground(new Color(72, 61, 139));
        lbl8.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl8 = new GridBagConstraints();
        gbc_lbl8.anchor = GridBagConstraints.SOUTHWEST;
        gbc_lbl8.insets = new Insets(0, 0, 5, 5);
        gbc_lbl8.gridx = 1;
        gbc_lbl8.gridy = 10;
        contentPane.add(lbl8, gbc_lbl8);

        JLabel lbl9 = new JLabel("The world is opensourse think opensourse && be open Mind ");
        lbl9.setHorizontalTextPosition(SwingConstants.LEFT);
        lbl9.setHorizontalAlignment(SwingConstants.LEFT);
        lbl9.setForeground(new Color(72, 61, 139));
        lbl9.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        GridBagConstraints gbc_lbl9 = new GridBagConstraints();
        gbc_lbl9.fill = GridBagConstraints.HORIZONTAL;
        gbc_lbl9.insets = new Insets(0, 0, 5, 5);
        gbc_lbl9.gridx = 1;
        gbc_lbl9.gridy = 11;
        contentPane.add(lbl9, gbc_lbl9);

        JButton BACK = new JButton("بازگشت");
        BACK.setBackground(new Color(255, 192, 203));
        BACK.setForeground(new Color(34, 139, 34));
        BACK.setFont(new Font("B Homa", Font.PLAIN, 24));
        BACK.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        GridBagConstraints gbc_BACK = new GridBagConstraints();
        gbc_BACK.fill = GridBagConstraints.BOTH;
        gbc_BACK.gridwidth = 4;
        gbc_BACK.gridx = 0;
        gbc_BACK.gridy = 13;
        contentPane.add(BACK, gbc_BACK);
        BACK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainFrame.home.setVisible(true);
            }
        });

    }
}
