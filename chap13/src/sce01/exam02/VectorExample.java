package sce01.exam02;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3")); //Board�� ȣ���ؼ� ��ü������ �Ű����� �Է�
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));

		list.remove(2);// �ε��� 2�� ���� ����3~�۾���3 ���� �մ������ �ε��� 2��  ����3~�̵�
		list.remove(3); //������ �ε����� �� ������� ������ ������ �ε��� 3�� ����4������ ���� �ε��� 3�� �����ϴ°� ����5~�� ����5~�� ������

		for (int i = 0; i < list.size(); i++) {//i�� list�� �迭�� ũ�⸦ ���� 3�� ����ɰ���
			Board board = list.get(i);// Board�� 3�� string subject,content,writer�� 3���� ������� �ε����� ����� ����1~,����2~,����4~,
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);//����� Board�� �Ű������� board�� ������ �� ����� �ε������� ���
			
		}
	}

}
