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
    
    public E peek(int k) { // k��° ����� �׸��� �˻�, a[k]
    	if(size == 0) { // �׸�(X)
    		throw new NoSuchElementException(); // ���α׷� stop
    	}
    	return a[k];
    }
    
    
}
