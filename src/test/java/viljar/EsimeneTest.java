package jaagup;
import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
  @Test
  public void test1(){
    assertEquals(3,3);
  }
  @Test
  public void test2(){
    Rakendus r=new Rakendus();
    assertEquals("Ahoi",r.tervitusfunktsioon());
  }
}
