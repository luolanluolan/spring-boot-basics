package com.origin.basics.InnerClassDemo;

/**
 * @author LL
 * @date 2019/11/27 11:19
 * @describe 局部内部类
 */
public class LocalInnerClass {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.method3();
    }

}

class Outer{
    private String s1 = "this is Outer s1";
    private String s2 = "this is Outer s2";

    private String method1(){
        return "this is Outer method1";
    }

    private String method2(){
        return "this is Outer method2";
    }

    public void method3(){
        final String s1_method3 = "s1_method3";

        class Inner{
            private String s1 = "this is Inner s1";
            public void method1(){
                //内部类访问外部方法的变量，需要有final修饰
                System.out.println(s1_method3);
                //局部内部类可直接访问外部类的变量，即使是私有变量
                System.out.println(s2);
                //内部类和外部类有同名变量和方法时
                System.out.println(s1);
                //内部类访问外部类成员
                System.out.println( Outer.this.s1);
                //内部类和外部内同名方法
                System.out.println(method2());
                //内部类访问外部类私有方法
                System.out.println(Outer.this.method2());
            }

            private String method2(){
                return "this is Inner method2";
            }
        }
        //创建内部类的实例只能在包含他的方法中
        Inner inner = new Inner();
        inner.method1();

    }
}
