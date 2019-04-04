package main.Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class GetEachFileDiskUsage {

	/**
	 * The Method takes list of all the files and sub directories
	 * and generates the Json with file path and its disk usage
	 * @param path
	 * @return
	 */
	public JSONObject getAllFileSize(String path)
	{
		//declaring data structure
		JSONObject obj = new JSONObject();
		JSONArray jarr =  new JSONArray();
		long fileSize;
		String filePath="";
		
		
		//getting all the file and subDirectories list
		GetAllFilesAndDirectories getAll = new GetAllFilesAndDirectories();
		File allFile[] = getAll.sentFilesAndDirectoriesList(path);
		
		for(File f : allFile)
		{
			JSONObject temp = new JSONObject();

			fileSize = getGivenFileSize(f);
			filePath = path + "/"+f.getName();
			
			temp.put(filePath, fileSize);
			jarr.add(temp);
		}
		
		
		//add the JSONArray to the final JsonObject
		obj.put("files", jarr);
		
		return obj;
		
		
	}
	
	
	/**
	 * Takes a file and returns its disk usage
	 * @param f
	 * @return
	 */
	public long getGivenFileSize(File f)
	{
		long diskUsage;
		if(f.isDirectory())
			diskUsage = FileUtils.sizeOfDirectory(f);
		else
			diskUsage = f.length();
		return diskUsage;
	}
}
