class ManageAccount
{
  public static void main(String args[])
  {
     Account obj=new Account();
	 Account obj1=new Account();
	 
      obj.setAccountHolderName("Suraj");
	  obj.setNumber(45454);
	  obj.setBalance(1500000);
	  obj.setInterestRate(10);
	  
	  obj1.setAccountHolderName("Suraj");
	  obj1.setNumber(46454);
	  obj1.setBalance(1500000);
	  obj1.setInterestRate(10);
	  
	  if(obj1.equals(obj))
	  {
        System.out.println("Unique account no.");
	  }
	  else 
	  {
		  System.out.println("Same account no. is not accepted..");
	  }
  }
}
