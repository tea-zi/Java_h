package H5_��̸���Ʈ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class H5_01_��̸���Ʈ_�⺻�̷�7 {
	/*
	 * ��� ����Ʈ 2���� ȸ������������ [1] ��ȣ [2] ���̵� [3] ��й�ȣ [4] �̸�
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] test1 = { "1001", "aaa", "aaa123", "��ö��" };
		String[] test2 = { "1002", "bbb", "bbb123", "�̹μ�" };
		String[] test3 = { "1003", "ccc", "ccc123", "�ڿ���" };
		String[] test4 = { "1004", "ddd", "ddd123", "�ֹ���" };

		int lastNumber = 1000;
		ArrayList<String[]> memberList = new ArrayList<String[]>();

		lastNumber++;
		memberList.add(test1);

		lastNumber++;
		memberList.add(test2);
		lastNumber++;
		memberList.add(test3);
		lastNumber++;
		memberList.add(test4);

		memberList.get(0)[0] = "1005";

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

				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						check = true;
						break;
					}
				}

				if (check == true) {
					System.out.println("�ߺ��Ⱦ��̵��Դϴ�.");
				} else {
					System.out.print("��й�ȣ�Է� : ");
					String pw = scan.next();
					System.out.print("�̸��Է� : ");
					String name = scan.next();
					String data[] = new String[4];
					lastNumber++;
					data[0] = lastNumber + "";
					data[1] = id;
					data[2] = pw;
					data[3] = name;
					memberList.add(data);
				}
			} else if (sel == 2) { // ����
				System.out.print("���̵��Է� : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
				} else {
					memberList.remove(index);
				}
			} else if (sel == 3) { // ����
				System.out.println("���̵��Է� : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
				} else {
					String[] data = memberList.get(index);
					System.out.println("�������");
					System.out.println("[1.���̵�][2.��й�ȣ][3.�̸�]");
					sel = scan.nextInt();
					if (sel == 1) {
						System.out.print("������ ���̵��Է� : ");
						id = scan.next();
						boolean check = false;
						for (int i = 0; i < memberList.size(); i++) {
							String[] temp = memberList.get(i);
							if (id.equals(temp[1])) {
								check = true;
								break;
							}
						}

						if (check == true) {
							System.out.println("�ߺ��Ⱦ��̵��Դϴ�.");
						} else {
							memberList.get(index)[1] = id;
//							data[1] = id;
//							memberList.set(index, data);
						}
					} else if (sel == 2) {
						System.out.print("��й�ȣ�Է� : ");
						String pw = scan.next();
						memberList.get(index)[2] = pw;
//						data[2] = pw;
//						memberList.set(index, data);
					} else if (sel == 3) {
						System.out.print("�̸��Է� : ");
						String name = scan.next();
						memberList.get(index)[3] = name;
//						data[3] = name;
//						memberList.set(index, data);
					}
				}
			} else if (sel == 4) { // �˻�
				System.out.print("���̵��Է� : ");
				String id = scan.next();
				int index = -1;
				for (int i = 0; i < memberList.size(); i++) {
					String[] temp = memberList.get(i);
					if (id.equals(temp[1])) {
						index = i;
						break;
					}
				}

				if (index == -1) {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
				} else {
					System.out.println(Arrays.toString(memberList.get(index)));
				}
			} else if (sel == 5) { // ���
				for (int i = 0; i < memberList.size(); i++) {
					System.out.println(Arrays.toString(memberList.get(i)));
				}
			}

		}
	}
}
