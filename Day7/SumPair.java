public class SumPair
{
	public static void main(String[] args) 
	{
	  int a[]={4,5,7,10,1,6,12,15,20,9};
      int hashtable[]=new int[21];
      int sum=14;
      for(int i=0;i<10;i++)
         hashtable[a[i]]++;
      	    
      for(int i=0;i<10;i++)
      {
        if( sum-a[i]>=0 && hashtable[sum-a[i]]==1 )
        {
            System.out.println("Pair : "+a[i]+","+(sum-a[i]));
        }
      }
      	    
      	    
	}
}
