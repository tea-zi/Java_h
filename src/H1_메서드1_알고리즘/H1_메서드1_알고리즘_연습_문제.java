package H1_�޼���1_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test3 {
	Random ran = new Random();

//	void scoresinput(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			int r = ran.nextInt(100) + 1;
//			arr[i] = r;
//		}
//		System.out.println(Arrays.toString(arr));
//	}

	void totalandavg(int arr[]) {
		int total = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avg = (double) total / arr.length;
		System.out.println("���� : " + total + "�� , ��� : " + avg + "��");
	}

	void acceptance(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) {
				count++;
			}
		}
		System.out.println("�հ��ڼ� : " + count + "��");
	}

	void searchScore(int arr[], int idx) {
		System.out.println("���� : " + arr[idx]);
	}

	void searchIndex(int arr[], int score) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == score) {
				System.out.println("�ε��� : " + i);
				break;
			}
		}
	}

	void searchScore2(int arr1[], int arr2[], int num) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == num) {
				System.out.println("���� : " + arr2[i]);
			}
		}
	}

	void searchScore3(int arr1[], int arr2[], int num) {
		boolean check = false;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == num) {
				System.out.println("���� : " + arr2[i]);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}
	}

	void search1st(int arr1[], int arr2[]) {
		int max = 0;
		int idx = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (max < arr2[i]) {
				max = arr2[i];
				idx = i;
			}
		}
		System.out.println("1���л� �й� : " + arr1[idx] + " , ���� : " + max);
	}
}

public class H1_�޼���1_�˰���_����_���� {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 92, 14, 47 };

		Test3 t3 = new Test3();
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
//		t3.scoresinput(scores); new int[5]
		System.out.println(Arrays.toString(scores));

		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		t3.totalandavg(scores);

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		t3.acceptance(scores);

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		Scanner scan = new Scanner(System.in);
		System.out.print("�ε��� �Է� : ");
		int idx = scan.nextInt();
		t3.searchScore(scores, idx);

		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		t3.searchIndex(scores, score);

		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		System.out.print("�й� �Է� : ");
		int hakbun = scan.nextInt();
		t3.searchScore2(hakbuns, scores, hakbun);

		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.print("�й� �Է� : ");
		hakbun = scan.nextInt();
		t3.searchScore3(hakbuns, scores, hakbun);

		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		t3.search1st(hakbuns, scores);

	}
}