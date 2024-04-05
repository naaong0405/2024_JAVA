/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터교육과 202227008 성시아
 * 설명 : 
 * 과정 : 1. 정수(월)을 입력받는다.
         2. month 가 3,4,5인 경우 "봄 입니다." 출력
            month 가 6,7,8인 경우 "여름 입니다." 출력
            month 가 9,10,11인 경우 "가을 입니다." 출력
            month 가 3,4,5인 경우 "겨울 입니다." 출력
            그 외의 경우 "해당 월은 없습니다." 출력
*/


import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in); // Scanner 객체 생성.
		
		// 1. 정수(월)를 입력 받는다.
		int month;
		
		do { 		
			System.out.print("월을 입력하시오(종료:0) : ");
			month = stdIn.nextInt();
			
			switch(month)
			{
				// if(month == 3 || month == 4 || month == 5) 
				case 0 :
					System.out.println("프로그램을 종료합니다.");
					break;
				case 3 :  case 4 : case 5 :
					System.out.println("봄 입니다.");  // month 가 3,4,5인 경우
					break;
				case 6 : case 7 : case 8 :
					System.out.println("여름 입니다.");  // month 가 3,4,5인 경우
					break;
				case 9 : case 10 : case 11 :
					System.out.println("가을 입니다.");  // month 가 3,4,5인 경우
					break;
				case 12 : case 1 : case 2 :
					System.out.println("겨울 입니다.");  // month 가 3,4,5인 경우
					break;
				default :
					System.out.println("해당 월은 없습니다.");  // 그 외의 경우
					break;
			}
			
		} while(month != 0);
		
	}

}
