package H3_�޼��帮��1_�򰡹���;

import java.util.Arrays;

/*
		student �����ʹ�  ���ʴ�� ==>  �̸� , ���� , ��ȣ �� ��Ÿ����.
		score �����ʹ� ==>  ��ȣ ���� , ���� , ���� �� ��Ÿ����.			
		�Ʒ�������� ��ü �л� ���  
		[�л���ȣ] [�̸�] [����] [����] [����] [����] [����] [���] 
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
					if (score[j][1].equals("����")) {
						result[i][3] = score[j][2];
					} else if (score[j][1].equals("����")) {
						result[i][4] = score[j][2];
					} else if (score[j][1].equals("����")) {
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

public class H3_�޼��帮��1_�򰡹���_����4 {
	public static void main(String[] args) {

		Return4 re = new Return4();

		String[][] student = { { "��ö��", "����", "1001" }, { "�����", "����", "1002" }, { "��ö��", "��ġ", "1003" },
				{ "���缮", "����", "1004" } };
		String[][] score = { { "��ȣ", "����", "����" }, { "1001", "����", "20" }, { "1002", "����", "50" },
				{ "1003", "����", "60" }, { "1004", "����", "17" }, { "1001", "����", "65" }, { "1002", "����", "15" },
				{ "1003", "����", "80" }, { "1004", "����", "70" }, { "1001", "����", "43" }, { "1002", "����", "90" },
				{ "1003", "����", "30" }, { "1004", "����", "70" } };

		String result[][] = re.run(student, score);
		System.out.println(Arrays.deepToString(result));

	}
}