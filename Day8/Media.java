class Media
{
	String title;
	Media()
	{
		System.out.println("Default constructor is working..");
	}
	void setTitle(String title)
	{
		this.title=title;
	}
	String getTitle()
	{
		return title;
	}
	
	public String toString()
	{
		return "Title : "+title;
	}
	
	public boolean equals(Object c)
	{
		Media obj=(Media)c;
		if(!(this.getTitle().equals(obj.getTitle())))
		     return false;
		return true;   
	}
}