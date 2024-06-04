import java.util.Scanner;

/*
 * 작성일 : 2024년 06월 04일
 * 작성자 : 202227008 성혜승
 *
 *
 * 설명 : Person 클래스를 작성하세요.
 *       이 클래스는 다음과 같은 속성을 가집니다.
 *       기본 생성자: 이름을 홍길동으로 초기화 합니다.
 *       매개변수 생성자: 이름을 입력받아 초기화합니다.
 *       printInfo() 메소드: 사람의 이름을 출력합니다.
 *      
 *       Person 클래스를 상속하는 Student 클래스를 작성하세요.
 *       이 클래스는 다음과 같은 속성을 추가로 가집니다.
 *       String major
 *      
 *       Student 클래스는 다음과 같은 메소드를 가집니다.
 *       기본 생성자: 부모 클래스의 기본 생성자를 호출하고, major를 기계공학과로 초기화합니다.
 *       매개변수 생성자: 이름과 전공을 입력받아 초기화합니다.
 *       printInfo() 메소드: 부모 클래스의 printInfo() 메소드를 호출하고, 전공을 추가로 출력합니다.
 *      
 *       [출력결과]
 *       이름을 입력하시오 : 성혜승
 *       전공을 입력하시오 : 컴퓨터교육
 *      
 *       이름 : 성혜승
 *       학과 : 컴퓨터교육과
 *       
 */

class Person {  // 내가 작성한 코드 : public class Person  → 'public'은 파일 이름과 동일한 클래스에만 사용해야 한다. StudentTest2 클래스만 'public'으로 선언되어야 한다.
	
	String name;
	// 기본 생성자 : 이름을 홍길동으로 초기화
	public Person() {
		this.name = "홍길동";  // 내가 작성한 코드 : name = "홍길동"  → 동일한 이름의 지역 변수가 참조 될 수 있음.
	}
	//  매개변수 생성자 : 이름을 입력받아 초기화
	public Person(String name) {
		this.name = name; // 내가 작성한 코드 : System.out.println("이름을 입력하시오 : "); Scanner stdIn = new Scanner(System.in); name = stdIn.next(); 
	}
	// 사람의 이름을 출력하는 메소드
	public void printInfo() {
		System.out.println("이름 : " + name);
	}
}

 class Student extends Person {
	 String major;
	// 기본 생성자 : 부모 클래스의 기본 생성자를 호출하고, major를 '기계공학과'로 초기화
	public Student() {
		super(); // 내가 작성한 코드 : Person();
		this.major = "기계공학과"; // 내가 작성한 코드 : major = "기계공학과";
	}
	// 매개변수 생성자 : 이름과 전공을 입력받아 초기화
	public Student(String name, String major) {
		super(name); // 내가 작성한 코드 : this.name = name; 
		this.major = major;  // 내가 작성한 코드 : System.out.println("전공을 입력하시오 : "); major = stdIn.next();
	}
	// 부모 클래스의 printinfo() 메소드를 호출하고, 전공을 추가로 출력
	public void printInfo() {
		super.printInfo();  // 내가 작성한 코드 : printInfo();
		System.out.println("전공 : " + major);
	}
}

public class StudentTest2 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("이름을 입력하시오 : ");
        String name = stdIn.nextLine();

        System.out.print("전공을 입력하시오 : ");
        String major = stdIn.nextLine();

        Student student = new Student(name, major);  // Student 객체 생성이 필요하다.
        student.printInfo();		

	}

}
