package com.yinsd.thread;

import org.junit.Test;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/5/15 10:28
 */
public class CreateThread extends Thread{

    //重写Run方法
    @Override
    public void run(){
        System.out.println("=========使用继承Thread类的方式创建线程到");
    }



    public static void main(String[] args){
        CreateThread ct1 = new CreateThread();
        CreateThread ct2 = new CreateThread();

        for (int i = 0; i < 4; i++) {
            System.out.println("这里是三号线程被执行了");
            ct1.start();
            System.out.println("这里是一号线程被执行了");
            //ct2.start();
            System.out.println("这里是二号线程被执行了");
        }

    }
}
