package H1_�޼���1_�˰���;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMRī�� : Ŭ���� + �޼���
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

class OMR {
	Random ran = new Random();
	int answer[] = { 1, 3, 4, 2, 5 };
	int hgd[] = new int[5];
	int count = 0;
	int score = 0;

	void question() {
		System.out.print("������ = ");
		System.out.println(Arrays.toString(answer));
		for (int i = 0; i < 5; i++) {
			int r = ran.nextInt(5) + 1;
			hgd[i] = r;
		}
		System.out.print("����� = ");
		System.out.println(Arrays.toString(hgd));
	}

	void compare() {
		System.out.print("����ǥ = [ ");
		for (int i = 0; i < 5; i++) {
			if (answer[i] == hgd[i]) {
				System.out.print("O" + " ");
				count++;
			} else {
				System.out.print("X" + " ");
			}
		}
		System.out.println("]");
	}

	void total() {
		score = count * 20;
		System.out.println(score + " ��");
	}
}

public class H1_�޼���1_�˰���_OMR_���� {
	public static void main(String[] args) {
		OMR omr = new OMR();
		omr.question();
		omr.compare();
		omr.total();
	}
}