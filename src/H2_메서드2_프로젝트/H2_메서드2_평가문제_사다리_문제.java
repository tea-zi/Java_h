package H2_메서드2_프로젝트;

import java.util.Random;
import java.util.Scanner;

//# 사다리 게임

class LadderGame {
	Scanner scan = new Scanner(System.in);
	int[][] ladder = { { 0, 0, 0, 0, 0 }, { 1, 2, 0, 1, 2 }, { 0, 1, 2, 0, 0 }, { 0, 0, 0, 1, 2 }, { 0, 1, 2, 0, 0 },
			{ 1, 2, 0, 0, 0 }, { 0, 0, 0, 1, 2 }, { 0, 0, 0, 0, 0 } };

	int pos = 0;
	String menu = "";

	void print() {
		System.out.println(" 1  2  3  4  5");
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) {
					System.out.print(" │ ");
				} else if (ladder[i][j] == 1) {
					System.out.print(" ├─");
				} else if (ladder[i][j] == 2) {
					System.out.print("─┤ ");
				} else {
					System.out.print(" ☆ ");
				}
			}
			System.out.println();
		}
	}

	void selectPosition() {
		System.out.print("위치 입력 : ");
		pos = scan.nextInt();
		pos--;
		ladder[0][pos] = 8;
		for (int i = 0; i < ladder.length; i++) {
			if (ladder[i][pos] == 1) {
				pos++;
			} else if (ladder[i][pos] == 2) {
				pos--;
			}
			ladder[i][pos] = 8;
		}

	}

	void setMenu() {
		if (pos == 0) {
			menu = "김밥";
		} else if (pos == 1) {
			menu = "파스타";
		} else if (pos == 2) {
			menu = "치킨";
		} else if (pos == 3) {
			menu = "따아";
		} else if (pos == 4) {
			menu = "피자";
		} else if (pos == 5) {
			menu = "떡볶이";
		}

	}

	void run() {
		print();

		selectPosition();

		print();

		setMenu();

		System.out.println("오늘의 점심 메뉴는 " + menu + " 입니다~!!!");
	}
}

public class H2_메서드2_평가문제_사다리_문제 {
	public static void main(String[] args) {

		LadderGame lg = new LadderGame();

		lg.run();
	}
}