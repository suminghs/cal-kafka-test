package com.mq;

import static org.junit.Assert.assertTrue;

import com.mq.demo.Customer;
import com.mq.demo.ReadBInLog;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void demo1(){
//        ReadBInLog.run();
    }

    @Test
    public void demo2(){
        (new Customer()).consume();
    }
}
