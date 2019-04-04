package test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import main.Global.Utilities.CustomException.ArgumentInvalidException;
import main.Global.Utilities.CustomException.CannotHaveMoreThanOneArgumentException;
import main.IO_Controller.ValidateUserInput;

public class VerifyInputArgument {

	@Test
	public void isCorrectFormat() throws CannotHaveMoreThanOneArgumentException
	{
		try
		{
			String input[] = {"\\home\\anindra"};
			ValidateUserInput check = new ValidateUserInput();
			check.validateUserArgumentFromConsole(input);
			fail("Expected Argument Invalid Exception!!");
		}
		catch (ArgumentInvalidException e) {
			assertThat(e.getMessage(), is("Wrong path!! Path given must begin with '/'"));
		}
	}
	
	
	@Test
	public void isCorrentArgumentCount() throws ArgumentInvalidException
	{
		try
		{
			String input[] = {"\\home\\anindra" , "\\home\\anindra"};
			ValidateUserInput check = new ValidateUserInput();
			check.validateUserArgumentFromConsole(input);
			fail("Expected Cannot Have more Than one Argument Exception!!");
		}
		catch (CannotHaveMoreThanOneArgumentException e) {
			assertThat(e.getMessage(), is("Cannot take more than one argument!!"));
		}
	}
	
}
