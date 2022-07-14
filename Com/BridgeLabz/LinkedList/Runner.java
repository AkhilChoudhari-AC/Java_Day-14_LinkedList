package Com.BridgeLabz.LinkedList;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Welcome to LinkedList program");

        LinkedList list = new LinkedList();

        list.insert(56);
        list.insert(30);
        list.insert(70);
        list.print();

        list.searchNode(30);
        list.insertMid(3, 40);
        list.print();
        list.sortedList();
        System.out.println("sorted data");
        list.print();

    }
}
