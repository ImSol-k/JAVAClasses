package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(i + "번째 값 : " + args[i]);
//		}
//			if(args[0].equals("-h")) {
//				System.out.println("도움말");
//			}
//			else if(args[0].equals("-v")) {
//				System.out.println("버전정보 : 1.1");
//			}
//			else if(args[0].equals("-m")) {
//				System.out.println("만든사람 : 김소리");
//			}
//			else if(args[0].equals("-a")) {
//				System.out.println("버전정보 : 1.1");
//				System.out.println("만든사람 : 김소리");
//			}
//			else {	}
		
		switch (args[0]) {
		case "-h":
			System.out.println("도움말");
			break;
		case "-v":
			System.out.println("버전정보 : 1.1");
			break;
		case "-m":
			System.out.println("만든사람 : 김소리");
			break;
		case "-a":
			System.out.println("버전정보 : 1.1");
			System.out.println("만든사람 : 김소리");
			break;
		default:
				break;
		}
		
	}

}
