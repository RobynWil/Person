
public class UnderAgeException extends Exception
{
	private static final long serialVersionUID = 4387563130738037824L;

	public UnderAgeException()
	{
		super("Parent is too Young");
	}

	public UnderAgeException(String message)
	{
		super(message);
	}
	
}
