import java.util.Scanner;
import java.lang.Math;
public class HexaDecimalToInteger
{
	static int hexaDecimalToInteger(String str)
	{
      	int i=str.length()-1;
	    int k=0;
	    int sum=0;
	    while(i>=0)
	    {
			char ch=str.charAt(i);
			int num;
			System.out.println(ch);
	        switch(ch)
			{
				case 'A' : num=10;
				           break;
			    case 'B' : num=11;
						   break;
								case 'C' : num=12;
									       break;
								case 'D' : num=13;
										    break;
							    case 'E' : num=14;
										    break;
			                    case 'F' : num=15;
					                        break;
					            default : num=ch-'0';
			}
			
			System.out.println(num);
			sum=sum+num*(int)Math.pow(16,k);
			i--;
			k++;
	    }
      return sum;
	}

	public static void main(String[] args) 
	{
		//Assuming that user type upper letter like A , C 
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the HexaDecimal String : - ");
		String str=scan.next();
	    System.out.println("Result in Integer : "+hexaDecimalToInteger(str));
	}
}
