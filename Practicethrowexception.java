package exceptionhandling;

public class Practicethrowexception {

	public static void main(String[] args) throws Exception {
		int i=90;
		String name="Pooja";
		if(name.equals(i))
		{
			System.out.println(i);
		}
		else
		{
			throw new Exception("Not Equal");
		}

	}

}
