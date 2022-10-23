package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SrvReg extends JFrame {

	private JPanel contentPane;
	private JTextField srvName;
	private JTextField srvPrice;
	private final JButton btnSrvReg = new JButton("등록");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SrvReg frame = new SrvReg();
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
	public SrvReg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SrvReg.class.getResource("/img/grayCat.png")));
		lblNewLabel.setBounds(720, 57, 310, 94);
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBounds(146, 234, 626, 579);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSrvName = new JLabel("서비스명");
		lblSrvName.setFont(new Font("NanumBarunGothic", Font.PLAIN, 21));
		lblSrvName.setBounds(37, 35, 140, 55);
		panel.add(lblSrvName);
		
		JLabel lblSrvTech = new JLabel("서비스 제공 정비사 선택");
		lblSrvTech.setFont(new Font("NanumBarunGothic", Font.PLAIN, 21));
		lblSrvTech.setBounds(37, 156, 356, 55);
		panel.add(lblSrvTech);
		
		JLabel lblSrvPrice = new JLabel("서비스 가격 (공임비)");
		lblSrvPrice.setFont(new Font("NanumBarunGothic", Font.PLAIN, 21));
		lblSrvPrice.setBounds(37, 301, 259, 55);
		panel.add(lblSrvPrice);
		
		srvName = new JTextField();
		srvName.setFont(new Font("NanumBarunGothic", Font.PLAIN, 21));
		srvName.setBounds(37, 89, 546, 45);
		panel.add(srvName);
		srvName.setColumns(10);
		
		JComboBox selectedSrvTech = new JComboBox();
		selectedSrvTech.setModel(new DefaultComboBoxModel(new String[] {"김하하", "이나나"}));
		selectedSrvTech.setToolTipText("");
		selectedSrvTech.setFont(new Font("NanumBarunGothic", Font.PLAIN, 21));
		selectedSrvTech.setBounds(37, 218, 273, 45);
		panel.add(selectedSrvTech);
		
		srvPrice = new JTextField();
		srvPrice.setFont(new Font("NanumBarunGothic", Font.PLAIN, 21));
		srvPrice.setColumns(10);
		srvPrice.setBounds(37, 368, 546, 45);
		panel.add(srvPrice);
		btnSrvReg.setBounds(247, 478, 140, 45);
		panel.add(btnSrvReg);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(966, 234, 571, 579);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JList listSrv = new JList();
		listSrv.setFont(new Font("NanumBarunGothic", Font.PLAIN, 12));
		listSrv.setBounds(22, 79, 528, 457);
		panel_1.add(listSrv);
		
		JLabel lblListSrv = new JLabel("등록된 서비스 목록");
		lblListSrv.setFont(new Font("NanumBarunGothic", Font.PLAIN, 21));
		lblListSrv.setBounds(201, 22, 191, 45);
		panel_1.add(lblListSrv);
		
		JButton btnComSignUp = new JButton("회원가입 완료");
		btnComSignUp.setFont(new Font("NanumBarunGothic", Font.PLAIN, 22));
		btnComSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComSignUp.setBounds(741, 862, 265, 52);
		contentPane.add(btnComSignUp);
	}
}