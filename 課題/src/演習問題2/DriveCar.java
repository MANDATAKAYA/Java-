package 演習問題2;

public class DriveCar {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.setNo(2525);
		c1.run(30);
		c1.display();
		
		c1.brake(10);
		c1.display();

	}

}
