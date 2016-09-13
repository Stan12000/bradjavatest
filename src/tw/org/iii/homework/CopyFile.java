package tw.org.iii.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;

public class CopyFile {
	
	 JFileChooser ch;
	 File ch1,ch2;
	 File[] f,s;
	 FileInputStream fin;
	 FileOutputStream fout;
	CopyFile(){
		ch =new JFileChooser();
		ch.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		if(ch.showOpenDialog(ch)==JFileChooser.APPROVE_OPTION){
		
			 ch1=ch.getSelectedFile();
			System.out.println(ch1.getAbsolutePath());
		}
		
		ch2 =new File("dir1/");
		Copy(ch1,ch2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new CopyFile();
		 		
	}


	 void Copy(File ch1,File ch2){
		
		try {
				
		
		if(ch1.isDirectory()==true){
		
			ch2.mkdir();
		
			for( File f:ch1.listFiles()){
				System.out.println(f);
			    Copy(f,new File(ch2,f.getName()));
				}
			
			
		 
		}else{
			fout = new FileOutputStream("dir1/"+ch1.getName());
			fin= new FileInputStream(ch1);
			int i;
			byte[] b = new byte[1024];
			while(( i =fin.read(b))!=-1){
				fout.write(b);;
			}
			fout.flush();
		    fout.close();
		    System.out.println("OK");
		
		
		} 
			}
		
        catch (Exception e) {
			System.out.println(e.toString());
		                                  }
			
		
	}
}
