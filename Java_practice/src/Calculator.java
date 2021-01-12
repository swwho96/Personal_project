import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame{
	public Calculator() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
		
		JPanel display = new JPanel();
		JPanel calculate = new JPanel();
		
		display.add(new JTextField(30));
		
		
		calculate.setLayout(new GridLayout(6,4));
		calculate.add(new JButton("%"));
		calculate.add(new JButton("CE"));
		calculate.add(new JButton("C"));
		calculate.add(new JButton("Del"));
		calculate.add(new JButton("1/x"));
		calculate.add(new JButton("x^2"));
		calculate.add(new JButton("root(x)"));
		calculate.add(new JButton("/"));
		calculate.add(new JButton("7"));
		calculate.add(new JButton("8"));
		calculate.add(new JButton("9"));
		calculate.add(new JButton("*"));
		calculate.add(new JButton("4"));

		getContentPane().add(display, BorderLayout.CENTER);
		getContentPane().add(calculate, BorderLayout.SOUTH);
		setSize(1000,700);
		setVisible(true);
	}
	public static void main(String[] str) {
		new Calculator();
	}
}
