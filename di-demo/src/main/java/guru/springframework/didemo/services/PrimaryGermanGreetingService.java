package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Oct 11, 2018
 *
 * @author mjeffreys
 */

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "Primarer Grudientst";
    }

}
