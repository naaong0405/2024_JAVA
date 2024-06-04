import java.util.Scanner;

/*
 * 작성일 : 2024년 06월 04일
 * 작성자 : 202227008 성혜승
 * 설명 : Shape 클래스를 작성하고 이를 상속받는 Circle 클래스를 작성하세요.
 *       Shape 클래스에는 String color 속성을 추가하고, 이를 설정하는 생성자를 작성합니다.
 *       Circle 클래스는 Shape 클래스를 상속받고, double radius 속성을 추가하여 이를 설정하는 생성자를 작성합니다.\
 *       Circle 클래스에 원의 면적과 둘레를 계산하는 메소드를 작성합니다.
 *       사용자로부터 원의 반지름과 색상을 입력받아, 해당 원의 정보를 출력하는 프로그램을 작성하세요.
 *       
 * [출력 결과]
 * 원의 색상을 입력하세요 : 빨강
 * 원의 반지름을 입력하세요 : 5
 * 
 * 원의 색상 : 빨강
 * 반지름 : 5.0
 * 원의 넓이 : 78.53981633974483
 * 원의 둘레 : 31.41592653589793
 * 
 */

// Shape 클래스
class Shape {
	public String color;
	
	// color 속성을 설정하는 생성자
	public Shape(String color) {
	    this.color = color;
	 }	
	// 도형의 정보를 출력하는 메소드
	 public void printInfo() {
	     System.out.println("원의 색상 : " + color);
	 }	
}

// Circle 클래스
class Circle extends Shape {
	public double radius;
	
	// color, radius 속성을 설정하는 생성자
	public Circle(String color, double radius) {
	    super(color);
	    this.radius = radius;
	 }
	// 원의 면적을 계산하는 메소드
	 public double Area() {
	     return Math.PI * radius * radius;
	 }	
	 // 원의 둘레를 계산하는 메소드
	 public double Circumference() {
	     return 2 * Math.PI * radius;
	 }	 
	 // 원의 정보를 출력하는 메소드
	 public void printInfo() {
	     super.printInfo();
	     System.out.println("반지름 : " + radius);
	     System.out.println("원의 넓이 : " + Area());
	     System.out.println("원의 둘레 : " + Circumference());	 
}

public class CircleMain {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
        System.out.print("원의 색상을 입력하세요 : ");
        String color = stdIn.nextLine();
        System.out.print("원의 반지름을 입력하세요 : ");
        double radius = stdIn.nextDouble();

        Circle circle = new Circle(color, radius);
        circle.printInfo();
	}

}
