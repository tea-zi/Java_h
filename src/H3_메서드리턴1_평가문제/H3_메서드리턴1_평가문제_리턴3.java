package H3_메서드리턴1_평가문제;

import java.util.Arrays;

/*
	아래 data는 학생 번호와 점수를 문자열로 저장한데이터이다.
	번호는 1001번에서 1004 번이고,
	점수는 0~100점 사이이고 , 60점이상이 합격이다.
	오로지 합격생의 번호와 점수를  result 배열에 담아서 리턴하시오.
 */

class Return3 {

	int[][] run(String[][] data) {

		int[][] result = null;
		result = new int[data.length][2];
		int idx = 0;
		for (int i = 0; i < data.length; i++) {
			int hakbun = Integer.parseInt(data[i][0]);
			int num = Integer.parseInt(data[i][1]);
			if (hakbun >= 1001 && hakbun <= 1004) {
				if (num >= 0 && num <= 100) {
					if (num >= 60) {
						result[idx][0] = hakbun;
						result[idx][1] = num;
					}
				}
			}
		}
		return result;
	}
}

public class H3_메서드리턴1_평가문제_리턴3 {
	public static void main(String[] args) {

		Return3 re = new Return3();

		String data[][] = { { "1001", "34" }, { "1002", "46" }, { "1003", "81" }, { "1004", "10" }, };

		int result[][] = re.run(data);
		System.out.println(Arrays.deepToString(result));

	}
}