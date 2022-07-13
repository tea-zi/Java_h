package H3_�޼��帮��1_�˰���;

import java.util.Scanner;

//# ���� �̵��ϱ� : Ŭ���� + �޼���
//1. ���� 8�� ĳ�����̴�.
//2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
//3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
//4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.

class moveNumber {
	Scanner scan = new Scanner(System.in);

	int[] move = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int size = move.length;
	int player = 4;

	void showMenu() {
		System.out.println(player);
		System.out.print("0.�����ϱ�");
		System.out.print("1.�·� �̵�");
		System.out.print("2.��� �̵�");
		System.out.print(": ");
	}

	void print() {
		for (int i = 0; i < size; i++) {
			if (move[i] == 0) {
				System.out.printf("[%2s]", "");
			} else {
				System.out.printf("[%2s]", "��");
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
			System.out.println("�̹������� �̵��Ұ�");
			return;
		}
		move[player] = 0;
		player--;
		move[player] = 8;
	}

	void moveRight() {
		if (checkPlayer(player + 1) == true) {
			System.out.println("�̹������� �̵��Ұ�");
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
				System.out.println("��������");
				break;
			}
		}
	}
}

public class H3_�޼��帮��1_�˰���_�����̵� {
	public static void main(String[] args) {
		moveNumber mn = new moveNumber();
		mn.run();
	}
}
