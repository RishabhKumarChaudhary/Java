class MediaTitle
{
   public static void main(String args[])
   {
     Media obj=new Media();
	 obj.setTitle("BEST FOR FOREVER");
	 Media obj1=new Media();
	 obj1.setTitle("best for forever");
	 
	 
	 if(obj.equals(obj1))
	 {
		 System.out.println("Both title are same ..");
	 }
	 else
	 {
		 System.out.println("Titles are not same ..");
	 }
	 System.out.println(obj);
   }
}