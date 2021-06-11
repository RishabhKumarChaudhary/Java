import java.util.Scanner;
import java.util.Arrays;
class ArrayOp
{
	void addCharacter(String str)
	{
		String result="";
		System.out.println("Enter the character which you wants to add : - ");
		char ch=scan.next().charAt(0);
		System.out.println(ch);
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			System.out.println(" C : "+c +" ch : "+ch);
			result+=c;
			result+=ch;
		}
		
		System.out.println("After adding char : "+result);
		
	}
	char [] stringToChar(String str)
	{
		char ch[]=str.toCharArray();
		return ch;
	}
	String charToString(char ch[])
	{
		String str="";
		for(char c: ch)
			str+=c;
		return str;
	}
	void sortStringArray(String ...str)
	{
		Arrays.sort(str);
		for(String s: str)
			System.out.println(s);
	}
	void fillArray(int data[])
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<data.length;i++)
		{
			data[i]=scan.nextInt();
		}
	}
   public static void main(String ...args)
   {
	   ArrayOp obj=new ArrayOp();
       Scanner scan=new Scanner(System.in);
	   String s[]=new String[5];  //sort string..
	   int data[]=new int[5]; //fill data..
	   System.out.println("Enter the String : - ");
	   String str=scan.next();
	   char ch[]=obj.stringToChar(str);   
	   for(char c: ch)
	   {
		   System.out.println(" "+c);
	   }
	   
	   System.out.println("String is : ");
	   System.out.println(obj.charToString(ch));
   
       System.out.println("Enter String Array element : - \n");
	   for(int i=0;i<5;i++)
	   {
		   s[i]=scan.next();
	   }
	   System.out.println("Sorted Array : \n ");
      obj.sortStringArray(s);
	  
	  System.out.println("Enter the array element : - \n\n");
	  obj.fillArray(data);
	  System.out.println("Print Array Element : - ");
	  for(int i=0;i<5;i++)
		  System.out.print(" "+data[i]);	 
	  obj.addCharacter(str);
   }
}