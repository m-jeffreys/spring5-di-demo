package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.services.GreetingServiceImpl;

/**
 * Oct 2, 2018
 * 
 * @author mjeffreys
 */

public class SettersInjectedControllerTest
{
    private SettersInjectedController settersInjectedController;

    @Before
    public void setUp() throws Exception
    {
        this.settersInjectedController = new SettersInjectedController();
        this.settersInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, settersInjectedController.sayHello());
    }
}
