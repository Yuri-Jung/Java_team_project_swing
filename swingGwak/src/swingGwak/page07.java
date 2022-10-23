package swingGwak;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class page07 {
	private static final String EXIT_ON_CLOSE = null;

	public static void main(String[] args) {
		JFrame frame = new JFrame("page07_정비사 수정");
		JPanel tablePanel = new JPanel(); // 테이블용 JPabnel  생성
		
		
		String[] headings = new String[] {"num", "techName", "techTel", "techLv"}; // 행 데이터 선언
		Object[][] data = new Object[][] { // 2차원 배열, 내부 데이터 입력
			{"1", "testName1", "testTel1", "testLv1"},
			{"2", "testName2", "testTel2", "testLv2"},
			{"3", "testName3", "testTel3", "testLv3"}
		};
		tablePanel.setLayout(null);

		// JTable 선언
		JTable table = new JTable(data, headings);
	
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		
		table.setFillsViewportHeight(true);
		
		
		//tablePanel.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(131, 225, 1622, 589);
		tablePanel.add(scrollPane); // 테이블에 스크롤을 사용할 수 있도록 설정, 임포트 해주기
		
		frame.getContentPane().add(tablePanel);
		
		JButton btnBackMain = new JButton("돌아가기");
		btnBackMain.setFont(new Font("굴림", Font.BOLD, 50));
		btnBackMain.setBounds(677, 850, 429, 91);
		tablePanel.add(btnBackMain);
		
		JLabel lblNewLabel = new JLabel("정비사 목록");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setBounds(131, 162, 297, 53);
		tablePanel.add(lblNewLabel);
		
		JButton btnAddTech = new JButton("추가");
		btnAddTech.setFont(new Font("굴림", Font.BOLD, 40));
		btnAddTech.setBounds(1273, 162, 152, 53);
		tablePanel.add(btnAddTech);
		
		JButton btnEditTech = new JButton("수정");
		btnEditTech.setFont(new Font("굴림", Font.BOLD, 40));
		btnEditTech.setBounds(1437, 162, 152, 53);
		tablePanel.add(btnEditTech);
		
		JButton btnDelTech = new JButton("삭제");
		btnDelTech.setFont(new Font("굴림", Font.BOLD, 40));
		btnDelTech.setBounds(1601, 162, 152, 53);
		tablePanel.add(btnDelTech);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nmk02\\Documents\\Java_team_project_swing\\swingGwak\\src\\cat.png"));
		lblNewLabel_1.setBounds(625, 23, 566, 168);
		tablePanel.add(lblNewLabel_1);
		
		
		frame.setTitle("page07 정비사 목록 수정");
		frame.setSize(1900,1060);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // 가운데서 창이 뜨게 함 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 추가 버튼 누르면 실행됨
		btnAddTech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page07_add add = new page07_add();
				add.setVisible(true);
				
			}
		});
		
		
		// 수정 버튼 누르면 실행됨
		btnEditTech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page07_edit edit = new page07_edit();
				edit.setVisible(true);
				
			}
		});
		
		// 삭제 버튼 누르면 실행됨
		btnDelTech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page07_del del = new page07_del();
				del.setVisible(true);
			}
		});
		
		
		// 돌아가기 버튼 누르면 실행됨
		btnBackMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ?
			}
		});
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page07 window = new page07();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
	}
	
	
	
	
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("\uD654\uBA741");
		btn1.setBounds(171, 111, 97, 23);
		panel.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page07_add a2 = new page07_add();
				a2.setVisible(true);
				dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
	}

	private void setDefaultCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	

}


