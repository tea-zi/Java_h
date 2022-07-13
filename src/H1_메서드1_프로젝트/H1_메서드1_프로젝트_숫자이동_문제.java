package H1_�޼���1_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ���� �̵��ϱ� : Ŭ���� + �޼���
 * 1. ���� 8�� ĳ�����̴�.
 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
 * 4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
 */

class NumberGame {

	Scanner scan = new Scanner(System.in);

	int[] move = { 0, 0, 0, 0, 8, 0, 0, 0, 0, 0 };
	int player = 4;

	void moveLeft() {
		if (player > 0) {
			move[player] = 0;
			player--;
			move[player] = 8;
		} else {
			System.out.println("�̵��Ұ�");
		}
	}

	void moveRight() {
		if (player < move.length - 1) {
			move[player] = 0;
			player++;
			move[player] = 8;
		} else {
			System.out.println("�̵��Ұ�");
		}
	}

	void run() {
		while (true) {
			System.out.println(Arrays.toString(move));
			System.out.println("[1.����][2.������][0.����]");
			int sel = scan.nextInt();
			if (sel == 1) {
				moveLeft();
			} else if (sel == 2) {
				moveRight();
			} else if (sel == 0) {
				break;
			}
		}
	}
}

public class H1_�޼���1_������Ʈ_�����̵�_���� {
	public static void main(String[] args) {

		NumberGame g = new NumberGame();
		g.run();

	}
}