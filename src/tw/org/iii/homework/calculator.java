package tw.org.iii.homework;



import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator extends JFrame implements ActionListener{

	
	public calculator(){
		
		super("§p∫‚ΩL");
		setSize(640,480);
	    setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("	≈„•‹");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel center =new JPanel();
		top.add(label);
		

		center.setLayout(new GridLayout(4,4));
		  Button a1 = new  Button("7");
		  Button a2 = new  Button("8");
		  Button a3 = new  Button("9");
		  Button a4 = new  Button("/");
		  Button a5 = new  Button("4");
		  Button a6 = new  Button("5");
		  Button a7 = new  Button("6");
		  Button a8 = new  Button("X");
		  Button a9 = new  Button("1");
		  Button a10 = new  Button("2");
		  Button a11 = new  Button("3");
		  Button a12 = new  Button("-");
		  Button a13 = new  Button("0");
		  Button a14 = new  Button(".");
		  Button a15 = new  Button("=");
		  Button a16 = new  Button("+");
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
		  a1.addActionListener(new Listener());
		  
		  

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

		 String b = "7";

		
	}

 }

 class Listener implements ActionListener{
	 
	 public void actionPerformed(ActionEvent ee){
		 String b = "7";
		 
	 }
	 
	 }
 