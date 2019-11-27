package com.origin.basics.InnerClassDemo;

/**
 * @author LL
 * @date 2019/11/27 11:02
 * @describe 成员内部类
 */
class Circle {
    private double radius  = 0;
    public static int count = 1;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    class Draw{ //内部类
        public void drawShape(){
            System.out.println(radius);  //外部私有成员属性
            System.out.println(count);   //外部静态成员
        }
    }
}

public class MemeberInnerClass{

    public static void main(String[] args) {
        //创建成员内部类对象
        Circle c = new Circle(); //创建外部类对象
        Circle.Draw draw = c.new Draw(); //外部类对象.new 成员内部类名()
    }

}
