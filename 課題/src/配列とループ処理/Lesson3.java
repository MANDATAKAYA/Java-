package 配列とループ処理;

public class Lesson3 {

	public static void main(String[] args) {
		int[][] array = { { 1, 8, 12, 17, 20 }, { 2, 5, 11, 13, 18 }, { 4, 6, 9, 19, 21 } };
		for (int[] ary : array) {
			for (int i = 0; i < ary.length; i++) {
				System.out.print(ary[i] + "");
			}
			System.out.println();
		}
	}
}
