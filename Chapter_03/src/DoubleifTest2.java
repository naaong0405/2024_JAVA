import java.util.Scanner;

/*
 *  �ۼ��� : 2024�� 3�� 19��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : ���� if�� �ǽ�.
 *        �ϳ��� ������ �Է� �޾� ¦������ Ȧ������ Ȯ���ϴ� ���α׷�.
 * 
 *  �����м� : ¦�� => 2�� ���� �������� 0�̴�.
 *          Ȧ�� => 2�� ���� �������� 1�̴�. (0�� �ƴϴ�)
 *          (if)¦�� �ƴϸ�(else) Ȧ���̴�.
 *          Ȧ�� �ƴϸ� ¦���̴�.
 *          
 *  �˰��� : 1. ������ �Է� �޴´�.
 *          2. �Է� ���� ������ ¦������ �Ǵ��Ѵ�.
 *               2-1. 00�� ¦���̴�. ���
 *          3. �ƴϸ�
 *               3-1. 00�� Ȧ���̴�. ���     
 */
public class DoubleifTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		// ������ �Է� �޴´�.
		// Scanner ��ü ����.
		Scanner stdIn = new Scanner(System.in); //��ĳ�� ������ ��ü ���� ����
		
		System.out.print("���� �Է� : ");
		num = stdIn.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		}
		else {  
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
	    }
     }
}