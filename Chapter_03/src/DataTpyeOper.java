import java.util.Scanner; 		// Ctrl + Shift + O
                                // �Է��� ���� ���̺귯�� �߰�. ������ ������ �߻��Ѵ�.

/*
 *  �ۼ��� : 2024�� 3�� 15��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : ����� �ڷ���.
                 �ΰ��� ������ �Է� �޾� ����� ����ϴ� ���α׷�.
                 
          1. �� ������ �Է� �޴´�.
          2. ����� ����Ѵ�.
          3. ����� ����Ѵ�. 
 */

// �ڹ� ���� ������ Ŭ�������� ��ġ�ؾ� �Ѵ�.
public class DataTpyeOper {

	public static void main(String[] args) {
		// �ΰ��� ������ �Է� �޴´�.
		// Scanner ��ü ����.
		Scanner stdIn = new Scanner(System.in); //��ĳ�� ������ ��ü ���� ����

		System.out.print("ù ��° ���� �Է� : ");
		int num1 = stdIn.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = stdIn.nextInt();
		
		// ����� ����Ѵ�.
		double avg1 = (num1 + num2) / 2;
		System.out.println("���� ���� : " + num1 + " + "+ num2 + " = " + avg1);
		
		double avg2 = (num1 + num2) / 2.0;
		System.out.println("�Ǽ� ���� : " + num1 + " + "+ num2 + " = " + avg2);
	}

}
