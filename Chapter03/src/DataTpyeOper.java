import java.util.Scanner; 		// Ctrl + Shift + O
                                // 입력을 위한 라이브러리 추가. 없으면 오류가 발생한다.

/*
 *  작성일 : 2024년 3월 15일
 *  작성자 : 컴퓨터교육과 202227008 성시아
 *  설명 : 연산과 자료형.
                 두개의 정수를 입력 받아 평균을 계산하는 프로그램.
                 
          1. 두 정수를 입력 받는다.
          2. 평균을 계산한다.
          3. 평균을 출력한다. 
 */

// 자바 파일 저장명과 클래스명이 일치해야 한다.
public class DataTpyeOper {

	public static void main(String[] args) {
		// 두개의 정수를 입력 받는다.
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in); //스캐너 형으로 객체 변수 선언

		System.out.print("첫 번째 정수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = stdIn.nextInt();
		
		// 평균을 계산한다.
		double avg1 = (num1 + num2) / 2;
		System.out.println("정수 연산 : " + num1 + " + "+ num2 + " = " + avg1);
		
		double avg2 = (num1 + num2) / 2.0;
		System.out.println("실수 연산 : " + num1 + " + "+ num2 + " = " + avg2);
	}

}
