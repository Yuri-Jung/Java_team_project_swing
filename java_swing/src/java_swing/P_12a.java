package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;

public class P_12a {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_12a window = new P_12a();
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
	public P_12a() {
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
		
		JButton btnBackSalesMain = new JButton("돌아가기\r\n");
		btnBackSalesMain.setBounds(763, 232, 146, 65);
		frame.getContentPane().add(btnBackSalesMain);
		
		table = new JTable();
		table.setFont(new Font("굴림", Font.PLAIN, 15));
		table.setBounds(0, 0, 1906, 1043);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC77C", "\uC218\uC785", "\uC9C0\uCD9C"},
				{"1", "1,100,000", "1,300,000"},
				{"2", "400,000", "0"},
				{",,,", "...", "..."},
				{"31", "300,000", null},
				{"", "\uCD1D\uC218\uC785", "\uCD1D\uC9C0\uCD9C"},
				{null, "8,000,000", "2,000,000"},
			},
			new String[] {
				"\uC77C", "\uC218\uC785", "\uC9C0\uCD9C"
			}
		));
		frame.getContentPane().add(table);
	}

}
