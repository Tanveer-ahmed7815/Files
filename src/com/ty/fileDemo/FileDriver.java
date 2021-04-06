package com.ty.fileDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDriver {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);	
		FileOutputStream out=null;
		try {
		 out=new FileOutputStream("Output.txt", true);
		
		System.out.println("Enter a sentence");

		String sentence= input.nextLine();
		byte[] data=sentence.getBytes();
		out.write(data);
		System.out.println("done writing");
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		input.close();
		try {
			out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}

}