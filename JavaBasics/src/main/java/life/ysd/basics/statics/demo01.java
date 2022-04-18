package life.ysd.basics.statics;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/17 9:09 PM
 */
public class demo01 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        System.out.println("c1的半径值为："+c1.getId());
        System.out.println("c2的半径值为："+c2.getId());
        System.out.println("c3的半径值为："+c3.getId());

    }
    class Circle1{

    }
}
//创建一个外部类：圆的属性
class Circle{

    //定义一个属性
    private double radisus;
    private int id;//自动赋值

    //定义一个无参构造
    public Circle(){
        id = init++;
    }

    public Circle(double radisus){
        radisus = this.radisus;

    }


    private static int total;  //创建的圆的个数

    private static int init = 1001;//static声明的对象被所有的对象所共享

    //创建一个内部方法
    public double findArea(){
        return 3.14 * radisus * radisus;
    }
    //


    public double getRadisus() {
        return radisus;
    }

    public void setRadisus(double radisus) {
        this.radisus = radisus;
    }

    public int getId() {
        return id;
    }
}