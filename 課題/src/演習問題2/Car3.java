package 演習問題2;

public class Car3 {
	//メンバ変数
	//自動車のナンバー
	private int no;
	//自動車の速度
	private int speed;

	//メソッド(処理)
	public Car3() {
		no = 0;
	}
	public Car3(int n){
		no = n;
	}
	//変数speedに引数sを設定する
	public void run(int s) {
		speed = s;
	}

	//変数speedに0を設定する
	public void brake() {
		speed = 0;
	}

	//変数speedから引数を減算する
	public void brake(int s) {
		speed = speed - s;
	}

	//変数no,変数speedの値を表示する
	public void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}
