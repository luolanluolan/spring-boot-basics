package com.origin.basics.reflectDemo;

/**
 * @author LL
 * @date 2019/11/20 16:26
 * @describe  反射学习
 */
public class Person {

    private String name = "Tom";

    public int age = 18;

    public Person() {

    }

    private void say(){
        System.out.println("private say");
    }

    public void work(){
        System.out.println("public work");
    }
}
