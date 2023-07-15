package test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)// by using this, we can access MyAnnotation's value and count at runtime
public @interface MyAnnotation {
    String value();

    int count() default 1;

}
