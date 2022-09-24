package nodeExample;

class Node {
		Object data; // String Ÿ���� ���� ���̸� ������ �� �ִ�.
		// �������� stack ����, �����ʹ� heap ������ ����
		Node link; // �ڱ� �ڽ��� �����ϴ� link
		
		void printList(Node d) {
			while(d != null) {
				System.out.print(d.data + " -> ");
				d = d.link;
			}
			System.out.println("null");
		}
	}
	
	public class LinkedList1 {
		public static void main(String[] args) {
			Node L = new Node();
			L.data = "Kim";
			L.link = null;
			
			Node tmp = new Node();
			tmp.data = "Lee";
			L.link = tmp; // Kim�ڿ� Lee ���� ����
			
			Node tmp1 = new Node();
			tmp1.data = "Park";
			tmp.link = tmp1;
			
			tmp1.link = null;
			System.out.println("����Ʈ ���");
			L.printList(L);
		}
	}
