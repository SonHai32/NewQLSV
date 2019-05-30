package com.SonHai.QLSV.Form;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;

public class QLSVForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchField;
	private JLabel lblSinhVien;
	private JPanel topPanel;
	private JPanel mainPanel;
	private JPanel sinhVienPanel;
	private JPanel bangDiemPanel;
	private JLabel lblIconBangDiem;
	private JLabel lblBangDiem;
	private JPanel lopHocPanel;
	private JLabel lblIconLopHoc;
	private JLabel lblLopHoc;
	private JPanel monHocPanel;
	private JLabel lblIconMonHoc;
	private JLabel lblMonHoc;
	private JPanel khoaPanel;
	private JLabel lblIconKhoa;
	private JLabel lblKhoa;
	private JPanel thongTinPanel;
	private JLabel lblIconThongTin;
	private JLabel lblThongTin;
	private JLabel lblIconSinhVien;
	private JPanel searchPanel;
	private JPanel headerPanel;
	private JLabel headerIconLabel;
	private JLabel searchIconLabel;


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

	public QLSVForm() {
		setTitle("Quản Lý Sinh Viên");
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 250, 900,650);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		setResizable(false);

		topPanel = new JPanel();
		topPanel.setBackground(Color.CYAN);

		mainPanel = new JPanel();
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

		sinhVienPanel = new JPanel();
		sinhVienPanel.setBackground(new Color(127, 255, 212));
		sinhVienPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		bangDiemPanel = new JPanel();
		bangDiemPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		bangDiemPanel.setBackground(new Color(127, 255, 212));

		lblIconBangDiem = new JLabel("");
		lblIconBangDiem.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\Score_50px.png"));

		lblBangDiem = new JLabel("B\u1EA3ng \u0110i\u1EC3m");
		lblBangDiem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBangDiem.setForeground(Color.RED);
		lblBangDiem.setFont(new Font("Serif", Font.BOLD, 20));
		GroupLayout gl_bangDiemPanel = new GroupLayout(bangDiemPanel);
		gl_bangDiemPanel.setHorizontalGroup(
				gl_bangDiemPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_bangDiemPanel.createSequentialGroup()
								.addContainerGap(50, Short.MAX_VALUE)
                                .addGap(50)
								.addComponent(lblIconBangDiem, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(50))
						.addGroup(gl_bangDiemPanel.createSequentialGroup()
                                .addGap(25)
                                .addComponent(lblBangDiem,GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)
                                .addGap(25)
                        )
		);
		gl_bangDiemPanel.setVerticalGroup(
				gl_bangDiemPanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_bangDiemPanel.createSequentialGroup()
								.addGap(40)
								.addComponent(lblIconBangDiem, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblBangDiem, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(20)
                        )
		);
		bangDiemPanel.setLayout(gl_bangDiemPanel);

		lopHocPanel = new JPanel();
		lopHocPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lopHocPanel.setBackground(new Color(127, 255, 212));

		lblIconLopHoc = new JLabel("");
		lblIconLopHoc.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\class_50px.png"));

		lblLopHoc = new JLabel("L\u1EDBp H\u1ECDc");
		lblLopHoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblLopHoc.setForeground(Color.RED);
		lblLopHoc.setFont(new Font("Serif", Font.BOLD, 20));
		GroupLayout gl_lopHocPanel = new GroupLayout(lopHocPanel);
		gl_lopHocPanel.setHorizontalGroup(
				gl_lopHocPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_lopHocPanel.createSequentialGroup()
								.addContainerGap(50, Short.MAX_VALUE)
                                .addGap(50)
								.addComponent(lblIconLopHoc, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(50))
                        .addGroup(gl_lopHocPanel.createSequentialGroup()
                                .addGap(25)
                                .addComponent(lblLopHoc,GroupLayout.DEFAULT_SIZE,100,Short.MAX_VALUE)
                                .addGap(25)
                        )

		);
		gl_lopHocPanel.setVerticalGroup(
				gl_lopHocPanel.createParallelGroup(Alignment.LEADING)

						.addGroup(gl_lopHocPanel.createSequentialGroup()
								.addGap(40)
								.addComponent(lblIconLopHoc, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblLopHoc, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(20)
                        )
		);
		lopHocPanel.setLayout(gl_lopHocPanel);

		monHocPanel = new JPanel();
		monHocPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		monHocPanel.setBackground(new Color(127, 255, 212));

		lblIconMonHoc = new JLabel("");
		lblIconMonHoc.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\book_50px.png"));

		lblMonHoc = new JLabel("M\u00F4n H\u1ECDc");
		lblMonHoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonHoc.setForeground(Color.RED);
		lblMonHoc.setFont(new Font("Serif", Font.BOLD, 20));
		GroupLayout gl_monHocPanel = new GroupLayout(monHocPanel);
		gl_monHocPanel.setHorizontalGroup(
				gl_monHocPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_monHocPanel.createSequentialGroup()
								.addContainerGap(50, Short.MAX_VALUE)
                                .addGap(50)
								.addComponent(lblIconMonHoc, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(50))
                        .addGroup(gl_monHocPanel.createSequentialGroup()
                                .addGap(25)
                                .addComponent(lblMonHoc, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(25)
                        )

		);
		gl_monHocPanel.setVerticalGroup(
				gl_monHocPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_monHocPanel.createSequentialGroup()
								.addGap(40)
								.addComponent(lblIconMonHoc, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblMonHoc, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(20)
                        )
		);
		monHocPanel.setLayout(gl_monHocPanel);

		khoaPanel = new JPanel();
		khoaPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		khoaPanel.setBackground(new Color(127, 255, 212));

		lblIconKhoa = new JLabel("");
		lblIconKhoa.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\Graduationhat_50px.png"));

		lblKhoa = new JLabel("Khoa");
		lblKhoa.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhoa.setForeground(Color.RED);
		lblKhoa.setFont(new Font("Serif", Font.BOLD, 20));
		GroupLayout gl_khoaPanel = new GroupLayout(khoaPanel);
		gl_khoaPanel.setHorizontalGroup(
				gl_khoaPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_khoaPanel.createSequentialGroup()
								.addContainerGap(50, Short.MAX_VALUE)
								.addComponent(lblIconKhoa, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(50))
                        .addGroup(gl_khoaPanel.createSequentialGroup()
                                .addGap(25)
                                .addComponent(lblKhoa, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(25)
                        )

		);
		gl_khoaPanel.setVerticalGroup(
				gl_khoaPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_khoaPanel.createSequentialGroup()
								.addGap(45)
								.addComponent(lblIconKhoa, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblKhoa, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addGap(20)
                        )
		);
		khoaPanel.setLayout(gl_khoaPanel);

		thongTinPanel = new JPanel();
		thongTinPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		thongTinPanel.setBackground(new Color(127, 255, 212));

		lblIconThongTin = new JLabel("");
		lblIconThongTin.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\information_50px.png"));

		lblThongTin = new JLabel("Th\u00F4ng Tin");
		lblThongTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThongTin.setForeground(Color.RED);
		lblThongTin.setFont(new Font("Serif", Font.BOLD, 20));
		GroupLayout gl_thongTinPanel = new GroupLayout(thongTinPanel);
		gl_thongTinPanel.setHorizontalGroup(
				gl_thongTinPanel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_thongTinPanel.createSequentialGroup()
								.addContainerGap(50, Short.MAX_VALUE)
                                .addGap(50)
								.addComponent(lblIconThongTin, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(50))
                        .addGroup(gl_thongTinPanel.createSequentialGroup()
                                .addGap(25)
                                .addComponent(lblThongTin, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(25)
                        )
		);
		gl_thongTinPanel.setVerticalGroup(
				gl_thongTinPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_thongTinPanel.createSequentialGroup()
								.addGap(45)
								.addComponent(lblIconThongTin, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblThongTin, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(20)
                        )
		);
		thongTinPanel.setLayout(gl_thongTinPanel);
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
				gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
								.addGap(110)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(sinhVienPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(monHocPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addGap(110)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(bangDiemPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(khoaPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addGap(110)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lopHocPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(thongTinPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addGap(110))
		);
		gl_mainPanel.setVerticalGroup(
				gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
								.addGap(40)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lopHocPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(bangDiemPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(sinhVienPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addGap(40)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(khoaPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(monHocPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(thongTinPanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addGap(239))
		);

		lblIconSinhVien = new JLabel("");
		lblIconSinhVien.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\student_50px.png"));

		lblSinhVien = new JLabel("Sinh Vi\u00EAn");
		lblSinhVien.setForeground(new Color(255, 0, 0));
		lblSinhVien.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinhVien.setFont(new Font("Serif", Font.BOLD, 20));
		GroupLayout gl_sinhVienPanel = new GroupLayout(sinhVienPanel);
		gl_sinhVienPanel.setHorizontalGroup(
				gl_sinhVienPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_sinhVienPanel.createSequentialGroup()
								.addContainerGap(50, Short.MAX_VALUE)
								.addGap(50)
								.addComponent(lblIconSinhVien, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(50))
						.addGroup(gl_sinhVienPanel.createSequentialGroup()
								.addGap(25)
								.addComponent(lblSinhVien, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
								.addGap(25)
						)
		);
		gl_sinhVienPanel.setVerticalGroup(
				gl_sinhVienPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_sinhVienPanel.createSequentialGroup()
								.addGap(45)
								.addComponent(lblIconSinhVien, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addComponent(lblSinhVien, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addGap(20)
						)
		);
		sinhVienPanel.setLayout(gl_sinhVienPanel);
		mainPanel.setLayout(gl_mainPanel);

		searchPanel = new JPanel();
		searchPanel.setBackground(Color.CYAN);

		headerPanel = new JPanel();
		headerPanel.setBackground(Color.CYAN);

		GroupLayout gl_topPanel = new GroupLayout(topPanel);
		gl_topPanel.setHorizontalGroup(
				gl_topPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_topPanel.createSequentialGroup()
								.addContainerGap()
								.addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, 150 ,GroupLayout.PREFERRED_SIZE)
								.addContainerGap(342, Short.MAX_VALUE))
		);
		gl_topPanel.setVerticalGroup(
				gl_topPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_topPanel.createSequentialGroup()
								.addContainerGap(91, Short.MAX_VALUE)
								.addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_topPanel.createSequentialGroup()
								.addGap(20)
								.addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
		);

		headerIconLabel = new JLabel();
		headerIconLabel.setIcon(new ImageIcon("E:\\icon\\book_50px.png"));

		JLabel lblQunLSinh = new JLabel("Qu\u1EA3n L\u00FD Sinh Vi\u00EAn");
		lblQunLSinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQunLSinh.setForeground(Color.RED);
		lblQunLSinh.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_headerPanel = new GroupLayout(headerPanel);
		gl_headerPanel.setHorizontalGroup(
				gl_headerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_headerPanel.createSequentialGroup()
								.addContainerGap()
								.addComponent(headerIconLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
								.addComponent(lblQunLSinh, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addGap(4))
		);
		gl_headerPanel.setVerticalGroup(
				gl_headerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_headerPanel.createSequentialGroup()
								.addGap(30)
								.addGroup(gl_headerPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblQunLSinh, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(headerIconLabel))
								.addContainerGap(86, Short.MAX_VALUE))
		);
		headerPanel.setLayout(gl_headerPanel);

		searchIconLabel = new JLabel();
		searchIconLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\NewQLSV\\src\\image\\search_50px.png"));

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

