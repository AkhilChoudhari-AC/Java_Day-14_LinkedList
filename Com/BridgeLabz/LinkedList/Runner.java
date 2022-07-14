package Com.BridgeLabz.LinkedList;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Welcome to LinkedList program");

        LinkedList list = new LinkedList();

        list.insert(56);
        list.insert(70);
        list.insertMid(2, 30);

        list.print();
    }
}
