package Com.BridgeLabz.LinkedList;

public class LinkedList {

    public static void main(String[] args) {

        System.out.println("Welcome to LinkedList program");
        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(30);
        list.insert(70);
        list.print();
    }


    public MyNode head = null;
    public MyNode tail = null;


    public void insert(int data) {


        MyNode newNode = new MyNode(data);
        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
        }
    }


    public void print() {

        MyNode temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list is: ");
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
