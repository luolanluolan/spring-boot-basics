package com.origin.basics.interfaceDemo;

/**
 * @author LL
 * @date 2019/11/27 10:42
 * @describe  接口 工厂设计模式
 */
interface Fruit{
    public void eat();
}

class Apple implements Fruit{

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
class Orange implements Fruit{

    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}

class Factory{
    public static Fruit getInstance(String className){
        Fruit f = null;
        if("apple".equals(className)){
            f = new Apple();
        }
        if("orange".equals(className)){
            f = new Orange();
        }
        return f;
    }
}


public class InterfaceCaseDemo {

    public static void main(String[] args) {
        Fruit f = Factory.getInstance("apple");
        f.eat();
    }
}
