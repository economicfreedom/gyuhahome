package sce01.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // String ��ü�� ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); //�տ� �ִ� Servlet/JSP�� 3������ ���� Database�� 2������ ��
		list.add("iBATIS");
		
		int size = list.size(); //ũ�⸦ ������ �Էµ�
		System.out.println("�� ��ü��: "+size);//�Էµ� ���ڿ��� 5���� 5�� �����
		System.out.println();
		
		
		String skill = list.get(3);//2�� �ε����� ��ü�� ����(�տ� database�� �ε��� 2������ ������)
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {//����� �� ��ü ����ŭ ���� Java,JDBC,Servelt/JSP,Database,iBATIS�� i�� ���ε�
			String str =list.get(i); // str�� i�� ����� 5���� �ε����� ���εǰ� 
			System.out.println(i+":"+str);//list.get(i) = 5���� �ε����� ���ϰ� ���� str�� list.get(i)�� ���ϰ� �ִ� 5���� �ε����� ����� i�� 0~4���� ����� ������ 0~4�� �����
		}
		System.out.println();
		
		
		list.remove(2); //2�� �ε����� ���� ���⼭ database�� ������
		list.remove(2);//2�� �ε����� ����µ� �տ��� database�� �����ż� 2�� �ε����� Servelt/JSP,Database�� �Ǿ remove(2)�� ����ϸ� Servelt/JSP,Database �� ������
		list.remove("iBATIS");//iBATIS�� ������
		
		for (int i = 0; i < list.size(); i++) { // �ٽ� �����ؼ� i�� list ������ŭ �����Ŵ
			String str = list.get(i); //str�� Java,JDBC�� ������ i�� 0~1 �ΰ��� �ε����� ������ ũ�Ⱑ 2����
			System.out.println(i+":"+str);//�����͵��� ����� ��µɶ� 0:Java,1:JDBC�� ��µ� ������ 3���� ���� �߱� ����
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
