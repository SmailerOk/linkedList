package LinkedList;

public class main {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<String>();
        myList.addFirst("First");
        myList.addFirst("First 2");
        myList.addFirst("First 3");
        System.out.println(myList.getFirstNode());
        System.out.println(myList.getLastNode());
    }
}
