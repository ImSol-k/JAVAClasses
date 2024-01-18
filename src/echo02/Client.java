package echo02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		
		//소캣객체생성
		Socket socket = new Socket();	
		System.out.println(">> 클라이언트시작");
		System.out.println("===========================");
		
		//서버 연결
		System.out.println(">> 서버에 연결을 요청합니다");
		//socket.connect(new InetSocketAddress("192.168.0.43", 10001));
		socket.connect(new InetSocketAddress("192.168.0.91", 10001));
		System.out.println(">> 서버에 연결 되었습니다");
		
		//메세지 보내기		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//메세지 받기
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		Scanner in = new Scanner(System.in);
//		InputStream in = System.in;
//		InputStreamReader inIsr = new InputStreamReader(in, "UTF-8");
//		BufferedReader inBff = new BufferedReader(inIsr);
		
		while(true) {
			//메세지 입력
			String inMsg = in.nextLine();
			//String inMsg = inBff.readLine();
			
			if("/q".equals(inMsg)){
				break;
			}
			bw.write(inMsg);
			bw.newLine();
			bw.flush();
			
			//메세지 보내기
			String msg = br.readLine();
			System.out.println("Server [" + msg + "]");
		}
		System.out.println("==============================");
		System.out.println(">> 클라이언트 종료");
		
		//println
		OutputStream pos = System.out;
		OutputStreamWriter posw = new OutputStreamWriter(pos, "UTF-8");
		BufferedWriter pbw = new BufferedWriter(posw);
		
		pbw.write("printlnTest");
		pbw.newLine();
		pbw.flush();
		
		//close
		socket.close();
		bw.close();
		br.close();
		in.close();
	}

}
