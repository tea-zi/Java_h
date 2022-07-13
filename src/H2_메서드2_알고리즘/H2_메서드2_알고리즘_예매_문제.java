package H2_�޼���2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

class Theater {

	int[] seat = new int[10];
	Scanner scan = new Scanner(System.in);
	String name = ""; // ��ȭ�� �̸�
	int cnt = 0; // ���� ��
	int money = 0; // �����

	void menu() {
		System.out.println("[1.�����ϱ�]");
		System.out.println("[0.�����ϱ�]");
	}

	void showSeat() {
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				System.out.print("[O]");
			} else {
				System.out.print("[X]");
			}
		}
		System.out.println();
	}

	void reservation() {
		System.out.print("�¼����� : ");
		int choice = scan.nextInt();
		if (seat[choice] == 0) {
			seat[choice] = 1;
			System.out.println("���ſϷ�");
			cnt++;
		} else {
			System.out.println("���źҰ�");
		}
	}

	void sales() {
		money = cnt * 12000;
		System.out.println("����� : " + money);
	}

}

public class H2_�޼���2_�˰���_����_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Theater megabox = new Theater();
		megabox.name = "�ް��ڽ�";

		while (true) {

			megabox.showSeat();

			megabox.menu();

			// �޴� �����ϱ�
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();

			if (choice == 1) {
				megabox.reservation();
			} else if (choice == 0) {

				megabox.sales();

				System.out.println("����");
				break;
			}

		}

	}
}