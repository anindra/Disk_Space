package main.Global.Utilities.CustomException;

public class CannotHaveMoreThanOneArgumentException extends Exception{
	
	private String message = "";
	
	public CannotHaveMoreThanOneArgumentException(String message)
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
