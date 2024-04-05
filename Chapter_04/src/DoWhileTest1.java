/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터교육과 202227008 성시아
 * 설명 : 1부터 10까지 합을 출력하시오.
 * 
 * 
 * 
 */



public class DoWhileTest1 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1; // 초기값
		
		do {
			sum = sum + num;
			num++;  // 증감식
			
		} while(num <= 10);  //조건식
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
