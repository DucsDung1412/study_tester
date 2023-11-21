package view;

import static org.testng.Assert.fail;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class testJF extends JFrame {

	private JPanel contentPane;
	private JTextField txt_age;
	private JTextField txt_name;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testJF frame = new testJF();
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
	public testJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JButton btnLogin = new JButton("Click Me");
		btnLogin.setName("btnLogin");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_name.getText().equals("DungVipPro") && txt_age.getText().equals("23")) {
					lbl.setText("Dung");
				} else {
					lbl.setText("Sai");
				}
			}
		});
		this.setLocationRelativeTo(null);
		
		txt_name = new JTextField();
		txt_name.setName("txt_name");
		contentPane.add(txt_name);
		txt_name.setColumns(10);
		
		txt_age = new JTextField();
		contentPane.add(txt_age);
		txt_age.setName("txt_age");
		txt_age.setColumns(10);
		contentPane.add(btnLogin);
		setContentPane(contentPane);
		
		lbl = new JLabel("New label");
		lbl.setName("lbl");
		contentPane.add(lbl);
	}

}
