import java.util.Scanner;
public class CharOp
{
    
    static String[] absentList(int ...absent)
    {
        int i=0;
        String result[]=new String[absent.length];
       for(int ab: absent)
        {  
            result[i]="MCA/450"+ab+"/20";
            i++;            
        }
        return result;
    }    
    static String removeConsonents(String str)
    {
        String duplicate="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U')
            {
                duplicate+=str.charAt(i);
            }
        }
        return duplicate;
    }
    
    
    
    static String insertCharacter(String str, char ch,int index)
    {
        String duplicate ="";
        for(int i=0;i<str.length();i++) 
        {
            if(i==index)
            {
                duplicate+=ch;
                duplicate+=str.charAt(i);
            }
            else
            {
                duplicate+=str.charAt(i);
            }
        }
        return duplicate;
    }
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 
	   System.out.println("Enter the String : ");
	   String str=scan.nextLine();
	   System.out.println("After Removing consonents from the string : "+removeConsonents(str));
	 
	
	 System.out.println("Enter the String : ");
	 String s=scan.next();
	 System.out.println("Enter character which you want to insert : ");
	 char ch=scan.next().charAt(0);
	 System.out.println("Enter the position of character where you want to insert the character : ");
	 int position =scan.nextInt();
	 if(position>=0 && position<s.length())
	 System.out.println("After Insert the Character based on the given position : "+insertCharacter(s,ch,position));
	 else
	 System.out.println("Opps ! You have enter wrong position..");
	  
	   
	   System.out.println("Enter the rollno of Absent student : ");
	   int absent[]={23,31,33,39,45};
	   System.out.println("Print the absent of the students in the correct format : \n");
	   String absentFormat[]=absentList(absent);
	   for(String ab : absentFormat)
	   {
	       System.out.println(ab);
	   }
	   
	}
}