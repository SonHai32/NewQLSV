package com.SonHai.QLSV.Form;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import java.awt.Desktop;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class ThongTinForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel topPanel;
	private JPanel mainPanel;
	private JLabel applicationNameLabel;
	private JLabel lblPhienBan;
	private JLabel lblTacGia;
	private JLabel lblThngTin;
	private JLabel lienHeLabel;
	private JLabel lblFacebook;
	private JLabel lblInstagram;
	private JLabel lblGithub;
	private JSeparator separator;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinForm frame = new ThongTinForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ThongTinForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		setTitle("Thông Tin");
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 250, 154), new Color(0, 255, 255)));
		setContentPane(contentPane);

		topPanel = new JPanel();
		topPanel.setBackground(new Color(0, 255, 255));

		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(244, 255, 255));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(topPanel, GroupLayout.PREFERRED_SIZE, 1250, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
						)
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(topPanel, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)

								.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 644, GroupLayout.PREFERRED_SIZE))
		);

		applicationNameLabel = new JLabel("T\u00EAn ph\u1EA7m m\u1EC1m : Qu\u1EA3n L\u00FD Sinh Vi\u00EAn");
		applicationNameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		lblPhienBan  = new JLabel("Phi\u00EAn B\u1EA3n : 1.0");
		lblPhienBan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		lblTacGia = new JLabel("T\u00E1c Gi\u1EA3 : S\u01A1n H\u1EA3i");
		lblTacGia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));

		lblThngTin = new JLabel("Th\u00F4ng Tin");
		lblThngTin.setForeground(new Color(255, 0, 0));
		lblThngTin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));

		lienHeLabel = new JLabel("Li\u00EAn H\u1EC7");
		lienHeLabel.setForeground(Color.RED);
		lienHeLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));

		lblFacebook = new JLabel("https://www.facebook.com/hai.lam.3726613");
		lblFacebook.setToolTipText("Facebook.com");
		lblFacebook.setIcon(new ImageIcon("E:\\icon\\facebook_48px.png"));
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFacebook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				faceboolCliked(evt);
			}
			@Override
			public void mouseEntered(MouseEvent evt) {
				facebookEntered(evt);
			}
			@Override
			public void mouseExited(MouseEvent evt) {
				facebookExited(evt);
			}
		});


		lblInstagram = new JLabel("https://www.instagram.com/hai.lam.3726613");
		lblInstagram.setToolTipText("Instagram.com");
		lblInstagram.setIcon(new ImageIcon("E:\\icon\\instagram_new_48px.png"));
		lblInstagram.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInstagram.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				instagramClicked(evt);
			}
			@Override
			public void mouseEntered(MouseEvent evt) {
				instagramEntered(evt);
			}
			@Override
			public void mouseExited(MouseEvent evt) {
				instagramExited(evt);
			}
		});

		lblGithub = new JLabel("https://github.com/lamsonhai1379");
		lblGithub.setToolTipText("Github.com");
		lblGithub.setIcon(new ImageIcon("E:\\icon\\github_48px.png"));
		lblGithub.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGithub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				githubClicked(evt);
			}
			@Override
			public void mouseEntered(MouseEvent evt) {
				githubEntered(evt);
			}
			@Override
			public void mouseExited(MouseEvent evt) {
				githubExited(evt);
			}

		});

		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
				gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(applicationNameLabel, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblThngTin, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblPhienBan, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblTacGia, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lienHeLabel, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFacebook, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblInstagram, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGithub, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(110, Short.MAX_VALUE))
		);
		gl_mainPanel.setVerticalGroup(
				gl_mainPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_mainPanel.createSequentialGroup()
								.addContainerGap(183, Short.MAX_VALUE)
								.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_mainPanel.createSequentialGroup()
												.addComponent(lienHeLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(lblFacebook, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(lblInstagram, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblGithub))
										.addGroup(gl_mainPanel.createSequentialGroup()
												.addComponent(lblThngTin, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(applicationNameLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblPhienBan, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblTacGia, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
										.addComponent(separator, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
								.addGap(11))
		);
		mainPanel.setLayout(gl_mainPanel);

		JLabel thongTinLabel = new JLabel("Th\u00F4ng Tin");
		thongTinLabel.setForeground(new Color(0, 0, 128));
		thongTinLabel.setBackground(Color.CYAN);
		thongTinLabel.setFont(new Font("Unispace", Font.BOLD | Font.ITALIC, 45));
		GroupLayout gl_topPanel = new GroupLayout(topPanel);
		gl_topPanel.setHorizontalGroup(
				gl_topPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_topPanel.createSequentialGroup()
								.addComponent(thongTinLabel, GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
						)
		);
		gl_topPanel.setVerticalGroup(
				gl_topPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_topPanel.createSequentialGroup()
								.addComponent(thongTinLabel, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
						)
		);
		topPanel.setLayout(gl_topPanel);
		contentPane.setLayout(gl_contentPane);
	}

	//Facebook label acction
	private void faceboolCliked(MouseEvent evt) {
		openWebPage("https://www.facebook.com/hai.lam.3726613");
	}
	private void facebookEntered(MouseEvent evt) {
		setColor(lblFacebook);
	}
	private void facebookExited(MouseEvent evt) {
		resetColor(lblFacebook);
	}

	//Instagram label action
	private void instagramClicked(MouseEvent evt) {
		openWebPage("https://www.instagram.com/hai.lam.3726613");
	}
	private void instagramEntered(MouseEvent evt) {
		setColor(lblInstagram);
	}
	private void instagramExited(MouseEvent evt) {
		resetColor(lblInstagram);
	}

	//Github label action
	private void githubClicked(MouseEvent evt) {
		openWebPage("https://github.com/lamsonhai1379");
	}
	private void githubEntered(MouseEvent evt) {
		setColor(lblGithub);
	}
	private void githubExited(MouseEvent evt) {
		resetColor(lblGithub);
	}



	private void setColor(JLabel label) {
		label.setForeground(Color.BLUE);
	}

	private void resetColor(JLabel label) {
		label.setForeground(Color.BLACK);
	}
	private void openWebPage(String urlWeb) {
		try {
			Desktop.getDesktop().browse(new URL(urlWeb).toURI());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

