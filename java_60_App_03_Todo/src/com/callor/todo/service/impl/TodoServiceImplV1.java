package com.callor.todo.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService {
	
	protected final String saveFileName;
	protected final List<TodoVO> todoList;

	public TodoServiceImplV1() {
		
		this("src/com/callor/todo/model/todolist.txt");
	}
	public TodoServiceImplV1(String saveFileName) {
		
		todoList = new ArrayList<>();
		this.saveFileName = saveFileName;
	}

	/*
	 * 매개변수로 content내용을 전달받아 key, 추가날짜, 시간을 생성한 후 TodoVO에 담고 todoList에 추가하기
	 * 
	 * java에서 날짜, 시간을 취급하는 방법이 여러가지가 있다. 자바버전 1.7이전에서는 date, Calender 클래스를 사용하여 날짜와
	 * 시간을 취급했다 1.8이후에서는 LocalDate, LocalTime, LocalDateTime이라는 클래스를 사용하여 날짜와 시간을
	 * 취급한다.
	 */
	@Override
	public void todoInsert(String content) {
		// TODO Auto-generated method stub
		// 컴퓨터의 현재날짜 시각을 읽어오기
		// 1.8에서는 Date 클래스의 생성자에 System.currentTimeMillis() method를 주입해 주어야 한다.
		Date curDate = new Date(System.currentTimeMillis());

		// Date 객체의 값을 날짜, 시각 문자열 타입으로 변경하기 위한 객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");

		// 현재 날짜, 시각에 해당하는 문자열 생성하기
		// SimpleDateFormat에 의해서 패턴대로 날짜 시각 문자열을 만든다.
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);

		/*
		 * Data 관련하여 사용되는 key, id 값 Data의 무결성을 보장하기 위하여 모든 데이터(레코드 단위 row단위)는 데이터를 유일하게
		 * 식별(구별)할 수 있는 데이터를 가지고 있어야 한다. 각 언어,DBMS 등에서는 고유의 방법으로 ID믈 만들고 관리한다.
		 * 
		 * java에서는 java.util.UUID 클래스를 사용하여 범우주적으로 유일한 ID 값을 생성하는 도구를 제공한다.
		 * 
		 */
		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();

		TodoVO tVO = TodoVO.builder().tKey(idStr).sDate(today).sTime(time).tContent(content).build();

		todoList.add(tVO);
	}

	@Override
	public List<TodoVO> todoSelectAll() {

		return todoList;
	}

	@Override
	public TodoVO findByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(TodoVO tVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveTodo(String fileName) throws IOException {

		FileWriter writer = null;
		PrintWriter out = null;
		
		writer = new FileWriter(saveFileName);
		out = new PrintWriter(writer);
		
		for(TodoVO vo : todoList) {
			out.printf("%s,", vo.getTKey());
			out.printf("%s,", vo.getSDate());
			out.printf("%s,",vo.getSTime());
			out.printf("%s,",vo.getEDate());
			out.printf("%s,",vo.getETime());
			out.printf("%s\n",vo.getTContent());
		}
		// buffer 에 남아있는 데이터를 강제로 파일에 기록
		out.flush();
		
		// 열려있는 파일 resource 를 닫기
		// 파일에 저장하는 코드에서는 
		// 반드시 마지막에 close를 해야 한다
		out.close();
		writer.close();
		
	}
	/*
	 * TODO 완료하기 매개변수로 전달받은 num 값은 List 요소의 실제 값보다 1만큼 크다 num 값이 4라면 실제로를 3번 요소를 선택한
	 * 것이다.
	 * 
	 * 선택한 요소의 edate, etime 부분을 현재 시스템의 날짜와 시간을 사용하여 문자열로 바꾼다음 setting
	 * 
	 * 완료한 날짜와 시간을 지정하기 숙제
	 */
	@Override
	public void compTodo(Integer num) {
		int index = num - 1;
		// java 1.8부터 사용하는 새로운 날짜 시간 관련 클래스
		// Date, Calender 클래스의 날짜와 관련된 많은 이슈때문에 새롭게 디자인되고 만들어진 클래스이다.
		// 객체를 새로 생성하는 것이 아니고 now()라는 static 메서드를 호출하여 가져다 쓰는구조이다.
		LocalDateTime local = LocalDateTime.now();
		LocalDate localdate = LocalDate.now();
		LocalTime localtime = LocalTime.now();

		// 날짜형의 문자열로 변환하기
		DateTimeFormatter toDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter toTimeFormat = DateTimeFormatter.ofPattern("hh::mm:ss");

		String eDate = local.format(toTimeFormat);
		String eTime = local.format(toTimeFormat);
		try {
			
			//todo의 eDate값이 null 이거나 ""이면
			//위에서 만든 eDate(현재시각)을 그대로 다시 eDate에 담고
			//그렇지 않으면 eDate에 null을 담아라
			
			//3항연산자
			//조건에 따라 변수에 다른 값을 저장하고 싶을때
			//변수 = 조건 ? 참일때 : 거짓일때
			TodoVO tVO = todoList.get(index);
			eDate = tVO.getEDate() == null || tVO.getEDate().isEmpty() ? eDate : null;
			eDate = tVO.getETime() == null || tVO.getETime().isEmpty() ? eDate : null;
			tVO.setEDate(eDate);
			tVO.setETime(eTime);
		} catch (Exception e) {
			System.out.println("TODOList 데이터 범위를 벗어났습니다.");
			
		}
		


		/*
		 * Date curDate = new Date(System.currentTimeMillis());
		 * 
		 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 * SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss"); String today
		 * = dateFormat.format(curDate); String time = timeFormat.format(curDate);
		 * 
		 * TodoVO tVO =
		 * TodoVO.builder().tKey(toVO.get(num).getTKey()).sDate(today).sTime(time).
		 * tContent(toVO.get(num).getTContent()).eDate(today).eTime(time).build();
		 * 
		 * todoList.set(num, tVO);
		 */

	}

}
