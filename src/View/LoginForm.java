package com.SonHai.QLSV.Form;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {

    private JPanel loginPanel ;
    private JPanel btnPanel;
    private JLabel usernameLabel ;
    private JLabel passwordLabel ;
    private JTextField usernameTextField ;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private ImageIcon errorIcon,userIcon,passIcon,frameIcon;
    private Image frameImage;

    public void setUI(){

        errorIcon = new ImageIcon("src/image/ERROR.png");
        userIcon = new ImageIcon("src/image/user_16px.png");
        passIcon = new ImageIcon("src/image/password_16px.png");
        frameIcon = new ImageIcon("src/image/enter_2_24px.png");
        frameImage = frameIcon.getImage();

        btnPanel = new JPanel();
        btnLogin = new JButton("LOGIN");
        btnLogin.addActionListener(this);

        usernameLabel = new JLabel("Username",userIcon,JLabel.CENTER);
        passwordLabel = new JLabel("Password",passIcon,JLabel.CENTER);

        usernameLabel.setLabelFor(usernameTextField);
        passwordLabel.setLabelFor(passwordField);

        usernameTextField = new JTextField(20);
        passwordField = new JPasswordField(20);

        usernameTextField.setBackground(Color.cyan);
        usernameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        passwordField.setBackground(Color.cyan);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        btnPanel.setBackground(new Color(0,0,0,25));
        btnPanel.add(btnLogin);

        loginPanel = new JPanel();
        loginPanel.setOpaque(true);
        loginPanel.setBackground(new Color(0,0,0,25));
        loginPanel.setLayout(new GridLayout(2,2 ,5,5));
        //loginPanel.setSize(300,30);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        this.setTitle("Login to QLSV");
        this.setIconImage(frameImage);
        this.setLayout(new GridLayout(2,1));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(6,6,6,6,Color.GREEN));
        this.add(loginPanel,BorderLayout.CENTER);
        this.add(btnPanel,BorderLayout.CENTER);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        long username = usernameTextField.getText().hashCode();
        long password = passwordField.getText().hashCode();

        if(username == -1943733835 && password == 948877636){
            JOptionPane.showMessageDialog(this,"Done");//Change after
        }
        else{

            JOptionPane.showMessageDialog(this,"Password Incorrect","Login Fail",JOptionPane.ERROR_MESSAGE,errorIcon);
        }

    }
}
