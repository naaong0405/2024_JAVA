import java.util.Scanner;

/*
 *  �ۼ��� : 2024�� 3�� 22��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : ���� if�� �ǽ�.
 *        ������ �Է¹޾� ������ ����Ͻÿ�.
 *        
 *  �����м� : 90�� �̻��̸� A����
 *          80�� �̻��̸� B����
 *          70�� �̻��̸� C����
 *          60�� �̻��̸� D����
 *          60�� �̸��̸� F����
 *          ������ ������ �Է� �޴´�.
 *  
 *  �˰��� : 1. ����(����)�� �Է¹޴´�.
 *          2. ������ 90�� �̻��ΰ�?
 *             2-1. A�����Դϴ�. ���
 *          3. �ƴϸ� ������ 80�� �̻��ΰ�?
 *             3-1. B�����Դϴ�. ���
 *          4. �ƴϰ� ������ 70�� �̻��ΰ�?
 *             4-1. C�����Դϴ�. ���
 *          5. �ƴϰ� ������ 60�� �̻��ΰ�?
 *             5-1. D�����Դϴ�. ���
 *          6. �ƴϸ�(��������)
 *             6-1. F�����Դϴ�. ���
 */

public class MultiIfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int score;
	    
		// 1. ����(����)�� �Է� �޴´�.
		Scanner stdIn = new Scanner(System.in); //��ĳ�� ������ ��ü ���� ����
		System.out.print("���� �Է� : ");
		score = stdIn.nextInt();
		
	
		// 2. ������ 90�� �̻��ΰ�?
		if(score >= 90 && score <= 100) {  // 90�� �̻��̰�, 100�� ����
			System.out.println("A�����Դϴ�.");
			}
		
		else if(score >= 80 && score < 90) {
			System.out.println("B�����Դϴ�.");
			}
		
		else if(score >= 70 && score < 80) {
			System.out.println("C�����Դϴ�.");
			}
		
		else if(score >= 60  && score < 70) {
			System.out.println("D�����Դϴ�.");
			}
		
		else if(score >= 0  && score < 60) {
			System.out.println("F�����Դϴ�.");
		}
		
	    else { 
	    	System.out.println("�߸��� ���� �Է��Դϴ�.");
    	}
	}
}

