package H2_�޼���2_������Ʈ;

import java.util.Random;
import java.util.Scanner;

//# ��ٸ� ����

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
					System.out.print(" �� ");
				} else if (ladder[i][j] == 1) {
					System.out.print(" ����");
				} else if (ladder[i][j] == 2) {
					System.out.print("���� ");
				} else {
					System.out.print(" �� ");
				}
			}
			System.out.println();
		}
	}

	void selectPosition() {
		System.out.print("��ġ �Է� : ");
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
			menu = "���";
		} else if (pos == 1) {
			menu = "�Ľ�Ÿ";
		} else if (pos == 2) {
			menu = "ġŲ";
		} else if (pos == 3) {
			menu = "����";
		} else if (pos == 4) {
			menu = "����";
		} else if (pos == 5) {
			menu = "������";
		}

	}

	void run() {
		print();

		selectPosition();

		print();

		setMenu();

		System.out.println("������ ���� �޴��� " + menu + " �Դϴ�~!!!");
	}
}

public class H2_�޼���2_�򰡹���_��ٸ�_���� {
	public static void main(String[] args) {

		LadderGame lg = new LadderGame();

		lg.run();
	}
}