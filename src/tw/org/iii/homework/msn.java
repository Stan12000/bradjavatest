package tw.org.iii.homework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class msn extends JFrame {
	static JTextArea area1;
	static JTextField field;
	JButton   button;
	static String message;
	public msn(){
		super("µøµ¡");
		
		
		area1 = new JTextArea();
		JScrollPane area =new JScrollPane(area1);
		add(area,BorderLayout.CENTER);
		JPanel p1 = new JPanel();	
		field =new JTextField(20);
		
		button = new JButton("B");
		p1.add(field);
		p1.add(button);
		add(p1,BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent  l) {
	
				doSend();
			}
		});
		
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		}
	
	
	
	protected void doSend() {
		// TODO Auto-generated method stub

		
		try {		
			String str =field.getText();
	
		     byte[] message = str.getBytes();
			DatagramPacket packet =new DatagramPacket(message, message.length, InetAddress.getByName("127.0.0.1"),8888);
			DatagramSocket socket =new DatagramSocket();
//			Socket client =new Socket();
//			BufferedOutputStream bout = new BufferedOutputStream(client.getOutputStream());
			socket.send(packet);
			socket.close();
			field.setText(null);
			System.out.println("send ok");
		} catch (IOException e) {
			
			System.out.println(e.toString());;
		}
		
	}



	public static void main(String[] args) {
	new msn();
	int b =1;
	while(b>0){
	receive();
	}
	}

    public static void receive(){
    	
    
    	byte[]  buf = new byte[1024];
		try {
//			ServerSocket server;
//			server = new ServerSocket(8888);
//			Socket socket = server.accept();
//			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			
			DatagramSocket socket =new DatagramSocket(8888);
			DatagramPacket packet =new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			InetAddress ip = packet.getAddress();
			byte[] data =packet.getData();
	         area1.setText(new String(data));
			socket.close();
			
			
//			int c ;
//			while((c=bin.read())!=-1){
//			System.out.println((char)c);
//			}
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
    	
    }


}


