class Division extends Sum1 implements Score
{
   public int sum(int x,int y)
   {
	   if(y==0)
		  y++;
	  
      return x/y;
   }
   
}