package day03;

public class NodeList {
	public class ListNode {
    	private int data;
    	private ListNode next;
    	
    	// ������
    	public ListNode(int data) {
    		this.data = data;
    	}
    	
    	public void setData(int data) {
    		this.data = data;
    	}
    	
    	public int getData() {
    		return data;
    	}
    	
    	public void setNext(ListNode next) {
    		this.next = next;
    	}
    	
    	public ListNode getNext() {
    		return this.next;
    	}
    }
	
	// ����Ʈ Ž��
	int ListLength(ListNode headNode) {
		int length = 0;
		ListNode currentNode = headNode;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	// ����Ʈ ����
	ListNode InsertLinkedList(ListNode headNode, ListNode nodeToInsert, int position) {
		if(headNode == null) 
			return nodeToInsert;
		int size = ListLength(headNode);
		if(position > size + 1 || position < 1) { 
			System.out.println("��带 ������ �� �����ϴ�.");
			return headNode;
		}
		
		if(position == 1) {
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		} else {
			ListNode previousNode = headNode;
			int count = 1;
			while(count < position -1) {
				previousNode = previousNode.getNext();
				count++;
			}
			ListNode currenNode = previousNode.getNext();
			nodeToInsert.setNext(currenNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}
	
}
