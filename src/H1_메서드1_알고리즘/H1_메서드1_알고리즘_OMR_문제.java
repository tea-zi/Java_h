package H1_메서드1_알고리즘;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

class OMR {
	Random ran = new Random();
	int answer[] = { 1, 3, 4, 2, 5 };
	int hgd[] = new int[5];
	int count = 0;
	int score = 0;

	void question() {
		System.out.print("정답지 = ");
		System.out.println(Arrays.toString(answer));
		for (int i = 0; i < 5; i++) {
			int r = ran.nextInt(5) + 1;
			hgd[i] = r;
		}
		System.out.print("답안지 = ");
		System.out.println(Arrays.toString(hgd));
	}

	void compare() {
		System.out.print("정오표 = [ ");
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
		System.out.println(score + " 점");
	}
}

public class H1_메서드1_알고리즘_OMR_문제 {
	public static void main(String[] args) {
		OMR omr = new OMR();
		omr.question();
		omr.compare();
		omr.total();
	}
}