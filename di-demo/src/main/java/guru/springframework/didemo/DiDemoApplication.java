package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SettersInjectedController;

@SpringBootApplication
public class DiDemoApplication
{

    public static void main(String[] args)
    {
        // load and get the handle on the context
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        // ask ctx to get a bean called myController
        MyController controller = (MyController) ctx.getBean("myController");

        // then called the method bean myController
        controller.hello();

        System.out.println(controller.hello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SettersInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }
}
