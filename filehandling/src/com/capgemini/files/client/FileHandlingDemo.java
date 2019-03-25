package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file = new File("C:\Rajyalakshmi\junit assignment\BankAccountClient.java");
//		System.out.println(file.exists());
		// File folder = new File("C:\Rajyalakshmi\junit assignment\src");
		// System.out.println(folder.exists());

		/*
		 * File file = new File("text.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("file created sucessfully.."); }
		 */

		// FileWriter writer = new FileWriter(file);
		// BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		/*
		 * PrintWriter writer = new PrintWriter(new FileWriter(file,true));
		 * writer.println("hello.."); writer.println("how are you..");
		 * writer.println("i hope u are fine.."); writer.println("okay..");
		 * writer.println("bye..");
		 * 
		 * writer.close(); System.out.println("content has been written sucessfully");
		 */
		/*
		 * FileReader reader = new FileReader(
		 * "C:\\Rajyalakshmi\\basic-assignments\\bank-app\\src\\com\\capgemini\\bankapp\\test\\BankAccountTest.java"
		 * ); BufferedReader bReader = new BufferedReader(reader);
		 * 
		 * PrintWriter writer = new PrintWriter("BankAccountTest.java");
		 * 
		 * String content;
		 * 
		 * while((content = bReader.readLine())!=null){ //System.out.println(content);
		 * writer.println(content); } System.out.println("success"); writer.close();
		 * bReader.close(); reader.close();
		 */
		
		File newDir = new File("myDir");
		if(!newDir.exists()) {
			newDir.mkdir();
			System.out.println("folder is successfully created");
		}
		
		File file = new File(newDir,"myfile.txt");
		if(!file.exists())
		{
			file.createNewFile();
			System.out.println("file is scuccessfully created");
		}
         
	}

}
