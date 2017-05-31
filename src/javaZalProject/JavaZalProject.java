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
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JavaZalProject {

	private JFrame frame;
	
	private String startGry = "X";
	
	private int licznikX = 0, licznikO = 0;
	private JLabel lblWynikO , lblWynikX;
	private JLabel btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	

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
	public JavaZalProject() 
	{
		initialize();
		//wynikGry();
	}
	
	private void wynikGry()
	{
		lblWynikX.setText(String.valueOf(licznikX));
		lblWynikO.setText(String.valueOf(licznikO));
	}

	private void wybierzGracza()
	{
		if(startGry.equalsIgnoreCase("X"))
		{
			startGry="0";
		}
		else
		{
			startGry="X";
		}
	}
	
	private void wygranaGra()
	{
		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();
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
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn1.setForeground(Color.RED);
				}
				else
				{
					btn1.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.RED);
				}
				else
				{
					btn2.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.RED);
				}
				else
				{
					btn3.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.RED);
				}
				else
				{
					btn4.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_4.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.RED);
				}
				else
				{
					btn5.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_5.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.RED);
				}
				else
				{
					btn6.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_6.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.RED);
				}
				else
				{
					btn7.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_7.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.RED);
				}
				else
				{
					btn8.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_8.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGry);
				if(startGry.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.RED);
				}
				else
				{
					btn9.setForeground(Color.BLUE);
				}
				wybierzGracza();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 99));
		panel_9.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGraczO = new JLabel("Gracz O");
		lblGraczO.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblGraczO.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblGraczO, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
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
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null); 
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
			}
		});
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
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Czy na pewno chesz wyj�� ?","K�ko i krzy�yk",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		panel_15.add(btnWyjcie, BorderLayout.CENTER);
	}

}
