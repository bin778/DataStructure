package day02;

import java.util.Arrays;

public class ReferenceTest {
	public static void main(String[] args) {
		String[] folderA = { "java", "program" };
		String[] folderB = folderA;
		
		System.out.println("[�纻 �迭�� �� ���� ��] ���� �迭 : " + Arrays.toString(folderA));
		
		folderB[0] = "newFolder";
		
		System.out.println("[�纻 �迭�� �� ���� ��] ���� �迭 : " + Arrays.toString(folderA));
		System.out.println("[�纻 �迭�� �� ���� ��] �纻 �迭 : " + Arrays.toString(folderB));
		
		/* Result
		[�纻 �迭�� �� ���� ��] ���� �迭 : [java, program]
		[�纻 �迭�� �� ���� ��] ���� �迭 : [newFolder, program]
		[�纻 �迭�� �� ���� ��] �纻 �迭 : [newFolder, program]
		 */
		
		// folderA�� folderB�� ���� ���� �ּҰ��� ����Ű�� �ֱ� ����
		// ����, �� �� �ϳ��� ��Ҹ� �����ص� �� ���� �迭 ��� ��Ұ� ����ȴ�.
	}
}