package arrayExample;

//�� ���� �迭�� �����Ѵ�. 
//������ ���� �� ���� �迭���� ���� ���� ��Ұ� ���ԵǾ� �ִ��� �Ǻ��ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
//ù ��° �迭 arr1 = { 1,2,3 };
//�� ��° �迭 arr2 = { 2,3,1 };

import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3};
		int[] arr2 = {2, 3, 1};
		int length;
		boolean equals = false;
		
		// arr1, arr2�� ������������ �����Ѵ� sort()
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// arr1�� arr2�� �迭 ���� �� ��� ���� �� ū �� ��
		length = arr1.length >= arr2.length ? arr1.length : arr2.length;
		
		try {
			for (int i = 0; i < length; i++) {
				// �� �迭�� ��Ұ� ��� ������ true, �ƴϸ� false
				if (arr1[i] == arr2[i]) {
					if (i == arr2.length - 1)
						equals = true;
				}
				else {
					equals = false;
					break;
				}
			}
		// �� �迭�� ��Ұ� ���� ��ġ���� ������ ���� ó���Ѵ�
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ��Ұ� �߸� ������");
			System.exit(0);
		}
		
		// ����� ���(true�̸� ����, false�� �ٸ�)
		if (equals == true)
			System.out.println("�� �迭�� ��Ұ� ���� �����ϴ�.");
		else if (equals == false)
			System.out.println("�� �迭�� ��Ұ� �ٸ��ϴ�.");
	}
}
