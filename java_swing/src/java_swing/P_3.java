package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class P_3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_3 frame = new P_3();
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
	public P_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1079);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JButton btnTechNext = new JButton("다음");
		btnTechNext.setFont(new Font("굴림", Font.PLAIN, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(89)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 684, GroupLayout.PREFERRED_SIZE)
							.addGap(171)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 684, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(691)
							.addComponent(btnTechNext, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(268, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
					.addGap(59)
					.addComponent(btnTechNext, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
					.addGap(22))
		);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(218, 37, 266, 62);
		textField.setFont(new Font("굴림", Font.BOLD, 28));
		textField.setText("등록된 정비사 목록");
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(64, 113, 564, 576);
		panel_1.add(panel_2);
		panel.setLayout(null);
		
		JButton btnTechReg = new JButton("등록");
		btnTechReg.setFont(new Font("굴림", Font.PLAIN, 25));
		btnTechReg.setBounds(247, 631, 182, 77);
		panel.add(btnTechReg);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("굴림", Font.PLAIN, 30));
		textPane.setText("정비사 이름");
		textPane.setBounds(43, 58, 226, 52);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("정비사 전화번호");
		textPane_1.setFont(new Font("굴림", Font.PLAIN, 30));
		textPane_1.setBounds(45, 251, 244, 52);
		panel.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("정비사 직급");
		textPane_2.setFont(new Font("굴림", Font.PLAIN, 30));
		textPane_2.setBounds(43, 432, 226, 52);
		panel.add(textPane_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 137, 573, 81);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 313, 573, 81);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(45, 505, 573, 81);
		panel.add(textField_3);
		contentPane.setLayout(gl_contentPane);
	}
}
