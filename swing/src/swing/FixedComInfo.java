package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FixedComInfo extends JFrame {

	private JPanel contentPane;
	private JTextField comId;
	private JTextField comPw;
	private JTextField comPwCheck;
	private JTextField comName;
	private JTextField comNum;
	private JTextField comZip;
	private JTextField comAddr;
	private JTextField comTel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FixedComInfo frame = new FixedComInfo();
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
	public FixedComInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(682, 49, 310, 94);
		lblNewLabel.setIcon(new ImageIcon(FixedComInfo.class.getResource("/img/grayCat.png")));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(438, 177, 803, 701);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblComId = new JLabel("아이디");
		lblComId.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComId.setBounds(158, 77, 136, 41);
		panel.add(lblComId);
		
		JLabel lblComPw = new JLabel("비밀번호");
		lblComPw.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComPw.setBounds(158, 139, 136, 41);
		panel.add(lblComPw);
		
		JLabel lblComPwCheck = new JLabel("비밀번호 재확인");
		lblComPwCheck.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComPwCheck.setBounds(132, 204, 162, 41);
		panel.add(lblComPwCheck);
		
		JLabel lblComName = new JLabel("업체명");
		lblComName.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComName.setBounds(158, 268, 136, 41);
		panel.add(lblComName);
		
		JLabel lblComNum = new JLabel("사업자등록번호");
		lblComNum.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComNum.setBounds(128, 330, 166, 41);
		panel.add(lblComNum);
		
		JLabel lblComZip = new JLabel("우편번호");
		lblComZip.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComZip.setBounds(158, 395, 136, 41);
		panel.add(lblComZip);
		
		JLabel lblComAddr = new JLabel("주소");
		lblComAddr.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComAddr.setBounds(158, 460, 136, 41);
		panel.add(lblComAddr);
		
		JLabel lblComTel = new JLabel("전화번호");
		lblComTel.setFont(new Font("NanumBarunGothic", Font.PLAIN, 20));
		lblComTel.setBounds(158, 524, 136, 41);
		panel.add(lblComTel);
		
		comId = new JTextField();
		comId.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comId.setEditable(false);
		comId.setBounds(304, 76, 384, 42);
		panel.add(comId);
		comId.setColumns(10);
		
		comPw = new JTextField();
		comPw.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comPw.setColumns(10);
		comPw.setBounds(304, 140, 384, 42);
		panel.add(comPw);
		
		comPwCheck = new JTextField();
		comPwCheck.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comPwCheck.setColumns(10);
		comPwCheck.setBounds(304, 204, 384, 42);
		panel.add(comPwCheck);
		
		comName = new JTextField();
		comName.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comName.setColumns(10);
		comName.setBounds(304, 268, 384, 42);
		panel.add(comName);
		
		comNum = new JTextField();
		comNum.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comNum.setColumns(10);
		comNum.setBounds(304, 332, 384, 42);
		panel.add(comNum);
		
		comZip = new JTextField();
		comZip.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comZip.setColumns(10);
		comZip.setBounds(304, 396, 169, 42);
		panel.add(comZip);
		
		comAddr = new JTextField();
		comAddr.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comAddr.setColumns(10);
		comAddr.setBounds(304, 460, 384, 42);
		panel.add(comAddr);
		
		comTel = new JTextField();
		comTel.setFont(new Font("NanumBarunGothic", Font.PLAIN, 13));
		comTel.setColumns(10);
		comTel.setBounds(304, 524, 384, 42);
		panel.add(comTel);
		
		JButton btnFixedComInfo = new JButton("수정 완료");
		btnFixedComInfo.setFont(new Font("NanumBarunGothic", Font.PLAIN, 19));
		btnFixedComInfo.setBounds(281, 622, 240, 41);
		panel.add(btnFixedComInfo);
	}
}