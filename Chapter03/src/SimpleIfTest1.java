	
/*
	 *  작성일 : 2024년 3월 19일
	 *  작성자 : 컴퓨터교육과 202227008 성시아
	 *  설명 : 단순 if문 실습.
	 *       정수를 입력 받아 0보다 작은지 비교,판단
0	 * 
	 *  알고리즘 : 1. 정수를 입력 받는다.
	 *          2. 입력 받은 정수가 0보다 작은지 판단한다.
	 *               2-1. "-0은 음수입니다." 출력한다.
	 */

import java.util.Scanner;

public class SimpleIfTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		/* 2. 음수인지 판단.
		 * 만약에 변수에 저장된 값이 0보다 작으면..
		 */
		if(num <0) {
			System.out.println(num + "은 음수입니다.");
		} // if 종료 지점.
		
		// 조건과 상관없이 무조건 출력되는 문장.
		System.out.println("프로그램 종료");
	}

}
