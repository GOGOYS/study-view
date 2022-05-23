package com.callor.app.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exex0000 {
	public static void main(String[] args) throws IOException {
		String file ="src/com/callor/app/exec/delta.txt";
		
		FileReader read = null;
		BufferedReader buffer = null;
		
		try {
			read = new FileReader(file);
			buffer = new BufferedReader(read);
			while(true) {
				String line = buffer.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			buffer.close();
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
