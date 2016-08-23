package tw.org.iii.homework;

public class allyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2016,month=8,day1,feb,sum=0,sum1= 0,all=0,c,e=0;
		int one =31,two=20,three=31,four=30;
		//1752¦~¥H«e

	if(year<1752){	
		for(int i = year;i>1;i--){
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
  				e = 30;
  				break;
  			case 2:
  				e=28;
  				break;
  			default: 
  			    e=30;
  			    break;
		}
		   for(int i =month;i>0;i--){
			switch(i){
			case 1: case 3: case 5: case 7: case 8:case 10: case 12:
				c = 30;
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
	    	  for(int i =month;i>0;i--){
	  			switch(i){
	  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
	  				c = 30;
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
	  				e = 30;
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
		System.out.println("¤é "+"¤@ "+"¤G "+"¤T "+"¥| "+"¤­  "+"¤»  ");
		if(date>1){
				for(int a = 1;a<date;a++){
					System.out.print(" ");
				}
		}
		for(int i=1;i<=e;i++){
			System.out.print(i+" ");
			if(i%7==1){
				System.out.println();
			}

			}
		
		//1752¦~
	}else if(year==1752){	
		for(int i = year;i>1;i--){
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
  				e = 30;
  				break;
  			case 2:
  				e=28;
  				break;
  			default: 
  			    e=30;
  			    break;
		}
		   for(int i =month;i>0;i--){
			switch(i){
			case 1: case 3: case 5: case 7: case 8:case 10: case 12:
				c = 30;
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
	    	  for(int i =month;i>0;i--){
	  			switch(i){
	  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
	  				c = 30;
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
	  				e = 30;
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
		System.out.println("¤é "+"¤@ "+"¤G "+"¤T "+"¥| "+"¤­  "+"¤»  ");
		if(date>1){
				for(int a = 1;a<date;a++){
					System.out.print(" ");
				}
		}
		for(int i=1;i<=e;i++){
			System.out.print(i+" ");
			if(i%7==1){
				System.out.println();
			}

			}
		
		
		
		
		
		//1753¦~¥H«á
	}else{	
		for(int i = year;i>1752;i--){
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
							   for(int i =month;i>0;i--){
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
							for(int i =month;i>0;i--){
						
				  			switch(i){
				  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
				  				c = 30;
				  				break;
				  			case 2:
				  				c=28;
				  				break;
				  			default: 
				  			    c=30;
				  			    break;}
						}}}else{ 
						for(int i =month;i>0;i--){
				
			  			switch(i){
			  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
			  				c = 30;
			  				break;
			  			case 2:
			  				c=29;
			  				break;
			  			default: 
			  			    c=30;
			  			    break;}
			  			sum += c;
				}}}else{ 
					for(int i =month;i>0;i--){
		  			switch(i){
		  			case 1:case 3:case 5: case 7:case 8:case 10: case 12:
		  				c = 30;
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
					  				e = 30;
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
				  				e = 30;
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
			  				e = 30;
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
	  				e = 30;
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
		System.out.println("¤é "+"¤@ "+"¤G "+"¤T "+"¥| "+"¤­  "+"¤»  ");
		if(date>0 && date <6){
				for(int a = 0;a<date;a++){
					System.out.print(" ");
				}
		}else if(date == 6){
			System.out.println();
		}else{
			System.out.println(" ");
		}
		for(int i=1;i<=e;i++){
			System.out.print(i+" ");
			if(i%7==6){
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
