package Struct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyLinkedListTest {

    @Test
    void addAndGetShouldReturnInsertedValuesInOrder() {
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    void sizeShouldReflectCurrentElementCount() {
        MyLinkedList list = new MyLinkedList();

        assertEquals(0, list.size());

        list.add(1);
        list.add(2);
        assertEquals(2, list.size());

        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    void removeShouldDeleteElementByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(15);
        list.add(25);

        list.remove(1);

        assertEquals(2, list.size());
        assertEquals(5, list.get(0));
        assertEquals(25, list.get(1));
    }

    @Test
    void toStringShouldReturnValuesInArrayStyle() {
        MyLinkedList list = new MyLinkedList();
        list.add(7);
        list.add(8);

        assertEquals("[7, 8]", list.toString());
    }

    @Test
    void getShouldThrowExceptionForOutOfBoundsIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(42);

        assertThrows(IllegalArgumentException.class, () -> list.get(2));
    }
}
