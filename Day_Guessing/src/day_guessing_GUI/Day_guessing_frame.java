package day_guessing_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Day_guessing_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Day_guessing_frame frame = new Day_guessing_frame();
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
	public Day_guessing_frame() {
		setTitle("Day Guessing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Monday");
		btnNewButton.setBounds(83, 167, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Display Data for day guessing");
		lblNewLabel.setBounds(153, 23, 405, 78);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Tuesday");
		btnNewButton_1.setBounds(193, 167, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Wednesday");
		btnNewButton_2.setBounds(293, 167, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Thrusday");
		btnNewButton_3.setBounds(396, 167, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Friday");
		btnNewButton_4.setBounds(503, 167, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Satarday");
		btnNewButton_5.setBounds(193, 213, 85, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Sunday");
		btnNewButton_6.setBounds(293, 213, 85, 21);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_5_1 = new JButton("Start New");
		btnNewButton_5_1.setBounds(83, 282, 85, 21);
		contentPane.add(btnNewButton_5_1);
	}
}
