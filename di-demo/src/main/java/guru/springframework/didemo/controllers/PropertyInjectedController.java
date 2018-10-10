package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingServiceImpl;

/**
 * Sep 28, 2018
 *
 * @author mjeffreys
 */

@Controller
public class PropertyInjectedController
{
    @Autowired
    @Qualifer("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

}
