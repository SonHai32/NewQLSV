package View;
import java.util.Random;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import Controller.DAOSinhVien;
import Model.SinhVien;
import javafx.scene.control.ContextMenu;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JLabel lblNoiSinh;
	private JTextField fldNoiSinh;
	private JLabel lblMaLop;
	private JTextField fldMaLop;
	private JLabel lblMaKhoa;
	private JTextField fldMaKhoa;
	private JButton btnXacNhan;
	private JComboBox<String> ccbLuaChon;
	private JComboBox<String> ccbGioiTinh;
	private DefaultTableModel model  ;
	private ArrayList<Model.SinhVien> listSinhVien;
	private Random idRandom = new Random();
	/* private JPanel ngaySinhPanel; */
	/*
	 * private JComboBox ccbDays; private JComboBox ccbMonths; private JComboBox
	 * ccbYears;
	 */
	private JLabel label;
	private JTextField textField;
	private String luaChon;

	
	
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
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		setContentPane(contentPane);
		setResizable(false);
		setLocationRelativeTo(null);
		initComponent();
		listSinhVien = new DAOSinhVien().getListSinhVien("SELECT * FROM sinhvien ORDER BY hotensv DESC");
		showTable();
		
	}
	public void showTable() {
		
		model = (DefaultTableModel) tbSinhVien.getModel();
		listSinhVien.forEach((s) ->{
			model.addRow(new Object[] {
					s.getID(), s.getMaSinhVien() , s.getHoTen() , s.getNgaySinh(),
					s.getGioiTinh() , s.getNoiSinh() , s.getMaLop()	, s.getMaKhoa()	
			});
		});
	
	
		tbSinhVien.getColumnModel().getColumn(0).setPreferredWidth(10);
		tbSinhVien.getColumnModel().getColumn(1).setPreferredWidth(20);
		tbSinhVien.getColumnModel().getColumn(2).setPreferredWidth(40);
		tbSinhVien.getColumnModel().getColumn(3).setPreferredWidth(20);
		tbSinhVien.getColumnModel().getColumn(4).setPreferredWidth(20);
		tbSinhVien.getColumnModel().getColumn(5).setPreferredWidth(20);
		tbSinhVien.getColumnModel().getColumn(6).setPreferredWidth(20);
		tbSinhVien.getColumnModel().getColumn(7).setPreferredWidth(20);
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
					.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 535, GroupLayout.PREFERRED_SIZE)
					)
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
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 535, GroupLayout.PREFERRED_SIZE)
						.addComponent(mainFieldPanel, GroupLayout.PREFERRED_SIZE, 535, GroupLayout.PREFERRED_SIZE)
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
						"Nơi Sinh" , "Mã Lớp" , "Mã Khoa"
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
		fldMaSinhVien.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				fldMaSinhVienKeyPressed(evt);
			}
		});
		
		lblHoTen = new JLabel();
		lblHoTen.setText("Họ và Tên");
		lblHoTen.setFont(new Font("serif",Font.BOLD | Font.ITALIC,15));
		lblHoTen.setForeground(Color.BLUE);
		
		fldHoTen = new JTextField();
		fldHoTen.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		fldHoTen.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				fldHoTenKeyPressed(evt);
			}
		});
		
		lblGioiTinh = new JLabel();
		lblGioiTinh.setText("Giới Tính");
		lblGioiTinh.setForeground(Color.BLUE);
		lblGioiTinh.setFont(new Font("serif",Font.BOLD | Font.ITALIC,15));
		
		ccbGioiTinh = new JComboBox<String>();
		ccbGioiTinh.addItem("Nam");
		ccbGioiTinh.addItem("Nữ");
		ccbGioiTinh.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent evt) {
				//ccbLuaChonStateChanged(evt);
				
			}
		});
		
		lblNgaySinh = new JLabel();
		lblNgaySinh.setText("Ngày Sinh");
		lblNgaySinh.setForeground(Color.BLUE);
		lblNgaySinh.setFont(new Font("serif",Font.BOLD | Font.ITALIC , 15));
		
		fldNgaySinh = new JTextField();
		fldNgaySinh.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		fldNgaySinh.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				fldNgaySinhKeyPressed(evt);
			}
		});
		
		/*
		 * ngaySinhPanel = new JPanel();
		 * 
		 * ccbDays = new JComboBox<String>(); for(int i = 1 ; i <= 31 ; i++) {
		 * ccbDays.addItem(""+i); }
		 * 
		 * ccbMonths = new JComboBox<String>(); for(int i = 1 ; i <= 12 ; i++) {
		 * ccbMonths.addItem(""+1); }
		 * 
		 * ccbYears = new JComboBox<String>(); for(int i = 2019 ; i >= 1920 ; i--) {
		 * ccbYears.addItem(""+i); }
		 */
	
		lblNoiSinh = new JLabel();
		lblNoiSinh.setText("Nơi Sinh");
		lblNoiSinh.setForeground(Color.BLUE);
		lblNoiSinh.setFont(new Font("serif",Font.BOLD | Font.ITALIC , 15));
		
		fldNoiSinh = new JTextField();
		fldNoiSinh.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		fldNoiSinh.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				fldNoiSinhKeyPressed(evt);
			}
		});
		
		lblMaLop = new JLabel();
		lblMaLop.setText("Mã Lớp");
		lblMaLop.setFont(new Font("serif" , Font.BOLD | Font.ITALIC , 15));
		lblMaLop.setForeground(Color.BLUE);
		
		fldMaLop = new JTextField();
		fldMaLop.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		fldMaLop.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				fldMaLopKeyPressed(evt);
			}
		});
		
		lblMaKhoa = new JLabel();
		lblMaKhoa.setText("Mã Khoa");
		lblMaKhoa.setForeground(Color.BLUE);
		lblMaKhoa.setFont(new Font("serif",Font.BOLD | Font.ITALIC , 15));
		
		fldMaKhoa = new JTextField();
		fldMaKhoa.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		fldMaKhoa.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
				fldMaKhoaKeyPressed(evt);
			}
		});
		
		ccbLuaChon = new JComboBox<String>();
		ccbLuaChon.addItem("Thêm");
		ccbLuaChon.addItem("Sửa");
		ccbLuaChon.addItem("Xóa");
		ccbLuaChon.addItem("Hoàn Tác");
		ccbLuaChon.setSelectedIndex(-1);
		ccbLuaChon.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent evt) {
				ccbLuaChonStateChanged(evt);
				
			}
		});
		
		
		label = new JLabel();
		label.setText("Mã Lớp");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		
		textField = new JTextField();
		textField.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		btnXacNhan = new JButton();
		btnXacNhan.setText("Xác Nhận");
		btnXacNhan.setBackground(Color.CYAN);
		btnXacNhan.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				btnXacNhanMouseClicked(evt);
			}
			
			public void mouseEntered(MouseEvent evt) {
				btnXacNhanMouseEntered(evt);
			}
			
			public void mouseExited(MouseEvent evt) {
				btnXacNhanMouseExited(evt);
			}
		});

		
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
				.addComponent(fldNgaySinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblNoiSinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addComponent(fldNoiSinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblMaLop, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addComponent(fldHoTen, GroupLayout.DEFAULT_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addComponent(ccbGioiTinh, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
				.addComponent(fldMaLop, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblMaKhoa, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_mainFieldPanel.createParallelGroup(Alignment.TRAILING, false)
					.addGroup(gl_mainFieldPanel.createSequentialGroup()
						.addGap(20)
						.addComponent(ccbLuaChon, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnXacNhan, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
					.addComponent(fldMaKhoa, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
		);
		gl_mainFieldPanel.setVerticalGroup(
			gl_mainFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainFieldPanel.createSequentialGroup()
					.addComponent(lblThongTinSinhVien)
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ccbGioiTinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNgaySinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fldNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNoiSinh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fldNoiSinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMaLop, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fldMaLop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMaKhoa, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fldMaKhoa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(gl_mainFieldPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnXacNhan, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(ccbLuaChon, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
	
	private void fldMaSinhVienKeyPressed(KeyEvent evt) {
		String sql;
		if("".equals(fldMaSinhVien.getText()) | " ".equals(fldMaSinhVien.getText())) 
			sql = "SELECT * FROM sinhvien";
	
		else 
			sql = "SELECT * FROM sinhvien WHERE masv LIKE '"+fldMaSinhVien.getText()+"%' ORDER BY hotensv DESC";
		
		
		sinhVienSearched(sql, evt);
	}
	
	private void fldHoTenKeyPressed(KeyEvent evt) {
		String sql; 
		if("".equals(fldHoTen.getText()) | " ".equals(fldHoTen.getText())) 
			sql = "SELECT * FROM sinhvien";
		
		else 
			sql = "SELECT * FROM sinhvien WHERE hotensv LIKE N'" + fldHoTen.getText() + "%'";
		
		sinhVienSearched(sql, evt);
		
		
	}
	
	private void fldNgaySinhKeyPressed(KeyEvent evt) {
		String sql; 
		if("".equals(fldNgaySinh.getText()) | " ".equals(fldNgaySinh.getText()))
			sql = "SELECT * FROM sinhvien";
		else
			sql = "SELECT * FROM sinhvien WHERE ngaysinh LIKE '%" + fldNgaySinh.getText() + "' ORDER BY hotensv DESC";
		
		sinhVienSearched(sql,evt);
	}
	
	private void fldNoiSinhKeyPressed(KeyEvent evt) {
		String sql;
		if("".equals(fldNgaySinh.getText()) | " ".equals(fldNgaySinh.getText()))
			sql = "SELECT * FROM sinhvien";
		else
			sql = "SELECT * FROM sinhvien WHERE noisinh LIKE '%" + fldNgaySinh.getText() + "%' ORDER BY hotensv DESC";
	
		sinhVienSearched(sql,evt);
	}
	
	private void fldMaLopKeyPressed(KeyEvent evt) {
		String sql;
		if("".equals(fldNgaySinh.getText()) | " ".equals(fldNgaySinh.getText()))
			sql = "SELECT * FROM sinhvien";
		else
			sql = "SELECT * FROM sinhvien WHERE malop LIKE '%" + fldNgaySinh.getText() + "%' ORDER BY hotensv DESC";
	
		sinhVienSearched(sql,evt);
	}
	
	private void fldMaKhoaKeyPressed(KeyEvent evt) {
		String sql;
		if("".equals(fldNgaySinh.getText()) | " ".equals(fldNgaySinh.getText()))
			sql = "SELECT * FROM sinhvien";
		else
			sql = "SELECT * FROM sinhvien WHERE makh LIKE '%" + fldNgaySinh.getText() + "%' GROUP BY hotensv DESC";
	
		sinhVienSearched(sql,evt);
	}
	
	private void sinhVienSearched(String sql , KeyEvent evt ) {
		if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
			for(int i = model.getRowCount()-1 ; i>=0 ; i--) {
				model.removeRow(i);
			}
			listSinhVien = new DAOSinhVien().getListSinhVien(sql);
			showTable();
			if(model.getRowCount() == 1) {
				fldId.setText((String)model.getValueAt(0, 0));
				fldMaSinhVien.setText((String)model.getValueAt(0, 1));
				fldHoTen.setText((String)model.getValueAt(0,2));
				fldNgaySinh.setText((String)model.getValueAt(0,3));
				ccbGioiTinh.setSelectedIndex(0);// sửa sau 
				fldNoiSinh.setText((String)model.getValueAt(0, 5));
				fldMaLop.setText((String)model.getValueAt(0,6));
				fldMaKhoa.setText((String)model.getValueAt(0, 7));
			}
			else if(model.getRowCount() > 1) {
				//do nothing
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Không Tìm Thấy Thông Tin Sinh Viên");
				fldId.setText("");
				fldMaSinhVien.setText("");
				fldHoTen.setText("");
				fldNgaySinh.setText("");
				fldNoiSinh.setText("");
				fldMaLop.setText("");
				fldMaKhoa.setText("");
			}
		}	
	}
	
	private void ccbLuaChonStateChanged(ItemEvent evt ) {
		if(evt.getItem().equals("Thêm") &&  evt.ITEM_STATE_CHANGED == ItemEvent.ITEM_STATE_CHANGED) {
			luaChon = "Thêm";
		}
	}

	
	private void btnXacNhanMouseEntered(MouseEvent evt) {
		setColor(btnXacNhan);
	}
	
	private void btnXacNhanMouseExited(MouseEvent evt) {
		resetColor(btnXacNhan);
	}
	
	private void btnXacNhanMouseClicked(MouseEvent evt) {
		if(luaChon != null ) {
			switch(luaChon) {
			case "Thêm" : 
				addSinhVien();
			}
		}
	}
	
	private void addSinhVien() {
		Model.SinhVien aSinhVien = new Model.SinhVien();
		int id = idRandom.nextInt(15000);
		for(Model.SinhVien x : listSinhVien ) {
			if ( x.getID() == id )
				id = idRandom.nextInt(15000);
			else 
				break;
		}
		aSinhVien.setID(id);
		aSinhVien.setMaSinhVien(fldMaSinhVien.getText());
		aSinhVien.setHoTen(fldHoTen.getText());
		aSinhVien.setGioiTinh(ccbGioiTinh.getSelectedItem().toString());
		aSinhVien.setNgaySinh(fldNgaySinh.getText());
		aSinhVien.setNoiSinh(fldNoiSinh.getText());
		aSinhVien.setMaLop(fldMaLop.getText());
		aSinhVien.setMaKhoa(fldMaKhoa.getText());
		
		listSinhVien.add(aSinhVien);
		
		if(new Controller.DAOSinhVien().addSinhVien(aSinhVien)) {
			JOptionPane.showMessageDialog(null,"Đã Thêm");
			ccbLuaChon.setSelectedIndex(-1);
			loadDataSinhVien();
		}
		else
			JOptionPane.showMessageDialog(null,"Không Thể Thêm Sinh Viên");
		
	}
	
	private void loadDataSinhVien() {
		listSinhVien = new Controller.DAOSinhVien().getListSinhVien("SELECT * FROM sinhvien");
		for(int i = model.getRowCount()-1 ; i >= 0 ; i--) {
			model.removeRow(i);
		}
		tbSinhVien.repaint();
		showTable();
		
	}
	
	private void setColor(JButton btn) {
		btn.setBackground(Color.GRAY);
	}
	
	private void resetColor(JButton btn) {
		btn.setBackground(Color.CYAN);
	}
}

