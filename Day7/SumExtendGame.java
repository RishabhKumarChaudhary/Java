import java.util.Scanner;
import java.util.Random;
class SumExtendGame
{

	static int subtraction(int mode)
	{
    	  Random r=new Random();
    	  Scanner scan=new Scanner(System.in);

    	  int level=0;

    		if(mode==1)
    			level=18;
    		else
    			level=198;


    		int a=r.nextInt(level);
    		int b=r.nextInt(level);

    		int swap;

    		if(a<b)
    		{
    		    swap=a;
    		    a=b;
    		    b=swap;
    		}

    		System.out.print("                             "+a+" - "+b+" :");

    		return a-b;

	}

	static int multiplication(int mode)
	{
    	   Random r=new Random();
    	   Scanner scan=new Scanner(System.in);

    	   int level=0;

    		if(mode==1)
    			level=10;
    		else
    			level=20;

    		int a=r.nextInt(level);
    		int b=r.nextInt(level);

    	   if(a==0){a++;}
    	   if(b==0){b++;}

    	   	System.out.print("                             "+a+" * "+b+" :" );

    	    return a*b;

	}

	static int division(int mode)
	{
    	   Random r=new Random();
    	   Scanner scan=new Scanner(System.in);

    	    int swap;
    	    int level=0;

    		if(mode==1)
    			level=10;
    		else
    			level=20;

    		int a=r.nextInt(level);
    		int b=r.nextInt(level);

    	   if(a==0){a++;}
    	   if(b==0){b++;}
    	   if(a<b)
    		{
    		    swap=a;
    		    a=b;
    		    b=swap;
    		}

    	   System.out.print("                             "+a+" / "+b+" :" );

    	   return a/b;

	}
   public static void main(String args[])
   {
      Scanner scan=new Scanner(System.in);
	  boolean execute=true;

	  int result=0;
	  int correctAnswer=0;
	  int answer=0;
	  int question=0;


	  System.out.print("                            Enter your Name : ");
	  String name=scan.nextLine();


 	  System.out.println("                            Select Level : ");
      System.out.println("                            Easy Mode : Press 1");
      System.out.println("                            Difficult Mode : Press 2");
      int mode=scan.nextInt();


	  do
      {
        	  System.out.println("                            Press 1 -> Subtraction ");

        	  System.out.println("                            Press 2 -> Multiplication ");

        	  System.out.println("                            Press 3 -> Division ");

        	  System.out.println("                            Press Other No.-> Exit");

        	  int no=scan.nextInt();


        	  switch(no)
        	  {
        		  case 1: question++;
        		          result=subtraction(mode);
        		          //System.out.println("Enter your Answer : - ");
        		          answer=scan.nextInt();

        		          if(result==answer)
        		          {
        					  correctAnswer++;
        		              System.out.println("                            Well done! Right Answer");
        		          }
        		          else
        		          {
        		              System.out.println("                            Opps ! Wrong Answer ");
        		              System.out.println("                            Correct Answer is : "+result);
        		          }

        		          break;


        		  case 2: question++;
        		          result=multiplication(mode);
        		           answer=scan.nextInt();

        		          if(result==answer)
        		          {
        					  correctAnswer++;
        		              System.out.println("                            Well done! Right Answer");
        		          }
        		         else
        		          {
        		              System.out.println("                            Opps ! Wrong Answer ");
        		              System.out.println("                            Correct Answer is : "+result);
        		          }

        		          break;


        		  case 3: question++;
        		          result=division(mode);

        		         // System.out.println("Enter your Answer : - ");
        		          answer=scan.nextInt();
        		          if(result==answer)
        		          {
        					  correctAnswer++;
        		              System.out.println("                            Well done! Right Answer");
        		          }
        		         else
        		          {
        		              System.out.println("                            Opps ! Wrong Answer ");
        		              System.out.println("                            Correct Answer is : "+result);
        		          }

        		           break;

        		  default: execute=false;

        	  }
	   }while(execute);
	  System.out.println("                  Correct Answers : "+correctAnswer+" \n"+"                             Total Question  : "+question);


	  System.out.println("\n\n                ----------------------------------------------------             \n\n");

	  if(question/2<correctAnswer)

	     System.out.println("                     Congratulations "+name+" ! You have Passed the Test.           ");

      else

        System.out.println("                               "+name+"You need more practice.");

      System.out.println("\n\n                 ----------------------------------------------------             \n\n");


   }
}

