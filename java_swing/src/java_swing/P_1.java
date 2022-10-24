package java_swing;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

// ComLogin
public class P_1 extends JFrame {
	private JPanel contentPane;
	private JTextField comPw;
	private JTextField comId;
	private JButton btnComLogin;
	private JButton btnComJoin;
	private JLabel lbGrayCat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_1 frame = new P_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Image & Component Draw
//	@Override
//	public void paint(Graphics g) {
//		Toolkit tool = Toolkit.getDefaultToolkit();
//		Image img = tool.getImage("img/grayCat.png");
//		g.drawImage(img, 800, 215, 305, 153, this);
//		comId.updateUI();
//		comPw.updateUI();
//		btnComLogin.updateUI();
//		btnComJoin.updateUI();
//	}

	/**
	 * Create the frame.
	 */
	public P_1() {
		setTitle("\uB2E4\uACE0\uCCD0\uCE74\uC13C\uD130");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comPw = new JTextField();
		comPw.setBounds(752, 399, 404, 66);
		comPw.setText("\uBE44\uBC00\uBC88\uD638");
		comPw.setHorizontalAlignment(SwingConstants.CENTER);
		comPw.setColumns(10);
		comPw.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red, Color.red, 
				Color.red, Color.red));
		contentPane.add(comPw);
		
		comId = new JTextField();
		comId.setBounds(752, 323, 404, 66);
		comId.setText("\uC544\uC774\uB514");
		comId.setHorizontalAlignment(SwingConstants.CENTER);
		comId.setColumns(10);
		comId.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red, Color.red, 
				Color.red, Color.red));
		contentPane.add(comId);
		
		btnComLogin = new JButton("\uB85C\uADF8\uC778");
		btnComLogin.setBounds(752, 520, 404, 71);
		btnComLogin.setForeground(new Color(0, 0, 0));
		btnComLogin.setBackground(new Color(244, 204, 204));
		btnComLogin.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red, Color.red, 
				Color.red, Color.red));
		contentPane.add(btnComLogin);
		
		btnComJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnComJoin.setBounds(752, 601, 404, 71);
		btnComJoin.setBackground(new Color(244, 204, 204));
		btnComJoin.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red, Color.red, 
				Color.red, Color.red));
		contentPane.add(btnComJoin);
		
		ImageIcon img = new ImageIcon("img/grayCat.png");
		lbGrayCat = new JLabel("", img, JLabel.CENTER);
		lbGrayCat.setBounds(800, 170, 305, 153);
		contentPane.add(lbGrayCat);
		
		// Font Setting
		try {
            InputStream inputStream = new BufferedInputStream(
                    new FileInputStream("font/NanumBarunGothic.ttf"));

            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);

            comPw.setFont(font.deriveFont(Font.BOLD, 24));
            comId.setFont(font.deriveFont(Font.BOLD, 24));
            btnComLogin.setFont(font.deriveFont(Font.BOLD, 24));
            btnComJoin.setFont(font.deriveFont(Font.BOLD, 24));

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
