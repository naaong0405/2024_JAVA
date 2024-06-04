import java.util.Scanner;

/*
 * 작성일 : 2024년 06월 04일
 * 작성자 : 202227008 성혜승
 * 설명 : Rectangle 클래스를 작성하고 이를 상속받는 Square 클래스를 작성하세요.
 * 		 Rectangle 클래스에는 double width와 doulbe height 속성을 추가하고 이를 설정하는 생성자를 작성합니다.
 * 		 Square 클래스는 Rectangle 클래스를 상속받고, 변의 길이를 설정하는 생성자를 작성합니다.
 * 		 Square 클래스에 면적과 둘레를 계산하는 메소드를 추가합니다.
 *		 사용자로부터 정사각형의 변의 길이를 입력 받아, 해당 정사각형의 정보를 출력하는 프로그램
 * 
 * [출력 결과] 
 * 도형의 길이를 입력하세요. (입력 종료는 enter입니다.) :
 * 2
 * 3
 * 
 * 직사각형의 넓이 : 6.0
 * 직사각형의 둘레 : 10.0
 * 
 */

// 직사각형의 속성 정의
class Rectangle {
	double width;
	double height;
	// width와 height를 설정하는 생성자
	public Rectangle(double width, double height) {  // 내가 작성한 코드 : public Rectangle() 
		this.width = width;
		this.height = height;
	}
	public double Area() {
		return width * height;
	}
	public double Perimeter() {
		return (width + height) * 2;
	}
}
// 정사각형의 속성 정의
class Square extends Rectangle {
	// 변의 길이를 설정하는 생성자
	 public Square(double length) {
	     super(length, length);
	 }
	// 면적을 계산하는 메소드 ( 상위 클래스 메소드 사용 )
	 public double Area() {
		 return super.Area();
	 }
	// 둘레를 계산하는 메소드 ( 상위 클래스 메소드 사용 )
	 public double Perimeter() {
		 return super.Perimeter();
	 }
}

public class Shape {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("도형의 길이를 입력하세요. (입력 종료는 enter입니다.) : ");
		double width = stdIn.nextFloat();
		double height = stdIn.nextFloat();
		
		if (width == height) {
			Square square = new Square(width);
			System.out.println("정사각형의 넓이 : " + square.Area());
			System.out.println("정사각형의 둘레 : " + square.Perimeter());
		}
		else {
			Rectangle rectangle = new Rectangle(width, height);
			System.out.println("직사각형의 넓이 : " + rectangle.Area());
            System.out.println("직사각형의 둘레 : " + rectangle.Perimeter());
		}
	}

}
