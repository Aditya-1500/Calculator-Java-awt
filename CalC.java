import java.awt.*;
import java.awt.event.*;

public class CalC extends Frame implements ActionListener {
	
	TextField tf;
	Button log, fact, power, root, pi, exp, percent, divide, multiply, subtract, plus, equal, clear, decimal, sin, cos, tan, invert, square;
	Button zero, one, two, three, four, five, six, seven, eight, nine;
	boolean equal_pressed = false;	
	static char op = '$';

	public CalC(){
		this.setTitle("Calculator");		
		this.setSize(400,400);
		this.setPreferredSize(getSize());
		this.setFont(new Font("Serif",Font.BOLD,22));;

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		this.setLayout(layout);

		gbc.weightx = 1;
		gbc.weighty = 1;

		// Input/Output TextField
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 5;
		gbc.ipady = 10;
		gbc.ipadx = 5;
		tf = new TextField();
//		tf.setEditable(false);
		tf.setBackground(new Color(230,253,253));
		tf.setForeground(new Color(0,0,80));
		tf.setFont(new Font("Serif",Font.BOLD,40));
		this.add(tf,gbc);
	
		//First Row
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 1;
		percent = new Button("%");
		this.add(percent,gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		fact = new Button("n!");
		this.add(fact,gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		log = new Button("log");
		this.add(log,gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		exp = new Button("e");
		this.add(exp,gbc);

		gbc.gridx = 4;
		gbc.gridy = 1;
		pi = new Button("\u03C0");
		this.add(pi,gbc);

		//Second Row
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 2;
		root = new Button("\u221A");
		this.add(root,gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		square = new Button("x\u00B2");
		this.add(square,gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;
		power = new Button("^");
		this.add(power,gbc);

		gbc.gridx = 3;
		gbc.gridy = 2;
		divide = new Button("/");
		this.add(divide,gbc);

		gbc.gridx = 4;
		gbc.gridy = 2;
		sin = new Button("sin");
		this.add(sin,gbc);

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

		gbc.gridx = 4;
		gbc.gridy = 3;
		cos = new Button("cos");
		this.add(cos,gbc);

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

		gbc.gridx = 4;
		gbc.gridy = 4;
		tan = new Button("tan");
		this.add(tan,gbc);

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

		gbc.gridx = 4;
		gbc.gridy = 5;
		invert = new Button("1/x");
		this.add(invert,gbc);

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
		gbc.gridwidth  = 2;
		equal = new Button("=");
		this.add(equal,gbc);
		
		this.setForeground(Color.BLUE);
		this.setBackground(Color.WHITE);

		log.setBackground(Color.WHITE);
		log.setForeground(new Color(255,200,0));
		fact.setBackground(Color.WHITE);
		fact.setForeground(new Color(255,200,0));
		power.setBackground(Color.WHITE);
		power.setForeground(new Color(255,200,0));
		root.setBackground(Color.WHITE);
		root.setForeground(new Color(255,200,0));
		pi.setBackground(Color.WHITE);
		pi.setForeground(new Color(255,200,0));
		exp.setBackground(Color.WHITE);
		exp.setForeground(new Color(255,200,0));
		percent.setBackground(Color.WHITE);
		percent.setForeground(new Color(255,200,0));
		divide.setBackground(Color.WHITE);
		divide.setForeground(new Color(255,200,0));
		plus.setBackground(Color.WHITE);
		plus.setForeground(new Color(255,200,0));
		subtract.setBackground(Color.WHITE);
		subtract.setForeground(new Color(255,200,0));
		subtract.setFont(new Font("Serif", Font.BOLD, 30));
		multiply.setBackground(Color.WHITE);
		multiply.setForeground(new Color(255,200,0));
		sin.setBackground(Color.WHITE);
		sin.setForeground(new Color(255,200,0));
		cos.setBackground(Color.WHITE);
		cos.setForeground(new Color(255,200,0));
		tan.setBackground(Color.WHITE);
		tan.setForeground(new Color(255,200,0));
		invert.setBackground(Color.WHITE);
		invert.setForeground(new Color(255,200,0));
		square.setBackground(Color.WHITE);
		square.setForeground(new Color(255,200,0));

		zero.setBackground(Color.WHITE);
		one.setBackground(Color.WHITE);
		two.setBackground(Color.WHITE);
		three.setBackground(Color.WHITE);
		four.setBackground(Color.WHITE);
		five.setBackground(Color.WHITE);
		six.setBackground(Color.WHITE);
		seven.setBackground(Color.WHITE);
		eight.setBackground(Color.WHITE);
		nine.setBackground(Color.WHITE);

		decimal.setBackground(Color.WHITE);
		equal.setBackground(new Color(255,145,0));
		equal.setForeground(Color.WHITE);
		equal.setFont(new Font("Serif",Font.BOLD,30));
		
		clear.setBackground(Color.WHITE);
		clear.setForeground(new Color(255,0,0));

		log.addActionListener(this);
		fact.addActionListener(this);
		power.addActionListener(this);
		root.addActionListener(this);
		pi.addActionListener(this);
		exp.addActionListener(this);
		percent.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		plus.addActionListener(this);
		subtract.addActionListener(this);
		equal.addActionListener(this);
		decimal.addActionListener(this);
		clear.addActionListener(this);
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		invert.addActionListener(this);
		square.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		tan.addActionListener(this);
		
		tf.setText("0");
				
		this.setVisible(true);

		addWindowListener(new WindowAdapter()  {  
			public void windowClosing(WindowEvent ev)  
				{System.exit(0);}  
			});  
		}

	public void actionPerformed(ActionEvent ae){
		String txt = tf.getText();
		if(ae.getSource() == zero){
			if(equal_pressed){
				tf.setText("0");
				equal_pressed = false;
			}
			if(txt.equals("0")){}
			else
				tf.setText(txt+"0");
		}
		if(ae.getSource() == one){
			if(equal_pressed){
				tf.setText("1");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("1"); }
				else{ tf.setText(txt+"1"); }
			}
		}
		if(ae.getSource() == two){
			if(equal_pressed){
				tf.setText("2");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("2"); }
				else{ tf.setText(txt+"2"); }
			}
		}
		if(ae.getSource() == three){
			if(equal_pressed){
				tf.setText("3");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("3"); }
				else{ tf.setText(txt+"3"); }
			}
		}
		if(ae.getSource() == four){
			if(equal_pressed){
				tf.setText("4");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("4"); }
				else{ tf.setText(txt+"4"); }
			}
		}
		if(ae.getSource() == five){
			if(equal_pressed){
				tf.setText("5");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("5"); }
				else{ tf.setText(txt+"5"); }
			}
		}
		if(ae.getSource() == six){
			if(equal_pressed){
				tf.setText("6");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("6"); }
				else{ tf.setText(txt+"6"); }
			}
		}
		if(ae.getSource() == seven){
			if(equal_pressed){
				tf.setText("7");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("7"); }
				else{ tf.setText(txt+"7"); }
			}
		}
		if(ae.getSource() == eight){
			if(equal_pressed){
				tf.setText("8");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("8"); }
				else{ tf.setText(txt+"8"); }
			}
		}
		if(ae.getSource() == nine){
			if(equal_pressed){
				tf.setText("9");
				equal_pressed = false;
			}
			else{
				if(txt.equals("0")){ tf.setText("9"); }
				else{ tf.setText(txt+"9"); }
			}
		}
		if(ae.getSource() == decimal){
			if(equal_pressed){
				tf.setText("0.");
				equal_pressed = true;
			}
			else{
				if(txt.charAt(txt.length()-1) >= '0' && txt.charAt(txt.length()-1) <= '9'){
					tf.setText(txt+".");
				}
			}
		}

		if(ae.getSource() == fact){
			int n = Integer.parseInt(txt);
			tf.setText(String.valueOf(getFactorial(n)));
		}
		if(ae.getSource() == root){
			double x = Double.parseDouble(txt);
			tf.setText(String.valueOf(Math.sqrt(x)));
		}
		if(ae.getSource() == square){
			double x = Double.parseDouble(txt);
			tf.setText(String.valueOf(x*x));
		}
		if(ae.getSource() == percent){
			double n = Double.parseDouble(txt);
			tf.setText(String.valueOf(n/100));
		}
		if(ae.getSource() == invert){
			double x = Double.parseDouble(txt);
			tf.setText(String.valueOf(1/x));
		}
		if(ae.getSource() == sin){
			double angle = Double.parseDouble(txt);
			double radians = Math.toRadians(angle);
			tf.setText(String.valueOf(Math.sin(radians)));
		}
		if(ae.getSource() == cos){
			double angle = Double.parseDouble(txt);
			double radians = Math.toRadians(angle);
			tf.setText(String.valueOf(Math.cos(radians)));
		}
		if(ae.getSource() == tan){
			double angle = Double.parseDouble(txt);
			double radians = Math.toRadians(angle);
			tf.setText(String.valueOf(Math.tan(radians)));
		}
		if(ae.getSource() == log){
			double x = Double.parseDouble(txt);
			tf.setText(String.valueOf(Math.log(x)));
		}

		if(ae.getSource() == pi){
			if(equal_pressed){ 
				tf.setText(String.valueOf(Math.PI));
				equal_pressed = false;
			}
			else {
				if(txt.charAt(txt.length()-1) >= '0' && txt.charAt(txt.length()-1) <='9'){ tf.setText(String.valueOf(Math.PI)); }
				else { tf.setText(txt+String.valueOf(Math.PI)); }
			}
		}
		if(ae.getSource() == exp){
			if(equal_pressed){ 
				tf.setText(String.valueOf(Math.E));
				equal_pressed = false;
			}
			else {
				if(txt.charAt(txt.length()-1) >= '0' && txt.charAt(txt.length()-1) <='9'){ tf.setText(String.valueOf(Math.E)); }
				else { tf.setText(txt+String.valueOf(Math.E)); }
			}
		}

		if(ae.getSource() == plus){
			if(op == '$') {
				tf.setText(txt+"+");
				equal_pressed = false;
				op = '+';
			}
			else if(txt.charAt(txt.length()-1) >= '0' && txt.charAt(txt.length()-1) <= '9') {
				int idx = txt.indexOf(op);
				double res = evaluateExp(txt,idx);
				tf.setText(String.valueOf(res)+"+");
				op = '+';
			}
			else {
				tf.setText(txt.substring(0,txt.length()-1)+"+");
				op = '+';
			}
		}
		if(ae.getSource() == subtract){}
		if(ae.getSource() == multiply){
			if(op == '$') {
				tf.setText(txt+"*");
				equal_pressed = false;
				op = '*';
			}
			else if(txt.charAt(txt.length()-1) >= '0' && txt.charAt(txt.length()-1) <= '9') {
				int idx = txt.indexOf(op);
				double res = evaluateExp(txt,idx);
				tf.setText(String.valueOf(res)+"*");
				op = '*';
			}
			else {
				tf.setText(txt.substring(0,txt.length()-1)+"*");
				op = '*';
			}
		}
		if(ae.getSource() == divide){
			if(op == '$') {
				tf.setText(txt+"/");
				equal_pressed = false;
				op = '/';
			}
			else if(txt.charAt(txt.length()-1) >= '0' && txt.charAt(txt.length()-1) <= '9') {
				int idx = txt.indexOf(op);
				double res = evaluateExp(txt,idx);
				tf.setText(String.valueOf(res)+"/");
				op = '/';
			}
			else {
				tf.setText(txt.substring(0,txt.length()-1)+"/");
				op = '/';
			}
		}
		if(ae.getSource() == power){
			if(op == '$') {
				tf.setText(txt+"^");
				equal_pressed = false;
				op = '^';
			}
			else if(txt.charAt(txt.length()-1) >= '0' && txt.charAt(txt.length()-1) <= '9') {
				int idx = txt.indexOf(op);
				double res = evaluateExp(txt,idx);
				tf.setText(String.valueOf(res));
				op = '^';
			}
			else {
				tf.setText(txt.substring(0,txt.length()-1)+"^");
				op = '^';
			}
		}

		if(ae.getSource() == clear){
			tf.setText("0");
			op = '$';
			equal_pressed = false;
		}
		if(ae.getSource() == equal){
			if(op != '$'){
				int idx = txt.indexOf(op);
				double res = evaluateExp(txt,idx);
				tf.setText(String.valueOf(res));
				op = '$';
				equal_pressed = true;
			}
		}
	}

	static double evaluateExp(String exp, int idx) {
		String first = exp.substring(0,idx);
		String second = exp.substring(idx+1,exp.length());
		double op1 = Double.parseDouble(first);
		double op2 = Double.parseDouble(second);
		switch(op){
			case '+':	return op1 + op2;
			case '-':	return op1 - op2;
			case '*':	return op1 * op2;
			case '/':	return op1 / op2;
			case '^':	return Math.pow(op1,op2);
		}
		return 0;
	}
	
	static int getFactorial(int n){
//		if(n < 0)
//			throw new Exception();
		if(n==0)
			return 1;
		int f = 1;
		for(int i=n;i>0;i--){
			f = f*i;
		}
		return f;
	}	
	
	public static void main(String[] args){
		new CalC();
	}
}
