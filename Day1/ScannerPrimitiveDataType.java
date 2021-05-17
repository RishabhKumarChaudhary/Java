import java.util.*;
public class ScannerPrimitiveDataType {
    public static void main(String[] args)	
    {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter String value :");
            String str=scan.nextLine();

            System.out.println("Enter Byte value : ");
            byte num1=scan.nextByte();

            System.out.println("Enter Short value: ");
            short num2=scan.nextShort();

            System.out.println("Enter Int value :");
            int num3=scan.nextInt();

            System.out.println("Enter float value : ");
            float num4=scan.nextFloat();

            System.out.println("Enter Long value : ");
            long num5=scan.nextLong();

            System.out.println("Enter Double value :");
            double num6=scan.nextDouble();

            System.out.println("Enter Char value  : ");
            char ch=scan.next().charAt(0);
                             
        System.out.println("\n +++ Print all Primitive Data Type Using Scanner +++ \n");
        System.out.println("Byte : "+num1);
        System.out.println("Short : "+num2);
        System.out.println("Int : "+num3);
        System.out.println("Float : "+num4);
        System.out.println("Long : "+num5);
        System.out.println("Double : "+num6);
        System.out.println("char : "+ch);
        System.out.println("str : "+str);
        
     }
}
