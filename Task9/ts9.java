import java.lang.reflect.Method;

public class ts9 {
    public static void main(String[] args) {
        //необязаиельные строчки, для проверки метода просто написаны
        String[] names = meth(Math.class);
        for (String name : names) {
            System.out.println(name);
        }
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
