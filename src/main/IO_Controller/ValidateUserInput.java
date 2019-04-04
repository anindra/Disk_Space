package main.IO_Controller;

import main.Global.Utilities.CustomException.ArgumentInvalidException;
import main.Global.Utilities.CustomException.CannotHaveMoreThanOneArgumentException;

public class ValidateUserInput {

	/**
	 * validates the path and checks the format provided is correct
	 * @param path
	 * @throws ArgumentInvalidException
	 */
	public void validateUserInputFromScanner(String path) throws ArgumentInvalidException
	{
		//start with '/'
		if(path.startsWith("/"))
		{
			String message = "Wrong path!! Path given must begin with '/'";
			throw new ArgumentInvalidException(message);
		}
		
	}
	
	/**
	 * checks that only one argument is provided and format is correct 
	 * @param arg
	 * @throws CannotHaveMoreThanOneArgumentException
	 * @throws ArgumentInvalidException
	 */
	public void validateUserArgumentFromConsole(String arg[]) throws CannotHaveMoreThanOneArgumentException, ArgumentInvalidException
	{
		//when argument is more than 1
		if(arg.length != 1)
		{
			String message = "Cannot take more than one argument!!";
			throw new CannotHaveMoreThanOneArgumentException(message);
		}
		
		//start with '/'
		if(!arg[0].startsWith("/"))
		{
			String message = "Wrong path!! Path given must begin with '/'";
			throw new ArgumentInvalidException(message);
		}
	}
}
