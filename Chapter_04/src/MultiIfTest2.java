import java.util.Scanner;

/*
 *  작성일 : 2024년 3월 22일
 *  작성자 : 컴퓨터교육과 202227008 성시아
 *  설명 : 다중 if문 실습.
 *        점수를 입력받아 학점을 출력하시오.
 *        
 *  문제분석 : 90점 이상이면 A학점
 *          80점 이상이면 B학점
 *          70점 이상이면 C학점
 *          60점 이상이면 D학점
 *          60점 미만이면 F학점
 *          점수를 정수로 입력 받는다.
 *  
 *  알고리즘 : 1. 점수(정수)를 입력받는다.
 *          2. 점수가 90점 이상인가?
 *             2-1. A학점입니다. 출력
 *          3. 아니면 점수가 80점 이상인가?
 *             3-1. B학점입니다. 출력
 *          4. 아니고 점수가 70점 이상인가?
 *             4-1. C학점입니다. 출력
 *          5. 아니고 점수가 60점 이상인가?
 *             5-1. D학점입니다. 출력
 *          6. 아니면(나머지는)
 *             6-1. F학점입니다. 출력
 */

public class MultiIfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int score;
	    
		// 1. 점수(정수)를 입력 받는다.
		Scanner stdIn = new Scanner(System.in); //스캐너 형으로 객체 변수 선언
		System.out.print("점수 입력 : ");
		score = stdIn.nextInt();
		
	
		// 2. 점수가 90점 이상인가?
		if(score >= 90 && score <= 100) {  // 90점 이상이고, 100점 이하
			System.out.println("A학점입니다.");
			}
		
		else if(score >= 80 && score < 90) {
			System.out.println("B학점입니다.");
			}
		
		else if(score >= 70 && score < 80) {
			System.out.println("C학점입니다.");
			}
		
		else if(score >= 60  && score < 70) {
			System.out.println("D학점입니다.");
			}
		
		else if(score >= 0  && score < 60) {
			System.out.println("F학점입니다.");
		}
		
	    else { 
	    	System.out.println("잘못된 점수 입력입니다.");
    	}
	}
}

