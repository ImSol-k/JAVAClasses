package com.javaex.ex03;

import java.util.Scanner;
import java.util.ArrayList;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	ArrayList<Goods> gList = new ArrayList<Goods>();
    	Goods god;
    	String[] gods;
    	String goods;
    	int num = 0;
    	
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	while(true) {
    		goods = in.nextLine();
    		
    		if("q".equals(goods)) {
    			System.out.println("[입력완료]");
    			break;
    		}
    		else {
    			gods = goods.split(",");
    			god = new Goods(gods[0], Integer.parseInt(gods[1]), Integer.parseInt(gods[2]));
    			gList.add(god);
    			num += Integer.parseInt(gods[2]);
    		}    		
    		
    	}
    	System.out.println("=====================");
    	for (int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
		}
    	System.out.println("모든 상품의 갯수는" + num + "개입니다.");
    	in.close();
    }

}
