	
/*
	 *  �ۼ��� : 2024�� 3�� 19��
	 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
	 *  ���� : �ܼ� if�� �ǽ�.
	 *       ������ �Է� �޾� 0���� ������ ��,�Ǵ�
0	 * 
	 *  �˰��� : 1. ������ �Է� �޴´�.
	 *          2. �Է� ���� ������ 0���� ������ �Ǵ��Ѵ�.
	 *               2-1. "-0�� �����Դϴ�." ����Ѵ�.
	 */

import java.util.Scanner;

public class SimpleIfTest1 {

	public static void main(String[] args) {
		// Scanner ��ü ����.
		Scanner stdIn = new Scanner(System.in);
		
		// 1. ������ �Է� �޴´�.
		System.out.print("���� �Է� : ");
		int num = stdIn.nextInt();
		
		/* 2. �������� �Ǵ�.
		 * ���࿡ ������ ����� ���� 0���� ������..
		 */
		if(num <0) {
			System.out.println(num + "�� �����Դϴ�.");
		} // if ���� ����.
		
		// ���ǰ� ������� ������ ��µǴ� ����.
		System.out.println("���α׷� ����");
	}

}
