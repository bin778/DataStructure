package day02;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr1 = new int[1];
		int[] arr2 = new int[] {1, 2, 3};
		int[] arr3 = {1, 2, 3, 4, 5};
		
		// �迭�� ��ҵ��� ����� �� Arrays Ŭ������ ����Ѵ�.(�Ϲ������� �迭�� ���)
		// toString() ==> �迭�� ��ҵ��� ���ڿ��� �����Ͽ� ��ȯ
		System.out.println("arr1 : " + Arrays.toString(arr1) + ", length : " + arr1.length);
		System.out.println("arr2 : " + Arrays.toString(arr2) + ", length : " + arr2.length);
		System.out.println("arr3 : " + Arrays.toString(arr3) + ", length : " + arr3.length);
		
		String[] strings = new String[3];
		System.out.println(strings[0]);
//		System.out.println(strings[-1]); �迭�� ������ �� �� ����
//		System.out.println(strings[3]); �迭�� �����÷ο찡 ���ܼ� ��� �Ұ�
		
		
		}
}