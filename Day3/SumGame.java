import java.util.Scanner;
import java.util.Random;
  class SumGame
  {
	  int sum(int n1 ,int n2)
	  {
		  return n1+n2;
	  }
	  
     public static void main(String args[])
	 {
	    Scanner scan=new Scanner(System.in);
		SumGame obj=new SumGame();
		    
		  Random r=new Random();
		  int correct=0,wrong=0;
		  boolean execute=true;
		  int i=0,n1,n2,sum=0;
		  char run='n';
		  do
		  {
					n1=n2=0;
					  
				  System.out.println("Select mode:\n Easy => e \nDifficult => d\n");

				   char mode=scan.next().charAt(0);
				
				 if(mode=='e' || mode=='E')
				  {
					  n1=r.nextInt(10);
					  n2=r.nextInt(10);
					
				  }			  
				  else if(mode=='d' || mode=='D')
				  {
					 n1=r.nextInt(100);
					 n2=r.nextInt(100);
				  }
				  else
				  {
					  System.out.println("Opps! Something went wrong.");          
				  }
		  
					  System.out.println(" n1:  "+n1);
					  System.out.println(" n2: +"+n2);
					  
					if(n1!=0 || n2!=0)
                    { 						
						  System.out.println("-------------\nEnter Sum\n");
						  try
						  {
									 sum=scan.nextInt();
								  
								  int result=obj.sum(n1,n2);
								  if(sum==result)
								  {  
									  correct++;
									  System.out.println("Correct Answer\n\n");
								  }		
								  else
								  {
									   wrong++;							  
									  System.out.println("Wrong Answer\n\n");				
								  }
								   obj.sum(n1,n2);
							

									System.out.println("\nDo you want to continue ?\n Yes => y \n No => any except y \n");
									 run=scan.next().charAt(0);
													
									if(run!='y')
											execute=false;							
					      
						   }
						  catch(Exception e)
						  {
							  execute=false;
							  System.out.println("Opps! Wrong Input");
						  }
					}
                    else
                    {
						execute=false;
						System.out.println("----Opps! Wrong Input----");
					}						
					
		  }while(execute); 
		  
		  int total=wrong+correct;
		  
		  if(correct  >=  total/2 )
			  System.out.println("You are Pass : "+"\nTotal Marks : "+correct);
		  else
			  System.out.println("You are Fail : "+"\nTotal Marks : "+correct);
		  
		  System.out.println("\nWrong Answer : "+wrong);
	 }
  }
