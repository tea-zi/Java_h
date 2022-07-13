package H5_어레이리스트;

import java.util.ArrayList; // 임포트 해야한다.

public class H5_01_어레이리스트_기본이론3 {
	/*
	 * 어레이리스트와 일반배열 둘을 비교해보자.
	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		String[] str = new String[100];
		int count = 0;

		// ------------------------------------
		// [1] 추가
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		// ------------------------------------

		str[count] = "aaa";
		count += 1;
		str[count] = "bbb";
		count += 1;
		str[count] = "ccc";
		count += 1;
		str[count] = "ddd";
		count += 1;
		// ------------------------------------

		// [2] 삭제
		// bbb를 삭제해보자.
		int removeIndex = 1;
		list.remove(removeIndex);

		// ------------------------------------

		for (int i = removeIndex; i < count - 1; i++) {
			str[i] = str[i + 1];
		}
		str[count] = "";
		count -= 1;

		// ------------------------------------

		// [3] 수정
		// ccc 를 kkk 로변경 ; // 위에서 삭제했으므로 aaa , ccc , ddd 3개만있다.
		int updateIndex = 1;
		String updateValue = "kkk";
		list.set(updateIndex, updateValue);
		// ------------------------------------

		str[updateIndex] = updateValue;

		// ------------------------------------

		// [4] 출력
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("-------------------");
		for (int i = 0; i < count; i++) {
			String temp = str[i];
			System.out.println(temp);
		}
	}

}