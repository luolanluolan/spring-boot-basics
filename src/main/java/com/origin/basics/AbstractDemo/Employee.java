package com.origin.basics.AbstractDemo;

import com.origin.basics.interfaceDemo.Worker;

/**
 * @author LL
 * @date 2019/11/27 10:00
 * @describe 抽象类继承抽象类 ,也能实现接口
 */
public abstract class Employee extends Person  implements Worker {

    //抽象类也可以继承抽象类
    //子类是抽象类可以不给出父类中抽象方法的具体实现

}
