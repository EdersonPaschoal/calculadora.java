package calculadora;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;
	
	Double valor1, valor2;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBackground(Color.WHITE);
		textResultado.setForeground(Color.BLACK);
		textResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		textResultado.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		textResultado.setBounds(10, 76, 305, 26);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "7");
			}
		});
		btn7.setBounds(10, 113, 55, 43);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "8");
			}
		});
		btn8.setBounds(75, 113, 55, 43);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "9");
			}
		});
		btn9.setBounds(136, 113, 55, 43);
		contentPane.add(btn9);
		
		JButton btnON = new JButton("ON");
		btnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText("");
			}
		});
		btnON.setBounds(196, 113, 55, 43);
		contentPane.add(btnON);
		
		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				operacao = "soma";
			}
		});
		btnMais.setBounds(260, 113, 55, 43);
		contentPane.add(btnMais);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "4");
			}
		});
		btn4.setBounds(10, 167, 55, 43);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "5");
			}
		});
		btn5.setBounds(75, 167, 55, 43);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "6");
			}
		});
		btn6.setBounds(136, 167, 55, 43);
		contentPane.add(btn6);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText("");
			}
		});
		btnC.setBounds(196, 167, 55, 43);
		contentPane.add(btnC);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				operacao = "subtracao";
				
				
			}
		});
		btnMenos.setBounds(260, 167, 55, 43);
		contentPane.add(btnMenos);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "1");
			}
		});
		btn1.setBounds(10, 219, 55, 43);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "2");
			}
		});
		btn2.setBounds(75, 219, 55, 43);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ "3");
			}
		});
		btn3.setBounds(136, 219, 55, 43);
		contentPane.add(btn3);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor2 = Double.parseDouble(textResultado.getText());
				if(operacao == "soma") {
					textResultado.setText(String.valueOf(valor1 + valor2));					
				}else if(operacao == "subtracao") {
					textResultado.setText(String.valueOf(valor1 - valor2));					
				}else if(operacao == "multiplicacao") {
					textResultado.setText(String.valueOf(valor1 * valor2));
				}else if(operacao == "divisao") {
					textResultado.setText(String.valueOf(valor1 / valor2));
				}
			}
		});
		btnIgual.setBounds(196, 219, 55, 97);
		contentPane.add(btnIgual);
		
		JButton btnVezes = new JButton("*");
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				operacao = "multiplicacao";
			}
		});
		btnVezes.setBounds(260, 219, 55, 43);
		contentPane.add(btnVezes);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				textResultado.setText(textResultado.getText()+ "0");
			}
		});
		btn0.setBounds(10, 273, 120, 43);
		contentPane.add(btn0);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText(textResultado.getText()+ ".");
			}
		});
		btnPonto.setBounds(136, 273, 55, 43);
		contentPane.add(btnPonto);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(textResultado.getText());
				textResultado.setText("");
				operacao = "divisao";
				
			}
		});
		btnDividir.setBounds(260, 273, 55, 43);
		contentPane.add(btnDividir);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(98, 26, 133, 39);
		contentPane.add(lblNewLabel);
	}
}
