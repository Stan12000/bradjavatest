package tw.org.iii.homework;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int length,num,all,c,b,d,e,g=0,f=0,h=0;
    String str1;
	Scanner str =new Scanner(System.in);
		str1 =str.nextLine();

		
		String[] a ={"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};
	    String[] unit ={" ","拾","百","千","萬","拾","百","千",
				"億","拾","百","千","兆"};
	    
	   

	   
	    length = str1.length();
	     e = length;
	    for(int i=0 ;i<length;i++){
	    	c =str1.charAt(i)-48;
	       
	    	
	    	if(i%4 ==1){
	    		f=c;
	    	 }else if(i%4 ==2){
	    		 g=c;}
	    	 else {h=c;}
	    	
	    	if(e<9 && e>=5 && i==length-5){
	    		if(c==0 && (f!=0 || g!=0 || h!=0) ){
	    			System.out.print(unit[4]);
	    		}
	    	
	    	}
	
	    	if(e<13 && e>=9 && i==length-9){
	    		if(c==0 &&(f!=0 || g!=0 || h!=0)){
	    			System.out.print(unit[8]);
	    		}
	    	
	    	}
	    	
	    	
	    	if(i !=length-1){
	 
	    	
	    	d =str1.charAt(i+1)-48; 
	    	
	    	//System.out.println(c);
	    	if(c == 0){
	    	    if(d != 0  ){
	    	    	if(e!= 4 && e!=8){System.out.print(a[str1.charAt(i)-48]);
	    	    	}
	    	    	else{}
	    	    }else{
	    	    	
	    	    }
	    	}else{
	    	
	    		System.out.print(a[str1.charAt(i)-48]+unit[str1.length()-i-1]);
	    	}
	    	//b= str1.charAt(length-1-i);
	    	//if(b != 48){
	    	//	System.out.print(a[str1.charAt(length-1-i)-48]);
	    	//}
	    	}else{
	    		if(c!=0){
	    			System.out.print(a[str1.charAt(i)-48]+unit[str1.length()-i-1]);
	    		}else{};
	    		
	    		
	    	}


	       


	    		 e--;
	    	 }
	    	
	    }
	   
	    	   // b =str1.charAt(0);
	    //System.out.println(b);
	}


