import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1,2,3,4,5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5,4,3,2,1 }, input1);
	}

  @Test
  public void testReversed2() {
    int[] input1 = { 1,2,3,4,5 };
    assertArrayEquals(new int[]{ 5,4,3,2,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] input1 = { 1,2 };
    double output = 2; 
    assertEquals(output, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testaverageWithoutLowest2() {
    double[] input1 = { 1,2,4 };
    double output = 3; 
    assertEquals(output, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }

  @Test
  public void testaverageWithoutLowest3() {
    double[] input1 = { 1,2,4, 3.3 };
    double output = 3.1; 
    assertEquals(output, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
  @Test
  public void testaverageWithoutLowest4() {
    double[] input1 = { 1,1,2,3,4 };
    double output = 3; 
    assertEquals(output, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
}
