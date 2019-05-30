public class Eccezioni extends Exception   {

	String message;
	public Eccezioni(String s)
	{
		message = s;
	}
	public String getMessage()
	{
		return message;
	}
}