package javaZalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JavaZalProject {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaZalProject window = new JavaZalProject();
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
	public JavaZalProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 3, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 99));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnNewButton, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnO = new JButton("");
		btnO.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_2.add(btnO, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton button_1 = new JButton("");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_3.add(button_1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton button_2 = new JButton("");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_4.add(button_2, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton button_3 = new JButton("");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_5.add(button_3, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton button_4 = new JButton("");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_6.add(button_4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton button_5 = new JButton("");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_7.add(button_5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton button_6 = new JButton("");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_8.add(button_6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton button_7 = new JButton("");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_9.add(button_7, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGraczO = new JLabel("Gracz O");
		lblGraczO.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblGraczO.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblGraczO, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblWynikO = new JLabel("0");
		lblWynikO.setHorizontalAlignment(SwingConstants.CENTER);
		lblWynikO.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_11.add(lblWynikO, BorderLayout.WEST);
		
		JLabel lblWynikX = new JLabel("0");
		lblWynikX.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_11.add(lblWynikX, BorderLayout.EAST);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(label, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGraczX = new JLabel("Gracz X");
		lblGraczX.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblGraczX.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblGraczX, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.ITALIC, 25));
		panel_13.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnWyjcie = new JButton("WYJ\u015ACIE");
		btnWyjcie.setFont(new Font("Tahoma", Font.ITALIC, 25));
		btnWyjcie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_15.add(btnWyjcie, BorderLayout.CENTER);
	}

}
