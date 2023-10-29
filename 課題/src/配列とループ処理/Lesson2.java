package 配列とループ処理;

public class Lesson2 {

	public static void main(String[] args) {
		//4番目を表示
		int[] nums = { 20, 1, 2, 23, 5, 11, 5, 67 };
		for (int X = 1; X <= 1; X++) {
			System.out.println(nums[3]);
		}
		//要素数
		for (int X = 1; X <= 1; X++) {
			System.out.println(nums.length);
		}
		int Sum = nums[0];
		for (int X = 1; X < nums.length; X++) {
			Sum = Sum + nums[X];
		}
		System.out.println((double) Sum / nums.length);
	}
}
