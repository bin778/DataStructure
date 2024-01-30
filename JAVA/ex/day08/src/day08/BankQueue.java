package day08;

import queue.linkedList.LinkedListQueue;
import java.util.Scanner;

public class BankQueue {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        int count = 1;
        int size = 0;
        boolean isStop = false;

        while (!isStop) {
            System.out.println("1. ���ǥ �߱�");
            System.out.println("2. ��    ��");
            System.out.println("3. ����ο�");
            System.out.println("4. ��    ��");
            System.out.print("=>");

            int choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1:
                    queue.enqueue(count);
                    System.out.println(String.format("��� ��ȣ: %s�� �߱�.\n", count));

                    count++;
                    size++;
                    break;
                case 2:
                    if (queue.empty()) {
                        System.out.println("��� ���� ���� �����ϴ�.\n");
                        break;
                    }

                    int number = (int) queue.dequeue();
                    System.out.println(String.format("%s�� â���� �̵��� �ּ���.\n", number));
                    size--;
                    break;
                case 3:
                    System.out.println(String.format("���� �ο��� %s�� �Դϴ�.\n", size));
                case 4:
                    System.out.println("��    ��.\n");
                    isStop = true;
                    break;
                default:
                        System.out.println("1.    ���ǥ �߱�");
                        System.out.println("2.    ��   ��");
                        System.out.println("3.    ����ο�");
                        System.out.print("=>");
            }
        }
    }
}
