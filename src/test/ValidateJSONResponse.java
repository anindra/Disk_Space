package test;

import static org.junit.Assert.fail;

import org.json.simple.JSONObject;
import org.junit.Test;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import main.Controller.GetEachFileDiskUsage;

public class ValidateJSONResponse {

	@Test
	public void isCorrectJsonSent()
	{
		String path = "/home/anindra";
		GetEachFileDiskUsage diskUsage = new GetEachFileDiskUsage();
		
		JSONObject json = diskUsage.getAllFileSize(path);
		
		//validating Json using JsonPath
		try
		{
		
			JsonParser parser = new JsonParser();
			parser.parse(json.toString());
		}
		catch(JsonSyntaxException jse)
		{
			fail("Not a valid Json String:"+jse.getMessage());
		}
	}
}
