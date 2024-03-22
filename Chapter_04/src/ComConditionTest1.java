import java.util.Scanner;

/*
 *  작성일 : 2024년 3월 22일
 *  작성자 : 컴퓨터교육과 202227008 성시아
 *  설명 : 조건식 연습.
 *       월을 입력받아 해당 계절을 출력하시오.
 *       3,4,5월  => 봄
 *       6,7,8월 => 여름
 *       9,10,11월 => 가을
 *       12,1,2월 => 겨울
 * 
 *  문제 분석 : 입력 받아야 할 값은
 *           1,2,3,4,5,6,7,8,9,10,11,12이다.
 *           0이나 13을 입력하면? => 해당 월은 없습니다 출력하자.
 *           
 *           다중 if?
 *           내포된 if?
 */  

public class ComConditionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mon;
		
		Scanner stdIn = new Scanner(System.in); //스캐너 형으로 객체 변수 선언
		System.out.print("몇 월의 계절이 궁급한지 입력하세요 : ");
		mon = stdIn.nextInt();
		
		if ( mon >= 0 && mon <= 12) {
			
			if(mon >= 12 || mon <= 2 ) {  
				System.out.println(mon + "월의 계절은 겨울입니다.");
				}
			
			else if(mon <= 5) {
				System.out.println(mon + "월의 계절은 봄입니다.");
				}
			
			else if(mon <= 8) {
				System.out.println(mon + "월의 계절은 여름입니다.");
				}
			
			else {
				System.out.println(mon + "월의 계절은 가을입니다.");
				}
		}
		else {
			    System.out.println("월이 아닌 숫자를 입력하였습니다.");
		}	
	  }
	}

