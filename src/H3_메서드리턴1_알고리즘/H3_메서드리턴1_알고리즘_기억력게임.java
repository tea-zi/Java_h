package H3_메서드리턴1_알고리즘;

import java.util.Random;
import java.util.Scanner;

// # 기억력 게임 : 클래스 + 메서드
// 1. front 배열 카드 10장을 섞는다.
// 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
// 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
// 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 

class MemoryGame {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);

	int size = 10;
	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int cnt = 0; // 정답을 맞춘 횟수

	void shuffle() {
		for (int i = 0; i < 100; i++) {
			int r = ran.nextInt(size);
			int r1 = ran.nextInt(size);
			int temp = front[r];
			front[r] = front[r1];
			front[r1] = temp;
		}
	}

	void printCard() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("]");
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println("]");
	}

	boolean checkCard(int num) {
		if (num >= 0 && num < 10) {
			return true;
		} else {
			return false;
		}
	}

	boolean compareCard(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	void selectCard() {
		System.out.println("1~10까지카드중 2개를 선택하세요");
		System.out.print("card1 : ");
		int card1 = scan.nextInt() - 1;
		System.out.print("card2 : ");
		int card2 = scan.nextInt() - 1;
		if (checkCard(card1) == false) {
			return;
		}
		if (checkCard(card2) == false) {
			return;
		}
		if (compareCard(card1, card2) == true) {
			return;
		}
		if (front[card1] == front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			cnt++;
		}

	}

	void run() {

		shuffle();

		while (true) {

			printCard();

			if (cnt == 5) {
				System.out.println("게임종료");
				break;
			}

			selectCard();
		}
	}
}

public class H3_메서드리턴1_알고리즘_기억력게임 {
	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.run();
	}
}
