import java.util.Scanner;

/*
 *  �ۼ��� : 2024�� 3�� 22��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : ���ǽ� ����.
 *       ���� �Է¹޾� �ش� ������ ����Ͻÿ�.
 *       3,4,5��  => ��
 *       6,7,8�� => ����
 *       9,10,11�� => ����
 *       12,1,2�� => �ܿ�
 * 
 *  ���� �м� : �Է� �޾ƾ� �� ����
 *           1,2,3,4,5,6,7,8,9,10,11,12�̴�.
 *           0�̳� 13�� �Է��ϸ�? => �ش� ���� �����ϴ� �������.
 *           
 *           ���� if?
 *           ������ if?
 */  

public class ComConditionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mon;
		
		Scanner stdIn = new Scanner(System.in); //��ĳ�� ������ ��ü ���� ����
		System.out.print("�� ���� ������ �ñ����� �Է��ϼ��� : ");
		mon = stdIn.nextInt();
		
		if ( mon >= 0 && mon <= 12) {
			
			if(mon >= 12 || mon <= 2 ) {  
				System.out.println(mon + "���� ������ �ܿ��Դϴ�.");
				}
			
			else if(mon <= 5) {
				System.out.println(mon + "���� ������ ���Դϴ�.");
				}
			
			else if(mon <= 8) {
				System.out.println(mon + "���� ������ �����Դϴ�.");
				}
			
			else {
				System.out.println(mon + "���� ������ �����Դϴ�.");
				}
		}
		else {
			    System.out.println("���� �ƴ� ���ڸ� �Է��Ͽ����ϴ�.");
		}	
	  }
	}

