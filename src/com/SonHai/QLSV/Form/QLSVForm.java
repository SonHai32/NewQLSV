package com.SonHai.QLSV.Form;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class QLSVForm extends JFrame {

    private JPanel searchPanel;
    private JPanel optionsPanel;
    private JLabel headerLabel;
    private JLabel searchLaybel;
    private JTextField searchField;
    private JButton btnXuatDanhSach;
    private JButton btnThem;
    private JButton btnXoa;
    private JButton btnSua;


    public void setUI(){

        ImageIcon searchIcon = new ImageIcon("src/image/search_16px.png");

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

        searchLaybel = new JLabel(searchIcon);
        searchField = new JTextField(20);

        searchPanel = new JPanel();
       // searchPanel.setLayout(new GridLayout(1,2));
        searchPanel.setSize(600,100);
        searchPanel.add(searchLaybel);
        searchPanel.add(searchField);

        optionsPanel = new JPanel();
        optionsPanel.setSize(100,100);
        optionsPanel.setLayout(new GridLayout(2,3,10,10));
       // optionsPanel.add(headerLabel);
        optionsPanel.add(btnXuatDanhSach);
        optionsPanel.add(btnThem);
        optionsPanel.add(btnXoa);
        optionsPanel.add(btnSua);

        setSize(600,600);
        //pack();
        //setLayout(new GridLayout(2,1));
        this.add(searchPanel,BorderLayout.NORTH);
        this.add(optionsPanel,BorderLayout.CENTER);
        setBackground(Color.cyan);
        getRootPane().setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.GREEN,Color.cyan));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}
