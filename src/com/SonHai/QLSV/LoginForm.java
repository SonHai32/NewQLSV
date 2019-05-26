package com.SonHai.QLSV;
import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame{
    private JPanel loginPanel ;
    private JLabel usernameLabel ;
    private JLabel passwordLabel ;
    private JTextField usernameTextField ;
    private JPasswordField passwordField;
    private JButton btnOK;

    public void setUI(){
        usernameLabel = new JLabel("Username",JLabel.RIGHT);
        passwordLabel = new JLabel("Password",JLabel.RIGHT);

        usernameLabel.setLabelFor(usernameTextField);
        passwordLabel.setLabelFor(passwordField);

        usernameTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*');

        btnOK = new JButton("OK");

        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3,2,5,5));
        loginPanel.setSize(300,150);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(btnOK);

        this.getRootPane().setBorder(BorderFactory.createMatteBorder(10,10,10,10,Color.GREEN));
        this.add(loginPanel);
        this.setSize(350,200);
       // this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println(usernameLabel.getSize());








    }
}
