package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StrategyPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StrategyPatternTest
{
    IApp app ;
    KeyPad kp;
    
    /**
     * Default constructor for test class StrategyPatternTest
     */
    public StrategyPatternTest()
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
        app = new AppAuthProxy() ;
      //  kp =new KeyPad();
    }


    @Test
    public void testLandscape()
    {
        // Login to App
            app.touch(1, 5);
            app.touch(2, 5);
            app.touch(3, 5);
            app.touch(4, 5);
        
        app.display();
        app.landscape();
        app.execute("B");
        System.out.println("Getname of current screen -- >");
        System.out.println(app.screen());
//          app.display()
//        System.out.println("JSingh");
        // Validate App is in Landscape Mode
//        app.screen()
        // (replace with correct assert)
        assertEquals("MyCards", app.screen());    
    }

    @Test
    public void testPortrait()
    {
        // Login to App
            app.touch(1, 5);
            app.touch(2, 5);
            app.touch(3, 5);
            app.touch(4, 5);
        // Put in Portrait Mode   
            app.display();
            System.out.println(app.screen());
        // Put in Landscape Mode   
        app.execute("B");
        System.out.println("Getname of current screen");
        System.out.println(app.screen());

        // Validate App is in Landscape Mode 
        // (replace with correct assert)
        assertEquals("Payments", app.screen());       
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
