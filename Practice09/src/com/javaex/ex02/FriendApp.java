package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	Friend frd;
    	String friend;
    	String[] str;
    	
    	System.out.println("친구 3명 등록해주세요");
    	for (int i = 0; i < 3; i++) {
    		friend = in.nextLine();
    		str = friend.split(" ");
    		frd = new Friend(str[0], str[1], str[2]);
    		fList.add(frd);
		}
    	
    	for (int i = 0; i < fList.size(); i++) {
    		fList.get(i).showInfo();
		}
    	
    	in.close();
    }

}
