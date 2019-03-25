package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.files.model.BankAccount;
import com.capgemini.files.model.DebitCard;

public class SerializationDemo {


	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		DebitCard debitCard = new DebitCard(19506246348193567L, 234, 11, 2021);
		BankAccount account = new BankAccount(101,"john","SAVING",32000,debitCard);
		
		//serialization process
		
		FileOutputStream fileOutputStream = new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		    outputStream.writeObject(account);
		outputStream.close();
		
		
		FileInputStream fileinputStream = new FileInputStream("account.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileinputStream);
		
		BankAccount account2 = (BankAccount)inputStream.readObject();
		inputStream.close();
		
		System.out.println(account);
	}

}
