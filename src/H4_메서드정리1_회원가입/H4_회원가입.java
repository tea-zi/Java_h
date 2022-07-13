package H4_�޼�������1_ȸ������;

import java.util.Arrays;
import java.util.Scanner;

//��� ������
//[0] ��ȣ
//[1] ���̵�
//[2] ��й�ȣ
//[3] �̸�

class MemberDAO {
	int lastNumber = 10001;
	int maxSize = 10000;
	String[][] memberList = new String[maxSize][4];
	int memberCount = 0;

	void insertMember(String id, String pw, String name) {
		memberList[memberCount][0] = lastNumber + "";
		memberList[memberCount][1] = id;
		memberList[memberCount][2] = pw;
		memberList[memberCount][3] = name;
		lastNumber += 1;
		memberCount += 1;
	}

	boolean checkId(String id) {
		boolean check = false;
		for (int i = 0; i < memberCount; i++) {
			if (memberList[i][1].equals(id)) {
				check = true;
				break;
			}
		}
		return check;
	}

	boolean checkLogin(String id, String pw) {
		boolean check = false;
		for (int i = 0; i < memberCount; i++) {
			if (memberList[i][1].equals(id) && memberList[i][2].equals(pw)) {
				check = true;
				break;
			}
		}
		return check;
	}

	void correctId(String id, String correctid) {
		for (int i = 0; i < memberCount; i++) {
			if (id.equals(memberList[i][1])) {
				memberList[i][1] = correctid;
				System.out.println("�����Ϸ�");
				return;
			}
		}

	}

	void correctPw(String id, String correctpw) {
		for (int i = 0; i < memberCount; i++) {
			if (id.equals(memberList[i][1])) {
				memberList[i][2] = correctpw;
				System.out.println("�����Ϸ�");
				return;
			}
		}

	}

	void correctName(String id, String correctname) {
		for (int i = 0; i < memberCount; i++) {
			if (id.equals(memberList[i][1])) {
				memberList[i][2] = correctname;
				System.out.println("�����Ϸ�");
				return;
			}
		}

	}

	void checkInformation() {
		System.out.printf("|%6s |%5s   |%5s   |%5s |\n", "Number", "Id", "Pw", "Name");
		for (int i = 0; i < memberCount; i++) {
			System.out.printf("|%6s |%5s   |%5s   |%5s |\n", memberList[i][0], memberList[i][1], memberList[i][2],
					memberList[i][3]);
		}
	}

	void withdraw(String id) {
		int idx = 0;
		for (int i = 0; i < memberCount; i++) {
			if (id.equals(memberList[i][1])) {
				for (int j = i; j < memberCount - 1; j++) {
					memberList[j][0] = memberList[j + 1][0];
					memberList[j][1] = memberList[j + 1][1];
					memberList[j][2] = memberList[j + 1][2];
					memberList[j][3] = memberList[j + 1][3];
				}
				memberList[memberCount - 1] = null;
				memberCount--;
				return;
			}
		}

	}

	void print() {
		for (int i = 0; i < memberCount; i++) {
			System.out.println(Arrays.toString(memberList[i]));
		}
	}
}

class Controller {
	Scanner scan = new Scanner(System.in);
	MemberDAO memberDAO = null;
	String log = "";

	void init(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	void run() {
		while (true) {
			System.out.println("=== [����ȭ��] ===");
			System.out.println("[1] ���� [2] �α��� [0] ����");

			int sel = scan.nextInt();
			if (sel == 1) { // ����
				System.out.println("���̵� �Է��ϼ��� : ");
				String id = scan.next();
				boolean check = memberDAO.checkId(id);
				if (check == true) {
					System.out.println("�����ϴ� ���̵��Դϴ�.");
				} else {
					System.out.println("����Ҽ��ִ� ���̵��Դϴ�.");
					System.out.println("��й�ȣ�� �Է��ϼ��� : ");
					String pw = scan.next();
					System.out.println("�̸��� �Է��ϼ��� : ");
					String name = scan.next();
					memberDAO.insertMember(id, pw, name);
				}
			} else if (sel == 2) { // �α���
				System.out.println("���̵� �Է��ϼ��� : ");
				String id = scan.next();
				System.out.println("��й�ȣ�� �Է��ϼ��� : ");
				String pw = scan.next();
				boolean check = memberDAO.checkLogin(id, pw);
				if (check == true) {
					log = id;
					System.out.println("�α��μ���");
					while (true) {
						System.out.println("[" + log + "�� �α�����]");
						System.out.println("[1] �α׾ƿ� [2] �������� [3] ����Ȯ�� [4] ȸ��Ż��");
						int sel2 = scan.nextInt();
						if (sel2 == 1) {
							System.out.println("�α׾ƿ��մϴ�.");
							log = "";
							break;
						} else if (sel2 == 2) { // ��������
							System.out.println("[1] ���̵� [2] ��й�ȣ [3] �̸�");
							int sel3 = scan.nextInt();
							if (sel3 == 1) {
								String correctid = scan.nextLine();
								if (memberDAO.checkId(id) == false) {
									memberDAO.correctId(id, correctid);
								}
							} else if (sel3 == 2) {
								String correctpw = scan.nextLine();
								memberDAO.correctPw(id, correctpw);
							} else if (sel3 == 3) {
								String correctname = scan.nextLine();
								memberDAO.correctName(id, correctname);
							}
						} else if (sel2 == 3) { // ����Ȯ��
							memberDAO.checkInformation();
						} else if (sel2 == 4) { // ȸ��Ż��
							memberDAO.withdraw(log);
							System.out.println("ȸ��Ż�� �Ϸ�");
							log = "";
							break;
						}
					}
				} else {
					System.out.println("�α��ν���");
				}

			} else if (sel == 0) { // ����
				System.out.println("�ý��� ����");
				break;
			} else if (sel == 3) {
				memberDAO.print();
			}
		}
	}
}

public class H4_ȸ������ {
	public static void main(String[] args) {
		Controller controller = new Controller();
		MemberDAO memberDAO = new MemberDAO();
		controller.init(memberDAO);
		controller.run();
	}
}