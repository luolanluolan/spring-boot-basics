package com.origin.basics.ClassLoadDemo;

/**
 * @author LL
 * @date 2019/12/16 10:31
 * @describe  被动引用
 */
public class PassiveReferenceDemo {

    public static void main(String[] args) {
        //一、子类引用父类的静态变量，不会导致子类初始化
        System.out.println(SubClass.value);  //输出SuperClass init! 123

        //二、通过数组定义来引用类，不会触发此类的初始化
        SuperClass[] sca = new SuperClass[10]; //不会输出静态代码块中内容

        //三、常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化
        System.out.println(ConstClass.value); //不会输出ConstClass init!
    }

}

class SuperClass{
    static{
        System.out.println("SuperClass init!");
    }
    public static int value = 123;
}

class SubClass extends SuperClass{
    static{
        System.out.println("SubClass init!");
    }
}

class ConstClass{
    static{
        System.out.println("ConstClass init!");
    }
    public static final int value = 456;
}