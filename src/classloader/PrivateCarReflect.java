package classloader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Ethan on 2016/2/14.
 */
public class PrivateCarReflect {

    public static void main(String[] args) throws Throwable{

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.classloader.PrivateCar");
        PrivateCar pcar = (PrivateCar) clazz.newInstance();

        Field colorField = clazz.getDeclaredField("color");
        colorField.setAccessible(true);
        colorField.set(pcar,"red");

        Method driveMethod = clazz.getDeclaredMethod("drive",(Class<?>[]) null);

        driveMethod.setAccessible(true);
        driveMethod.invoke(pcar,(Object[]) null);

    }
}
