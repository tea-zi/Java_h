package H3_�޼��帮��1_�˰���;

import java.util.Random;
import java.util.Scanner;

// # ���� ���� : Ŭ���� + �޼���
// 1. front �迭 ī�� 10���� ���´�.
// 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
// 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
// 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 

class MemoryGame {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);

	int size = 10;
	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int cnt = 0; // ������ ���� Ƚ��

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
		System.out.println("1~10����ī���� 2���� �����ϼ���");
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
				System.out.println("��������");
				break;
			}

			selectCard();
		}
	}
}

public class H3_�޼��帮��1_�˰���_���°��� {
	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.run();
	}
}
