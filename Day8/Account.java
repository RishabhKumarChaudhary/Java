
class Account
{
	String accountHolderName;
	int number;
	int balance;
	int interestRate;
	
	Account()
	{
		System.out.println("Default constructor is working...");
	}
	void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	void setNumber(int balance)
	{
		this.number=number;
	}
	void setBalance(int balance)
	{
		this.balance=balance;
	}
	void setInterestRate(int interestRate)
	{
		this.interestRate=interestRate;
	}
	
	public String toString()
	{
		String result = "AccountHolder Name : "+accountHolderName+"\nAccount Number : "+number+"\nInterestRate : "+interestRate+"\nBalance : "+balance;
		return result;
	}
	
	public boolean equals(Account a)
	{
		Account obj=a;
		if(!((this.number == obj.number)))
		{
			return true;
		}
		return false;
	}
}