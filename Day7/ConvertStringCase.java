import java.util.Scanner;
public class ConvertStringCase
{
    static String changeCase(String str, int no)
    {
        
        String duplicate="";
        	    switch(no)
	    {
	        case 1 : str=str.toUpperCase();
	                 break;
	        case 2 : str=str.toLowerCase();
	                 break;
	                 
	        case 3 : for(int i=0;i<str.length();i++)
	                 {
	                    if(i==0 || str.charAt(i-1)==' ')
	                        duplicate+=Character.toUpperCase(str.charAt(i));
	                    else
	                      duplicate+=Character.toLowerCase(str.charAt(i));    
	                 }
	                  str=duplicate;
	                  break;
	       default : System.out.println("Invalid Input : -");                    
	    }
	     return str;
    }
	public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the String : ");
	    String str=scan.nextLine();
	    System.out.println("Press 1 : Change to UpperCase ");
	    System.out.println("Press 2 : Change to LowerCase ");
	    System.out.println("Press 3 : Change to Title Case ");
	    System.out.println("Something went wrong : if user press other number ");
	    int no=scan.nextInt();
	    System.out.println("Change Case : "+changeCase(str,no));
	    
	}
}
