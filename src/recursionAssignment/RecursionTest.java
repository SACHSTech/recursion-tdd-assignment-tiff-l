package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{

    // Problem Set 1

    @Test
    public void Test1(){
        assertEquals(0, Recursion.countHi(""));
    }

    @Test
    public void Test2(){
      assertEquals(1, Recursion.countHi("xxhixx"));
    }

    @Test
    public void Test3(){
      assertEquals(2, Recursion.countHi("xhixhix"));
    }

    // Problem Set 2

    @Test
    public void Test4(){
      assertEquals("", Recursion.changePi(""));
    }

    @Test
    public void Test5(){
      assertEquals("3.14", Recursion.changePi("pi"));
    }

    @Test
    public void Test6(){
      assertEquals("3.14p", Recursion.changePi("pip"));
    }

    @Test
    public void Test7(){
      assertEquals("3.143.14", Recursion.changePi("pipi"));
    }

    //Problem set 3
    @Test
    public void Test8(){
      assertEquals("yza", Recursion.stringClean("yyzzza"));
    }

    @Test
    public void Test9(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd"));
    }

    @Test
    public void Test10(){
      assertEquals("Helo", Recursion.stringClean("Hello"));
    }

}