import java.util.Scanner;
import java.util.Random;
class MathGame1 extends Sum1
{
	public void setScore(int a,int b)
	{
		x=a;
		y=b;
	}
	
	public void displayScore()
	{
		System.out.println(x+" / "+y);
	}
	
	
	boolean level()
	{
	 
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Choose Level : - false-> easy OR true-> difficult");
	  gameLevel=scan.nextBoolean();
	  return gameLevel;
	}
	
   public static void main(String args[])
   {
      Scanner scan=new Scanner(System.in);
	  Random r =new Random();
	  
	  MathGame1 obj=new MathGame1();
	  boolean execute=true;
	  int limit;
	  
	  if(obj.level())
	  {
		 limit=10;
	  }
	  else
	  {
		  limit=100;
	  }
	  
	  System.out.println("Choose Practice Mode : ");
	  System.out.println("Addition : Press 1 ");
	  System.out.println("Subtraction : Press 2");
	  System.out.println("Multiplication : Press 3");
	  System.out.println("Division : Press 4 ");

	int mode=scan.nextInt();
	   Sum1 object;
	  switch(mode)
	  {
        case 1 :  object=new Addition();
		         break;
        case 2 :  object=new Subtraction();
		         break;
		case 3 :  object=new Multiplication();
		         break;
		case 4 :  object=new Division();
		         break;
	   default : System.out.println("Wrong input ..");
		          return ;  

	  }

	  int total=0;
	  int correct=0;
	  do
	  {
		int x=r.nextInt(limit);
        int y=r.nextInt(limit);		
		System.out.println(x +" "+y );
		int result=scan.nextInt();
		if(result==object.sum(x,y))
		{
			correct++;
		}
		total++;
	 
	    System.out.printltn("Do you want to continue : then type true else false ");
	    execute=scan.nextBoolean();
		
	  }while(execute);
       obj.setScore(correct,total);
       obj.display();	   
  }
}