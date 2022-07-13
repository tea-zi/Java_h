package H1_메서드1_알고리즘;

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

public class H1_메서드1_알고리즘_연습문제2 {
	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		Test2 t2 = new Test2();

		// 문제 1) 전체 합 출력
		// 정답 1) 362
		t2.printSum(arr);

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		t2.printSumMultiple4(arr);

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		t2.printCountMultiple4(arr);

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		t2.printEvenOrOdd(arr);
	}
}