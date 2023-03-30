package sce01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();  //array 생성,호출해서 list1 매개변수에 저장
		List<String> list2 = new LinkedList<String>();	//linked 생성,호출해서 list2 매개변수에 저장
		
		long startTime; //걸린 시간을 저장할 long타입 변수를 생성
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간: "+(endTime-startTime)+"ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+(endTime-startTime)+"ns");
	}
		
	
	}


