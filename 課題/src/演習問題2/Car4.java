package 演習問題2;

class Car4 {
	//クラス内のみで利用できる。
	private int no;
	private static int count = 0;

	//コンストラクタ
	public Car4(){
	//0をnoを代入する
	no = 0;
	//countが1増える
	count++;
	System.out.println("ナンバーなしを作りました");
	}

	public Car4(int n){
	no = n;
	count++;
	System.out.println("ナンバー" + no + "を作りました");
	}

	public static void display(){
	System.out.println(count + "台作成済です");
	}
	}

