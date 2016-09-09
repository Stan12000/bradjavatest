package tw.org.iii.homework;



import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class calculator extends JFrame implements ActionListener{

	private Object tmp;
	 JLabel label;
	 JButton c,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16;
	 
	public calculator(){
		
		super("¤pºâ½L");
		setSize(640,480);
	    setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		 label = new JLabel("123");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel center =new JPanel();
		
		top.add(label);
		

		center.setLayout(new GridLayout(4,4));
		   a1 = new  JButton("7"); 
		   a2 = new  JButton("8"); 
		   a3 = new  JButton("9");
		   a4 = new  JButton("/");
		   a5 = new  JButton("4");
		   a6 = new  JButton("5");
		   a7 = new  JButton("6");
		   a8 = new  JButton("X");
		   a9 = new  JButton("1");
		   a10 = new  JButton("2");
		   a11 = new  JButton("3");
		   a12 = new  JButton("-");
		   a13 = new  JButton("0");
		   a14 = new  JButton(".");
		   a15 = new  JButton("=");
		   a16 = new  JButton("+");
		  center.add(a1);
		  center.add(a2);
		  center.add(a3);
		  center.add(a4);
		  center.add(a5);
		  center.add(a6);
		  center.add(a7);
		  center.add(a8);
		  center.add(a9);
		  center.add(a10);
		  center.add(a11);
		  center.add(a12);
		  center.add(a13);
		  center.add(a14);
		  center.add(a15);
		  center.add(a16);
		  a1.addActionListener(this);
		  a2.addActionListener(this);
		  a3.addActionListener(this);
		  a4.addActionListener(this);
		  a5.addActionListener(this);
		  a6.addActionListener(this);
		  a7.addActionListener(this);
		  a8.addActionListener(this);
		  a9.addActionListener(this);
		  a10.addActionListener(this);
		  a11.addActionListener(this);
		  a12.addActionListener(this);
		  a13.addActionListener(this);
		  a14.addActionListener(this);
		  a15.addActionListener(this);
		  a16.addActionListener(this);
		  

		setLayout(new BorderLayout());
		add(top,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);


	  
	
	}	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new calculator();
	}  
      
      
	





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
     
     JButton c= (JButton)e.getSource();
	 //label.setText(c.getText());

	} 
	 
	 
}
	 
	