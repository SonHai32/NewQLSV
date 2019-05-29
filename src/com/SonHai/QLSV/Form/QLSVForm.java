package com.SonHai.QLSV.Form;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

public class QLSVForm extends JFrame {

    private JPanel contentPane;
    private JTextField searchField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QLSVForm frame = new QLSVForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public QLSVForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 250, 1250, 600);
        contentPane = new JPanel();
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        setResizable(false);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.CYAN);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(224, 255, 255));
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
                                        .addComponent(mainPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(topPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(topPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        )
        );

        JPanel sinhVienPanel = new JPanel();

        JPanel bangDiemPanel = new JPanel();

        JPanel lopHocPanel = new JPanel();

        JPanel monHocPanel = new JPanel();

        JPanel thongTinPanel = new JPanel();

        JPanel khoaPanel = new JPanel();
        GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
        gl_mainPanel.setHorizontalGroup(
                gl_mainPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_mainPanel.createSequentialGroup()
                                .addGap(90)
                                .addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(gl_mainPanel.createSequentialGroup()
                                                .addComponent(monHocPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addGap(150)
                                                .addComponent(khoaPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addGap(150)
                                                .addComponent(thongTinPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_mainPanel.createSequentialGroup()
                                                .addComponent(sinhVienPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addGap(150)
                                                .addComponent(bangDiemPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                .addGap(150)
                                                .addComponent(lopHocPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))))
        );
        gl_mainPanel.setVerticalGroup(
                gl_mainPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_mainPanel.createSequentialGroup()
                                .addGap(50)
                                .addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lopHocPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bangDiemPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sinhVienPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                //.addPreferredGap(ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                                .addGap(50)
                                .addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(monHocPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(khoaPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(thongTinPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                                .addGap(250))
        );
        GroupLayout gl_thongTinPanel = new GroupLayout(thongTinPanel);
        gl_thongTinPanel.setHorizontalGroup(
                gl_thongTinPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        gl_thongTinPanel.setVerticalGroup(
                gl_thongTinPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        thongTinPanel.setLayout(gl_thongTinPanel);
        GroupLayout gl_khoaPanel = new GroupLayout(khoaPanel);
        gl_khoaPanel.setHorizontalGroup(
                gl_khoaPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        gl_khoaPanel.setVerticalGroup(
                gl_khoaPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        khoaPanel.setLayout(gl_khoaPanel);
        GroupLayout gl_monHocPanel = new GroupLayout(monHocPanel);
        gl_monHocPanel.setHorizontalGroup(
                gl_monHocPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        gl_monHocPanel.setVerticalGroup(
                gl_monHocPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        monHocPanel.setLayout(gl_monHocPanel);
        GroupLayout gl_lopHocPanel = new GroupLayout(lopHocPanel);
        gl_lopHocPanel.setHorizontalGroup(
                gl_lopHocPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        gl_lopHocPanel.setVerticalGroup(
                gl_lopHocPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        lopHocPanel.setLayout(gl_lopHocPanel);
        GroupLayout gl_bangDiemPanel = new GroupLayout(bangDiemPanel);
        gl_bangDiemPanel.setHorizontalGroup(
                gl_bangDiemPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        gl_bangDiemPanel.setVerticalGroup(
                gl_bangDiemPanel.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        bangDiemPanel.setLayout(gl_bangDiemPanel);

        JLabel lblNewLabel = new JLabel("New label");
        GroupLayout gl_sinhVienPanel = new GroupLayout(sinhVienPanel);
        gl_sinhVienPanel.setHorizontalGroup(
                gl_sinhVienPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_sinhVienPanel.createSequentialGroup()
                                .addContainerGap(75, Short.MAX_VALUE)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addGap(73))
        );
        gl_sinhVienPanel.setVerticalGroup(
                gl_sinhVienPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_sinhVienPanel.createSequentialGroup()
                                .addGap(26)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(134, Short.MAX_VALUE))
        );
        sinhVienPanel.setLayout(gl_sinhVienPanel);
        mainPanel.setLayout(gl_mainPanel);

        JPanel searchPanel = new JPanel();
        searchPanel.setBackground(Color.CYAN);

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.CYAN);
        GroupLayout gl_topPanel = new GroupLayout(topPanel);
        gl_topPanel.setHorizontalGroup(
                gl_topPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_topPanel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, 561, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(342, Short.MAX_VALUE))
        );
        gl_topPanel.setVerticalGroup(
                gl_topPanel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_topPanel.createSequentialGroup()
                                .addContainerGap(91, Short.MAX_VALUE)
                                .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                        .addGroup(Alignment.LEADING, gl_topPanel.createSequentialGroup()
                                .addGap(20)
                                .addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );

        JLabel headerIconLabel = new JLabel("New label");
        headerIconLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\student_50px.png"));

        JLabel lblQunLSinh = new JLabel("Qu\u1EA3n L\u00FD Sinh Vi\u00EAn");
        lblQunLSinh.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblQunLSinh.setForeground(Color.RED);
        lblQunLSinh.setHorizontalAlignment(SwingConstants.CENTER);
        GroupLayout gl_headerPanel = new GroupLayout(headerPanel);
        gl_headerPanel.setHorizontalGroup(
                gl_headerPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_headerPanel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(headerIconLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(lblQunLSinh, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_headerPanel.setVerticalGroup(
                gl_headerPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_headerPanel.createSequentialGroup()
                                .addGap(55)
                                .addGroup(gl_headerPanel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(headerIconLabel)
                                        .addComponent(lblQunLSinh, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(70, Short.MAX_VALUE))
        );
        headerPanel.setLayout(gl_headerPanel);

        JLabel searchIconLabel = new JLabel("New label");
        searchIconLabel.setIcon(new ImageIcon("src/img/:search_50px.png"));

        searchField = new JTextField();
        searchField.setBackground(Color.CYAN);
        searchField.setColumns(10);
        searchField.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
        GroupLayout gl_searchPanel = new GroupLayout(searchPanel);
        gl_searchPanel.setHorizontalGroup(
                gl_searchPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_searchPanel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchIconLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(searchField, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(47, Short.MAX_VALUE))
        );
        gl_searchPanel.setVerticalGroup(
                gl_searchPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_searchPanel.createSequentialGroup()
                                .addContainerGap(52, Short.MAX_VALUE)
                                .addGroup(gl_searchPanel.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(searchField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchIconLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                                .addGap(2))
        );
        searchPanel.setLayout(gl_searchPanel);
        topPanel.setLayout(gl_topPanel);
        contentPane.setLayout(gl_contentPane);
    }
}
