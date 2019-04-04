package main.Controller;

import java.io.File;

public class GetAllFilesAndDirectories {

	
	public File[] sentFilesAndDirectoriesList(String path)
	{
		// File object for the given path
        File parentDir = new File(path); 
       
        if(parentDir.exists() && parentDir.isDirectory()) 
        { 
	        //get the list of all the file and directories from the given path
	        File fileArray[] = parentDir.listFiles();
	        
	        //return the list of all the files and Directories
	        return fileArray;
        }
        else
        {
        	System.out.println("Invalid Path");
        	return null;
        }
	}
}
