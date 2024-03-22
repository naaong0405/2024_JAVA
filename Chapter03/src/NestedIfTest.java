import java.util.Scanner;

/*
 *  작성일 : 2024년 3월 22일
 *  작성자 : 컴퓨터교육과 202227008 성시아
 *  설명 : 내포된 if문 실습.
 *        점수를 입력받아 학점을 출력하시오.
 *        점수는 0~100점 사이 입니다.
 *        점수 범위를 벗어나면 "잘못된 점수 입니다." 출력하시오.
 *        
 *  문제분석 : 입력받은 점수가 0~100 사이인가?
 *  		점수가 0~100 사이가 아니면?
 *          90점 이상이면 A학점
 *          80점 이상이면 B학점
 *          70점 이상이면 C학점
 *          60점 이상이면 D학점
 *          60점 미만이면 F학점
 *          점수를 정수로 입력 받는다.
 *  
 *  알고리즘 : 1. 점수(정수)를 입력받는다.
 *          2. if 점수의 범위가 0~100 사이인가?
 *            1) A
 *            2) B
 *               :
 * 
 *          3. else 아닌가?
 *            1) "잘못된 점수입니다." 출력 
 */

public class NestedIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		
		Scanner stdIn = new Scanner(System.in); //스캐너 형으로 객체 변수 선언
		System.out.print("점수 입력 : ");
		score = stdIn.nextInt();
		
		if ( score >= 0 && score <= 100) {
		
			if(score >= 90) {  // 90점 이상이고, 100점 이하
				System.out.println("A학점입니다.");
				}
			
			else if(score >= 80) {
				System.out.println("B학점입니다.");
				}
			
			else if(score >= 70) {
				System.out.println("C학점입니다.");
				}
			
			else if(score >= 60) {
				System.out.println("D학점입니다.");
				}
			
			else {
				System.out.println("F학점입니다.");
			}
		}
		
		else {
			    System.out.println("잘못된 점수 입력입니다.");
		}	
	  }

} 
