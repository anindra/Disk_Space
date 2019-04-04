package main.IO_Controller;

import java.util.Scanner;

public class ReadPathFromUser {

	public String getPath()
	{
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}
