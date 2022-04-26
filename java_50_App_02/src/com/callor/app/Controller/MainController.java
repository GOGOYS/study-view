package com.callor.app.Controller;

public class MainController {

	public static void main(String[] args) {

		MenuController menu = new MenuController();
		StudentControllerV1 stController = new StudentControllerV1();
		menu.viewMainMenu();

		Integer select = menu.selectMenu();

		while (true) {
			if (select == null) {
				System.out.println("업무선택을 잘못했습니다");
				System.out.println("다시 입력해 주세요");
				continue;
			} else if (select == 1) {
				stController.selectMenu();
			} else if (select == 2) {
				menu.viewScMenu();
			}else if(select == -1){
				break;
			}else{
				System.out.println("업무 선택을 잘못했습니다.");
			}// if end
		}// while end
		
		System.out.println("끝");
	}// main end
}
