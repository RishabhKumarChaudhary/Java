import java.util.*;
  class Captcha
  {
     public static void main(String args[])
	 {
	    String cap="";
		Random r=new Random();
		for(int i=1;i<=8;i++)
		{
		  cap+=r.nextInt(10);	
		}
		
		System.out.println(cap);
	 }
  }
