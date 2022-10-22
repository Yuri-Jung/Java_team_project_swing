package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;

public class P_12b {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_12b window = new P_12b();
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
	public P_12b() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1921, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 10, 1907, 195);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"num", "\uC9C1\uC6D0\uBA85", "\uC11C\uBE44\uC2A4\uBA85", "\uAC74\uC218", "\uCD1D\uAE08\uC561", "\uB0B4\uC6A9", "\uAE08\uC561"},
				{"1", "\uAE40\uB098\uB098", "\uD0C0\uC774\uC5B4\uAD50\uCCB4", "2", "500,000", "\uBCFC\uD2B8\uAD6C\uC785", "300,000"},
				{"2", "\uC774\uB2E4\uB77C", "\uC5D4\uC9C4\uC218\uB9AC", "1", "600,000", "\uC778\uAC74\uBE44", "1,000,000"},
				{null, "", null, "\uCD1D\uC218\uC785", "1,100,000", "\uCD1D\uC9C0\uCD9C", "1,300,000"},
			},
			new String[] {
				"num", "\uC9C1\uC6D0\uBA85", "\uC11C\uBE44\uC2A4\uBA85", "\uAC74\uC218", "\uCD1D\uAE08\uC561", "\uB0B4\uC6A9", "\uAE08\uC561"
			}
		));
		frame.getContentPane().add(table);
		
		JButton btnCloseSales = new JButton("닫기");
		btnCloseSales.setFont(new Font("굴림", Font.PLAIN, 20));
		btnCloseSales.setBounds(873, 243, 110, 48);
		frame.getContentPane().add(btnCloseSales);
	}
}
