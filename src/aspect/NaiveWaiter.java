package aspect;

/**
 * Created by Ethan on 2016/2/18.
 */
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to: " + name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to: " + name);
    }
}
