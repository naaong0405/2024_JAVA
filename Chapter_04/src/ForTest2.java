/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터교육과 202227008 성시아
 * 설명 : 알고싶은 단을 입력 받아 구구단을 출력하시오.
 * 
 * 문제분석 : 단은 고정이다. 입력 받는다.
 * 	      	곱하는 수는 1부터 9까지 1씩 증가한다.
 * 			곱셈의 결과는 단 * 수 이다.
 * 			구구단 곱셈의 과정이 하나씩 출력되야 한다.
 *         
 * 알고리즘 : 1. 단을 입력 받는다.(정수)
 * 		    2. 곱하는 수는 1부터 9까지 1씩 증가하면서 반복(초기값)(조건식)(증감식)
 *             2-1. 구구단 출력한다.    
 *           
 */

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); // Scanner 객체 생성.
		
		// 1. 단을 입력 받는다.
		System.out.print("알고 싶은 단 입력 : ");
		int dan = stdIn.nextInt();
		// 2. 곱하는 수는 1부터 9까지 1씩 증가하면서 반복(초기값)(조건식)(증감식)
		for(int su=1; su<10; su++) {
			System.out.println(dan + " X " + su + " = " + dan*su); // 2-1. 구구단 출력한다.    
			  
		}
	}
}
