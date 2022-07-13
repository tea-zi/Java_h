package H2_�޼���2_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + �޼���
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

class MemoryGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int cnt = 0; // ������ ���� Ƚ��

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
		System.out.println("ī��1 ���� : ");
		int c1 = scan.nextInt();
		System.out.println("ī��2 ���� : ");
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
		// ī�� �ո� ���
		System.out.print("front = [");
		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("] ");

		// ī�� �޸� ���
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

public class H2_�޼���2_�˰���_���°���_���� {
	public static void main(String[] args) {

		MemoryGame mg = new MemoryGame();

		mg.selcetCard();
	}
}