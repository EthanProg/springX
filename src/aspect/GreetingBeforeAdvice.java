package aspect;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Ethan on 2016/2/18.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clientName = (String) objects[0];
        System.out.println("clientName:　" + clientName);
    }
}
