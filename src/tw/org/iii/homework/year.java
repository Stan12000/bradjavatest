package tw.org.iii.homework;

import java.io.*;
import java.util.Scanner;

public class year {

	public static void main(String[] args) throws IOException { 
		
		int year,i;
		
		for (i=1;i>=0;i++){
		System.out.println("�ɿ�J�~����:");
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		
		

	
		if(year%400 == 0 ){System.out.println("�|�~");}
		else if(year%100 == 0){System.out.println("���O�|�~");}
		else if(year%4 == 0){System.out.println("�|�~");}
		else{System.out.println("���O�|�~");}
		
		
		
		i = year;
		
		if(i == 0) break;
		
		}
		
	}

}
