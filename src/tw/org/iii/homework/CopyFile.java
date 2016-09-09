package tw.org.iii.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;

public class CopyFile {
	
	 JFileChooser ch;
	 File ch1;
	 FileInputStream fin;
	 FileOutputStream fout;
	CopyFile(){
		ch =new JFileChooser();
		ch.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		if(ch.showOpenDialog(ch)==JFileChooser.APPROVE_OPTION){
		
			 ch1=ch.getSelectedFile();
			System.out.println(ch1.getAbsolutePath());
		}
		
		Copy();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new CopyFile();
		 		
	}


	 void Copy(){
		
		try {
				
		
		if(ch1.isDirectory()==true){
			
		}else{
			 fin= new FileInputStream(ch1);
			int i;
			while(( i =fin.read())==-1){
				fin.read();
			}
			
			}
		
		fout = new FileOutputStream("dir1/"+ch1.getName());
		int b;
		while((b=fin.read())!=-1){
			fout.write(b);
		}
		fout.flush();
		fout.close();
		System.out.println("OK");
		
		
		} catch (Exception e) {
			System.out.println(e.toString());
		                                  }
			
		
	}
}
