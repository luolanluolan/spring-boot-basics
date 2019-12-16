package com.origin.basics.ThrowableDemo;

/**
 * @author LL
 * @date 2019/11/28 9:37
 * @describe
 */
class MyException extends Exception{

    public MyException(){

    }

    public MyException(String message){
        super(message);
    }

}

public class TestException{


    public static void testExce(String[] args) {
        try{
            int age = 10;
            if(age<18){
                throw new MyException("未满18岁,不能玩游戏");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}