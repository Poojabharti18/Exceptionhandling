package exceptionhandling;

public class Finallyexample {

	public static void main(String[] args) {
		try
		{
	    int a=4,b=0;
	    int k=a/b;
	    System.out.println(k);
	    
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello");
		}
		
	}

}