package tw.org.iii.practice;

import java.util.Scanner;

public class practice125_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b,i,c,d,e;
		for(i=1;i>0;i++){
			
		System.out.println("�ɿ�J�j��2�����:");
		Scanner a = new Scanner(System.in);
		b = a.nextInt();
		
			
			d=b-1;
			for(c=b;d>=1;d--){
				 e = c % d;
				 if(d>1 && e == 0){
					 System.out.println(b+"���O���");
					       break;
				           }
				 else if(d == 1)     {
					 System.out.println(b+"�O���");
				           break; 
				           } 
				
			                }
			
		       
			
			
			
			
			
			
			
		                }
		

	}

}
