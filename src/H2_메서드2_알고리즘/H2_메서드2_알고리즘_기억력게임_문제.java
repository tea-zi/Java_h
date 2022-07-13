package H2_메서드2_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int cnt = 0; // 정답을 맞춘 횟수

	void shuffle() {
		for (int i = 0; i < 10; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			int temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		System.out.println(Arrays.toString(front));
	}

	void compare() {
		System.out.println("카드1 선택 : ");
		int c1 = scan.nextInt();
		System.out.println("카드2 선택 : ");
		int c2 = scan.nextInt();

		if (c1 != c2) {
			if (front[c1] == front[c2]) {
				back[c1] = front[c1];
				back[c2] = front[c2];
				cnt++;
			}
		}
	}

	void printCard() {
		// 카드 앞면 출력
		System.out.print("front = [");
		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("] ");

		// 카드 뒷면 출력
		System.out.print("back  = [");
		for (int i = 0; i < back.length; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println("] ");
	}

	void selcetCard() {

		shuffle();

		while (true) {

			printCard();

			if (cnt == 5) {
				break;
			}

			compare();
		}
	}

}

public class H2_메서드2_알고리즘_기억력게임_문제 {
	public static void main(String[] args) {

		MemoryGame mg = new MemoryGame();

		mg.selcetCard();
	}
}