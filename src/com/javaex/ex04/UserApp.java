package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] usArr = new User[3];
		User us1 = new Customer("jws", "j1234", "정우성", 1000);
		User us2 = new Customer("yjs", "y2345", "이효리", 2000);
		User us3 = new Employee("master", "m7788", "운영자", 5000000);
		usArr[0] = us1;
		usArr[1] = us2;
		usArr[2] = us3;
		
		for (int i = 0; i < usArr.length; i++) {
			usArr[i].showInfo();
		}
		System.out.println("운영자의 월급은 " + us3.getSalary() + "원 입니다.");
	
	}

}
