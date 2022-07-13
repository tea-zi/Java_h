package H3_메서드리턴1_평가문제;

import java.util.Arrays;

/*
	아래 data는 학생 점수를 문자열로 저장한데이터이다.
	점수는 0~100점 사이이고 , 60점이상이 합격이다.
	오로지 합격생의 점수만 result 배열에 담아서 리턴하시오.
 */

class Return1 {

	int[] run(String[] data) {

		int[] result = null;
		result = new int[data.length];
		int idx = 0;
		for (int i = 0; i < data.length; i++) {
			int num = Integer.parseInt(data[i]);
			if (num >= 0 && num <= 100) {
				if (num >= 60) {
					result[idx] = num;
					idx++;
				}
			}
		}
		return result;
	}
}

public class H3_메서드리턴1_평가문제_리턴1 {
	public static void main(String[] args) {

		Return1 re = new Return1();

		String[] data = { "34", "43", "76", "12", "54" };

		int result[] = re.run(data);
		System.out.println(Arrays.toString(result));

	}
}