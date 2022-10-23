package java_swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

// ComServiceList
public class P_8 extends JFrame {
	private JPanel contentPane;
	private JTable tableSrvList;
	private JScrollPane scSrvList;
	private JButton btnAddsrv;
	private JButton btnEditSrv;
	private JButton btnDelSrv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_8 frame = new P_8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.getImage("img/grayCat.png");
		g.drawImage(img, 770, 50, 305, 153, this);
		tableSrvList.updateUI();
		btnAddsrv.updateUI();
		btnEditSrv.updateUI();
		btnDelSrv.updateUI();
	}

	/**
	 * Create the frame.
	 */
	public P_8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Num, Service Name, Provide Technician, Service Price
		Object[] columns = {"Num", "���񽺸�", "���� �����", "���� ����"};
		Object[][] rowNames = {
				{"1", "����1", "ȫ�浿", "10000"},
				{"2", "����2", "�ٵ���", "20000"},
				{"3", "����3", "�迵��", "30000"}
		};
		
		// Text Align Center
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		render.setHorizontalAlignment(SwingConstants.CENTER);
		
		tableSrvList = new JTable(rowNames, columns);
		tableSrvList.getColumn("Num").setCellRenderer(render);
		tableSrvList.getColumn("���񽺸�").setCellRenderer(render);
		tableSrvList.getColumn("���� �����").setCellRenderer(render);
		tableSrvList.getColumn("���� ����").setCellRenderer(render);
		
		// Column Not Move
		tableSrvList.getTableHeader().setReorderingAllowed(false);
		
		// Column Change Width
		tableSrvList.getColumn("���񽺸�").setPreferredWidth(200);
		tableSrvList.getColumn("���� �����").setPreferredWidth(350);
		
		// Row Change Height 
		tableSrvList.setRowHeight(50);
		
		// Table Font
		tableSrvList.setFont(new Font("font/NanumBarunGothic.ttf", Font.PLAIN, 20));
		
		// Table Set Area
		scSrvList = new JScrollPane(tableSrvList);
		scSrvList.setVisible(true);
		scSrvList.setBounds(150, 175, 1600, 750);
		
		contentPane.add(scSrvList);
		
		// Button Create
		btnAddsrv = new JButton("�߰�");
		btnAddsrv.setBackground(new Color(244, 204, 204));
		btnAddsrv.setBounds(100, 100, 150, 50);
		btnAddsrv.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red, Color.red, 
				Color.red, Color.red));
		contentPane.add(btnAddsrv);
		
		btnEditSrv = new JButton("����");
		btnEditSrv.setBackground(new Color(244, 204, 204));
		btnEditSrv.setBounds(300, 100, 150, 50);
		btnEditSrv.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red, Color.red, 
				Color.red, Color.red));
		contentPane.add(btnEditSrv);
		
		btnDelSrv = new JButton("����");
		btnDelSrv.setBackground(new Color(244, 204, 204));
		btnDelSrv.setBounds(500, 100, 150, 50);
		btnDelSrv.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red, Color.red, 
				Color.red, Color.red));
		contentPane.add(btnDelSrv);
	}
}
