import java.util.Scanner;
class Contact
{
	String name;
	String phoneno;
	 Contact()
	{
	  	System.out.println("Default constructor is working...");
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setPhone(String phoneno)
	{
		this.phoneno=phoneno;
	}
	
	String getName()
	{
		return name;
	}
	String getPhone()
	{
		return phoneno;
	}
	
	public boolean equals(Object obj)
	{
		Contact c=(Contact)obj;
		if(!(this.getName().equals(c.getName())))
			  return false;
		  
		if(!(this.getPhone().equals(c.getPhone())))
              return false;
        return true;		  
	}
	
	public String toString()
	{
		return "Name : "+name+"\nPhoneno. : "+phoneno;
	}
	
   public static void main(String args[])
   {
      Contact obj=new Contact();
	  obj.setName("Suraj");
	  obj.setPhone("8700000090");
	  
	  Contact obj1=new Contact();
	  obj1.setName("Suraj");
	  obj1.setPhone("8700000090");
       
      if(obj.equals(obj1))
	  {
		  System.out.println("Value are equals");
	  }		  
	  else
	  {
		  System.out.println("Value are not equals");
	  }
	  
	  System.out.println(obj);
   }
}