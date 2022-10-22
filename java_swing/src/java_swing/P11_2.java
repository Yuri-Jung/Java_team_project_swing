package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class P11_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField cusName;
	private JTextField cusCarNum;
	private JTextField cusCarBrand;
	private JTextField cusCarType;
	private JTextField cusKm;
	private JTextField cusZip;
	private JTextField cusAddr;
	private JTextField cusTel;
	private JTextField cusDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P11_2 window = new P11_2();
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
	public P11_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(685, 10, 822, 1007);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setText("고객 이름");
		textField.setBounds(66, 49, 119, 54);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setText("차 번호");
		textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(66, 144, 119, 54);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setText("브랜드");
		textField_2.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(66, 236, 119, 54);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setText("차종");
		textField_3.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(66, 324, 119, 54);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setText("주행거리");
		textField_4.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(66, 424, 119, 54);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setText("우편번호");
		textField_5.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(66, 526, 119, 54);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setText("주소");
		textField_6.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(66, 627, 119, 54);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("");
		textField_7.setText("전화번호");
		textField_7.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(66, 725, 119, 54);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("");
		textField_8.setText("가입날짜");
		textField_8.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(66, 815, 119, 54);
		panel.add(textField_8);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(352, 919, 162, 61);
		panel.add(btnNewButton);
		
		cusName = new JTextField();
		cusName.setBounds(304, 49, 246, 54);
		panel.add(cusName);
		cusName.setColumns(10);
		
		cusCarNum = new JTextField();
		cusCarNum.setColumns(10);
		cusCarNum.setBounds(304, 144, 246, 54);
		panel.add(cusCarNum);
		
		cusCarBrand = new JTextField();
		cusCarBrand.setColumns(10);
		cusCarBrand.setBounds(304, 236, 246, 54);
		panel.add(cusCarBrand);
		
		cusCarType = new JTextField();
		cusCarType.setColumns(10);
		cusCarType.setBounds(304, 324, 246, 54);
		panel.add(cusCarType);
		
		cusKm = new JTextField();
		cusKm.setColumns(10);
		cusKm.setBounds(304, 424, 246, 54);
		panel.add(cusKm);
		
		cusZip = new JTextField();
		cusZip.setColumns(10);
		cusZip.setBounds(304, 526, 246, 54);
		panel.add(cusZip);
		
		cusAddr = new JTextField();
		cusAddr.setColumns(10);
		cusAddr.setBounds(304, 627, 365, 54);
		panel.add(cusAddr);
		
		cusTel = new JTextField();
		cusTel.setColumns(10);
		cusTel.setBounds(304, 725, 365, 54);
		panel.add(cusTel);
		
		cusDate = new JTextField();
		cusDate.setColumns(10);
		cusDate.setBounds(304, 815, 365, 54);
		panel.add(cusDate);
		
		JButton btnBackCusMain = new JButton("돌아가기");
		btnBackCusMain.setFont(new Font("굴림", Font.PLAIN, 30));
		btnBackCusMain.setBounds(274, 940, 162, 61);
		frame.getContentPane().add(btnBackCusMain);
	}
}
