import java.util.Scanner;

/*
 *  �ۼ��� : 2024�� 3�� 15��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : 3�� ������.
 *  	  ������ �Է¹޾� ¦������ Ȯ���ϴ� ���α׷�.
 */

public class TernaryOpTest {

	public static void main(String[] args) {
		// Scanner ��ü ����.
		Scanner stdIn = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = stdIn.nextInt();
		
		boolean result; // true, false �� �� ���
		result = (num % 2 == 0) ? true : false;
		
		System.out.print(num + "�� ¦���Դϱ�? ");
		System.out.println(result);
		
	}

}
