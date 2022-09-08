package day02;

import java.util.Arrays;

public class ReferenceTest1 {
	public static void main(String[] args) {
		String[] folderA = { "java", "program" };
		String[] folderB = new String[folderA.length];
		
		System.out.println("[�纻 �迭�� �� ���� ��] ���� �迭 : " + Arrays.toString(folderA));
		
		for (int i = 0; i < folderA.length; i++) {
			folderB[i] = folderA[i];
		}
		
		folderB[0] = "newFolderB";
		
		System.out.println("[�纻 �迭�� �� ���� ��] ���� �迭 : " + Arrays.toString(folderA));
		System.out.println("[�纻 �迭�� �� ���� ��] �纻 �迭 : " + Arrays.toString(folderB));
		
		/* Result
		[�纻 �迭�� �� ���� ��] ���� �迭 : [java, program]
		[�纻 �迭�� �� ���� ��] ���� �迭 : [java, program]
		[�纻 �迭�� �� ���� ��] �纻 �迭 : [newFolderB, program]
		 */
		
		// folderA�� folderB�� �޸� �ּ� ���� ���� ����Ű�� �ֱ� ����
		// ����, �� �� �ϳ��� ��Ҹ� �����ϸ� ��Ҹ� �ٲ� �迭�� ��Ҹ� ����ȴ�.
	}
}