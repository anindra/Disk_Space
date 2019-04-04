package main.Controller;

import org.json.simple.JSONObject;

import main.IO_Controller.ValidateUserInput;
import main.Global.Utilities.CustomException.ArgumentInvalidException;
import main.Global.Utilities.CustomException.CannotHaveMoreThanOneArgumentException;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public class ReturnDiskUsageOfThePath_Driver {

	public static void main(String[] args) throws CannotHaveMoreThanOneArgumentException, ArgumentInvalidException {

		ValidateUserInput validate = new ValidateUserInput();
		validate.validateUserArgumentFromConsole(args);
		
		GetEachFileDiskUsage getAll = new GetEachFileDiskUsage();
		System.out.println(args[0]);
		JSONObject js = getAll.getAllFileSize(args[0]);

		String resultJson = new GsonBuilder().setPrettyPrinting().create()
				.toJson(new JsonParser().parse(js.toString()));

		System.out.println(resultJson);

	}

}
