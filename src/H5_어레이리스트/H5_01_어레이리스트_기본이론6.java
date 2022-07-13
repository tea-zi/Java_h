package H5_어레이리스트;

import java.util.Arrays;
import java.util.Scanner;

public class H5_01_어레이리스트_기본이론6 {
	/*
	 * 어레이 리스트를 안쓸때 (일반배열사용) 복습 회원관리데이터 [1] 번호 [2] 아이디 [3] 비밀번호 [4] 이름
	 * 
	 * 테스트를 위해 아래 기본데이터 4개를 넣고 시작한다.
	 */

	public static void main(String[] args) {

		// 어레이 리스트를 안쓸때 (일반배열사용)

		Scanner scan = new Scanner(System.in);
		String[] test1 = { "1001", "aaa", "aaa123", "김철수" };
		String[] test2 = { "1002", "bbb", "bbb123", "이민수" };
		String[] test3 = { "1003", "ccc", "ccc123", "박영희" };
		String[] test4 = { "1004", "ddd", "ddd123", "최민정" };

		String[][] memberList = new String[100][4];
		int count = 0;
		int lastNumber = 1001;
		memberList[count] = test1;
		lastNumber++;
		count++;

		memberList[count] = test2;
		lastNumber++;
		count++;

		memberList[count] = test3;
		lastNumber++;
		count++;

		memberList[count] = test4;
		lastNumber++;
		count++;

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

				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						check = true;
						break;
					}
				}

				if (check == true) {
					System.out.println("중복아이디입니다.");
				} else {
					String[] data = new String[4];
					data[0] = lastNumber + "";
					data[1] = id;
					System.out.print("비밀번호입력 : ");
					String pw = scan.next();
					data[2] = pw;
					System.out.print("이름입력 : ");
					String name = scan.next();
					data[3] = name;
					memberList[count] = data;
					lastNumber++;
					count++;
				}
			} else if (sel == 2) { // 삭제
				System.out.print("아이디입력 : ");
				String id = scan.next();
				int index = -1;

				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("아이디가 존재하지 않습니다.");
				} else {
					for (int i = index; i < count - 1; i++) {
						memberList[i] = memberList[i + 1];
					}
					memberList[count - 1] = null;
					count--;
				}
			} else if (sel == 3) { // 수정
				System.out.print("아이디입력 : ");
				String id = scan.next();
				int index = -1;

				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("아이디가 존재하지 않습니다.");
				} else {
					System.out.println("변경사항선택");
					System.out.println("[1.아이디][2.비밀번호][3.이름]");
					sel = scan.nextInt();
					if (sel == 1) {
						System.out.print("아이디입력 : ");
						id = scan.next();
						boolean check = false;

						for (int i = 0; i < count; i++) {
							String temp = memberList[i][1];
							if (id.equals(temp)) {
								check = true;
								break;
							}
						}

						if (check == true) {
							System.out.println("중복아이디입니다.");
						} else {
							memberList[index][1] = id;
						}
					} else if (sel == 2) {
						System.out.print("비밀번호입력 : ");
						String pw = scan.next();
						memberList[index][2] = pw;
					} else if (sel == 3) {
						System.out.print("이름입력 : ");
						String name = scan.next();
						memberList[index][3] = name;
					}
				}
			} else if (sel == 4) { // 검색
				System.out.print("아이디입력 : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						index = i;
						break;
					}
				}
				if (index == -1) {
					System.out.println("존재하지 않는 아이디입니다.");
				} else {
					System.out.println(Arrays.toString(memberList[index]));
				}
			} else if (sel == 5) { // 출력
				for (int i = 0; i < count; i++) {
					System.out.println(Arrays.toString(memberList[i]));
				}
			}
		}
	}
}
