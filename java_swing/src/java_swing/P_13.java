package java_swing;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

// CommentManage
public class P_13 extends JFrame {

	private JPanel contentPane;
	private JTable tableCommentList;
	private JScrollPane scCommentList;
	private JLabel lbGrayCat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_13 frame = new P_13();
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
	public P_13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null); // 이거 없으면 정상적으로 레이아웃 안그려진다..
		
		Object[] columns = {"Num", "고객명", "방문날짜", "서비스내용", "별점", "코멘트"};
		Object[][] rowNames = {
				{"1", "홍길동", "2022-02-11", "타이어교체", "⭐⭐⭐", "수리하는데 시간이 너무 오래걸림"},
				{"2", "김홍도", "2022-02-13", "엔진오일교체", "⭐⭐⭐⭐⭐", "가성비있게 교체한 것 같습니다..."
						+ "위치도 좋구요~^^"}
		};
		
		// Text Align Center
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		render.setHorizontalAlignment(SwingConstants.CENTER);
		
		tableCommentList = new JTable(rowNames, columns);
		tableCommentList.getColumn("Num").setCellRenderer(render);
		tableCommentList.getColumn("고객명").setCellRenderer(render);
		tableCommentList.getColumn("방문날짜").setCellRenderer(render);
		tableCommentList.getColumn("서비스내용").setCellRenderer(render);
		tableCommentList.getColumn("별점").setCellRenderer(render);
		tableCommentList.getColumn("코멘트").setCellRenderer(render);
		
		// Column Not Move
		tableCommentList.getTableHeader().setReorderingAllowed(false);
		
		// Column Change Width
		tableCommentList.getColumn("서비스내용").setPreferredWidth(200);
		tableCommentList.getColumn("코멘트").setPreferredWidth(500);
		
		// Row Change Height 
		tableCommentList.setRowHeight(50);
		
		// Table Font
		tableCommentList.setFont(new Font("font/NanumBarunGothic.ttf", Font.PLAIN, 20));
		
		// Table Set Area
		scCommentList = new JScrollPane(tableCommentList);
		scCommentList.setVisible(true);
		scCommentList.setBounds(150, 175, 1600, 750);
		
		contentPane.add(scCommentList);
		
		ImageIcon img = new ImageIcon("img/grayCat.png");
		lbGrayCat = new JLabel("", img, JLabel.CENTER);
		lbGrayCat.setBounds(770, 40, 305, 153);
		contentPane.add(lbGrayCat);
	}

}
