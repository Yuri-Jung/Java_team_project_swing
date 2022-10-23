package swingGwak;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;


public class page02 {

	private JFrame frame;
	private JTextField comId;
	private JTextField comName;
	private JTextField comNum;
	private JTextField comZip;
	private JTextField comAddr;
	private JTextField comTel;
	private JPasswordField comPw;
	private JPasswordField comPwCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page02 window = new page02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public page02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("page02 회원가입");
		frame.setSize(new Dimension(1920, 1080));
		frame.getContentPane().setSize(new Dimension(1920, 1080));
		frame.getContentPane().setLayout(null);
		
		JPanel panel02 = new JPanel();
		panel02.setBounds(12, 10, 1904, 1030);
		frame.getContentPane().add(panel02);
		panel02.setLayout(null);
		
		JButton btnComNext = new JButton("다음");
		btnComNext.setFont(new Font("나눔고딕", Font.BOLD, 50));
		btnComNext.setBounds(830, 889, 440, 80);
		panel02.add(btnComNext);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel.setBounds(920, 160, 90, 40);
		panel02.add(lblNewLabel);
		
		comId = new JTextField();
		comId.setBounds(920, 200, 242, 40);
		panel02.add(comId);
		comId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_1.setBounds(920, 240, 242, 40);
		panel02.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 재확인");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_2.setBounds(920, 320, 242, 40);
		panel02.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("업체명");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_3.setBounds(920, 400, 242, 40);
		panel02.add(lblNewLabel_3);
		
		comName = new JTextField();
		comName.setBounds(920, 440, 242, 40);
		panel02.add(comName);
		comName.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("사업자 등록번호");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_4.setBounds(920, 480, 242, 40);
		panel02.add(lblNewLabel_4);
		
		comNum = new JTextField();
		comNum.setBounds(920, 520, 242, 40);
		panel02.add(comNum);
		comNum.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("우편번호");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_5.setBounds(920, 560, 242, 40);
		panel02.add(lblNewLabel_5);
		
		comZip = new JTextField();
		comZip.setBounds(920, 600, 242, 40);
		panel02.add(comZip);
		comZip.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("주소");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_6.setBounds(920, 640, 242, 40);
		panel02.add(lblNewLabel_6);
		
		comAddr = new JTextField();
		comAddr.setBounds(920, 680, 242, 40);
		panel02.add(comAddr);
		comAddr.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("전화번호");
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_7.setBounds(920, 720, 242, 40);
		panel02.add(lblNewLabel_7);
		
		comTel = new JTextField();
		comTel.setBounds(920, 760, 242, 40);
		panel02.add(comTel);
		comTel.setColumns(10);
		
		comPw = new JPasswordField();
		comPw.setBounds(920, 280, 242, 40);
		panel02.add(comPw);
		
		comPwCheck = new JPasswordField();
		comPwCheck.setBounds(920, 360, 242, 40);
		panel02.add(comPwCheck);
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // 창이 가운데서 열리게 함
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // 전체화면
		frame.setVisible(true); //
	}
}

