package H5_어레이리스트;

import java.util.ArrayList;

public class H5_01_어레이리스트_기본이론4 {
	/*
	 * 어레이리스트(정수형) [1] 어레이리스트에서는 기존의 int 는 사용할수없다. [2] Integer 로 변수를 선언해야한다. [3] 선언만
	 * Integer 로하고 나머지는 똑같다.
	 */
	public static void main(String[] args) {
		// 특이하게 int 는 사용할수없고 Integer 로 바꿔줘야한다.
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 추가
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		// 삭제
		list.remove(1); // 20이 삭제된것이다.

		// 수정
		list.set(2, 100);
		// 인덱스 2면 10,30,40 에서 40을 뜻한다.
		// 40 이 100으로 바뀐것이다.

		System.out.println("-------------------");
		// 출력
		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i); // 꺼낼때는 int로 해도된다.
			System.out.println(temp);
		}
	}
}
