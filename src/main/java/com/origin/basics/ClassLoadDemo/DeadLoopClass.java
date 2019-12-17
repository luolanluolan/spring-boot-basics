package com.origin.basics.ClassLoadDemo;

/**
 * @author LL
 * @date 2019/12/17 16:18
 * @describe 如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的Clinit<>方法，其他线程都需要阻塞等待，，，。
 */
public class DeadLoopClass {

    public static void main(String[] args) {
        Thread t = new Thread(){
          @Override
          public void run(){
              System.out.println(Thread.currentThread()+"--start");
              DeadLoopDemo dLC = new DeadLoopDemo();
              System.out.println(Thread.currentThread()+"--run over");
          }
        };
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}

class DeadLoopDemo{
    static{
        if(true){
            System.out.println(Thread.currentThread()+"init DeadLoopClass");
            while(true){
            }
        }
    }
}