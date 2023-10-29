package 配列とループ処理;

public class Lesson4 {

	public static void main(String[] args) {
		for (int l = 0; l < 4; l++) {
			for (int m = 4; m < 4 - (l + 1); m++) {
				System.out.print(" ");
			}
			for (int n = 0; n < (l + 1); n++) {
				System.out.print("$");
			}
			System.out.print("\n");
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i + 1); k++) {
				System.out.print("$");
			}
			System.out.print("\n");
		}

	}

}
