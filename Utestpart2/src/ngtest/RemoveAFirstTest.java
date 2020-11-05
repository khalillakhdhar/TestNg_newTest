package ngtest;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RemoveAFirstTest {
@Test
public void removeATest() {
RemoveAfirst a=new RemoveAfirst();
Assert.assertEquals("BCD", a.removeLetterA("AABCD"));
}
}
