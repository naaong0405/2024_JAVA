/*
 *  �ۼ��� : 2024�� 3�� 15��
 *  �ۼ��� : ��ǻ�ͱ����� 202227008 ���þ�
 *  ���� : ������ �ڷ���.
 */

public class VarDatatype {

	public static void main(String[] args) {
		
		// ��� ����
		final int MAX = 100;
		final double PI = 3.14;
		
		// PI = 3.14159;	
		// ���� �߻�. ����� �ѹ� ���� �����Ǹ�  ����� �� ����.
		
		int r = 5; // ����
		double pi = 3.14159; // �Ǽ� ����
		String name = "������";  // ���ڿ�
		char blood = 'A';  // ����
		//Char blood1 = 'AB' // ���� �߻�. ���ڴ� 1byte
		
		// ������ ���
		System.out.println("�������� " + PI + "�Դϴ�.");
		System.out.println("�������� " + pi + "�Դϴ�.");
		
		// ���� ���� ����Ͽ� ���
		double circle = 0;
		circle = r * r * pi;
		System.out.println("�������� ���̰� " + r +"�� ���� ���̴� " + circle + "�Դϴ�.");
	 	
		// ���� ���̸� ����Ѵ�.
		double area = r * r * pi;
		
		// ���� ���̸� ����Ѵ�.
		System.out.println("�������� ���̰� " + r +"�� ���� ���̴� " + area + "�Դϴ�.");
		
		area = r * r * PI;  // �̹� �ڷ����� double�� �����߱⿡ �缱���� �ʿ䰡 ����.
	 	System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ�.\n", r, area);
	 	
	}
}
