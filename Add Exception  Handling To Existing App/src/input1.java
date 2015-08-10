import java.util.Scanner;
	public class input1 {

		int d[][]=new int[4][10];
		
		int i=0;
	   int[][] inputt()
	   {
		 
		   Class1 a=new Class1();
		
		   System.out.println("Welcome to the transcript application")  ;
		  
		   Scanner sc=new Scanner(System.in);
		System.out.println("continue:yes or no");
		String aaaa=sc.nextLine();
		while(true)// aaaa is import
		{
			//Scanner sm=new Scanner(System.in);
		    System.out.println("input Course");
		    Scanner so=new Scanner(System.in);
		   try{ int aa=so.nextInt();
		        a.setCode(aa);
		        } catch(Exception e){
			System.out.println(e.toString()); 
			  
		  }
		   
		    d[0][i]=a.getCode();
		
			  
		  
		   
		    System.out.println("input Grade");
		   try{ 
			   int cc=sc.nextInt();
			   a.setGrade(cc);
		      }
		   catch(Exception e){
			   System.out.println(e.toString());
				  
			  }
		 
		    d[1][i]=a.getGrade();
		     
		  
		   
		    
		    System.out.println("input credit");
		    try{int bb=sc.nextInt();
		  
                a.setCredit(bb);
		       }catch(Exception e){
					System.out.println(e.toString());
				  }
		    
			d[2][i]= a.getCredit();
			
			
			//System.out.println("woshigou"+d[0][i]+"  "+d[1][i]+"  "+d[2][i]);

			
			System.out.println("continue:yes or no");
			Scanner sl=new Scanner(System.in);
			String aaa=sl.nextLine();
			
						
			if(aaa.equals("n"))
				break;
		 
			i++;
		
		
		
		}  
	   
		return  d;
	   
	   }
		
		
		
	}