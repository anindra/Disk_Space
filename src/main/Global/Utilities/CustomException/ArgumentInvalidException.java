package main.Global.Utilities.CustomException;

public class ArgumentInvalidException extends Exception{

	private String message = "";
	
	public ArgumentInvalidException(String message)
	{
		super(message);
		this.message = message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
