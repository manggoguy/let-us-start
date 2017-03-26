package com.riotgames.sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple CalcApp.
 */
public class CalcAppTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalcAppTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalcAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.junit.Test
    public void testCalcAppDoesCorrectAddOperation(){
        String[] args = new String[] {"1", "+", "2"};

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(3.0));
    }
    @org.junit.Test
    public void testCalcAppDoesCorrectMinusOperation(){
        String[] args = new String[] {"1", "-", "2"};

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(-1.0));
    }

    @org.junit.Test
    public void testCalcAppDoesCorrectMulOperation(){
        String[] args = new String[] {"1", "*", "2"};

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(2.0));
    }
    @org.junit.Test
    public void testCalcAppDoesCorrectDivOperation(){
        String[] args = new String[] {"2", "/", "1"};

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(2.0));
    }
    @org.junit.Test
    public void testCalcAppMain(){
        String[] args = new String[] {"2", "/", "1"};
        CalcApp.main(args);
    }

    @org.junit.Test(expected = MyOwnRuntimeException.class)
    public void testLessTokens(){
        String[] args = new String[] {"2", "+1"};
        CalcApp app = new CalcApp();
        try {
            app.calc(args);
        }catch (MyOwnRuntimeException aMyOwnRuntimeException){
            assertThat(aMyOwnRuntimeException.getMessage(), is("Invalid operator"));
            Logger logger = Logger.getLogger("logging.exception");
            logger.info(aMyOwnRuntimeException.getMessage());
            throw new MyOwnRuntimeException(aMyOwnRuntimeException);
        }

    }
    //Test
    @org.junit.Test(expected = MyOwnRuntimeException.class)
    public void testCalcThrowException(){
        String[] args = new String[] {"1", "j", "2"};

        CalcApp app = new CalcApp();
        try {
            app.calc(args);
        }catch (MyOwnRuntimeException aMyOwnRuntimeException){
            assertThat(aMyOwnRuntimeException.getMessage(), is("Invalid operator"));
            Logger logger = Logger.getLogger("logging.exception");
            logger.info(aMyOwnRuntimeException.getMessage());
            throw new MyOwnRuntimeException(aMyOwnRuntimeException);
        }

    }
}
