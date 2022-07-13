package H2_�޼���2_������Ʈ;

import java.util.Random;
import java.util.Scanner;

class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;
	int count = 1;
	boolean check = false;

	void setNumber() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				front[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				back[i][j] = count;
				count++;
			}
		}
	}

	void shuffle() {
		for (int i = 0; i < 10; i++) {
			int r1 = ran.nextInt(3);
			int r2 = ran.nextInt(3);
			int r3 = ran.nextInt(3);
			int r4 = ran.nextInt(3);
			int temp = front[r1][r2];
			front[r1][r2] = front[r3][r4];
			front[r3][r4] = temp;

			r1 = ran.nextInt(3);
			r2 = ran.nextInt(3);
			r3 = ran.nextInt(3);
			r4 = ran.nextInt(3);
			temp = back[r1][r2];
			back[r1][r2] = back[r3][r4];
			back[r3][r4] = temp;
		}
	}

	void checkBack() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (count <= 50) {
					if (back[i][j] == 0) {
						back[i][j] = count;
						count++;
					}
				}
			}
		}
	}

	void selectCard() {
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		int cnt = 0;
		for (int i = 2; i >= 0; i--) {
			for (int j = 0; j < 3; j++) {
				cnt++;
				if (num == cnt) {
					if (this.num == front[i][j]) {
						front[i][j] = back[i][j];
						back[i][j] = 0;
						check = true;
					}
				}
			}
		}
	}

	void checkCard() {
		if (check == true) {
			this.num++;
			check = false;
		}
	}

	void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("[%2d]", front[i][j]);
			}
			System.out.println();
		}
	}

	void run() {

		setNumber();

		shuffle();

		while (true) {

			print();

			selectCard();

			if (num == 50 && check == true) {
				System.out.println("��������");
				break;
			}

			checkCard();

			checkBack();

		}
	}
}

public class H2_�޼���2_�򰡹���_1to50_���� {
	public static void main(String[] args) {
		SpeedGame sg = new SpeedGame();

		sg.run();

	}
}