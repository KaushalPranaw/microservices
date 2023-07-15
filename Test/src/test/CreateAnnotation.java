package test;

@MyAnnotation(value = "pranaw", count = 3)
public class CreateAnnotation {
    public static void main(String[] args) {
        Class<?> clazz = CreateAnnotation.class;
        MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
        if (annotation != null) {
            String value = annotation.value();
            int count = annotation.count();
            // Perform actions based on the annotation values
            System.out.println(value+" "+count);
        }
    }
}

