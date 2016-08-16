package tw.org.iii.homework;

import java.io.*;
import java.util.Scanner;

public class year {

	public static void main(String[] args) throws IOException { 
		
		int year,i;
		
		for (i=1;i>=0;i++){
		System.out.println("糗輸入年粉ˋ:");
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		
		

	
		if(year%400 == 0 ){System.out.println("閏年");}
		else if(year%100 == 0){System.out.println("不是閏年");}
		else if(year%4 == 0){System.out.println("閏年");}
		else{System.out.println("不是閏年");}
		
		
		
		i = year;
		
		if(i == 0) break;
		
		}
		
	}

}
