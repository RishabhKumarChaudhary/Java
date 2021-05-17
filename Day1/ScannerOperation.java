import java.util.Scanner;
class ScannerOperation
{
  public static void main(String args[])
  {
      System.out.println("Enter two Number : ");
      Scanner scan = new Scanner(System.in);
      int number1=scan.nextInt();
      int number2=scan.nextInt();
     
	 System.out.println("Numbers Entered : \n First Number : " + number1 +" \n " + " Second Number : " + number2);
	 
	 System.out.println("Arithmetic Operation....");
	 System.out.println("Add : "+(number1+number2));
	 System.out.println("Subtract : "+(number1-number2));
	 System.out.println("Division : "+(number1/number2));
	 System.out.println("Modulus : "+(number1%number2));
	 System.out.println("Multiplication : "+(number1*number2));
	 
	 System.out.println("\n+++Comparison Operation+++\n");
	 System.out.println(" < "+(number1<number2));
	 System.out.println(" > "+(number1>number2));
	 System.out.println(" <= "+(number1<=number2));
	 System.out.println(" >= "+(number1>=number2));
	 System.out.println(" == "+(number1==number2));
	 
	 System.out.println("\n++++BitWise Operation+++\n");

	 System.out.println("Or operator  :" + (number1 | number2));
     System.out.println("Add operator : "+(number1 & number2));
     System.out.println("XOR operator : "+(number1^number2 ));      
     System.out.println("Complement operator : "+(~number1)); 
     System.out.println("Left Shift : "+(number1 <<2));
     System.out.println("Right Shift : "+(number2 >>2));
     
  }
}