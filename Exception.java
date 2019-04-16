class Exception
{
	public static void main(String[] args)
	{
		int balance=5000;
		int withdrawl=2000;
		try
		{
			if(withdrawl>balance)
			throw new ArithmeticException("Insufficiant fund");
			else
				System.out.println("Transaction Succesfully");
			balance=balance-withdrawl;
			System.out.println("Your remaining balace is "+balance);

		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			}
			System.out.println("Thank You");
		
	}
}