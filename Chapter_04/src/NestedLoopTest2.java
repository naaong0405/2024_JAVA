/*
 * 정수를 입력하시오 : 5
 * ★
 * ★★
 * ★★★
 * ★★★★
 * ★★★★★
 */

import java.util.Scanner;

public class NestedLoopTest2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); // Scanner 객체 생성.
		System.out.print("정수를 입력하시오 : ");
		int su = stdIn.nextInt();
		
		for(int i=1; i<=su; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
	}
}
