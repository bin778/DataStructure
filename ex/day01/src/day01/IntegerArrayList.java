package day01;

public class IntegerArrayList implements IntegerListInterface {
	private Integer[] item;
	private int numItem;
	private static final int DEFAULT_CAPACITY = 60;
	// ������ : ��ü�� �ʱ�ȭ.
	// static : ���� �ʱ�ȭ.

	public IntegerArrayList() {
		item = new Integer[DEFAULT_CAPACITY];
		numItem = 0;
	}

	public IntegerArrayList(int n) {
		item = new Integer[n];
		numItem = 0;
	}
}
