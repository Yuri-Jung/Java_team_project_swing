package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

public class P_5_A {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_5_A window = new P_5_A();
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
	public P_5_A() {
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
		
		JButton btnEditComInfo = new JButton("업체정보 수정");
		btnEditComInfo.setFont(new Font("굴림", Font.PLAIN, 20));
		btnEditComInfo.setBounds(648, 120, 460, 67);
		frame.getContentPane().add(btnEditComInfo);
		
		JButton btnEditTechList = new JButton("정비사 목록 수정");
		btnEditTechList.setFont(new Font("굴림", Font.PLAIN, 20));
		btnEditTechList.setBounds(648, 218, 460, 67);
		frame.getContentPane().add(btnEditTechList);
		
		JButton btnEditSrvInfo = new JButton("서비스 목록 수정");
		btnEditSrvInfo.setFont(new Font("굴림", Font.PLAIN, 20));
		btnEditSrvInfo.setBounds(648, 319, 460, 67);
		frame.getContentPane().add(btnEditSrvInfo);
		
		JButton btnMgrUnitStock = new JButton("부품 재고 관리");
		btnMgrUnitStock.setFont(new Font("굴림", Font.PLAIN, 20));
		btnMgrUnitStock.setBounds(648, 424, 460, 67);
		frame.getContentPane().add(btnMgrUnitStock);
		
		JButton btnMgrBook = new JButton("예약 관리");
		btnMgrBook.setFont(new Font("굴림", Font.PLAIN, 20));
		btnMgrBook.setBounds(648, 526, 460, 67);
		frame.getContentPane().add(btnMgrBook);
		
		JButton btnMgrCustomer = new JButton("고객 관리");
		btnMgrCustomer.setFont(new Font("굴림", Font.PLAIN, 20));
		btnMgrCustomer.setBounds(648, 635, 460, 67);
		frame.getContentPane().add(btnMgrCustomer);
		
		JButton btnMgrSales = new JButton("매출 관리");
		btnMgrSales.setFont(new Font("굴림", Font.PLAIN, 20));
		btnMgrSales.setBounds(648, 739, 460, 67);
		frame.getContentPane().add(btnMgrSales);
		
		JButton btnMgrComment = new JButton("코멘트 관리");
		btnMgrComment.setFont(new Font("굴림", Font.PLAIN, 20));
		btnMgrComment.setBounds(648, 851, 460, 67);
		frame.getContentPane().add(btnMgrComment);
	}

}
