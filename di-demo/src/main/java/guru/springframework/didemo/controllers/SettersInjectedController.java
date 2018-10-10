package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * Sep 28, 2018
 *
 * @author mjeffreys
 */

@Controller
public class SettersInjectedController
{
    private GreetingService greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

    @Autowired

    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

}
