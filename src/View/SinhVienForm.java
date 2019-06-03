package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import Controller.DAOSinhVien;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class SinhVienForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tbSinhVien;
    private JTextField fldId;
    private JLabel lblMaSinhVien;
    private JTextField fldMaSinhVien;
    private JLabel lblHoTen;
    private JTextField fldHoTen;
    private JLabel lblGioiTinh;
    private JLabel lblNgaySinh;
    private JTextField fldNgaySinh;
    private JTextField fldNgaySinh_1;
    private JLabel lblNoiSinh;
    private JTextField fldNoiSinh;
    private JLabel lblKhoa;
    private JTextField fldKhoa;
    private JComboBox<String> cbLuaChon;
    private JComboBox<String> ccbGioiTinh;
    private DefaultTableModel model  ;
    private ArrayList<Model.SinhVien> listSinhVien;




    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SinhVienForm frame = new SinhVienForm();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public SinhVienForm() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        setContentPane(contentPane);
        setResizable(false);
        setLocationRelativeTo(null);
        initComponent();
        showTable();

    }
    public void showTable() {
        listSinhVien = new DAOSinhVien().getListSinhVien("SELECT * FROM sinhvien ORDER BY hotensv DESC");
        model = (DefaultTableModel) tbSinhVien.getModel();
        listSinhVien.forEach((s) ->{
            model.addRow(new Object[] {
                    s.getID(), s.getMaSinhVien() , s.getHoTen() , s.getNgaySinh(),
                    s.getGioiTinh() , s.getNoiSinh() , s.getMaLop()
            });
        });


        tbSinhVien.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbSinhVien.getColumnModel().getColumn(1).setPreferredWidth(20);
        tbSinhVien.getColumnModel().getColumn(2).setPreferredWidth(40);
        tbSinhVien.getColumnModel().getColumn(3).setPreferredWidth(20);
        tbSinhVien.getColumnModel().getColumn(4).setPreferredWidth(20);
        tbSinhVien.getColumnModel().getColumn(5).setPreferredWidth(20);
        tbSinhVien.getColumnModel().getColumn(6).setPreferredWidth(20);
        tbSinhVien.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }

    public void initComponent() {

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.CYAN);
        topPanel.setBorder(new EmptyBorder(1,1,1,1));

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(244,255,255));

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(topPanel, GroupLayout.PREFERRED_SIZE, 894, Short.MAX_VALUE)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(topPanel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        JPanel mainFieldPanel = new JPanel();
        mainFieldPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
        gl_mainPanel.setHorizontalGroup(
                gl_mainPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_mainPanel.createSequentialGroup()
                                .addComponent(mainFieldPanel, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
        gl_mainPanel.setVerticalGroup(
                gl_mainPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_mainPanel.createSequentialGroup()
                                .addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING, false)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mainFieldPanel, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
                                )
                        ));

        tbSinhVien = new JTable();
        tbSinhVien.setGridColor(new Color(255,255,255));
        tbSinhVien.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
        tbSinhVien.setRowHeight(30);
        tbSinhVien.setRowMargin(5);
        tbSinhVien.setShowHorizontalLines(false);
        tbSinhVien.setShowVerticalLines(false);
        tbSinhVien.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String[] {
                        "ID" , "Mã SV" , "Họ Tên" , "Ngày Sinh" , "Giới Tính" ,
                        "Nơi Sinh" , "Lớp"
                }
        ));



        scrollPane.setViewportView(tbSinhVien);

        JLabel lblThongTinSinhVien = new JLabel("Th\u00F4ng Tin Sinh Vi\u00EAn");
        lblThongTinSinhVien.setFont(new Font("serif",Font.BOLD|Font.ITALIC,16));

        JLabel lblId = new JLabel();
        lblId.setText("ID");
        lblId.setForeground(Color.BLUE);
        lblId.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));

        fldId = new JTextField();
        fldId.setEnabled(false);
        fldId.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        lblMaSinhVien = new JLabel();
        lblMaSinhVien.setText("Mã Sinh Viên");
        lblMaSinhVien.setForeground(Color.BLUE);
        lblMaSinhVien.setFont(new Font("serif",Font.BOLD | Font.ITALIC , 15));

        fldMaSinhVien = new JTextField();
        fldMaSinhVien.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        lblHoTen = new JLabel();
        lblHoTen.setText("Họ và Tên");
        lblHoTen.setFont(new Font("serif",Font.BOLD | Font.ITALIC,15));
        lblHoTen.setForeground(Color.BLUE);

        fldHoTen = new JTextField();
        fldHoTen.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        lblGioiTinh = new JLabel();
        lblGioiTinh.setText("Giới Tính");
        lblGioiTinh.setForeground(Color.BLUE);
        lblGioiTinh.setFont(new Font("serif",Font.BOLD | Font.ITALIC,15));

        ccbGioiTinh = new JComboBox<String>();
        ccbGioiTinh.addItem("Nam");
        ccbGioiTinh.addItem("Nữ");
        //ccbGioiTinh.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));


        lblNgaySinh = new JLabel();
        lblNgaySinh.setText("Ngày Sinh");
        lblNgaySinh.setForeground(Color.BLUE);
        lblNgaySinh.setFont(new Font("serif",Font.BOLD | Font.ITALIC , 15));

        fldNgaySinh = new JTextField();
        fldNgaySinh.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        lblNoiSinh = new JLabel();
        lblNoiSinh.setText("Nơi Sinh");
        lblNoiSinh.setForeground(Color.BLUE);
        lblNoiSinh.setFont(new Font("serif",Font.BOLD | Font.ITALIC , 15));

        fldNoiSinh = new JTextField();
        fldNoiSinh.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        fldNgaySinh_1 = new JTextField();
        fldNgaySinh_1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        lblKhoa = new JLabel();
        lblKhoa.setText("Khoa");
        lblKhoa.setForeground(Color.BLUE);
        lblKhoa.setFont(new Font("serif",Font.BOLD | Font.ITALIC , 15));

        fldKhoa = new JTextField();
        fldKhoa.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

        cbLuaChon = new JComboBox<String>();
        cbLuaChon.addItem("Thêm");
        cbLuaChon.addItem("Sửa");
        cbLuaChon.addItem("Xóa");


        GroupLayout gl_mainFieldPanel = new GroupLayout(mainFieldPanel);
        gl_mainFieldPanel.setHorizontalGroup(
                gl_mainFieldPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_mainFieldPanel.createSequentialGroup()
                                .addGap(70)
                                .addComponent(lblThongTinSinhVien, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(fldId, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaSinhVien, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(fldMaSinhVien, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(fldNgaySinh_1, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNoiSinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(fldNoiSinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblKhoa, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addGroup(gl_mainFieldPanel.createParallelGroup(Alignment.TRAILING)
                                .addComponent(cbLuaChon, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(fldKhoa, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
                        .addComponent(fldHoTen, GroupLayout.DEFAULT_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ccbGioiTinh, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        );
        gl_mainFieldPanel.setVerticalGroup(
                gl_mainFieldPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_mainFieldPanel.createSequentialGroup()
                                .addComponent(lblThongTinSinhVien)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fldId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(lblMaSinhVien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fldMaSinhVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblHoTen, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fldHoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(lblGioiTinh)
                                .addGap(4)
                                .addComponent(ccbGioiTinh, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fldNgaySinh_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblNoiSinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fldNoiSinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblKhoa)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fldKhoa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(cbLuaChon, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        mainFieldPanel.setLayout(gl_mainFieldPanel);
        mainPanel.setLayout(gl_mainPanel);

        JLabel lblIconSinhVien = new JLabel("");
        lblIconSinhVien.setIcon(new ImageIcon(getClass().getResource("/images/student_50px.png")));
        JLabel lblSinhVien = new JLabel("Sinh Viên ");
        lblSinhVien.setFont(new Font("serif",Font.BOLD| Font.ITALIC,20));
        lblSinhVien.setForeground(Color.RED);
        lblSinhVien.setHorizontalAlignment(SwingConstants.CENTER);
        GroupLayout gl_topPanel = new GroupLayout(topPanel);
        gl_topPanel.setHorizontalGroup(
                gl_topPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_topPanel.createSequentialGroup()
                                .addGroup(gl_topPanel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_topPanel.createSequentialGroup()
                                                .addGap(425)
                                                .addComponent(lblIconSinhVien, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addGap(425))
                                        .addGroup(gl_topPanel.createSequentialGroup()
                                                .addGap(350)
                                                .addComponent(lblSinhVien, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(350, Short.MAX_VALUE))
        );
        gl_topPanel.setVerticalGroup(
                gl_topPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_topPanel.createSequentialGroup()
                                .addGap(5)
                                .addComponent(lblIconSinhVien, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(lblSinhVien, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addContainerGap())
        );
        topPanel.setLayout(gl_topPanel);
        contentPane.setLayout(gl_contentPane);

    }
}

