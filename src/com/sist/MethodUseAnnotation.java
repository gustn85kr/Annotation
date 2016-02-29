package com.sist;

/**
 * Created by aaa on 2016-02-29.
 */
public class MethodUseAnnotation {
    @PrintAnnotation
    public void methodName1(){
        System.out.println("어노테이션 적용 메서드1");
    }
    @PrintAnnotation("*")
    public void methodName2(){
        System.out.println("어노테이션 적용 메서드2");
    }
    @PrintAnnotation(value="$",number=100)
    public void methodName3(){
        System.out.println("어노테이션 적용 메서드3");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
