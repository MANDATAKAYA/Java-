package 演習問題2;

public class Car1 {
	//メンバ変数
	//自動車のナンバー
	int no;
	//自動車の速度
	int speed;

	//メソッド(処理)
	//変数noに引数nを設定する
	void setNo(int n) {
		no = n;
	}

	//変数speedに引数sを設定する
	void run(int s) {
		speed = s;
	}

	//変数speedに0を設定する
	void brake() {
		speed = 0;
	}

	//変数speedから引数を減算する
	void brake(int s) {
		speed = speed - s;
	}

	//変数no,変数speedの値を表示する
	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}
