package H1_메서드1_알고리즘;

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
		System.out.println("총점 : " + total + "점 , 평균 : " + avg + "점");
	}

	void acceptance(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) {
				count++;
			}
		}
		System.out.println("합격자수 : " + count + "명");
	}

	void searchScore(int arr[], int idx) {
		System.out.println("성적 : " + arr[idx]);
	}

	void searchIndex(int arr[], int score) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == score) {
				System.out.println("인덱스 : " + i);
				break;
			}
		}
	}

	void searchScore2(int arr1[], int arr2[], int num) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == num) {
				System.out.println("성적 : " + arr2[i]);
			}
		}
	}

	void searchScore3(int arr1[], int arr2[], int num) {
		boolean check = false;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == num) {
				System.out.println("성적 : " + arr2[i]);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("해당학번은 존재하지 않습니다.");
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
		System.out.println("1등학생 학번 : " + arr1[idx] + " , 성적 : " + max);
	}
}

public class H1_메서드1_알고리즘_연습_문제 {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 92, 14, 47 };

		Test3 t3 = new Test3();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
//		t3.scoresinput(scores); new int[5]
		System.out.println(Arrays.toString(scores));

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		t3.totalandavg(scores);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		t3.acceptance(scores);

		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		t3.searchScore(scores, idx);

		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		t3.searchIndex(scores, score);

		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		t3.searchScore2(hakbuns, scores, hakbun);

		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		hakbun = scan.nextInt();
		t3.searchScore3(hakbuns, scores, hakbun);

		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		t3.search1st(hakbuns, scores);

	}
}