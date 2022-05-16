package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08 {
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/app/exec/delta.txt";
		
		InputStream data = null;
		Scanner scan = null;
		
		try {
			data = new FileInputStream(fileName);
			scan = new Scanner(data);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			
			scan.close();
			try {
				data.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어");
		}
		
		
				
	}
}
