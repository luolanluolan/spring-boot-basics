package com.origin.basics.reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author LL
 * @date 2019/11/21 11:31
 * @describe
 */
public class APIClassMethod {

    public static void main(String[] args) throws Exception{
        Class c1 = Person.class;

        //API中Class的方法
        String className = c1.getName(); //获取类的完整名字
        System.out.println("className "+className); //com.origin.basics.reflectDemo.Person

        Field[] fields = c1.getFields();//获取类的public类型的属性
        System.out.print("fields: ");
        for (Field field: fields) {
            System.out.print(field.getName()+"   ");
        }
        //age
        System.out.println();

        Field[] declaredFields = c1.getDeclaredFields();//获取类的所有属性，包括private声明的和继承类
        System.out.print("declaredFields: ");
        for (Field field: declaredFields) {
            System.out.print(field.getName()+"   ");
        }
        //name   age
        System.out.println();

        Method[] methods =c1.getMethods();//获取类的public类型的方法
        System.out.print("methods: ");
        for (Method method: methods) {
            System.out.print(method.getName()+"   ");
        }
        //work   wait   wait   wait   equals   toString   hashCode   getClass   notify   notifyAll
        System.out.println();

        Method[] declaredMethods = c1.getDeclaredMethods();//获得类的所有方法，包括private声明的和继承类
        System.out.print("declaredMethods: ");
        for (Method method: declaredMethods) {
            System.out.print(method.getName()+"   ");
        }
        //say   work
        System.out.println();

        Constructor[] constructors = c1.getConstructors();//获得类的public类型的构造器方法
        System.out.print("constructors: ");
        for (Constructor constructor: constructors) {
            System.out.print(constructor.getName()+"   ");
        }
        //com.origin.basics.reflectDemo.Person
        System.out.println();

        Object o = c1.newInstance(); //通过类的不带参数的构造方法创建这个类的一个对象
        System.out.println("o "+o.toString());

        //获取private属性
        Field f1 = c1.getDeclaredField("name");
        System.out.println("f1 = [" + f1 + "]");
        f1.setAccessible(true); //启用和禁用访问安全检查的开关，值为true,则表示反射的对象在使用时应该取消java语言的访问检查
        Object obj = c1.newInstance();
        System.out.println(f1.get(obj)); //获取私有属性的值
        f1.set(obj,"BOB"); //私有属性赋值，使用反射机制可以打破封装性，导致了java对象的属性不安全
        System.out.println(f1.get(obj));

        //public属性
        Field f2 = c1.getDeclaredField("age");
        System.out.println("f2 = [" + f2 + "]");


        //反射调用方法
        Object obj1 = c1.newInstance();
        boolean flag = obj1 instanceof Person;
        if(flag){
            Method method = c1.getDeclaredMethod("say");
//            method.setAccessible(true);
            method.invoke(obj1);
        }

    }
}
