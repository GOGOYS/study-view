package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class exex000 {
	public static void main(String[] args) {
		
		String file = "src/com/callor/app/exec/delta.txt";
		
		InputStream data = null;
		Scanner scan = null;
		
		try {
			data = new FileInputStream(file);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 없습니다");
		}
		
		
	}
}
