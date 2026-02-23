package Struct;

public class Test {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(7);

        System.out.println(myLinkedList);

        myLinkedList.remove(1);

        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
