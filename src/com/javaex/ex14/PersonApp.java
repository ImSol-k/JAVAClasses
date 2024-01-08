package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
		Person pe1 = new Person("정우성", 45);
		
		Student std1 = new Student();		
		std1.setName("정우성");
		std1.setAge(45);
		std1.setSchoolName("서울고등학교");
		
		Student std2 = new Student("유재석", 44, "서울고등학교");
		
		pe1.showInfo();
		System.out.println(pe1.toString());
		System.out.println("========================================");
		System.out.println(std1.toString());
		System.out.println("========================================");
		System.out.println(std2.toString()
				);
		
	}

}
