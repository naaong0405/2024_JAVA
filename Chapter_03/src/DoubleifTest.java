import java.util.Scanner;

/*
 *  �ۼ��� : 2024�� 3�� 19��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : ���� if�� �ǽ�
 *       �ϳ��� ������ �Է� �޾� �������� ������� Ȯ���ϴ� ���α׷�.
 *       
 *  �����м� : ������ 0���� ���� ���̴�.
 *          ������ �Է¹޾� 0���� ������ ��, �Ǵ�.
 *          ����� 0���� ū ���̴�.
 *          �Է� ���� ������ 0���� ū�� �Ǵ�.
 *  
 *  �˰��� : 1. ������ �Է¹޴´�.
 *          2. �Է� ���� ������ 0���� ������ �Ǵ��Ѵ�.
 */

public class DoubleifTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num;
		
		// ������ �Է� �޴´�.
		// Scanner ��ü ����.
		Scanner stdIn = new Scanner(System.in); //��ĳ�� ������ ��ü ���� ����
		
		System.out.print("���� �Է� : ");
		num = stdIn.nextInt();
	
	
		// 2. �������� �Ǵ�.
		// ���࿡ ������ ����� ��(�Է� ���� ��)�� 0���� ������..
	
		if(num < 0) {
		System.out.println(num + "��(��) �����Դϴ�.");
		// if ���� ����

		}
	
		// 3. ������� �Ǵ�.
	
		if(num > 0) {
		System.out.println(num + "��(��) ����Դϴ�.");
		
	}
	
	
		// �� ���� ������ 0���� ������ �ƴϸ�(ũ��)
	
		if(num < 0) {
		System.out.println(num + "��(��) �����Դϴ�.");
		// if ����.
	}

		else {  // �ƴϸ�, �׷��� ������, ��������..
		System.out.println(num + "��(��) �����Դϴ�.");
	}  // else ����.
	
		
		// ���ǰ� ������� ������ ��µǴ� ����.	
	
		System.out.println(num + "���α׷� ����.");
	}
}
