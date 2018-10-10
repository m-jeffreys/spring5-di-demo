package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * Sep 25, 2018
 *
 * @author mjeffreys
 */

// annotate as a controller makes it a spring component, managed by the spring context
// so when spring starts up will get a handle and put in spring context
@Controller
public class MyController
{
    private GreetingService greetingService;

    public MyController(GreetingService greetingService)
    {
        super();
        this.greetingService = greetingService;
    }

    public String hello()
    {
        System.out.println("MyController: Hello!!!!");
        return greetingService.sayGreeting();
    }

}
