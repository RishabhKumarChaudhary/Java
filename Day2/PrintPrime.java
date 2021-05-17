public class PrintPrime {
    
	private int n1;
	private int n2;
	PrimePrint(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	void printPrimeNumber()
	{
		
		for(int i=n1;i<=n2;i++)
		{
			int count=0;
			
         	if(i==1 ||i==4)
			 {
				 count++;
			 }
		    else
			{
			   for(int j=3;j<=i/2;j++)
			   {
				   if(i%j==0)
				   {       
					   count++;		   
				   }
			   }
			}   			
			 if(count==0)
				 System.out.print(" "+i);
		}
	}
   public static void main(String args[])
   {
     Scanner scan=new Scanner(System.in);
	 System.out.println("Enter two number : ");
	 int n1=scan.nextInt();
	 int n2=scan.nextInt();
	 PrimePrint obj=new PrimePrint(n1,n2);
	 
	 System.out.println("\n| Print all Prime no |\n");
	 obj.printPrimeNumber();
   }
}
