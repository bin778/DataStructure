package arrayExample;

//����ڷ� ���� �Է¹��� �ҹ��� ���ĺ��� �빮�ڷ� �����Ͽ� ����ϴ� �ҽ��� �ڵ�
//��] 'a'�� �Է� ������ 'A'�� ���

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ҹ��� �Է� >> ");
		ch = sc.next().charAt(0);
		
		// �ҹ���(a~z)�� �Է��ϸ� ASCII �ڵ带 �̿��� 32�� �� ������ ������ �� ���
		if (ch >= 'a' && ch <= 'z')
			System.out.println("�빮�� : " + (char)(ch - 32));
		else
			System.out.println("�ҹ��ڸ� �Է��ؾ� �մϴ�.");
	}
}

