package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Oct 4, 2018
 *
 * @author mjeffreys
 */

@Service
public class SetterGreetingService implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "Hello Mons - I was injected by the Setter";
    }
}
