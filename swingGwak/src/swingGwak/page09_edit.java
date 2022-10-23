package swingGwak;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class page09_edit extends JFrame{
	private JTextField srvName;
	private JTextField techName;
	private JTextField srvPrice;
	public Object btnTechReg;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page07_add window = new page07_add();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page09_edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 978, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 962, 561);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSrvSave = new JButton("저장");
		btnSrvSave.setFont(new Font("굴림", Font.BOLD, 40));
		btnSrvSave.setBounds(385, 477, 189, 62);
		panel.add(btnSrvSave);
		
		JLabel lblNewLabel = new JLabel("서비스명");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(250, 60, 221, 40);
		panel.add(lblNewLabel);
		
		setTechName(new JTextField());
		getTechName().setBounds(252, 106, 437, 57);
		panel.add(getTechName());
		getTechName().setColumns(10);
		
		techName = new JTextField();
		techName.setColumns(10);
		techName.setBounds(250, 217, 437, 57);
		panel.add(techName);
		
		srvPrice = new JTextField();
		srvPrice.setColumns(10);
		srvPrice.setBounds(252, 331, 437, 57);
		panel.add(srvPrice);
		
		JLabel lblNewLabel_2 = new JLabel("서비스 가격");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(250, 284, 221, 40);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("제공 정비사 목록");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(250, 167, 221, 40);
		panel.add(lblNewLabel_1);
		

		
		btnSrvSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page07 a1 = new page07();
				a1.setVisible(true);
				// 테이블 수정 -> 저장 기능 구현
				dispose();
			}
		});
		
	}

	public JTextField getTechName() {
		return srvName;
	}

	public void setTechName(JTextField techName) {
		this.srvName = techName;
	}

}