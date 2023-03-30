package sce01.exam06;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		//�÷��� ����
		Map<String, Integer> map=new HashMap<String,Integer>();
		
		//��ü����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);//ȫ�浿 Ű�� ���� ������ ���� ������ �����Ѱ����� ��ü
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry��: "+map.size());//����� �� Entry �� ���
		
		//��üã��
		System.out.println("\tȫ�浿: "+map.get("ȫ�浿")); //�̸�(Ű) ���� ����(��)�� �˻�
		System.out.println();
		
		//��ü �ϳ��� ����
		Set<String> keySet= map.keySet(); //key set���
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();			//�ݺ��ؼ� Ű�� ��� ���� Map���� ��
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: "+map.size());
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //Map.Entry Set ���
		Iterator<Map.Entry<String, Integer>>entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer> entry=entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
			
		}
		System.out.println();
		
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: "+map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}