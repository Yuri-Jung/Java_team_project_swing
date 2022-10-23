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
import javax.swing.JTextArea;

public class page09_del extends JFrame{
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
	public page09_del() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 593, 372);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 577, 333);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("삭제하시겠습니까?");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(150, 57, 281, 98);
		panel.add(lblNewLabel);
		
		JButton btnDelSrvY = new JButton("예");
		btnDelSrvY.setFont(new Font("굴림", Font.BOLD, 30));
		btnDelSrvY.setBounds(75, 200, 192, 75);
		panel.add(btnDelSrvY);
		
		JButton btnDelSrvN = new JButton("아니오");
		btnDelSrvN.setFont(new Font("굴림", Font.BOLD, 30));
		btnDelSrvN.setBounds(303, 200, 192, 75);
		panel.add(btnDelSrvN);
		
		btnDelSrvY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page07 a1 = new page07();
				a1.setVisible(true);
				// 테이블에서 데이터 삭제 기능 구현
				dispose();
			}
		});
		
		btnDelSrvN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page07 a1 = new page07();
				a1.setVisible(true);
				dispose();
			}
		});
		
	}
}