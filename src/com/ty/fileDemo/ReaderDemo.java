package com.ty.fileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReaderDemo {

	Scanner scan=new Scanner(System.in);
	FileInputStream fil=null;
	
	public static void main(String[] args) {
		
	try	(FileInputStream fil=new FileInputStream("output.txt")){
		
		int i;
		while((i=fil.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
