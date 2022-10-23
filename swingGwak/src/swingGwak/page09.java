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

public class page09 {
	private static final String EXIT_ON_CLOSE = null;

	public static void main(String[] args) {
		JFrame frame = new JFrame("page09_서비스 목록 수정");
		JPanel tablePanel = new JPanel(); // 테이블용 JPabnel  생성
		
		
		
		
		
		String[] headings = new String[] {"num", "SrvName", "techName", "SrvPrice"}; // 행 데이터 선언
		Object[][] data = new Object[][] { // 2차원 배열, 내부 데이터 입력
			{"1", "타이어교체", "김땡땡", "100000"},
			{"2", "엔진오일교체", "박모모", "20000"},
			{"3", "에어컨청소", "최뫄뫄", "30000"}
		};
		tablePanel.setLayout(null);
		
		//DefaultTableModel model = new DefaultTableModel(data,headings);
		
		// JTable 선언
		JTable table = new JTable(data, headings);
		//JTable table = new JTable(model);
		
	
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		
		table.setFillsViewportHeight(true);
		
		
		//tablePanel.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(131, 225, 1622, 589);
		tablePanel.add(scrollPane); 
		
		frame.getContentPane().add(tablePanel);
		
		JButton btnBackMain = new JButton("돌아가기");
		btnBackMain.setFont(new Font("굴림", Font.BOLD, 50));
		btnBackMain.setBounds(677, 850, 429, 91);
		tablePanel.add(btnBackMain);
		
		JLabel lblNewLabel = new JLabel("서비스 목록");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setBounds(131, 162, 297, 53);
		tablePanel.add(lblNewLabel);
		
		JButton btnAddSrv = new JButton("추가");
		btnAddSrv.setFont(new Font("굴림", Font.BOLD, 40));
		btnAddSrv.setBounds(1273, 162, 152, 53);
		tablePanel.add(btnAddSrv);
		
		JButton btnEditSrv = new JButton("수정");
		btnEditSrv.setFont(new Font("굴림", Font.BOLD, 40));
		btnEditSrv.setBounds(1437, 162, 152, 53);
		tablePanel.add(btnEditSrv);
		
		JButton btnDelSrv = new JButton("삭제");
		btnDelSrv.setFont(new Font("굴림", Font.BOLD, 40));
		btnDelSrv.setBounds(1601, 162, 152, 53);
		tablePanel.add(btnDelSrv);
		
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
		btnAddSrv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page09_add add = new page09_add();
				add.setVisible(true);
				
			}
		});
		
		
		// 수정 버튼 누르면 실행됨
		btnEditSrv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page09_edit edit = new page09_edit();
				edit.setVisible(true);
				
			}
		});
		
		// 삭제 버튼 누르면 실행됨
		btnDelSrv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page09_del del = new page09_del();
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
					page09 window = new page09();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
//		DefaultTableModel m =
//                (DefaultTableModel)table.getModel();
//        //모델에 데이터 추가 , 1번째 출에 새로운 데이터를 추가합니다
//        m.insertRow(0, new Object[]{"d1","d2","d3"});
//        //추가를 마치고 데이터 갱신을 알립니다.
//        table.updateUI();
		
	
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


