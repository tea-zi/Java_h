package H1_�޼���1_�˰���;

import java.util.Scanner;

/*
 * # ������ ����ϱ� : Ŭ����[����]
 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
 */

class BurgerShop {

	Scanner scan = new Scanner(System.in);

	String name = ""; // ���� �̸�
	int[] arPrice = { 2500, 3800, 1500, 1000 };
	String[] arMenu = { "ġ�����", "�Ұ�����", "����Ƣ��", "��      ��" };
	int[] arCount = new int[4];
	int total = 0;

	void menu() {
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println((i + 1) + ". " + arMenu[i] + " : " + arPrice[i]);
		}
		System.out.println("5.�����ϱ�");
	}

	void select(int a) {
		arCount[a]++;
	}

	void getReceipt() {
		System.out.println("===== ������ =====");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println((i + 1) + " . " + arMenu[i] + " : " + arCount[i] + " ��");
			total += arPrice[i] * arCount[i];
		}
		System.out.println("�Ѿ� : " + total + " ��");
	}
}

public class H1_�޼���1_�˰���_������_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		BurgerShop moms = new BurgerShop();
		moms.name = "������ġ �ܹ���";

		while (true) {
			moms.menu();
			// �޴� ����
			System.out.print("�޴��� �����ϼ��� : ");
			int choice = scan.nextInt();

//			if (choice == 1) {

//			} else if (choice == 2) {
//				moms.select(choice - 1);
//			} else if (choice == 3) {
//
//			} else if (choice == 4) {
			if (choice > 0 && choice < 5) {
				moms.select(choice - 1);
			} else if (choice == 5) {
				moms.getReceipt();
				break;
			}
		}

	}
}