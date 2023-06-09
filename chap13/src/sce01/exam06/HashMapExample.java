package sce01.exam06;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		//컬렉션 생성
		Map<String, Integer> map=new HashMap<String,Integer>();
		
		//객체저장
		map.put("신용권", 85);
		map.put("홍길동", 90);//홍길동 키가 같기 때문에 제일 마지막 저장한값으로 대체
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry수: "+map.size());//저장된 총 Entry 수 얻기
		
		//객체찾기
		System.out.println("\t홍길동: "+map.get("홍길동")); //이름(키) 으로 점수(값)를 검색
		System.out.println();
		
		//객체 하나씩 정리
		Set<String> keySet= map.keySet(); //key set얻기
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();			//반복해서 키를 얻고 값을 Map에서 얻어냄
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: "+map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //Map.Entry Set 얻기
		Iterator<Map.Entry<String, Integer>>entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer> entry=entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
			
		}
		System.out.println();
		
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: "+map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
