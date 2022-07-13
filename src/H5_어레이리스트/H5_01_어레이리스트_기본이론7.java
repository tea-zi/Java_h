package H5_어레이리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class H5_01_어레이리스트_기본이론7 {
	/*
	 * 어레이 리스트 2차원 회원관리데이터 [1] 번호 [2] 아이디 [3] 비밀번호 [4] 이름
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] test1 = { "1001", "aaa", "aaa123", "김철수" };
		String[] test2 = { "1002", "bbb", "bbb123", "이민수" };
		String[] test3 = { "1003", "ccc", "ccc123", "박영희" };
		String[] test4 = { "1004", "ddd", "ddd123", "최민정" };

		int lastNumber = 1000;
		ArrayList<String[]> memberList = new ArrayList<String[]>();

		lastNumber++;
		memberList.add(test1);

		lastNumber++;
		memberList.add(test2);
		lastNumber++;
		memberList.add(test3);
		lastNumber++;
		memberList.add(test4);

		memberList.get(0)[0] = "1005";

		while (true) {
			System.out.println("[회원관리]");
			System.out.println("[1] 추가 [2] 삭제 [3] 수정 [4] 검색 [5] 출력 [0] 종료");
			int sel = scan.nextInt();
			if (sel == 0) { // 종료
				break;
			} else if (sel == 1) { // 추가
				System.out.print("아이디입력 : ");
				String id = scan.next();
				boolean check = false;

				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						check = true;
						break;
					}
				}

				if (check == true) {
					System.out.println("중복된아이디입니다.");
				} else {
					System.out.print("비밀번호입력 : ");
					String pw = scan.next();
					System.out.print("이름입력 : ");
					String name = scan.next();
					String data[] = new String[4];
					lastNumber++;
					data[0] = lastNumber + "";
					data[1] = id;
					data[2] = pw;
					data[3] = name;
					memberList.add(data);
				}
			} else if (sel == 2) { // 삭제
				System.out.print("아이디입력 : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("아이디가 존재하지 않습니다.");
				} else {
					memberList.remove(index);
				}
			} else if (sel == 3) { // 수정
				System.out.println("아이디입력 : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("아이디가 존재하지 않습니다.");
				} else {
					String[] data = memberList.get(index);
					System.out.println("변경사항");
					System.out.println("[1.아이디][2.비밀번호][3.이름]");
					sel = scan.nextInt();
					if (sel == 1) {
						System.out.print("변경할 아이디입력 : ");
						id = scan.next();
						boolean check = false;
						for (int i = 0; i < memberList.size(); i++) {
							String[] temp = memberList.get(i);
							if (id.equals(temp[1])) {
								check = true;
								break;
							}
						}

						if (check == true) {
							System.out.println("중복된아이디입니다.");
						} else {
							memberList.get(index)[1] = id;
//							data[1] = id;
//							memberList.set(index, data);
						}
					} else if (sel == 2) {
						System.out.print("비밀번호입력 : ");
						String pw = scan.next();
						memberList.get(index)[2] = pw;
//						data[2] = pw;
//						memberList.set(index, data);
					} else if (sel == 3) {
						System.out.print("이름입력 : ");
						String name = scan.next();
						memberList.get(index)[3] = name;
//						data[3] = name;
//						memberList.set(index, data);
					}
				}
			} else if (sel == 4) { // 검색
				System.out.print("아이디입력 : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("아이디가 존재하지 않습니다.");
				} else {
					System.out.println(Arrays.toString(memberList.get(index)));
				}
			} else if (sel == 5) { // 출력
				for (int i = 0; i < memberList.size(); i++) {
					System.out.println(Arrays.toString(memberList.get(i)));
				}
			}

		}
	}
}
