package H5_어레이리스트;

import java.util.ArrayList; // 임포트 해야한다.

public class H5_01_어레이리스트_기본이론1 {

	public static void main(String[] args) {
		/*
		 * # 어레이리스트 [1] 기본 배열은 max 값을 정해놓고 그이상은 저장할수가 없었다. [2] 어레이리스트는 가변배열로 무한대로 저장이
		 * 가능하다.
		 * 
		 * # 사용법 [1-1] 랜덤과 마찬가지로 임포트 해야한다. [1-2] import java.util.ArrayList;
		 * 
		 * [2-1] 변수 선언의 모습이 특이하다. <> 를 이용한다. [2-2] ArrayList<String> list = new
		 * ArrayList<String>();
		 * 
		 */
		ArrayList<String> list = new ArrayList<String>();

		// 1. 추가 add
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println("-------------");

		// 2. 출력 size 와 get
		// list.size() ==> 위에 4개를 추가햇으므로 4이다.
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i); // get(인덱스) 를 통해서 하나씩 꺼낼수가있다.
			System.out.println(temp);
			System.out.println(list.get(i));
		}
		System.out.println("-------------");

		// 3. 수정 set (인덱스 , 변경할값)
		// bbb 를 eee 로 변경해보자.
		list.set(1, "eee");
		list.set(2, "bbb");
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("-------------");

		// 4. 삭제 remove(인덱스)
		// ccc 를 삭제해보자.
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("-------------");
	}

}