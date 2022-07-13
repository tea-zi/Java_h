package H2_메서드2_알고리즘;

import java.util.Random;
import java.util.Scanner;

//# 틱택토
class TicTacToe {

	Scanner scan = new Scanner(System.in);

	String[][] game = new String[3][3];

	int turn = 0;
	int win = 0; // 1[turn1승리] 2[turn2승리]
	int play = 0;
	String p = "";

	void setGame() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				game[i][j] = "[ ]";
			}
		}
	}

	void print() {
		System.out.println("=================");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				System.out.print(game[i][j]);
			}
			System.out.println();
		}
		System.out.println("=================");
	}

	void turn() {
		if (turn % 2 == 0) {
			play = 1;
			p = "[O]";
		} else {
			play = 2;
			p = "[X]";
		}
	}

	void run() {

		setGame();

		while (true) {

			print();

			turn();

			if (win != 0) {
				System.out.println("player" + win + " Win");
				break;
			}

			System.out.print("[p" + play + "]");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			}

			select(sel);

			exitWidth();
			exitHeight();
			exitCross();

		}
	}

	void select(int sel) {
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cnt++;
				if (cnt == sel) {
					if (game[i][j] == "[ ]") {
						game[i][j] = p;
						turn++;
					}
				}
			}
		}
	}

// 종료 : 가로 검사
// 00 01 02
// 10 11 12
// 20 21 22
	void exitWidth() {
		for (int i = 0; i < game.length; i++) {
			if (game[i][0].equals(p) && game[i][1].equals(p) && game[i][2].equals(p)) {
				win = play;
			}
		}
	}

// 종료 : 세로 검사
// 00 10 20
// 01 11 21
// 02 12 22
	void exitHeight() {
		for (int i = 0; i < game.length; i++) {
			if (game[0][i].equals(p) && game[1][i].equals(p) && game[2][i].equals(p)) {
				win = play;
			}
		}
	}

// 종료 : 대각선 검사
// 00 11 22
// 02 11 20
	void exitCross() {
		if (game[0][0].equals(p) && game[1][1].equals(p) && game[2][2].equals(p)) {
			win = play;
		}
		if (game[0][2].equals(p) && game[1][1].equals(p) && game[2][0].equals(p)) {
			win = play;
		}
	}
}

public class H2_메서드2_평가문제_틱택토_문제 {
	public static void main(String[] args) {
		TicTacToe tic = new TicTacToe();
		for (int i = 1; i < 10; i++) {
			System.out.print("[" + i + "]");
			if (i % 3 == 0) {
				System.out.println();
			}
		}

		tic.run();

	}
}