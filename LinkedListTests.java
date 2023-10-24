import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class Node {
    int value;
    Node next;
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class LinkedListTests {
	@Test 
	public void testappend() {
    LinkedList list = new LinkedList(); 
    list.append(1);
    list.append(2);
    list.append(3); 
    assertEquals(1, list.first());
    assertEquals(3, list.last());
    assertEquals(3, list.length());
	}

    @Test 
    public void testmerge() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("cherry");
        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("date");
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("apple");
        expectedOutput.add("banana");
        expectedOutput.add("cherry");
        expectedOutput.add("date");
        List<String> actualOutput = ListExamples.merge(list1, list2);
        assertEquals(expectedOutput, actualOutput);

    }
}
