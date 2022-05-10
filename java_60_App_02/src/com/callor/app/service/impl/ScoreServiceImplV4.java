package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV4 extends ScoreServiceImplV3{

	public ScoreServiceImplV4() {
		super();
	}
	
	@Override
	public void saveScore() {
		
		FileWriter fileWriter = null;
		PrintWriter print = null;
		/*
		 * 파일 데이터에 저장
		 * V3와 다른 방법임
		 */
		
		try {
			fileWriter = new FileWriter(saveFileName);
			//system.out 대신에 사용하는 print
			print = new PrintWriter(fileWriter);
			
			for(ScoreVO scVO : scList) {
				print.printf("%s:", scVO.getStName());
				print.printf("%d:", scVO.getStKor());
				print.printf("%d:", scVO.getStEng());
				print.printf("%d\n", scVO.getStMath());
				
			}// end for
			print.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
