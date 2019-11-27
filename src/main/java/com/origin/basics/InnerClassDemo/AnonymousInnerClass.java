package com.origin.basics.InnerClassDemo;

/**
 * @author LL
 * @date 2019/11/27 15:11
 * @describe 匿名内部类
 */

public class AnonymousInnerClass {

    public void test(Bird bird){
        System.out.println(bird.getName()+"能够飞"+bird.fly()+"米");
    }

    public static void main(String[] args) {
        AnonymousInnerClass test = new AnonymousInnerClass();

        test.test(new Bird(){

            @Override
            public int fly(){
                return 10000;
            }

            public String getName(){
                return "大雁";
            }

        });

    }
}

abstract class Bird{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract int fly();
}
