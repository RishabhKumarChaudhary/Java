import java.util.Scanner;
public class DecimalToHexadecimal
{
	static String decimalToHexaDecimal(int d)
	{
		int r=0;
	   String str="";
	   while(d!=0)
	   {
	       r=d%16;
	       if(r>=10)
	       {
	           switch(r)
	           {
	               case 10: str='A'+str;
	                         break;
	               case 11: str='B'+str;
	                         break;
	               case 12: str='C'+str;
	                         break;
	               case 13: str='D'+str;
	                         break;
	               case 14: str='E'+str;
	                         break;
	               case 15: str='F'+str;
	                         break;
	           }
	       }
	       else
	          str=r+str;
	        d=d/16;  
	   }
	   return str;
	}
	
	
	public static void main(String[] args) 
	{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter Decimal no. : ");
	   int d=scan.nextInt();
	   
	   System.out.println("HexaDecimal Result : "+decimalToHexaDecimal(d));
	}
}
