package データ入力と条件分岐;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 int num = Integer.parseInt(args[0]);
		 //もし変数numが1であれば
		 if(num == 1){
		 //入園料金:8400円を表示する
		  System.out.println("入園料金: 8400円");
		  //変数numが2であれば
		 } else if(num == 2){
		  //入園料金:7000円を表示する
		  System.out.println("入園料金: 7000円");
		  //変数numが3の場合
		} else if(num ==3){
		  //入園料金:5000円を表示する
		  System.out.println("入園料金: 5000円");
		  //入園料金:5000円を表示する
		 }else{
		  //その他の場合は
		  System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
		  //1:一般, 2:中・高校生, 3:小学生・幼児を表示する
		 }
	}
}
