package com.origin.basics.AbstractDemo;

/**
 * @author LL
 * @date 2019/11/27 10:00
 * @describe
 */
public abstract class Person {

    //有抽象方法的类一定是抽象类，抽象方法只是声明，不包含方法体,抽象方法必须是public
    public abstract void  doSomething();

    //抽象类中可以有普通方法
    public void say(){
        System.out.println("说话");
    }

    //构造方法不能声明为抽象方法
    public Person(){

    }

    //static修饰的方法补鞥呢声明为抽象方法
    public  static void eat(){

    }

}
