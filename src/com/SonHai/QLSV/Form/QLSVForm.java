package com.SonHai.QLSV.Form;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class QLSVForm extends JFrame {

    private JPanel headerAndSearchPanel;
    private JPanel optionsPanel;
    private JLabel headerLabel;
    private JLabel searchLaybel;
    private JTextField searchField;
    private JButton btnSinhVien;
    private JButton btnLopHoc;
    private JButton btnBangDiem;
    private JButton btnMonHoc;
    private JButton btnKhoa;
    private JButton btnThongTin;

    public QLSVForm(){
        setUI();
    }

    private void setUI(){

        ImageIcon searchIcon = new ImageIcon("src/image/search_16px.png");
        ImageIcon studentIcon = new ImageIcon("src/image/student_64px.png");

        headerLabel = new JLabel("QLSV APPLICATION", JLabel.LEFT);
        headerLabel.setForeground(Color.BLACK);
        headerLabel.setText("<html> <h1><font color='red'>QLSV APPLICATION</font></h1></html>") ;

        //headerLabel.setFont(new Font("Serif",Font.PLAIN,17));
        //headerLabel.setForeground(Color.DARK_GRAY);
        //headerLabel.setForeground(Color.GREEN);


        btnSinhVien = new JButton("Sinh Viên",studentIcon);
        btnSinhVien.setHorizontalAlignment(SwingConstants.LEFT);
        btnSinhVien.setFont(new Font("Yu Gothic UI Light",Font.BOLD | Font.ITALIC,16));
        btnSinhVien.setBackground(Color.cyan);
        btnSinhVien.setForeground(Color.GREEN);
        btnLopHoc = new JButton("Lớp Học");
        btnKhoa= new JButton("Khoa");
        btnBangDiem = new JButton("Bảng Điểm");
        btnMonHoc = new JButton("Môn Học");
        btnThongTin = new JButton("Thông Tin");



        searchLaybel = new JLabel(searchIcon);
        searchField = new JTextField(20);

        headerAndSearchPanel = new JPanel();

        optionsPanel = new JPanel();

        GroupLayout mainGroupLayout = new GroupLayout(getContentPane());
        mainGroupLayout.setHorizontalGroup(
                mainGroupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(mainGroupLayout.createSequentialGroup()
                       // .addContainerGap(800,Short.MAX_VALUE)
                            .addGap(160)
                        .addComponent(btnSinhVien , GroupLayout.PREFERRED_SIZE,190,GroupLayout.PREFERRED_SIZE))


        );

        mainGroupLayout.setVerticalGroup(
                mainGroupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(mainGroupLayout.createSequentialGroup()

                            .addComponent(btnSinhVien , GroupLayout.PREFERRED_SIZE,150,GroupLayout.PREFERRED_SIZE)
                           // .addContainerGap(800,Short.MAX_VALUE))

        ));


        setBounds(100,100,900,600);
        getContentPane().setLayout(mainGroupLayout);
        setBackground(Color.cyan);
        getRootPane().setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.GREEN,Color.cyan));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}
