import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame{
	
	
	public Calculator() {		
		JFrame frame = new JFrame();
		JPanel display = new JPanel();
		JPanel calculate = new JPanel();
		
		frame.setTitle("계산기");
		frame.setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
		
		display.setLayout(null);
		display.setSize(50, 50);
		display.setBackground(Color.GREEN);
		display.add(new JTextArea(2,30));
		display.add(new JTextArea(2,30));
		
		calculate.setLayout(new GridLayout(6,4));
		calculate.setBackground(Color.GREEN);
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
		calculate.add(new JButton("5"));
		calculate.add(new JButton("6"));
		calculate.add(new JButton("-"));
		calculate.add(new JButton("1"));
		calculate.add(new JButton("2"));
		calculate.add(new JButton("3"));
		calculate.add(new JButton("+"));
		calculate.add(new JButton("+/-"));
		calculate.add(new JButton("0"));
		calculate.add(new JButton("."));
		calculate.add(new JButton("="));

		frame.setLayout(new GridLayout(3,1));
		frame.setSize(1000,1000);
		frame.setVisible(true);
		frame.add(display);
		frame.add(calculate);
	}
	
	
	//계산기 실행
	public static void main(String[] str) {
		new Calculator();
	}
}
