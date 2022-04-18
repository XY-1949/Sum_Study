package com.test.ClassDemo.demo_01;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/10 6:56 PM
 */
public class Son extends Parent{


    public static void main(String[] args) {
        String str = new String("abcde");
        Parent parent = new Parent();
        toStr(str);
        //super.toInt(1);



    }
    /**
     * 子类调用父类的静态方法可以直接调用，直接在子类内部写父类方法的方法名
     * 子类的静态方法内不能调用父类的非静态方法
     *
     */

}
