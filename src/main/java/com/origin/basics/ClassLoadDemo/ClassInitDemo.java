package com.origin.basics.ClassLoadDemo;

/**
 * @author LL
 * @date 2019/12/17 14:55
 * @describe 初始化阶段（编译器收集类中所有的 类变量的赋值动作 和 静态代码块中的语句 合并产生
 * 非法向前引用
 */
public class ClassInitDemo {
    public static void main(String[] args) {
        System.out.println(SubClInitDemo.B); //3
        SubClInitDemo sub = new SubClInitDemo();
        System.out.println(sub);

    }

}

//非法向前引用
class NonForwardReference{
    static{
        i = 10;
//        System.out.println(i); //初始化阶段，静态代码块中可以给代码块之后出现的变量赋值，但不能访问
    }
    static int i = 2;
}


/*
 * 父类Clinit<>发放在子类Clinit<>执行之前已经完成
 */
class SuperClInitDemo{

    public static int A = 2;
    static{
        A = 3;
    }

    public SuperClInitDemo() {
        System.out.println("SuperClInitDemo");
    }
}
class SubClInitDemo extends SuperClInitDemo{
    public static int B = A;

    public SubClInitDemo() {
        System.out.println("SubClInitDemo");
    }
}

