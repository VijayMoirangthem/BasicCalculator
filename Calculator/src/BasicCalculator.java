import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCalculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicCalculator window = new BasicCalculator();
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
	public BasicCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 295, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		textField.setBounds(10, 11, 258, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder (textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackSpace.setBackground(Color.LIGHT_GRAY);
		btnBackSpace.setForeground(Color.BLACK);
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnBackSpace.setBounds(10, 71, 57, 44);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number); 
			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(10, 126, 57, 44);
		frame.getContentPane().add(btn7);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number); 
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(10, 236, 57, 44);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number); 
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(10, 291, 57, 44);
		frame.getContentPane().add(btn0);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number); 
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(10, 181, 57, 44);
		frame.getContentPane().add(btn4);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(77, 71, 57, 44);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number); 
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(77, 126, 57, 44);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number); 
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(77, 181, 57, 44);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number); 
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(77, 236, 57, 44);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(Color.BLACK);
		btnDot.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setBounds(77, 291, 57, 44);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number); 
			}
		});
		btn00.setForeground(Color.BLACK);
		btn00.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn00.setBackground(Color.LIGHT_GRAY);
		btn00.setBounds(144, 71, 57, 44);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number); 
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(144, 126, 57, 44);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number); 
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(144, 181, 57, 44);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number); 
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(144, 236, 57, 44);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnEqual.setBackground(Color.LIGHT_GRAY);
		btnEqual.setBounds(144, 291, 57, 44);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setForeground(Color.BLACK);
		btnPlus.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnPlus.setBackground(Color.LIGHT_GRAY);
		btnPlus.setBounds(211, 71, 57, 44);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setForeground(Color.BLACK);
		btnMinus.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnMinus.setBackground(Color.LIGHT_GRAY);
		btnMinus.setBounds(211, 126, 57, 44);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setForeground(Color.BLACK);
		btnMultiply.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnMultiply.setBackground(Color.LIGHT_GRAY);
		btnMultiply.setBounds(211, 181, 57, 44);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setForeground(Color.BLACK);
		btnDivide.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnDivide.setBackground(Color.LIGHT_GRAY);
		btnDivide.setBounds(211, 236, 57, 44);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setForeground(Color.BLACK);
		btnPercent.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnPercent.setBackground(Color.LIGHT_GRAY);
		btnPercent.setBounds(211, 291, 57, 44);
		frame.getContentPane().add(btnPercent);
	}
}
