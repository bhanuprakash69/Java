import java.awt.*;

class MyFrame
{
	Frame f;
	Label L1, L2, L3, L4, L5, L6;
	TextField tf1, tf2, tf3;
	TextArea ta;
	Choice ch1;
	Choice ch2;
	Button b;
	
	MyFrame()
	{
		f = new Frame("Seshadri rao gudlavalleru engineering college ");
		L1 = new Label("Student name");
		L2 = new Label("Roll number");
		L3 = new Label("Branch");
		L4 = new Label("Gender");
		L5 = new Label("Address");
		L6 = new Label("Student Application From");
		tf1 = new TextField(10);
		tf2 = new TextField(10);
		ch1 = new Choice();
		ch1.add("CSE");
		ch1.add("AI&DS");
		ch1.add("AI&ML");
		ch1.add("ECE");
		ch1.add("EEE");
		ch1.add("IT");
		ch1.add("IOT");
		ch1.add("MECH");
		ch1.add("CIVIL");
		ch1.add("CYBER SECURITY");
		ch1.add("CHEMICAL");
		ch1.add("AERONAUTICAL");
		
		
		ch2 = new Choice();
		ch2.add("Male");
		ch2.add("Female");
		ch2.add("Nighter can't say");
		ta = new TextArea();
		b = new Button("Submit");


		// setBounds(x, y, width, height)
		L1.setBounds(50,100,100,30);
		L2.setBounds(50,150,100,30);
		L3.setBounds(50,200,100,30);
		L4.setBounds(50,250,100,30);
		L5.setBounds(50,300,100,30);
		L6.setBounds(90,50,200,50);
		
		tf1.setBounds(150,100,120,30);
		tf2.setBounds(150,150,120,30);
		ch1.setBounds(150,200,120,30);
		ch2.setBounds(150,250,120,30);
		ta.setBounds(150,300,200,70);
		b.setBounds(120,420,120,30);
		
		f.add(L1);
		f.add(L2);
		f.add(L3);
		f.add(L4);
		f.add(L5);
		f.add(L6);
		f.add(tf1);
		f.add(tf2);
		f.add(ch1);
		f.add(ch2);
		f.add(ta);
		f.add(b);


		f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
	}
}