package J25_06_23;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Reflection {
    public String noSecret = "No secret";
    private String secret = "secret";

    public Reflection(){
//        System.out.println(secret);
        System.out.println("Reflection constructor execution ");
    }

    public String greet (String name) {
        return "Hello, " + name;
    }

    private  String reveal (String code){
        return "Access granted to: " + code;
    }
}


public class Reflection_prac {
    public static void main(String[] args){
        Class<?> classs = Reflection.class;

        System.out.println("Class name: " + classs.getName());

        System.out.println("\n [Field List]");
        Field[] fields = classs.getDeclaredFields();
        for(Field field: fields){
            System.out.println("Field: " + field.getName());
        }

        System.out.println("\n [Method List]");
        Method[] methods = classs.getDeclaredMethods();
        for (Method method: methods){
            System.out.println("Method: " + method.getName());
            for(Class<?> paramType: method.getParameterTypes()){
                System.out.println("Parameter type: " + paramType.getSimpleName());
            }
        }
        try{
            Object instance = classs.getDeclaredConstructor().newInstance();
            Method greetMethod = classs.getMethod("greet", String.class);
            Object greetResult = greetMethod.invoke(instance, "Jun");
            System.out.println("\n[Public method execution result");
            System.out.println("greet(): " + greetResult);

            Method revealMethod = classs.getMethod("reveal", String.class);
            revealMethod.setAccessible(true);
            Object revealResult = revealMethod.invoke(instance, "abcd");
            System.out.println("\n [private method execution result");
            System.out.println("reveal(): " + revealResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
