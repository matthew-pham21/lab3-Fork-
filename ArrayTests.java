import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 5, 4, 3, 2 }, input2);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = { 5, 4, 3, 2 };
    assertArrayEquals(new int[] { 2, 3, 4, 5 }, ArrayExamples.reversed(input2));
  }

  @Test 
  public void testAvgWOLow() {
    double[] input = {5, 5, 10};
    assertEquals(7.5,ArrayExamples.averageWithoutLowest(input), 0.000001);
  }
}
