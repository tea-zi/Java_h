package H3_메서드리턴1_알고리즘;

import java.util.Scanner;

//# 숫자 이동하기 : 클래스 + 메서드
//1. 숫자 8은 캐릭터이다.
//2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
//3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
//4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.

class moveNumber {
	Scanner scan = new Scanner(System.in);

	int[] move = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int size = move.length;
	int player = 4;

	void showMenu() {
		System.out.println(player);
		System.out.print("0.종료하기");
		System.out.print("1.좌로 이동");
		System.out.print("2.우로 이동");
		System.out.print(": ");
	}

	void print() {
		for (int i = 0; i < size; i++) {
			if (move[i] == 0) {
				System.out.printf("[%2s]", "");
			} else {
				System.out.printf("[%2s]", "옷");
			}
		}
	}

	boolean checkPlayer(int num) {
		if (num < 0 || num >= size) {
			return true;
		} else {
			return false;
		}
	}

	void moveLeft() {
		if (checkPlayer(player - 1) == true) {
			System.out.println("이방향으로 이동불가");
			return;
		}
		move[player] = 0;
		player--;
		move[player] = 8;
	}

	void moveRight() {
		if (checkPlayer(player + 1) == true) {
			System.out.println("이방향으로 이동불가");
			return;
		}
		move[player] = 0;
		player++;
		move[player] = 8;
	}

	void direction() {

	}

	void run() {

		move[player] = 8;

		while (true) {

			print();

			showMenu();

			int dir = scan.nextInt();
			if (dir == 1) {
				moveLeft();
			} else if (dir == 2) {
				moveRight();
			} else if (dir == 0) {
				System.out.println("게임종료");
				break;
			}
		}
	}
}

public class H3_메서드리턴1_알고리즘_숫자이동 {
	public static void main(String[] args) {
		moveNumber mn = new moveNumber();
		mn.run();
	}
}
