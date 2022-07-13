package H5_어레이리스트;

import java.util.ArrayList;

public class H5_01_어레이리스트_기본이론2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println("------------------");

		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}

		System.out.println("------------------");

		list.set(1, "ddd");
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
		System.out.println("------------------");

		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
		}
	}
}