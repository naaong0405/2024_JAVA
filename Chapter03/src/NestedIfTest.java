import java.util.Scanner;

/*
 *  �ۼ��� : 2024�� 3�� 22��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : ������ if�� �ǽ�.
 *        ������ �Է¹޾� ������ ����Ͻÿ�.
 *        ������ 0~100�� ���� �Դϴ�.
 *        ���� ������ ����� "�߸��� ���� �Դϴ�." ����Ͻÿ�.
 *        
 *  �����м� : �Է¹��� ������ 0~100 �����ΰ�?
 *  		������ 0~100 ���̰� �ƴϸ�?
 *          90�� �̻��̸� A����
 *          80�� �̻��̸� B����
 *          70�� �̻��̸� C����
 *          60�� �̻��̸� D����
 *          60�� �̸��̸� F����
 *          ������ ������ �Է� �޴´�.
 *  
 *  �˰��� : 1. ����(����)�� �Է¹޴´�.
 *          2. if ������ ������ 0~100 �����ΰ�?
 *            1) A
 *            2) B
 *               :
 * 
 *          3. else �ƴѰ�?
 *            1) "�߸��� �����Դϴ�." ��� 
 */

public class NestedIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		
		Scanner stdIn = new Scanner(System.in); //��ĳ�� ������ ��ü ���� ����
		System.out.print("���� �Է� : ");
		score = stdIn.nextInt();
		
		if ( score >= 0 && score <= 100) {
		
			if(score >= 90) {  // 90�� �̻��̰�, 100�� ����
				System.out.println("A�����Դϴ�.");
				}
			
			else if(score >= 80) {
				System.out.println("B�����Դϴ�.");
				}
			
			else if(score >= 70) {
				System.out.println("C�����Դϴ�.");
				}
			
			else if(score >= 60) {
				System.out.println("D�����Դϴ�.");
				}
			
			else {
				System.out.println("F�����Դϴ�.");
			}
		}
		
		else {
			    System.out.println("�߸��� ���� �Է��Դϴ�.");
		}	
	  }

} 
