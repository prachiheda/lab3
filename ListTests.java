import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class MyStringChecker implements StringChecker{
    public boolean checkString(String s){
        if (s.length() > 4){
            return true; 
        }
        return false; 
    }
}

public class ListTests {
	@Test 
	public void testfilter() {
    List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("cherry");
        input.add("date");
    List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("apple");
        expectedOutput.add("banana");
        expectedOutput.add("cherry");
    StringChecker sc = new MyStringChecker();
    List<String> actualOutput = ListExamples.filter(input,sc);
    assertEquals(expectedOutput, actualOutput);
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
