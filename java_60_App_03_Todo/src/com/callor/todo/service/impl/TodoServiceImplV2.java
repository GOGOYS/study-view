package com.callor.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.callor.todo.model.IndexInfo;
import com.callor.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1{
	
	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}
	
	/*
	 * 저장된 todoList.txt파일을 읽어서 todoList에 추가하기
	 * 
	 * todolist.txt파일열기
	 * 		열기할 파일은 V1의 saveFimeName에 저장되어 있다.
	 * 한라인씩 읽어서
	 * 컴마(,)기준으로 spilt하고
	 * todoVO에 담고
	 * todoList 추가
	 *  	v1의 todoList 객체가 생성되어 있다.
	 */
	private void loadTodoList() {
		//InputStream을 생성하고
		FileInputStream is = null;
		//Scanner에 연결
		Scanner scan = null;
		try {
			is = new FileInputStream(this.saveFileName);
		} catch (FileNotFoundException e) {
			System.out.println(saveFileName +"파일을 찾을 수 없습니다");
			return;
		}
		scan = new Scanner(is);
		
		int T_KEY = 0;
		int T_SDATE = 1;
		int T_STIME =2;
		int T_EDATE =3;
		int T_ETIME =4;
		int T_CONTENT =5;
		
		while(scan.hasNext()) {
			String tLine = scan.nextLine();
			String[] todo = tLine.split(",");
			//text 파일에 데이터를 저장하면 마지막에
			//공백의 line이 추가되는 경우가 있다
			//이때는 splite으로 분해한 배열의 개수가 부족하게 된다.
			//이러한 상황을 방지하기 위하여 아래 코드를 추가한다.
			if(todo.length < T_CONTENT+1) continue;
			
//			String tKey = tInfo[IndexInfo.ST.TKEY];
//			String sDate = tInfo[IndexInfo.ST.SDATE];
//			String sTime = tInfo[IndexInfo.ST.STIME];
//			String tContent = tInfo[IndexInfo.ST.TCONTENT];
//			String Comp = tInfo[IndexInfo.ST.COMP];
			
//			TodoVO toVO = new TodoVO(tKey, sDate, sTime, tContent, Comp);
			
			String eDate = todo[T_EDATE];
			String eTime = todo[T_ETIME];
			if(eDate.equalsIgnoreCase("null")) eDate = null;
			if(eTime.equalsIgnoreCase("null")) eTime = null;
			TodoVO toVO = TodoVO.builder()
								.tKey(todo[T_KEY])
			.sDate(todo[T_SDATE])
			.sTime(todo[T_STIME])
			.eDate(eDate)
			.eTime(eTime)
			.tContent(todo[T_CONTENT])
			.build();
			
			todoList.add(toVO);

		}
	}
	//end loadTodo
	@Override
	public void update(Integer num, String content) {
		int index = num -1;
		TodoVO tVO;
		
		try {
			tVO = todoList.get(index);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("선택한 항목이 리스트에 없습니다");
			 return;
		}
		tVO.setTContent(content);
		
		//업데이트 후에 내용을 파일에 자동으로 저장하기
		try {
			this.saveTodo(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
