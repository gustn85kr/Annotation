package com.sist;

import java.lang.reflect.Method;

/**
 * Created by aaa on 2016-02-29.
 */
public class PrintAnnotationLab {
    public static void main(String[] args){
        Method[] methods = MethodUseAnnotation.class.getDeclaredMethods();

        for(Method m : methods){
            if(m.isAnnotationPresent(PrintAnnotation.class)){
                PrintAnnotation printAnnotation = m.getAnnotation(PrintAnnotation.class);
                System.out.println("["+m.getName() + "]");
                for(int i=0; i<printAnnotation.number(); i++){
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try{
                    m.invoke(new MethodUseAnnotation());
                }catch(Exception ex){
                    ex.printStackTrace();
                }

            }
        }

    }

}
