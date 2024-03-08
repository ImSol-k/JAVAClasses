package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		
		int star = 6;
		
		//세로
		for(int i = 1; i <= star; i++) {
			
			//가로
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			
			//한줄 넘어갈때 마다 개행
			System.out.println();
		}
		
		
		
		
	}

}
