import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd1() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test
  public void testFilter1(){
    IsMoon sc = new IsMoon();
    List<String> input1 = Arrays.asList("a", "notmoon", "cow");
    List<String> expected = Arrays.asList();
    assertEquals(expected, ListExamples.filter(input1, sc));
  }

  @Test
  public void testFilter2(){
    IsMoon sc = new IsMoon();
    List<String> input2 = Arrays.asList("MOON", "notmoon", "moon");
    List<String> expected = Arrays.asList("MOON", "moon");
    assertEquals(expected, ListExamples.filter(input2, sc));
  }
}

