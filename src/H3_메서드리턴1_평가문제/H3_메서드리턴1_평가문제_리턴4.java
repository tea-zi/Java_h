package H3_메서드리턴1_평가문제;

import java.util.Arrays;

/*
		student 데이터는  차례대로 ==>  이름 , 지역 , 번호 를 나타낸다.
		score 데이터는 ==>  번호 국어 , 수학 , 영어 을 나타낸다.			
		아래순서대로 전체 학생 출력  
		[학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] 
 */

class Return4 {
	String[][] run(String[][] student, String[][] score) {
		String[][] result = null;
		result = new String[student.length][8];
		for (int i = 0; i < student.length; i++) {
			result[i][0] = student[i][2];
			result[i][1] = student[i][0];
			result[i][2] = student[i][1];
			int total = 0;
			for (int j = 1; j < score.length; j++) {
				if (result[i][0].equals(score[j][0])) {
					total += Integer.parseInt(score[j][2]);
					if (score[j][1].equals("국어")) {
						result[i][3] = score[j][2];
					} else if (score[j][1].equals("수학")) {
						result[i][4] = score[j][2];
					} else if (score[j][1].equals("영어")) {
						result[i][5] = score[j][2];
					}
				}
			}
			result[i][6] = total + "";
			result[i][7] = total / 3 + "";
		}
		return result;
	}
}

public class H3_메서드리턴1_평가문제_리턴4 {
	public static void main(String[] args) {

		Return4 re = new Return4();

		String[][] student = { { "김철만", "신촌", "1001" }, { "오상덕", "강남", "1002" }, { "민철이", "대치", "1003" },
				{ "유재석", "강동", "1004" } };
		String[][] score = { { "번호", "과목", "점수" }, { "1001", "국어", "20" }, { "1002", "국어", "50" },
				{ "1003", "국어", "60" }, { "1004", "국어", "17" }, { "1001", "수학", "65" }, { "1002", "수학", "15" },
				{ "1003", "수학", "80" }, { "1004", "수학", "70" }, { "1001", "영어", "43" }, { "1002", "영어", "90" },
				{ "1003", "영어", "30" }, { "1004", "영어", "70" } };

		String result[][] = re.run(student, score);
		System.out.println(Arrays.deepToString(result));

	}
}