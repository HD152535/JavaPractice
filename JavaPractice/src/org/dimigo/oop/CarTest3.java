package org.dimigo.oop;

public class CarTest3 {

	public static void main(String[] args) {
		Car3 genesis = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 k7 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 sm7= new Car3("삼성자동차", "SM7", "회색");
		
//		genesis.setCompany("현대자동차");
//		genesis.setModel("제네시스");
//		genesis.setColor("검정색");
//		genesis.setMaxSpeed(225);
//		genesis.setPrice(50000000);
//		
//		k7.setCompany("기아자동차");
//		k7.setModel("K7");
//		k7.setColor("흰색");
//		k7.setMaxSpeed(246);
//		k7.setPrice(40000000);
//		
//		sm7.setCompany("삼성자동차");
//		sm7.setModel("SM7");
//		sm7.setColor("회색");
//		sm7.setMaxSpeed(200);
//		sm7.setPrice(38000000);
//		
		System.out.println("<< 자동차 목록 >>");

		
		System.out.println("제조사명 : " + genesis.getCompany());
		System.out.println("모델명 : " + genesis.getModel());
		System.out.println("색상 : " + genesis.getColor());
		System.out.println("최대속도 : " + genesis.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", genesis.getPrice()));
		
		System.out.println();
		
		System.out.println("제조사명 : " + k7.getCompany());
		System.out.println("모델명 : " + k7.getModel());
		System.out.println("색상 : " + k7.getColor());
		System.out.println("최대속도 : " + k7.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", k7.getPrice()));
		
		System.out.println();
		
		System.out.println("제조사명 : " + sm7.getCompany());
		System.out.println("모델명 : " + sm7.getModel());
		System.out.println("색상 : " + sm7.getColor());
		System.out.println("최대속도 : " + sm7.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", sm7.getPrice()));
		
		
	}

}
