package com.SonHai.QLSV.Form;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class QLSVForm extends JFrame {

    private JPanel optionsPanel;
    private JLabel headerLabel;
    private JButton btnXuatDanhSach;
    private JButton btnThem;
    private JButton btnXoa;
    private JButton btnSua;

    public void setUI(){
        //headerPanel = new JPanel();
        headerLabel = new JLabel("QLSV APPLICATION", JLabel.CENTER);

        headerLabel.setForeground(Color.BLACK);
        headerLabel.setText("<html> <h1><font color='red'>QLSV APPLICATION</font></h1></html>") ;

        //headerLabel.setFont(new Font("Serif",Font.PLAIN,17));
        //headerLabel.setForeground(Color.DARK_GRAY);
        //headerLabel.setForeground(Color.GREEN);


        btnXuatDanhSach = new JButton("Xuất Danh Danh Sinh Viên");
        btnThem = new JButton("Thêm Sinh Viên ");
        btnXoa = new JButton("Xoa");
        btnSua = new JButton("Sua");

        optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(5,1,5,5));
        optionsPanel.add(headerLabel);
        optionsPanel.add(btnXuatDanhSach);
        optionsPanel.add(btnThem);
        optionsPanel.add(btnXoa);
        optionsPanel.add(btnSua);

        this.add(optionsPanel);
        setSize(600,600);
        setBackground(Color.cyan);
        getRootPane().setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.GREEN,Color.cyan));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}
