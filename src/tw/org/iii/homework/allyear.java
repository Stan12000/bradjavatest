package tw.org.iii.homework;

import javax.swing.JOptionPane;

public class allyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year,month,day1,feb,sum=0,sum1= 0,all=0,c,e=0;
		int one =31,two=20,three=31,four=30,f,g=0;
		//1752¦~¥H«e

	String stryear = JOptionPane.showInputDialog("year");
	String strmonth = JOptionPane.showInputDialog("month");
	year = Integer.parseInt(stryear);
	month = Integer.parseInt(strmonth);
		
	if(year<1752){	
		for(int i = year-1;i>0;i--){
			if(i%4 == 0){
				day1 = 366;
			}else{
				day1 = 365;
			}
			
			 sum += day1;
			}
		if(year % 4 ==0){
  			switch(month){
  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
  				e = 31;
  				break;
  			case 2:
  				e=29;
  				break;
  			default: 
  			    e=30;
  			    break;
		}
		   for(int i =1;i<month;i++){
			switch(i){
			case 1: case 3: case 5: case 7: case 8:case 10: case 12:
				c = 31;
				break;
			case 2:
				c=29;
				break;
			default: 
			    c=30;
			    break;
			}
			sum1 += c;
		   }
		   
	      }else{
	    	  for(int i =1;i<month;i++){
	  			switch(i){
	  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
	  				c = 31;
	  				break;
	  			case 2:
	  				c=28;
	  				break;
	  			default: 
	  			    c=30;
	  			    break;
	      }
	  			sum1 += c;
	     }
	  			switch(month){
	  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
	  				e = 31;
	  				break;
	  			case 2:
	  				e=28;
	  				break;
	  			default: 
	  			    e=30;
	  			    break;
	   }
	      }
		
		all = sum +sum1+1;
		int date = all % 7;
		    
		System.out.println("¤é \t¤@ \t¤G \t¤T \t¥| \t¤­  \t¤»  ");
		if(date == 0 ){
				for(int a = 7;a>date;a--){
					System.out.print("\t");
					
					g++;
				}
		  
		}else {
			for(int a = 1;a<date;a++){
				System.out.print("\t");
				g++;
			}
		}
		
		for(int i=1;i<=e;i++){
			System.out.print(i+"\t");
			f= g+i;
			if(f%7==0){
				System.out.println();
			}
			
		
		
			}
		
		
		//1752¦~
	}else if(year==1752){	

		
		for(int i = year-1;i>0;i--){
			if(i%4 == 0){
				day1 = 366;
			}else{
				day1 = 365;
			}
			
			 sum += day1;
			}
		if(year % 4 ==0){
  			switch(month){
  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
  				e = 31;
  				break;
  			case 2:
  				e=29;
  				break;
  			case 9:
  				e=19;
  				break;
  			default: 
  			    e=30;
  			    break;
		}
		   for(int i =1;i<month;i++){
			switch(i){
			case 1: case 3: case 5: case 7: case 8:case 10: case 12:
				c = 31;
				break;
			case 2:
				c=29;
				break;
			case 9:
				c=19;
				break;
			default: 
			    c=30;
			    break;
			}
			sum1 += c;
		   }
		   
	      }else{
	    	  for(int i =1;i<month;i++){
	  			switch(i){
	  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
	  				c = 31;
	  				break;
	  			case 2:
	  				c=28;
	  				break;
	  			case 9:
	  				c=19;
	  				break;
	  			default: 
	  			    c=30;
	  			    break;
	      }
	  			sum1 += c;
	     }
	  			switch(month){
	  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
	  				e = 31;
	  				break;
	  			case 2:
	  				e=29;
	  				break;
	  			case 9: 
	  				e=19;
	  			    break;
	  			default: 
	  			    e=30;
	  			    break;
	   }
	      }	
		
		all =sum+sum1;
		int date= all % 7;
		System.out.println("¤é \t¤@ \t¤G \t¤T \t¥| \t¤­ \t¤»  ");
		if(date==1 ){
			for(int a = 7;a>date;a--){
				System.out.print("\t");
				
				g++;
			}
	    }else if(date==2){System.out.println();}
	        else{
		      for(int a = 0;a<date-1;a++){
			  System.out.print("\t");
			  g++;
		         }
	           }//else{
		//	System.out.println();
		//}
		if(month==9){
		for(int i=1;i<=30;i++){
		 if(i==3){
			i=14;
			g=5;
		 } 	
		 System.out.print(i+"\t");
			f= g + i;
			if(f%7==0){
				System.out.println();
				}
			
		
		}}else{	
		for(int i=1;i<=e;i++){
			System.out.print(i+"\t");
			f= g + i;
			if(f%7==0){
				System.out.println();
			}

			}
		}
		//1753¦~¥H«á
	}else{	
		for(int i = year-1;i>1752;i--){
				if(i%4 == 0){
					if(i%100 ==0){
						if(i%400 ==0){
							day1=366;
						}else{day1=365;}
					}else{day1=366;}
				}else{day1=365;}
			
			 sum += day1;
			}
		
				if(year%4 == 0){
					if(year%100 ==0){
						if(year%400 ==0){
							   for(int i =1;i<month;i++){
									switch(i){
									case 1: case 3: case 5: case 7: case 8:case 10: case 12:
										c = 31;
										break;
									case 2:
										c=29;
										break;
									default: 
									    c=30;
									    break;
									}
									sum1 += c;
								   }							
						}else{ 
							for(int i = 1;i<month;i++){
						
				  			 switch(i){
				  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
				  				c = 31;
				  				break;
				  			case 2:
				  				c=28;
				  				break;
				  			default: 
				  			    c=30;
				  			    break;}
						sum1 += c;
							}}}else{ 
						for(int i =1;i<month;i++){
				
			  			switch(i){
			  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
			  				c = 31;
			  				break;
			  			case 2:
			  				c=29;
			  				break;
			  			default: 
			  			    c=30;
			  			    break;}
			  			sum += c;
				}}}else{ 
					for(int i = 1;i<month;i++){
		  			switch(i){
		  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
		  				c = 31;
		  				break;
		  			case 2:
		  				c=28;
		  				break;
		  			default: 
		  			    c=30;
		  			    break;}
		  			sum += c;
		  			}}
		
				if(year%4 == 0){
						if(year%100 ==0){
							if(year%400 ==0){
								switch(month){
					  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
					  				e = 31;
					  				break;
					  			case 2:
					  				e=29;
					  				break;
					  			default: 
					  			    e=30;
					  			    break;
					   }
							}else{switch(month){
				  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
				  				e = 31;
				  				break;
				  			case 2:
				  				e=28;
				  				break;
				  			default: 
				  			    e=30;
				  			    break;
				   }}
						}else{switch(month){
			  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
			  				e = 31;
			  				break;
			  			case 2:
			  				e=29;
			  				break;
			  			default: 
			  			    e=30;
			  			    break;
			   }}
				}else{switch(month){
	  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
	  				e = 31;
	  				break;
	  			case 2:
	  				e=28;
	  				break;
	  			default: 
	  			    e=30;
	  			    break;
	   }}

	
	
		all = sum +sum1+1;
		int date = all % 7;			
		System.out.println("¤é \t¤@ \t¤G \t¤T \t¥| \t¤­ \t¤»  ");
		if(date>0 && date <6){
				for(int a = 0;a<date;a++){
					System.out.print("\t");
				}
		}else {
			System.out.println();
		}//else{
		//	System.out.println();
		//}
		for(int i=1;i<=e;i++){
			System.out.print(i+"\t");
			f= date + i;
			if(f%7==0){
				System.out.println();
			}

			}
	}
	//	for(int i = year;i>=1;i--){
		//	if(i%4 == 0){
			//	if(i%100 ==0){
				//	if(i%400 ==0){
					//	System.out.println(i+"¬O¶|¦~");
				//	}else{System.out.println(i+"¤£¬O¶|¦~");}
			//	}else{System.out.println(i+"¬O¶|¦~");}
		//	}else{System.out.println(i+"¤£¬O¶|¦~");}
	//	}
		
	}

}
