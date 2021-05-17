public class CLIPrimitiveDataType {
    public static void main(String[] args)
	{
	      System.out.println("++++ Print All Primitive DataType value ++++\n");
          System.out.println("Byte Value : "+Byte.parseByte(args[0]));
          System.out.println("Short Value : "+Short.parseShort(args[1]));
          System.out.println("Int Value : "+Integer.parseInt(args[2]));
          System.out.println("Long Value : "+Long.parseLong(args[3]));
          System.out.println("Float Value : "+Float.parseFloat(args[4]));
          System.out.println("Double Value : "+Double.parseDouble(args[5]));
          System.out.println("String Value : "+args[6]);
          System.out.println("Character value : "+args[7].charAt(0));
	}
}

// For CLI Arguments :
//123 230 345 45646 4545.54 5656465.56 Welcome developer