package exceptionhandling;

public class PositiveorNegative {
    public static void checkPositive(int num) throws Exception{
	  if(num>=0)
	  {
		  System.out.println("positive number");
	  }
	  else
	  {
		  throw new Exception("negative number");
	  }
}

	public static void main(String[] args) throws Exception
	{
		checkPositive(-1);
	}
}

	
