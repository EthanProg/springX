package classloader;

/**
 * Created by Ethan on 2016/2/14.
 */
public class PrivateCar {

    private String color;

    protected void drive(){
        System.out.println("the color is: " + color);
    }
}
