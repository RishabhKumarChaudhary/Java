import java.util.Scanner;
class Contact
{
	String name;
	String phoneno;
	 Contact()
	{
	  	System.out.println("Default constructor is working...");
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPhone(String phoneno)
	{
		this.phoneno=phoneno;
	}
	
	public String getName()
	{
		return name;
	}
	public String getPhone()
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
	
  
}