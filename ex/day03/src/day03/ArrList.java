package day03;

import java.util.NoSuchElementException;

public class ArrList<E> {
	private E a[];
    private int size; // ����Ʈ�� �׸� ��

    // �迭 ����Ʈ
    public ArrList() { // ������
    	a = (E[])new Object[1]; // 1���� ���Ҹ� ������ �迭
    	size = 0; // �׸��� 0���� �ʱ�ȭ
    }
    
    // ����(��ũ) ����Ʈ
    public class ListNode {
        private int data; // ���� ���
        private ListNode next; // ����Ʈ ���
        public ListNode(int data) {  }
    }
    
    // ����Ʈ�� ����
    public E peek(int k) { // k��° ����� �׸��� �˻�, a[k]
    	if(size == 0) { // �׸�(X)
    		throw new NoSuchElementException(); // ���α׷� stop
    	}
    	return a[k];
    }
    
    // ����Ʈ�� ����
    public void insertLast(E newItem) {
    	if(size == a.length)
    		resize(2*a.length); // a�� ����� 2��� �ø���.
    	a[size++] = newItem;
    }
    
    // resize() �޼ҵ�
    public void resize(int newSize) {
    	Object[] o = new Object[newSize];
    	for (int i = 0; i < size; i++)
    		o[i] = a[i];
    	a = (E[])o;
    }
    
}
