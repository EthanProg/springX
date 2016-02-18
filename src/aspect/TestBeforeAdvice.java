package aspect;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by Ethan on 2016/2/18.
 */
public class TestBeforeAdvice {
    public static void main(String[] args){

        Waiter target = new NaiveWaiter();

        BeforeAdvice advice = new GreetingBeforeAdvice();

        // Spring 提供的代理工厂
        ProxyFactory pf = new ProxyFactory();

        // 设置代理目标
        pf.setTarget(target);

        // 为代理目标添加增强
        pf.addAdvice(advice);

        // 生成代理实例
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("Ethan");
        proxy.serveTo("Tony");
    }
}
