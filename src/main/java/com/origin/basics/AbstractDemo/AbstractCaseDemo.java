package com.origin.basics.AbstractDemo;

/**
 * @author LL
 * @date 2019/11/27 10:30
 * @describe 抽象类的实际使用场景——设计模式（模板设计）
 */
abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = age;
    }

    public void say(){
        System.out.println(this.getContent());
    }

    public abstract String getContent(); //说话内容具体由子类决定
}

class Cat extends Animal{

    private String call;

    public Cat(String name, int age, String call) {
        super(name, age);
        this.call = call;
    }

    @Override
    public String getContent() {
        return "姓名: "+ super.getName()+
                "、年龄: "+ super.getAge()+
                "、叫声: "+ this.call;
    }
}

class Dog extends Animal{

    private String call;

    public Dog(String name, int age, String call) {
        super(name, age);
        this.call = call;
    }

    @Override
    public String getContent() {
        return "姓名: "+ super.getName()+
                "、年龄: "+ super.getAge()+
                "、叫声: "+ this.call;
    }
}

public class AbstractCaseDemo{

    public static void main(String[] args) {
        Animal a = null;
        Animal b = null;
        a = new Cat("小猫",3,"喵喵喵");
        b = new Cat("小狗",4,"汪汪汪");
        a.say();
        b.say();
    }
}