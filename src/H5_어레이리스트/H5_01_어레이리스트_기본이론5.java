package H5_��̸���Ʈ;

import java.util.ArrayList;
import java.util.Scanner;

public class H5_01_��̸���Ʈ_�⺻�̷�5 {
	// ��Ʈ�ѷ�

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[��Ʈ�ѷ�]");
			System.out.println("[1] �߰� [2] ���� [3] �˻� [4] ��� [5] ���� [0] ����");
			int sel = scan.nextInt();
			if (sel == 0) { // ����
				break;
			} else if (sel == 1) { // �߰�
				System.out.print("��ȣ�Է� : ");
				int num = scan.nextInt();
				System.out.print("�̸��Է� : ");
				String name = scan.next();

				boolean check = false;

				for (int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if (temp == num) {
						check = true;
						break;
					}
				}
				if (check == false) {
					numberList.add(num);
					System.out.println("ȸ���� �߰��մϴ�.");
				} else {
					System.out.println("�ߺ��� ��ȣ�Դϴ�.");
				}
			} else if (sel == 2) { // ����
				System.out.print("��ȣ�Է� : ");
				int num = scan.nextInt();
				int index = -1;

				for (int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if (temp == num) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("������ �����Ͱ� �����ϴ�.");
				} else {
					numberList.remove(index);
				}
			} else if (sel == 3) { // �˻�
				System.out.print("��ȣ�Է� : ");
				int num = scan.nextInt();
				int index = -1;

				for (int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if (temp == num) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("���� ��ȣ�Դϴ�.");
				} else {
					System.out.println(numberList.get(index));
				}
			} else if (sel == 4) { // ���
				for (int i = 0; i < numberList.size(); i++) {
					System.out.println(numberList.get(i) + " ");
				}
			} else if (sel == 5) { // ����
				System.out.print("��ȣ�Է� : ");
				int num = scan.nextInt();
				int index = -1;

				for (int i = 0; i < numberList.size(); i++) {
					int temp = numberList.get(i);
					if (temp == num) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("���� ��ȣ�Դϴ�.");
				} else {
					System.out.print("������ ��ȣ�Է� : ");
					num = scan.nextInt();
					boolean check = false;

					for (int i = 0; i < numberList.size(); i++) {
						int temp = numberList.get(i);
						if (temp == num) {
							check = true;
							break;
						}
					}

					if (check == false) {
						numberList.set(index, num);
					}
				}
			}
		}
	}
}
