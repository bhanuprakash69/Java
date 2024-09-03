import java.awt.*;
import java.awt.event.*;

public class ButtonDemo implements ActionListener
{
	Frame f;

	TextField tf;
	Button b[] = new Button[10];
	Button ps, ms, ml, dv, eq, ce;
	int x, y, z;
	String op;

	ButtonDemo()
	{
		f = new Frame("Calculator");	
		
		tf = new TextField(10);
		f.add(tf);
		
		
		ps = new Button("+");
		f.add(ps);
		ps.addActionListener(this);
		
		ms = new Button("-");
		f.add(ms);
		ms.addActionListener(this);
		
		ml = new Button("x");
		f.add(ml);
		ml.addActionListener(this);
		
		dv = new Button("/");
		f.add(dv);
		dv.addActionListener(this);
		
		eq = new Button("=");
		f.add(eq);
		eq.addActionListener(this);

		ce = new Button("C");
		f.add(ce);
		ce.addActionListener(this);
		 	
		
		for(int i=0;i<=9;i++)
		{
			b[i] = new Button( ""+i );
			f.add(b[i]);
			b[i].addActionListener(this);
		}		
	
		f.setSize(400,400);
		f.setLayout(new GridLayout(4,5));
		f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
	
		String btvalue= ae.getActionCommand();
		
		if(btvalue=="+" || btvalue=="-" || btvalue=="x" || btvalue=="/")
		{
			x = Integer.parseInt(tf.getText());
			tf.setText(""+0);
			op = btvalue;
		}
		else if(btvalue=="=")
		{
			y = Integer.parseInt(tf.getText());
			if(op=="+")
			{
				z = x+y;
			}
			else if(op=="-")
			{
				z = x-y;
			}
			else if(op=="x")
			{
				z = x*y;
			}
			else if(op=="/")
			{
				z = x/y;
			}
			tf.setText(""+z);
			op="";
			x=0;
			y=0;
		}
		else if(btvalue=="C")
		{
			tf.setText("");
			op="";
			x=0;
			y=0;
		}
		else
		{
			String n = tf.getText()+btvalue;
			tf.setText(n);
		}
	}

	public static void main(String[] args)
	{
		new ButtonDemo();
	}
}