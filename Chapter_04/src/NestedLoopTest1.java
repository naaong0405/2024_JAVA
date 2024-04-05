/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터교육과 202227008 성시아
 * 설명 : 전체 구구단 작성하기
 * 
 * [문제분석]
 *      단 2~9까지
 *      곱하는 수는 1~9까지
 *      2단 출력하고, 3단 출력하고, ... 9단 출력한다.
 * 
 * [알고리즘]
 * 
 *     ---- for ----
 *      1. 단은 2부터 9까지 반복한다.
 *         =  0 단 = 출력
 *          1-1. 곱하는 수는 1부터 9까지 반복한다.
 *              1-1-1. 구구단 출력한다.
 *              
 *     ---- while ----         
 *      1. 단은 2단부터
 *      2. 단은 9단까지
 *         =  0 단 = 출력
 *           2-1. 수는 1부터
 *           2-2. 수는 9까지 반복
 *                2-2-1. 구구단 출력한다.
 * 				  2-2-2. 수를 1 증가시킨다.
 *           2-3. 단을 1 증가시킨다.
 */
public class NestedLoopTest1 {

	public static void main(String[] args) {
		int dan;
		
		for (dan=2; dan<10; dan++) {
			
			for(int su=1; su<10; su++) {
				System.out.println(dan + " X " + su + " = " + su*dan);
			}
			
			System.out.println("= " + dan + "단 =");
			System.out.println();
		}
		

	}

}
