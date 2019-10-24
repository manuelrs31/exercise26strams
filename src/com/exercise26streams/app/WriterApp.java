package com.exercise26streams.app;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterApp {

	public static void main(String[] args)
	
	{
		//final limit = 24;
		int tabla=0;
		Scanner input = new Scanner(System.in);
		File myFile = null;
		FileWriter myWriter= null;
		BufferedWriter myBuffer= null;
		try 
		{
			myFile = new File("c:\\a\\b.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			System.out.println("dame la tablaa multiplicar");
			tabla=input.nextInt();
			
			for ( int i=0;i<=24;i++)
			{
			//myBuffer.write("hey manuel");
				
				System.out.println(String.format("%d X %d = %d", tabla,i,tabla*i));
				myBuffer.write(String.format("%d X %d = %d \n", tabla,i,tabla*i));
			}
			
			
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				myBuffer.close();
				myWriter = null;
				myFile = null;
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
