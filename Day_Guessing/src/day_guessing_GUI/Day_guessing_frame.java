package day_guessing_GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.util.Random;





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
		
		// Function: Import events
		// Create by Quanhui Yu
		// Date: 04/27/2024
        String filePath = "src/files_folder/Events.txt";
        Vector<String> title = new Vector<>();  //declare string vector to store the title
        Vector<String> date = new Vector<>();  //declare string vector to store the month/day/year
        Vector<String> day = new Vector<>();  //declare string vector to store the day Monday..Sunday 
        									
        try (FileInputStream events = new FileInputStream(filePath)) {
        	Scanner eventScnr = new Scanner(events);
        	eventScnr.useDelimiter(";"); // Set the delimiter to ";"
        	
            while (eventScnr.hasNext()) {
                title.add( eventScnr.next() );
                date.add( eventScnr.next() );
                day.add( eventScnr.next() );
                
            }
            
            eventScnr.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

	    //Generate random selector
        Random rand = new Random();
		int selector = rand.nextInt(title.size());

		
		JLabel lblNewLabel = new JLabel(title.get(selector));
		lblNewLabel.setBounds(153, 23, 405, 78);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		JButton btnNewButton = new JButton("Monday");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("click");
			}
		});
		btnNewButton.setBounds(60, 167, 100, 21);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Tuesday");
		btnNewButton_1.setBounds(170, 167, 100, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Wednesday");
		btnNewButton_2.setBounds(280, 167, 100, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Thrusday");
		btnNewButton_3.setBounds(396, 167, 100, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Friday");
		btnNewButton_4.setBounds(503, 167, 100, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Satarday");
		btnNewButton_5.setBounds(60, 213, 100, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Sunday");
		btnNewButton_6.setBounds(170, 213, 100, 21);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_5_1 = new JButton("Start New");
		btnNewButton_5_1.setBounds(60, 282, 141, 21);
		contentPane.add(btnNewButton_5_1);
	}
}
