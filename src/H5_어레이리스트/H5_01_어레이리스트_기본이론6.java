package H5_��̸���Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class H5_01_��̸���Ʈ_�⺻�̷�6 {
	/*
	 * ��� ����Ʈ�� �Ⱦ��� (�Ϲݹ迭���) ���� ȸ������������ [1] ��ȣ [2] ���̵� [3] ��й�ȣ [4] �̸�
	 * 
	 * �׽�Ʈ�� ���� �Ʒ� �⺻������ 4���� �ְ� �����Ѵ�.
	 */

	public static void main(String[] args) {

		// ��� ����Ʈ�� �Ⱦ��� (�Ϲݹ迭���)

		Scanner scan = new Scanner(System.in);
		String[] test1 = { "1001", "aaa", "aaa123", "��ö��" };
		String[] test2 = { "1002", "bbb", "bbb123", "�̹μ�" };
		String[] test3 = { "1003", "ccc", "ccc123", "�ڿ���" };
		String[] test4 = { "1004", "ddd", "ddd123", "�ֹ���" };

		String[][] memberList = new String[100][4];
		int count = 0;
		int lastNumber = 1001;
		memberList[count] = test1;
		lastNumber++;
		count++;

		memberList[count] = test2;
		lastNumber++;
		count++;

		memberList[count] = test3;
		lastNumber++;
		count++;

		memberList[count] = test4;
		lastNumber++;
		count++;

		while (true) {
			System.out.println("[ȸ������]");
			System.out.println("[1] �߰� [2] ���� [3] ���� [4] �˻� [5] ��� [0] ����");
			int sel = scan.nextInt();

			if (sel == 0) { // ����
				break;
			} else if (sel == 1) { // �߰�
				System.out.print("���̵��Է� : ");
				String id = scan.next();
				boolean check = false;

				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						check = true;
						break;
					}
				}

				if (check == true) {
					System.out.println("�ߺ����̵��Դϴ�.");
				} else {
					String[] data = new String[4];
					data[0] = lastNumber + "";
					data[1] = id;
					System.out.print("��й�ȣ�Է� : ");
					String pw = scan.next();
					data[2] = pw;
					System.out.print("�̸��Է� : ");
					String name = scan.next();
					data[3] = name;
					memberList[count] = data;
					lastNumber++;
					count++;
				}
			} else if (sel == 2) { // ����
				System.out.print("���̵��Է� : ");
				String id = scan.next();
				int index = -1;

				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
				} else {
					for (int i = index; i < count - 1; i++) {
						memberList[i] = memberList[i + 1];
					}
					memberList[count - 1] = null;
					count--;
				}
			} else if (sel == 3) { // ����
				System.out.print("���̵��Է� : ");
				String id = scan.next();
				int index = -1;

				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("������׼���");
					System.out.println("[1.���̵�][2.��й�ȣ][3.�̸�]");
					sel = scan.nextInt();
					if (sel == 1) {
						System.out.print("���̵��Է� : ");
						id = scan.next();
						boolean check = false;

						for (int i = 0; i < count; i++) {
							String temp = memberList[i][1];
							if (id.equals(temp)) {
								check = true;
								break;
							}
						}

						if (check == true) {
							System.out.println("�ߺ����̵��Դϴ�.");
						} else {
							memberList[index][1] = id;
						}
					} else if (sel == 2) {
						System.out.print("��й�ȣ�Է� : ");
						String pw = scan.next();
						memberList[index][2] = pw;
					} else if (sel == 3) {
						System.out.print("�̸��Է� : ");
						String name = scan.next();
						memberList[index][3] = name;
					}
				}
			} else if (sel == 4) { // �˻�
				System.out.print("���̵��Է� : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < count; i++) {
					String temp = memberList[i][1];
					if (id.equals(temp)) {
						index = i;
						break;
					}
				}
				if (index == -1) {
					System.out.println("�������� �ʴ� ���̵��Դϴ�.");
				} else {
					System.out.println(Arrays.toString(memberList[index]));
				}
			} else if (sel == 5) { // ���
				for (int i = 0; i < count; i++) {
					System.out.println(Arrays.toString(memberList[i]));
				}
			}
		}
	}
}
