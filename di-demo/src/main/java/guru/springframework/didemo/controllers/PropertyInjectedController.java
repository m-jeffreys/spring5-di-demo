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
public class PropertyInjectedController
{
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello()
    {
        return greetingServiceImpl.sayGreeting();
    }

}
