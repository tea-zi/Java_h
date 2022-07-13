package H1_�޼���1_�˰���;

class Test2 {
	void printSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

	void printSumMultiple4(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

	void printCountMultiple4(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	void printEvenOrOdd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}

public class H1_�޼���1_�˰���_��������2 {
	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		Test2 t2 = new Test2();

		// ���� 1) ��ü �� ���
		// ���� 1) 362
		t2.printSum(arr);

		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		t2.printSumMultiple4(arr);

		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		t2.printCountMultiple4(arr);

		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		t2.printEvenOrOdd(arr);
	}
}