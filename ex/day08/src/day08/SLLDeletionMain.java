package day08;

public class SLLDeletionMain {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(85);
        singlyLinkedList.append(59);
        singlyLinkedList.append(70);
        singlyLinkedList.append(23);
        singlyLinkedList.append(65);

        System.out.print("���� ���� ���� ����Ʈ: ");
        singlyLinkedList.printAll();

        singlyLinkedList.delete(85);
        System.out.print("��� 85�� ������ ���� ���� ����Ʈ: ");
        singlyLinkedList.printAll();

        singlyLinkedList.delete(70);
        System.out.print("��� 70�� ������ ���� ���� ����Ʈ: ");
        singlyLinkedList.printAll();

        singlyLinkedList.delete(65);
        System.out.print("��� 65�� ������ ���� ���� ����Ʈ: ");
        singlyLinkedList.printAll();
    }
}
