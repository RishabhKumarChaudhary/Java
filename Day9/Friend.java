import java.util.Date;
import java.util.Scanner;
class Friend extends Contact
{
	String birthday;
	Friend(String birthday)
	{
		this.birthday=birthday;
	}
	
    boolean checkDate()
	{
	   String date[]=new Date().toString().split(" ");
       if(birthday.equals(date[1]+" "+date[2]))
	   {
		   return true;
	   }    	   
	   else
	   {
		   return false;
	   }
	}
	
	 void greet()
	{
		if(checkDate())
		{
			setName("Suraj Topal");
			System.out.println("Wish you ! HAppy BIrthday .."+getName());
		}
		
	}
	
  public static void main(String args[])
  {
    Friend obj=new Friend("May 25");
	obj.greet();
  }
}