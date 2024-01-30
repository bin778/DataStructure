package day04;

public class LinkedNodeList {
	// private�� ���� ������ �� ���� ��Ű������ ���� ����
		public class LinkedListNode2<E> {
			  E data;
			  LinkedListNode2<E> next;	  
		}
	
	// private�� ���� ���� �� ���� Ŭ���� �������� ���� ����(����ȭ ����)
	// LinkedListNode�� ���� ����
	public class LinkedListNode<E> {
		  private E data; // �����͸� ����
		  private LinkedListNode<E> next; // ���� ��带 ����
		  // --> �ڱ� �ڽŰ� ���� �ڷ����� �ν��Ͻ��� ����Ų��
		  
		  LinkedListNode(E data, LinkedListNode<E> next) {
			  this.data = data;
			  this.next = next;
		  }
	}
	
	public class LinkedList<E> {
		// ���� Ŭ���� --> Node class �������� ���� ����
		// Node class ���� ����
		class Node<E> { 
			private E data;
			private Node<E> next;
			
			Node(E data, Node<E> next) {
				  this.data = data;
				  this.next = next;
			}
		}
		private Node<E> head; // ��� ���
		private Node<E> crnt; // ���� ���
		
		public LinkedList() {
			head = crnt = null; // head = null; crnt = null;
		}
		
		// ��� ����
		public void addFirst(E obj) {
			Node<E> p = head; // ��� ��� p �ʱ�ȭ
			head = crnt = new Node<E>(obj, p); // ù ��° ��带 �����Ѵ�
		}
		
		public void addLast(E obj) {
			// ��� ��尡 ��������� ù ��° ��� ����
			if(head == null) 
				addFirst(obj); // ù ��° ��� ���� �Լ�
			else {
				Node<E> p = head; // ��� ��� p �ʱ�ȭ
				// while���� ������ ���� ��尡 ��������� ����
				while(p.next != null)
					p = p.next;
				p.next = crnt = new Node<E>(obj, null);
			}
		}
		
		// ��� ����
		public void removeFirst() {
			if(head != null) 
				head = crnt = head.next;
		}
		
		public void removeLast() {	
			if(head != null)
				if(head.next == null)
					removeFirst();
			else {
				Node<E> p = head;
				Node<E> p1 = head;
				while(p.next != null) {
					p1 = p;
					p = p.next;
				}
				p1.next = null;
				crnt = p1;
			}
		}
		
	}
}
