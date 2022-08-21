package exceptionhandling;

public class AgeValidationExample {
	public  void validateAge(int age)
	{
		if(age<18)
		{
			try
			{
			throw new Exception("invalid age");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}


}
