package exceptionhandling;

public class FiveDigitNumber {

	public static void fiveDigit(int number)
	{
		if(number>=10000 && number<=99999)
		{
			System.out.println("five digit number");
		}
		else
		{
			try
			{
			throw new Exception("not a five digit number");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		fiveDigit(345670);

	}

}
