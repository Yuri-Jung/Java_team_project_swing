package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P11_a extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P11_a frame = new P11_a();
					frame.setVisible(true);
					frame.setSize(1920,1080);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P11_a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 96, 1906, 64);
		table.setPreferredScrollableViewportSize(getMaximumSize());
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"num", "\uACE0\uAC1D\uC774\uB984", "\uCC28\uBC88\uD638", "\uBE0C\uB79C\uB4DC", "\uCC28\uC885", "\uC8FC\uD589\uAC70\uB9AC", "(\uC6B0\uD3B8\uBC88\uD638) \uC8FC\uC18C", "\uC804\uD654\uBC88\uD638", "\uAC00\uC785\uB0A0\uC9DC"},
				{"1", "\uAE40\uB561\uB561", "63\uD5582234", "\uD604\uB300", "\uC18C\uB098\uD0C0", "3000", "(37326)\uC6B8\uC0B0\uAD11\uC5ED\uC2DC", "010-1111-1111", "2012-04-30"},
				{"2", "\uC774\uB9F9\uB9F9", "49\uC5449987", "\uBCA4\uCE20", "e\uD074\uB798\uC2A4", "5000", "(39857)\uB300\uC804\uAD11\uC5ED\uC2DC", "010-2222-2222", "2015-09-16"},
				{"3", "\uBC15\uB9DD\uB9DD", "42\uC5EC5932", "\uAE30\uC544", "K7", "8000", "(22342)\uBD80\uC0B0\uAD11\uC5ED\uC2DC", "010-3333-3333", "2020-08-05"},
			},
			new String[] {
				"num", "\uACE0\uAC1D\uC774\uB984", "\uCC28\uBC88\uD638", "\uBE0C\uB79C\uB4DC", "\uCC28\uC885", "\uC8FC\uD589\uAC70\uB9AC", "(\uC6B0\uD3B8\uBC88\uD638) \uC8FC\uC18C", "\uC804\uD654\uBC88\uD638", "\uAC00\uC785\uB0A0\uC9DC"
			}
		));
		table.getColumnModel().getColumn(6).setPreferredWidth(113);
		contentPane.add(table);
		
		JButton btnEditCus = new JButton("수정");
		btnEditCus.setBounds(155, 38, 97, 48);
		btnEditCus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnEditCus);
		
		JButton btnAddCus = new JButton("추가");
		btnAddCus.setBounds(25, 38, 97, 48);
		contentPane.add(btnAddCus);
		
		JButton btnDelCus = new JButton("삭제");
		btnDelCus.setBounds(292, 38, 97, 48);
		contentPane.add(btnDelCus);
	}
}
