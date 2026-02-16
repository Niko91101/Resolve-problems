package Struct;

public class MyLinkedList {
    private int size;
    private Node head;



    public void add(int value) {
        //если это первое добавление в список
        if (head == null) {
            //логика
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
        }

        size++;
    }
    private static class Node {
        private int value;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        private Node next;

    }
}
