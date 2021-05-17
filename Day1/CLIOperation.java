
class CLIOperation
{
		public static void main(String args[])
		{	
            int number1=Integer.parseInt(args[0]);
            int number2=Integer.parseInt(args[1]);
        System.out.println("Two numbers are :\n\n number1 :"+number1+" \n "+"number2 : "+number2);
        
        System.out.println("Arithmetic Operation....");
        System.out.println("Add : "+(number1+number2));
        System.out.println("Subtract : "+(number1-number2));
        System.out.println("Division : "+(number1/number2));
        System.out.println("Modulus : "+(number1%number2));
        System.out.println("Multiplication : "+(number1*number2));
        
        System.out.println("Comparison Operation......");
        System.out.println(" < "+(number1<number2));
        System.out.println(" > "+(number1>number2));
        System.out.println(" <= "+(number1<=number2));
        System.out.println(" >= "+(number1>=number2));
        System.out.println(" == "+(number1==number2));
        
        System.out.println("BitWise Operation ......");

        System.out.println(" Or operator  :" + (number1 | number2));
        System.out.println(" Add operator : "+(number1 & number2));
        System.out.println(" XOR operator : "+(number1^number2 ));      
        System.out.println("Complement operator : "+(~number1)); 
        System.out.println("Left Shift : "+(number1 <<2));
        System.out.println("Right Shift : "+(number2 >>2));    
	}
}