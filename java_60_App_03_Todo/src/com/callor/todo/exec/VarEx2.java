package com.callor.todo.exec;
import java.util.ArrayList;
import java.util.List;

import com.callor.todo.model.TodoVO;

public class VarEx2 {
 public static void main(String[] args) {
	List<TodoVO>todoList = new ArrayList<>();
	
	/*
	 * builder 패턴을 사용한 VO 객체 생성
	 * 클래스.Builder() 매서드에 의해서 VO 객체가 선언되고
	 * 필드변수로 선언한 것과 같은 이름의 setter method를 사용하여
	 * VO객체의 각 변수를 채워넣으면서 VO 객체를 생성하는것
	 */
	TodoVO tVO = TodoVO.builder().sDate("2022-05-11").tContent("과제하기").build();
	
	todoList.add(tVO);
	
	//기본생성자를 사용하여 객체를 초기화하고
	//setter method를 사용하여 각 변수 값을 저장하기
	//필드생성자를 사용하여 객체 변수를 저장하면서 제거하기
	
	TodoVO  todoVO = todoList.get(0);
}
}
