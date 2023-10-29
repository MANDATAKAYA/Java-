package データ入力と条件分岐;

public class Lesson2 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		 System.out.println("数字Aを入力してください:" + num1);
		 System.out.println("数字Bを入力してください:" + num2);
		if(num1 > num2){
		 System.out.println("大きい数字は" + num1 + "です");
		}else{
		 System.out.println("大きい数字は" + num2 + "です");
		}
		}
		}
