package guru.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.didemo.services.GreetingService;

/**
 * Sep 28, 2018
 *
 * @author mjeffreys
 */

@Controller
public class ConstructorInjectedController
{
    private GreetingService greetingService;// GreetingServices is an interface

    // specify the class name using the @Qualifier annotation
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

    /*
     * public void sayGreetingService(GreetingService greetingService) { this.greetingService =
     * greetingService; }
     */

}
