package arrayListExam;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		
		//ArrayList는 Object배열에 데이터를 저장한다.
		// 만약에 데이터를 추가한다면 기존에 있는 배열을 더 큰 배열에다가 복사한 다음에 데이터를 추가한다.
		
		// raw타입(원천)은 안정성이 떨어지기 때문에 제너릭스를 사용하는 것을 권장한다.
		ArrayList list = new ArrayList();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		
		// Arraylist는 생성자로 다른 list를 저장할 수 있다.
		// subList는 인덱스를 지정해서 특정 구간에 list만 가져올 수 있다.
		ArrayList list2 = new ArrayList(list.subList(1, 3));
		
		// Collections클래스는 정적메서드만 존재하고 컬렉션클래스들에 대한 기능을 제공한다.
		Collections.sort(list);
		Collections.sort(list2);
		print(list,list2);
		/*
		list : [1, 2, 3, 4, 5]
		list2 : [2, 3]
		*/
		
		// 리스트의 모든 요소가 포함되어 있는 리스트 사이를 비교한다.
		System.out.println(list.containsAll(list2));
		System.out.println(list2.containsAll(list));
		
		// 인덱스 지정 데이터 저장
		list.add(3,"A");
		
		// list와 list2의 공집합부분만 제외하고 삭제
		System.out.println(list.retainAll(list2));
		print(list,list2);
		/*
		list : [2, 3]
		list2 : [2, 3]
		*/
		
		// list.get : 해당 인덱스의 값을 반환
		// list.size : 리스트의 크기 반환
		// list.remove : 해당 인덱스의 값 삭제
		// 끝에서부터 제거하면서 1씩 감소시키고  0보다 작을 때까지 반복
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
			list.remove(i);
		}
		
	}
	
	static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
	}
}
