package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Sep 28, 2018
 *
 * @author mjeffreys
 */

@Service
public class GreetingServiceImpl implements GreetingService
{
    public static final String HELLO_GURUS = "GreetingServiceImpl:  Hello Gurus -  Original!!!";

    @Override
    public String sayGreeting()
    {
        return HELLO_GURUS;
    }

}
