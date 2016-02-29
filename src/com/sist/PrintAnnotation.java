package com.sist;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by aaa on 2016-02-29.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
    String value() default  "-";
    int number() default 15;
}
