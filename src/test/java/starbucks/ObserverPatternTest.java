package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{

    KeyPad kp;
    PinEntryMachine pmachine;
    
    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
    {  
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        // Set up Key Pad and Pin Entry Machine
        // Using Observer Pattern

        kp = new KeyPad();
        pmachine = new PinEntryMachine();
        kp.attach(pmachine);
    }


    @Test
    public void testOneKey()
    {
        // Key Pad Press 1
        kp.touch(1,5);


        // Assert D1 is "1" (replace with appropriate test)
        assertEquals( "1",pmachine.d1());
    }

    @Test
    public void testTwoKeys()
    {
        // Key Pad Press 1 and 2
        kp.touch(1,5);
        kp.touch(2,5);
        // Assert D1 and D2 are correct 
        // (replace with appropriate test)

        assertEquals("1",pmachine.d1());
        assertEquals("2",pmachine.d2());
    }

    @Test
    public void testThreeKeys()
    {
        // Key Pad Press 1, 2 and 3
        kp.touch(1,5);
        kp.touch(2,5);
        kp.touch(3,5);

        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)

        assertEquals("1",pmachine.d1());
        assertEquals("2",pmachine.d2());
        assertEquals("3",pmachine.d3());
     }

    @Test
    public void testFourKeys()
    {
        // Key Pad Press 1, 2, 3 and 4
        kp.touch(1,5);
        kp.touch(2,5);
        kp.touch(3,5);
        kp.touch(1,6);

        // Assert D1, D2, D3 and D4 are correct
        // (replace with appropriate test)
        assertEquals("1",pmachine.d1());
        assertEquals("2",pmachine.d2());
        assertEquals("3",pmachine.d3());
        assertEquals("4",pmachine.d4());

    }

   @Test
    public void testBackspace()
    {
        // Key Pad Press 1, 2, 3 and 4
        kp.touch(1,5);
        kp.touch(2,5);
        kp.touch(3,5);
        kp.touch(1,6);

        // Assert D1, D2, D3, D4 are correct
        // (replace with appropriate test)
        assertEquals("1",pmachine.d1());
        assertEquals("2",pmachine.d2());
        assertEquals("3",pmachine.d3());
        assertEquals("4",pmachine.d4());

        // Key Pad Press 1, 2, 3 and 4 and then backspace
        kp.touch(1,5);
        kp.touch(2,5);
        kp.touch(3,5);
        kp.touch(1,6);
        kp.touch(3,8);

        // Assert D1, D2, D3, D4 are correct
        // (replace with appropriate test)
        assertEquals("1",pmachine.d1());
        assertEquals("2",pmachine.d2());
        assertEquals("3",pmachine.d3());
        assertEquals("",pmachine.d4());

    }
    


    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
