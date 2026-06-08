import java.lang.reflect.Method;

public class ts9 {
    public static void main(String[] args) {
        
    }

    public static String[] meth(Object obj) {
        Class<?> cls = obj.getClass();
        Method[] methods = cls.getDeclaredMethods();
        String[] names = new String[methods.length];
        for (int i = 0; i < methods.length; i++) {
            names[i] = methods[i].getName();
        }
        return names;
    }
}
