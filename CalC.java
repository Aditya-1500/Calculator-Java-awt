import java.awt.*;
import java.awt.event.*;

public class CalC extends Frame {
	
	TextField tf;
	Button log, fact, power, root, pi, exp, percent, divide, multiply, subtract, plus, equal, clear, decimal;
	Button zero, one, two, three, four, five, six, seven, eight, nine;
	public CalC(){
		this.setTitle("Calculator");
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		this.setLayout(layout);

		gbc.weightx = 1;
		gbc.weighty = 1;

		// Input/Output TextField
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.ipady = 20;
		gbc.ipadx = 10;
		tf = new TextField();
		this.add(tf,gbc);
		
		//First Row
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 1;
		log = new Button("ln");
		this.add(log,gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		fact = new Button("n!");
		this.add(fact,gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		power = new Button("^");
		this.add(power,gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		root = new Button("\u221A");
		this.add(root,gbc);

		//Second Row
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 2;
		pi = new Button("\u03C0");
		this.add(pi,gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		exp = new Button("e");
		this.add(exp,gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;
		percent = new Button("%");
		this.add(percent,gbc);

		gbc.gridx = 3;
		gbc.gridy = 2;
		divide = new Button("/");
		this.add(divide,gbc);

		//Third Row
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 3;
		seven = new Button("7");
		this.add(seven,gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		eight = new Button("8");
		this.add(eight,gbc);

		gbc.gridx = 2;
		gbc.gridy = 3;
		nine = new Button("9");
		this.add(nine,gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		multiply = new Button("*");
		this.add(multiply,gbc);

		//Fourth Row
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 4;
		four = new Button("4");
		this.add(four,gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		five = new Button("5");
		this.add(five,gbc);

		gbc.gridx = 2;
		gbc.gridy = 4;
		six = new Button("6");
		this.add(six,gbc);

		gbc.gridx = 3;
		gbc.gridy = 4;
		subtract = new Button("-");
		this.add(subtract,gbc);

		//Fifth Row
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 5;
		one = new Button("1");
		this.add(one,gbc);

		gbc.gridx = 1;
		gbc.gridy = 5;
		two = new Button("2");
		this.add(two,gbc);

		gbc.gridx = 2;
		gbc.gridy = 5;
		three = new Button("3");
		this.add(three,gbc);

		gbc.gridx = 3;
		gbc.gridy = 5;
		plus = new Button("+");
		this.add(plus,gbc);

		//Sixth Row
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 6;
		decimal = new Button(".");
		this.add(decimal,gbc);

		gbc.gridx = 1;
		gbc.gridy = 6;
		zero = new Button("0");
		this.add(zero,gbc);

		gbc.gridx = 2;
		gbc.gridy = 6;
		clear = new Button("AC");
		this.add(clear,gbc);

		gbc.gridx = 3;
		gbc.gridy = 6;
		equal = new Button("=");
		this.add(equal,gbc);

				
		this.setSize(400,400);
		this.setPreferredSize(getSize());
		this.setVisible(true);

		addWindowListener(new WindowAdapter()  {  
			public void windowClosing(WindowEvent ev)  
				{System.exit(0);}  
			});  
		}
		
	public static void main(String[] args){
		new CalC();
	}
}
