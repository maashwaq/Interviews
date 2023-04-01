**Spring aop webservice code**

Spring AOP in a web service:

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name) {
        return myService.getGreeting(name);
    }

    // other controller methods...

}

@Service
public class MyService {

    @LogExecutionTime
    public String getGreeting(String name) {
        try {
            Thread.sleep(1000); // simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, " + name + "!";
    }

    // other service methods...

}

@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature() + " executed in " + (endTime - startTime) + "ms");
        return result;
    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}

In this example, we have a REST controller MyController that depends on a service MyService. The service method getGreeting is annotated with @LogExecutionTime, which is a custom annotation we define to mark methods that we want to log execution time for.

The LoggingAspect class is the aspect that defines the behavior we want to apply to methods annotated with @LogExecutionTime. In this case, we want to log the execution time of the method. We do this by defining an advice method logExecutionTime that wraps the annotated method with an Around advice. The Around advice allows us to execute custom behavior both before and after the method execution. In this case, we capture the start time of the method execution, then call proceed() to actually execute the method, capture the end time of the method execution, log the elapsed time, and return the result.

To enable Spring AOP, we need to annotate the LoggingAspect class with @Aspect and @Component. This tells Spring that this class contains advice that should be applied to methods that match the pointcut expression specified in the advice method. We also need to enable AOP in our Spring configuration by adding the @EnableAspectJAutoProxy annotation to a configuration class.

That's it! Now, every time the getGreeting method is called, the execution time will be logged.

**Spring AOP using XML configuration**:

Define the target class and interface:

public interface MyService {
    public void doSomething();
}

public class MyServiceImpl implements MyService {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }
}

Define the aspect class:

public class MyAspect {
    public void beforeAdvice() {
        System.out.println("Before advice");
    }
    public void afterAdvice() {
        System.out.println("After advice");
    }
}

Define the XML configuration file (e.g. applicationContext.xml):
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
         http://www.springframework.org/schema/beans/spring-beans.xsd
         http://www.springframework.org/schema/aop
         http://www.springframework.org/schema/aop/spring-aop.xsd">

    <bean id="myService" class="com.example.MyServiceImpl" />

    <bean id="myAspect" class="com.example.MyAspect" />

    <aop:config>
        <aop:aspect id="myAspectId" ref="myAspect">
            <aop:pointcut id="myPointcut" expression="execution(* com.example.MyService.doSomething(..))" />
            <aop:before pointcut-ref="myPointcut" method="beforeAdvice" />
            <aop:after pointcut-ref="myPointcut" method="afterAdvice" />
        </aop:aspect>
    </aop:config>

</beans>

In this example, we define a target class MyServiceImpl that implements the MyService interface. We also define an aspect class MyAspect that contains two advice methods: beforeAdvice() and afterAdvice().

In the XML configuration file, we define two beans: myService and myAspect. We also define an AOP configuration that specifies the myAspect bean as the aspect to apply, and the myPointcut pointcut expression to match. The beforeAdvice() and afterAdvice() methods are then specified as the advice to apply before and after the matched method.

To enable this AOP configuration, we need to load the applicationContext.xml file in our Spring application context. We can then retrieve the myService bean from the context and call its doSomething() method. This will trigger the beforeAdvice() and afterAdvice() methods to be executed before and after the doSomething() method.

