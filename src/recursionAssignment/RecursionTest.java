package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{

    /** Problem Set 1
     *Test base case
     */
    @Test
    public void Test1_1(){
        assertEquals(0, Recursion.countHi(""));
    }

    /**
     * Testing recursive step 
     */
    @Test
    public void Test1_2(){
      assertEquals(1, Recursion.countHi("xxhixx"));
    }

    /**
     * Testing recursive step 
     */
    @Test
    public void Test1_3(){
      assertEquals(2, Recursion.countHi("xhixhix"));
    }

    /**
     * Testing recursive step 
     */
    @Test
    public void Test1_4(){
      assertEquals(4, Recursion.countHi("ihhihihiihi"));
    }

    /**
     * Testing recursive step 
     */
    @Test
    public void Test1_5(){
      assertEquals(1, Recursion.countHi("hi"));
    }


    /** Problem Set 2
    *Test base case
    */
    @Test
    public void Test2_1(){
      assertEquals("", Recursion.changePi(""));
    }

     /**
     * Testing base case 
     */
    @Test
    public void Test2_2(){
      assertEquals("p", Recursion.changePi("p"));
    }

    
    /**
     * Testing recursive step 
     */
    @Test
    public void Test2_3(){
      assertEquals("3.14p", Recursion.changePi("pip"));
    }

    /**
     * Testing recursive step 
     */
    @Test
    public void Test2_4(){
      assertEquals("3.143.14", Recursion.changePi("pipi"));
    }

    /**
     * Testing recursive step 
     */
    @Test
    public void Test2_5(){
      assertEquals("3.14", Recursion.changePi("pi"));
    }

    /** Problem Set 3
    *Test base case
    */
    @Test
    public void Test3_1(){
      assertEquals("yza", Recursion.stringClean("yyzzza"));
    }

    /**
     * Problem Set 3: Testing recursive step 
     */
    @Test
    public void Test3_2(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd"));
    }

    /**
     * Problem Set 3: Testing recursive step 
     */
    @Test
    public void Test3_3(){
      assertEquals("Helo", Recursion.stringClean("Hello"));
    }

    /**
     * Problem Set 3: Testing recursive step 
     */
    @Test
    public void Test3_4(){
      assertEquals("x", Recursion.stringClean("xxxxxx"));
    }

    /**
     * Problem Set 3: Testing recursive step 
     */
    @Test
    public void Test3_5(){
      assertEquals("yayayay", Recursion.stringClean("yayayayy"));
    }

}