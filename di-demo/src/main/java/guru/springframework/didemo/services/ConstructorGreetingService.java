package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Oct 4, 2018
 *
 * @author mjeffreys
 */

@Service
public class ConstructorGreetingService implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "Hey Mons - I was injected by the constructor!!!!";
    }
}
