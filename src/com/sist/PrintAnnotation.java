package com.sist;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
/**
 * Created by aaa on 2016-02-29.
 */
public @interface PrintAnnotation {
    String value() default  "-";
    int number() default 15;
}
