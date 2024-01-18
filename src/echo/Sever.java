package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {

	public static void main(String[] args) throws IOException {
		
		boolean server = true;
				
		//192.168.0.91				
		ServerSocket svsk = new ServerSocket();
		
		//bind
		svsk.bind(new InetSocketAddress("192.168.0.91", 10001));
		
		System.out.println(">> 서버시작");
		System.out.println("===========================");
		
		//반복시작
		while(server) {
			System.out.println(">> 연결을 기다리고 있습니다");

			//클라이언트 접속
			Socket socket = svsk.accept();
			Thread thread = new ServerThread(socket);
			thread.start();
		}
		/*
		 * //종료
		if(server == false) {			
			System.out.println("===========================");
			System.out.println(">> 서버종료");

			//close
			svsk.close();
			socket.close();
		}
		*/
	}

}
