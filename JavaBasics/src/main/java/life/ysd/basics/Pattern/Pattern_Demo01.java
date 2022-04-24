package life.ysd.basics.Pattern;

import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/19 10:43 AM
 */
public class Pattern_Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        Patter(num);

    }

    //判断数字是否是100以内的
    public static void Patter(String num){

        String pattern = "[^10]";

        Boolean isMath = Pattern.matches(pattern,num);

        System.out.println("这个数字是否属于100以内："+isMath);

    }

    @Test
    public void Pattern_Test(){
        String str = new String("string");
        Patter(str);

    }
}
