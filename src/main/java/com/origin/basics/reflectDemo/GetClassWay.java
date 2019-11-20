package com.origin.basics.reflectDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author LL
 * @date 2019/11/20 16:30
 * @describe 获得Class的三种方式
 */
public class GetClassWay {

    static Logger  logger = LoggerFactory.getLogger(GetClassWay.class);

    public static void main(String[] args) {

        //1、通过对象调用getClass()方法获取（例如传过来一个Object类型的对象，而我不知道具体类型，用这种方法）
        Person p1 = new Person();
        Class c1 = p1.getClass();
        logger.info("1、通过getClass方式获得Class: " + c1);

        //2、直接通过类名.class方式获取，该方法最为安全可靠，程序性能更高，这说明任何一个类都有一个隐含的静态成员变量 Class
        Class c2 = Person.class;
        logger.info("2、通过class方式获得Class: " + c2);

        //3、通过Class对象的forName()静态方法来获取，用的最多，但可能抛出ClassNotFoundException异常
        try {
            Class c3 = Class.forName("com.origin.basics.reflectDemo.Person");
            logger.info("3、通过Class.forName(String ClassPath)方式获得Class: " + c3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
